// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.statement.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Print(List<Expression> expressions)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Print print, Object param) {

		out("#LINE " + print.end().getLine());

		value(print, param);
		
		out("OUT");

		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Read read, Object param) {

		out("#LINE " + read.end().getLine());

		address(read, param);

		out("IN");

		out("STORE");


		return null;
	}

	// class FunctionCallStatement(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		// value(functionCallStatement.expressions());
		// address(functionCallStatement.expressions());

		out("<instruction>");

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Assignment assignment, Object param) {

		out("#LINE " + assignment.end().getLine());

		address(assignment.getLeft(), param);

		value(assignment.getRight(), param);

		out("STORE");

		return null;
	}

	// class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Conditional conditional, Object param) {

		value(conditional.getExpression(), param);

		out("JZ else" + conditional.hashCode());

		for (Statement statement : conditional.getIfStatements()) {
			execute(statement, param);
		}

		out("JMP endif" + conditional.hashCode());

		out("else" + conditional.hashCode() + ":");

		return null;
	}

	// class While(Expression expression, List<Statement> loopStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(While whileValue, Object param) {

		// value(whileValue.getExpression());
		// address(whileValue.getExpression());

		// execute(whileValue.loopStatements());

		out("<instruction>");

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Return returnValue, Object param) {

		// value(returnValue.getExpression());
		// address(returnValue.getExpression());

		out("<instruction>");

		return null;
	}

}
