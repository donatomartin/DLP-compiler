// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package visitor;

import ast.*;
import ast.definition.*;
import ast.statement.*;
import ast.type.*;
import ast.expression.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getDefinitions().forEach(definition -> definition.accept(this, param));
		return null;
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		varDefinition.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		structDefinition.getFields().forEach(field -> field.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		functionDefinition.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));
		functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Field field, Object param) {

		field.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {

		print.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {

		read.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

		assignment.getLeft().accept(this, param);
		assignment.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Conditional conditional, Object param) {

		conditional.getExpression().accept(this, param);
		conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
		conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(While whileValue, Object param) {

		whileValue.getExpression().accept(this, param);
		whileValue.getLoopStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Return returnValue, Object param) {

		returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	@Override
	public Object visit(FloatType floatType, Object param) {

		return null;
	}

	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

		arrayType.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(StructAccess structAccess, Object param) {

		structAccess.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		arrayAccess.getLeft().accept(this, param);
		arrayAccess.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Cast cast, Object param) {

		cast.getCastType().accept(this, param);
		cast.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

		arithmetic.getLeft().accept(this, param);
		arithmetic.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Comparison comparison, Object param) {

		comparison.getLeft().accept(this, param);
		comparison.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		logicBinary.getLeft().accept(this, param);
		logicBinary.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		logicUnary.getExpression().accept(this, param);
		return null;
	}


}
