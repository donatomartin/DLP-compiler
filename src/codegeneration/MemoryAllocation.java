package codegeneration;

import ast.*;
import ast.definition.*;
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

            definition.accept(this, param);

		}

		return null;
	}

    // class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {


        // Parameters
        if (functionDefinition.getVarDefinitions() != null) {
    
            int currentAddress = 4;
    
            for (var parameter : functionDefinition.getVarDefinitions()) {
                parameter.setAddress(currentAddress);
                currentAddress += parameter.getType().getSize();
            }
        }

        if (functionDefinition.getType().isPresent()) {
            functionDefinition.getType().get().accept(this, param);
        }

        
        

        return null;
	}

}
