package codegeneration;

import ast.*;
import ast.definition.*;
import visitor.DefaultVisitor;

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }
    
    // class Program(List<Definition> definitions)
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

        super.visit(functionDefinition, param);

        int paramOffset = 4;

        for (var parameter : functionDefinition.getParameters()) {
            parameter.setAddress(paramOffset);
            paramOffset += parameter.getType().getSize();
        }

        int localVariablesOffset = 0;

        for (var localVariable : functionDefinition.getLocalVariables()) {
            localVariable.setAddress(localVariablesOffset);
            localVariablesOffset += localVariable.getType().getSize();
        }

        return null;
	}

    // class StructDefinition(String name, List<FieldDefinition> FieldDefinitions)
    @Override
    public Object visit(StructDefinition structDefinition, Object param) {

        super.visit(structDefinition, param);

        int offset = 0;

        for (var fieldDefinition : structDefinition.getFieldDefinitions()) {
            fieldDefinition.setAddress(offset);
            offset += fieldDefinition.getType().getSize();
        }

        return null;
    }


}
