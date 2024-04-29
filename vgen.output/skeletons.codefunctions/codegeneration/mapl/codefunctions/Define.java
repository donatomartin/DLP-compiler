// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.definition.*;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class VarDefinition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		out("#GLOBAL " + node.getNombre() + ":" + node.getTipo().getMAPLName());
		return null;

	}

	// class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		out("#TYPE " + node.getNombre() + ":" + node.getTipo().getMAPLName());
		return null;

	}

	// class FieldDefinition(String name, Type type)
	// phase Identification { StructDefinition structDefinition }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		out("<instruction>");
		return null;

	}

	// class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> localVariables, List<Statement> statements)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		out(functionDefinition.getName() + ":");

		define(functionDefinition.parameters());
		metadata(functionDefinition.parameters());

		define(functionDefinition.localVariables());
		metadata(functionDefinition.localVariables());

		execute(functionDefinition.statements());

		out("<instruction>");

		return null;
	}

}
