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

        int address = 0;

        for (var definition : program.getDefinitions()) {

			if (definition instanceof VarDefinition) {
                VarDefinition varDefinition = (VarDefinition) definition;
                varDefinition.setAddress(address);
                address += varDefinition.getType().getSize();
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
        if (functionDefinition.getParameters() != null) {
    
            int address = 4;
    
            for (var parameter : functionDefinition.getParameters()) {
                parameter.setAddress(address);
                address += parameter.getType().getSize();
            }
        }

        // Type
        if (functionDefinition.getType().isPresent()) {
            functionDefinition.getType().get().accept(this, param);
        }

        // Local Variables
        if (functionDefinition.getLocalVariables() != null) {
    
            int address = 0;
    
            for (var localVariable : functionDefinition.getLocalVariables()) {
                localVariable.setAddress(address);
                address += localVariable.getType().getSize();
            }

        }

        return null;
	}

    @Override
    public Object visit(StructDefinition structDefinition, Object param) {

        int address = 0;

        for (var fieldDefinition : structDefinition.getFieldDefinitions()) {
            fieldDefinition.setAddress(address);
            address += fieldDefinition.getType().getSize();

            // In case there are nested structs
            fieldDefinition.accept(this, param);
        }

        return null;
    }


}
