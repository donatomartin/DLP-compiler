/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import ast.*;
import ast.definition.*;
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

    // class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {

        Expression left = assignment.getLeft();
        Expression right = assignment.getRight();
        
        predicate(sameType(left.getType(), right.getType()), "Types of left and right expressions do not match", assignment);
        predicate(left.isLvalue(), "Left expression must be an lvalue", assignment);
        
        super.visit(assignment, param);

		return null;
	}

    // class Arithmetic(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

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

		super.visit(arithmetic, param);

		return null;
	}

    // class Cast(Type castType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

        Type castType = cast.getCastType();
        Expression expression = cast.getExpression();

        predicate(sameType(castType, expression.getType()), "Types of cast and expression already match", cast);
        
		cast.setType(cast.getCastType());
		cast.setLvalue(false);

		super.visit(cast, param);

		return null;
	}

    

    // ----------------------------------------------------------
    // Auxiliary methods

    private boolean sameType(Type typeA, Type typeB) {
        return typeA.equals(typeB);
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
