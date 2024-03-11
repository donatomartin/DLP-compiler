package semantic;

import visitor.DefaultVisitor;
import ast.*;
import ast.definition.*;
import ast.statement.*;
import ast.type.*;
import ast.expression.*;
import main.ErrorManager;

// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /*
     * Write "visits" here...
     */

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Definition> definitions)
	@Override
	public Object visit(Program program, Object param) {

		// program.getDefinitions().forEach(definition -> definition.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class VarDefinition(String name, Type type)
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getType().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class StructDefinition(String name, List<Field> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// structDefinition.getFields().forEach(field -> field.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		// functionDefinition.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		// functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));
		// functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

	// class Field(String name, Type type)
	@Override
	public Object visit(Field field, Object param) {

		// field.getType().accept(this, param);
		super.visit(field, param);

		return null;
	}

	// class Print(Expression expression)
	@Override
	public Object visit(Print print, Object param) {

		// print.getExpression().accept(this, param);
		super.visit(print, param);

		return null;
	}

	// class Read(Expression expression)
	@Override
	public Object visit(Read read, Object param) {

		// read.getExpression().accept(this, param);
		super.visit(read, param);

		return null;
	}

	// class FunctionCallStatement(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		// functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallStatement, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallStatement.setFunctionDefinition(?);
		return null;
	}

	// class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {

		// assignment.getLeft().accept(this, param);
		// assignment.getRight().accept(this, param);
		super.visit(assignment, param);

		return null;
	}

	// class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	@Override
	public Object visit(Conditional conditional, Object param) {

		// conditional.getExpression().accept(this, param);
		// conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
		// conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
		super.visit(conditional, param);

		return null;
	}

	// class While(Expression expression, List<Statement> loopStatements)
	@Override
	public Object visit(While whileValue, Object param) {

		// whileValue.getExpression().accept(this, param);
		// whileValue.getLoopStatements().forEach(statement -> statement.accept(this, param));
		super.visit(whileValue, param);

		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	// class FloatType()
	@Override
	public Object visit(FloatType floatType, Object param) {

		return null;
	}

	// class CharType()
	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	// class ArrayType(int intValue, Type type)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		// arrayType.getType().accept(this, param);
		super.visit(arrayType, param);

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition structDefinition }
	@Override
	public Object visit(StructType structType, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// structType.setStructDefinition(?);
		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	@Override
	public Object visit(Variable variable, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// variable.setVarDefinition(?);
		return null;
	}

	// class IntLiteral(int intValue)
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		return null;
	}

	// class FloatLiteral(float floatValue)
	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		return null;
	}

	// class CharLiteral(char charValue)
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		return null;
	}

	// class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		// functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpression, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallExpression.setFunctionDefinition(?);
		return null;
	}

	// class StructAccess(Expression expression, String name)
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// structAccess.getExpression().accept(this, param);
		super.visit(structAccess, param);

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getLeft().accept(this, param);
		// arrayAccess.getRight().accept(this, param);
		super.visit(arrayAccess, param);

		return null;
	}

	// class Cast(Type type, Expression expression)
	@Override
	public Object visit(Cast cast, Object param) {

		// cast.getType().accept(this, param);
		// cast.getExpression().accept(this, param);
		super.visit(cast, param);

		return null;
	}

	// class Arithmetic(Expression left, String operator, Expression right)
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

		// arithmetic.getLeft().accept(this, param);
		// arithmetic.getRight().accept(this, param);
		super.visit(arithmetic, param);

		return null;
	}

	// class Logic(Expression left, String operator, Expression right)
	@Override
	public Object visit(Logic logic, Object param) {

		// logic.getLeft().accept(this, param);
		// logic.getRight().accept(this, param);
		super.visit(logic, param);

		return null;
	}

	// class LogicAnd(Expression left, Expression right)
	@Override
	public Object visit(LogicAnd logicAnd, Object param) {

		// logicAnd.getLeft().accept(this, param);
		// logicAnd.getRight().accept(this, param);
		super.visit(logicAnd, param);

		return null;
	}

	// class LogicOr(Expression left, Expression right)
	@Override
	public Object visit(LogicOr logicOr, Object param) {

		// logicOr.getLeft().accept(this, param);
		// logicOr.getRight().accept(this, param);
		super.visit(logicOr, param);

		return null;
	}

	// class LogicNot(Expression expression)
	@Override
	public Object visit(LogicNot logicNot, Object param) {

		// logicNot.getExpression().accept(this, param);
		super.visit(logicNot, param);

		return null;
	}

    // # --------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    private void notifyError(String msg) {
        errorManager.notify("Identification", msg);
    }

    private void notifyError(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void notifyError(String msg, AST node) {
        notifyError(msg, node.start());
    }

}
