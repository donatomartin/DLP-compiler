// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		out("<instruction>");

		return null;
	}

	// class IntLiteral(int intValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		out("<instruction>");

		return null;
	}

	// class FloatLiteral(float floatValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		out("<instruction>");

		return null;
	}

	// class CharLiteral(char charValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		out("<instruction>");

		return null;
	}

	// class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		// value(functionCallExpression.expressions());
		// address(functionCallExpression.expressions());

		out("<instruction>");

		return null;
	}

	// class StructAccess(Expression expression, String name)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// value(structAccess.getExpression());
		// address(structAccess.getExpression());

		out("<instruction>");

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// value(arrayAccess.getLeft());
		// address(arrayAccess.getLeft());

		// value(arrayAccess.getRight());
		// address(arrayAccess.getRight());

		out("<instruction>");

		return null;
	}

	// class Cast(Type castType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

		// value(cast.getExpression());
		// address(cast.getExpression());

		out("<instruction>");

		return null;
	}

	// class Arithmetic(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

		// value(arithmetic.getLeft());
		// address(arithmetic.getLeft());

		// value(arithmetic.getRight());
		// address(arithmetic.getRight());

		out("<instruction>");

		return null;
	}

	// class Comparison(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Comparison comparison, Object param) {

		// value(comparison.getLeft());
		// address(comparison.getLeft());

		// value(comparison.getRight());
		// address(comparison.getRight());

		out("<instruction>");

		return null;
	}

	// class LogicBinary(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		// value(logicBinary.getLeft());
		// address(logicBinary.getLeft());

		// value(logicBinary.getRight());
		// address(logicBinary.getRight());

		out("<instruction>");

		return null;
	}

	// class LogicUnary(String operator, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		// value(logicUnary.getExpression());
		// address(logicUnary.getExpression());

		out("<instruction>");

		return null;
	}

}
