// Generated with VGen 2.0.0


/*

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos
   los hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y
   se pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

*/

package main;

import visitor.DefaultVisitor;
import ast.*;
import ast.definition.*;
import ast.statement.*;
import ast.type.*;
import ast.expression.*;


public class VisitorImpl extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Definition> definitions)
	@Override
	public Object visit(Program program, Object param) {

        System.out.println("--- Inicio Programa");

		program.getDefinitions().forEach(definition -> definition.accept(this, param));
		
		System.out.println("--- Fin Programa");

		return null;

	}

	// class VarDefinition(String name, Type type)
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

        System.out.print("var " + varDefinition.getName() + ":");

        varDefinition.getType().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class StructDefinition(String name, List<Field> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

        System.out.println("struct " + structDefinition.getName() + "{");

		structDefinition.getFields().forEach(field -> field.accept(this, param));

        System.out.println("}");

		return null;
	}

	// class FunctionDefinition(String name, List<Parameter> parameters, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        System.out.print(functionDefinition.getName() + "(");

		functionDefinition.getParameters().forEach(parameter -> parameter.accept(this, param));

        System.out.print(")");

		functionDefinition.getType().ifPresent(type -> type.accept(this, param));
        
        System.out.println(" {");

		functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));

		functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));

        System.out.println("}");

		return null;

	}

	// class Field(String name, Type type)
	@Override
	public Object visit(Field field, Object param) {

		System.out.print(field.getName() + ":");

        field.getType().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class Parameter(String name, Type type)
	@Override
	public Object visit(Parameter parameter, Object param) {

		System.out.print(parameter.getName() + ":");

		parameter.getType().accept(this, param);

		return null;
	}

	// class Print(Expression expression)
	@Override
	public Object visit(Print print, Object param) {

		System.out.print("print ");

		print.getExpression().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class Read(Expression expression)
	@Override
	public Object visit(Read read, Object param) {

		System.out.print("read ");

		read.getExpression().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class Call(Expression expression)
	@Override
	public Object visit(Call call, Object param) {

		call.getExpression().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {

		assignment.getLeft().accept(this, param);

		System.out.print(" = ");

		assignment.getRight().accept(this, param);

		System.out.println(";");

		return null;
	}

	// class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	@Override
	public Object visit(Conditional conditional, Object param) {

		System.out.print("if (");

		conditional.getExpression().accept(this, param);

		System.out.println(") {");

		conditional.getIfStatements().forEach(statement -> statement.accept(this, param));

		System.out.println("}");

		System.out.println("else {");

		conditional.getElseStatements().forEach(statement -> statement.accept(this, param));

		System.out.println("}");
		
		return null;
	}

	// class While(Expression expression, List<Statement> loopStatements)
	@Override
	public Object visit(While whileValue, Object param) {

		System.out.print("while (");

		whileValue.getExpression().accept(this, param);

		System.out.println(") {");

		whileValue.getLoopStatements().forEach(statement -> statement.accept(this, param));

		System.out.println("}");

		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {

		System.out.print("return ");

		returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));

		System.out.println(";");

		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {
		
		System.out.print(" int");
		
		return null;
	}

	// class FloatType()
	@Override
	public Object visit(FloatType floatType, Object param) {
		
		System.out.print(" float");
		
		return null;
	}

	// class CharType()
	@Override
	public Object visit(CharType charType, Object param) {

		System.out.print(" char");
		
		return null;
	}

	// class ArrayType(int intValue, Type type)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		System.out.print( "[" + arrayType.getIntValue() + "]");
		arrayType.getType().accept(this, param);

		return null;
	}

	// class StructType(String name)
	@Override
	public Object visit(StructType structType, Object param) {

		System.out.print(" " + structType.getName());
		return null;
	}

	// class Variable(String name)
	@Override
	public Object visit(Variable variable, Object param) {

		System.out.print(variable.getName());
		
		return null;
	}

	// class IntLiteral(int intValue)
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		System.out.print(intLiteral.getIntValue());

		return null;
	}

	// class FloatLiteral(float floatValue)
	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		System.out.print(floatLiteral.getFloatValue());

		return null;
	}

	// class CharLiteral(char charValue)
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		// String Type, should implement a getCharacter method or something idk
		System.out.print(charLiteral.getCharValue());

		return null;
	}

	// class FunctionCall(String name, List<Expression> expressions)
	@Override
	public Object visit(FunctionCall functionCall, Object param) {

		System.out.print(functionCall.getName() + "(");

		functionCall.getExpressions().forEach(expression -> expression.accept(this, param));

        System.out.print(")");

		return null;
	}

	// class StructAccess(Expression e, String name)
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		structAccess.getE().accept(this, param);

		System.out.print("." + structAccess.getName());

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		arrayAccess.getLeft().accept(this, param);

		System.out.print("[");

		arrayAccess.getRight().accept(this, param);

		System.out.print("]");

		return null;
	}

	// class Cast(Type type, Expression expression)
	@Override
	public Object visit(Cast cast, Object param) {

		System.out.print("<");
		cast.getType().accept(this, param);
		System.out.print(">");

		System.out.print("(");

		cast.getExpression().accept(this, param);

		System.out.print(")");

		return null;
	}

	// class Arithmetic(Expression left, String operator, Expression right)
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

		arithmetic.getLeft().accept(this, param);

		System.out.print(arithmetic.getOperator());

		arithmetic.getRight().accept(this, param);

		return null;
	}

	// class Logic(Expression left, String operator, Expression right)
	@Override
	public Object visit(Logic logic, Object param) {

		logic.getLeft().accept(this, param);

		System.out.print(logic.getOperator());

		logic.getRight().accept(this, param);

		return null;
	}

	// class LogicAnd(Expression left, Expression right)
	@Override
	public Object visit(LogicAnd logicAnd, Object param) {

		logicAnd.getLeft().accept(this, param);

		System.out.print("&&");

		logicAnd.getRight().accept(this, param);

		return null;
	}

	// class LogicOr(Expression left, Expression right)
	@Override
	public Object visit(LogicOr logicOr, Object param) {

		logicOr.getLeft().accept(this, param);

		System.out.print("||");

		logicOr.getRight().accept(this, param);

		return null;
	}

	// class LogicNot(Expression expression)
	@Override
	public Object visit(LogicNot logicNot, Object param) {

		System.out.print("!");
		logicNot.getExpression().accept(this, param);

		return null;
	}

}
