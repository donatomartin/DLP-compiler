/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import ast.*;
import ast.definition.FieldDefinition;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // ----------------------------------------------------------
    // Visit methods


    // class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        for (Statement statement : functionDefinition.getStatements()) {
            statement.setFunction(functionDefinition);
        }

        if (!functionDefinition.getParameters().isEmpty()) {
            for (VarDefinition varDefinition : functionDefinition.getParameters()) {
                varDefinition.accept(this, param);
                predicate(isPrimitive(varDefinition.getType()), "Parameter must be of primitive type", varDefinition);
            }
        }

        if (functionDefinition.getType().isPresent()) {
            functionDefinition.getType().get().accept(this, param);
            predicate(isPrimitive(functionDefinition.getType().get()), "Return type must be of primitive type", functionDefinition);
        }

        super.visit(functionDefinition, param);

		return null;
	}

    // class Print(List<Expression> expressions)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Print print, Object param) {

		super.visit(print, param);

        for (Expression expression : print.getExpressions()) {
            predicate(isPrimitive(expression.getType()), "Expression must be of numeric type", print);
        }

		return null;
	}

    // class Read(Expression expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Read read, Object param) {

		// read.getExpression().accept(this, param);
		super.visit(read, param);

        Expression expression = read.getExpression();
        predicate(isPrimitive(expression.getType()), "Expression must be of numeric type", read);

		return null;
	}

    // class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {

        super.visit(assignment, param);

        Expression left = assignment.getLeft();
        Expression right = assignment.getRight();
        
        predicate(sameType(left.getType(), right.getType()), "Types of left and right expressions do not match", assignment);
        predicate(left.isLvalue(), "Left expression must be an lvalue", assignment);
        
		return null;
	}

    // class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Conditional conditional, Object param) {

        Expression expression = conditional.getExpression();
        expression.accept(this, param);
        predicate(expression.getType() instanceof IntType, "Expression must be of int type", conditional);

        for (Statement statement : conditional.getIfStatements())  {
            statement.setFunction(conditional.getFunction());
            statement.accept(this, param);
        }
        
        for (Statement statement : conditional.getElseStatements()) {
            statement.setFunction(conditional.getFunction());
            statement.accept(this, param);
        }


		return null;
	}

    // class While(Expression expression, List<Statement> loopStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(While whileValue, Object param) {

        Expression expression = whileValue.getExpression();
        expression.accept(this, param);
        predicate(expression.getType() instanceof IntType, "Expression must be of boolean type", whileValue);

        for (Statement statement : whileValue.getLoopStatements()) {
            statement.setFunction(whileValue.getFunction());
            statement.accept(this, param);
        }
		
		return null;
	}

    // class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDefinition function }
    @Override
    public Object visit(Return returnValue, Object param) {

        super.visit(returnValue, param);

        if (returnValue.getExpression().isEmpty()) {
            predicate(returnValue.getFunction().getType() != null, "Return type does not match function empty return type", returnValue);
        }

        else {
            Expression expression = returnValue.getExpression().get();
            predicate(sameType(returnValue.getFunction().getType().get(), expression.getType()), "Return type does not match function return type", returnValue);
        }


        return null;
    }

    // class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		variable.setType(variable.getVarDefinition().getType());
		variable.setLvalue(true);

		return null;
	}

    // class IntLiteral(int intValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

        intLiteral.setType(new IntType());
        intLiteral.setLvalue(false);
		
		return null;
	}

	// class FloatLiteral(float floatValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		floatLiteral.setType(new FloatType());
        floatLiteral.setLvalue(false);

		return null;
	}

	// class CharLiteral(char charValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		charLiteral.setType(new CharType());
        charLiteral.setLvalue(false);

		return null;
	}

    // class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
    @Override
    public Object visit(FunctionCallExpression functionCallExpression, Object param) {

        super.visit(functionCallExpression, param);

        functionCallExpression.setLvalue(false);
        
        if (functionCallExpression.getFunctionDefinition().getType().isPresent()) {
            functionCallExpression.setType(functionCallExpression.getFunctionDefinition().getType().get());
        }

        return null;
    }

    // class StructAccess(Expression expression, String name)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		super.visit(structAccess, param);

        predicate(structAccess.getExpression().getType() instanceof StructType, "Expression must be of struct type", structAccess);

        if (structAccess.getExpression().getType() instanceof StructType) {
            StructType structType = (StructType) structAccess.getExpression().getType();
            for (FieldDefinition fieldDefinition : structType.getStructDefinition().getFieldDefinitions()) {
                if (fieldDefinition.getName().equals(structAccess.getName())) {
                    structAccess.setType(fieldDefinition.getType());
                }
            }
        }

		structAccess.setLvalue(true);

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

        super.visit(arrayAccess, param);

        predicate(arrayAccess.getLeft().getType() instanceof ArrayType, "Expression must be of array type", arrayAccess);

		if (arrayAccess.getLeft().getType() instanceof ArrayType) {

            predicate(arrayAccess.getRight().getType() instanceof IntType, "Index must be of type IntType", arrayAccess);
            ArrayType arrayType = (ArrayType) arrayAccess.getLeft().getType();
            arrayAccess.setType(arrayType.getType());
        }

		arrayAccess.setLvalue(true);

		return null;
	}

     // class Cast(Type castType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

		super.visit(cast, param);

        Type castType = cast.getCastType();
        Expression expression = cast.getExpression();

        predicate(!sameType(castType, expression.getType()), "Types of cast and expression already match", cast);
        
		cast.setType(cast.getCastType());
		cast.setLvalue(false);

		return null;
	}

    // class Arithmetic(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {
        
        super.visit(arithmetic, param);

        Expression left = arithmetic.getLeft();
        Expression right = arithmetic.getRight();

        if (arithmetic.getOperator().equals("%")) {
            predicate(left.getType() instanceof IntType, "Left operand of '%' operator must be of type IntType", arithmetic);
            predicate(right.getType() instanceof IntType, "Right operand of '%' operator must be of type IntType", arithmetic);
        }
        else {
            predicate(left.getType() instanceof IntType || left.getType() instanceof FloatType, "Left operand of arithmetic operator must be of type IntType or FloatType", arithmetic);
            predicate(right.getType() instanceof IntType || right.getType() instanceof FloatType, "Right operand of arithmetic operator must be of type IntType or FloatType", arithmetic);
        }

        arithmetic.setLvalue(false);
        arithmetic.setType(left.getType());

		return null;
	}

    // class Comparison(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
    @Override
    public Object visit(Comparison comparison, Object param) {

        super.visit(comparison, param);

        predicate(isNum(comparison.getLeft().getType()), "Left operand of comparison operator must be of numeric type", comparison);
        predicate(isNum(comparison.getRight().getType()), "Right operand of comparison operator must be of numeric type", comparison);
        
        comparison.setType(new IntType());
        comparison.setLvalue(false);

        return null;
    }

    // class LogicBinary(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		super.visit(logicBinary, param);

        predicate(isNum(logicBinary.getLeft().getType()), "Left operand of logical binary operator must be of boolean type", logicBinary);
        predicate(isNum(logicBinary.getRight().getType()), "Right operand of logical binary operator must be of boolean type", logicBinary);
		
        logicBinary.setType(new IntType());
        logicBinary.setLvalue(false);

		return null;

	}

    // class LogicUnary(String operator, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		// logicUnary.getExpression().accept(this, param);
		super.visit(logicUnary, param);

		predicate(isNum(logicUnary.getExpression().getType()), "Operand of logical unary operator must be of boolean type", logicUnary);

        logicUnary.setType(new IntType());
        logicUnary.setLvalue(false);

		return null;
	}

    // ----------------------------------------------------------
    // Auxiliary methods

    private boolean sameType(Type typeA, Type typeB) {
        if (typeA == null || typeB == null)
            return false;

        return typeA.getClass().equals(typeB.getClass());
    }

    private boolean isNum(Type typeA) {
        return typeA instanceof IntType || typeA instanceof FloatType;
    }

    private boolean isPrimitive(Type typeA) {
        return typeA instanceof IntType || typeA instanceof FloatType || typeA instanceof CharType;
    }

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    // private void notifyError(String msg) {
    //     errorManager.notify("Type Checking", msg);
    // }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }

}
