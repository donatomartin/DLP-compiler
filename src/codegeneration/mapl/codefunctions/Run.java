// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.definition.Definition;
import codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Definition> definitions)
	@Override
	public Object visit(Program program, Object param) {

		// define(program.definitions());

		out("#SOURCE " + this.getSpecification().getSourceFile());
		out("CALL main");
		out("HALT");

		for (Definition definition : program.getDefinitions()) {
			define(definition, param);
		}

		return null;
	}

}
