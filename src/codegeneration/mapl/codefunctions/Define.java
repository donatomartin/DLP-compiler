// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.definition.*;
import ast.statement.Statement;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class VarDefinition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		metadata(varDefinition, param);

		return null;
	}

	// class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		out("#TYPE " + structDefinition.getName() + " " + structDefinition.getFieldDefinitions().size());

		return null;
	}

	// class FieldDefinition(String name, Type type)
	// phase Identification { StructDefinition structDefinition }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> localVariables, List<Statement> statements)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		metadata(functionDefinition, param);

		out("ENTER " + functionDefinition.getLocalVariables().size());

		for (Statement statement : functionDefinition.getStatements()) {
			execute(statement, param);
		}

		return null;
	}

}
