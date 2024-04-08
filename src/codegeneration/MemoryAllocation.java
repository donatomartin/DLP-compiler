package codegeneration;

import ast.*;
import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.StructDefinition;
import ast.definition.VarDefinition;
import visitor.DefaultVisitor;

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }
    
    	@Override
	public Object visit(Program program, Object param) {

        int currentAddress = 0;

        for (var definition : program.getDefinitions()) {

			if (definition instanceof VarDefinition) {
                VarDefinition varDefinition = (VarDefinition) definition;
                varDefinition.setAddress(currentAddress);
                currentAddress += varDefinition.getType().getSize();
            }

            if (definition instanceof StructDefinition) {
                StructDefinition structDefinition = (StructDefinition) definition;
                structDefinition.setAddress(currentAddress);

                for (FieldDefinition fieldDefinition : structDefinition.getFieldDefinitions()) {
                    fieldDefinition.setAddress(currentAddress);
                    currentAddress += fieldDefinition.getType().getSize();
                }
            }

            if (definition instanceof FunctionDefinition) {
                
                FunctionDefinition functionDefinition = (FunctionDefinition) definition;

                for (VarDefinition varDefinition : functionDefinition.getVarDefinitions()) {
                    varDefinition.setAddress(currentAddress);
                    currentAddress += varDefinition.getType().getSize();
                }

                currentAddress += 4; // Return address
                functionDefinition.setAddress(currentAddress);

                for (Definition localDefinition : functionDefinition.getDefinitions()) {
                    
                    if (localDefinition instanceof VarDefinition) {
                        VarDefinition varDefinition = (VarDefinition) localDefinition;
                        varDefinition.setAddress(currentAddress);
                        currentAddress += varDefinition.getType().getSize();
                    }

                    if (localDefinition instanceof StructDefinition) {
                        StructDefinition structDefinition = (StructDefinition) localDefinition;
                        structDefinition.setAddress(currentAddress);

                        for (FieldDefinition fieldDefinition : structDefinition.getFieldDefinitions()) {
                            fieldDefinition.setAddress(currentAddress);
                            currentAddress += fieldDefinition.getType().getSize();
                        }
                    }
                    
                }

            }

		}

        super.visit(program, param);

		return null;
	}

}
