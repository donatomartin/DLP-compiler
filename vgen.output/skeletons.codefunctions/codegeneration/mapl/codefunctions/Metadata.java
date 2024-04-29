// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.definition.*;
import codegeneration.mapl.*;


public class Metadata extends AbstractCodeFunction {

    public Metadata(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Definition> definitions)
	@Override
	public Object visit(Program program, Object param) {

		// define(program.definitions());

		out("<instruction>");

		return null;
	}

	// class VarDefinition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		out("<instruction>");

		return null;
	}

	// class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// define(structDefinition.fieldDefinitions());

		out("<instruction>");

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> localVariables, List<Statement> statements)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		// define(functionDefinition.parameters());
		// metadata(functionDefinition.parameters());

		// define(functionDefinition.localVariables());
		// metadata(functionDefinition.localVariables());

		// execute(functionDefinition.statements());

		out("<instruction>");

		return null;
	}

}
