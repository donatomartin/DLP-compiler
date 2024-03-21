// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	logicUnary: expression -> operator:string expression:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class LogicUnary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// logicUnary: expression -> operator:string expression
	private String operator;
	private Expression expression;

    // ----------------------------------
    // Constructors

	public LogicUnary(String operator, Expression expression) {
		super();

		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		updatePositions(operator, expression);
	}

	public LogicUnary(Object operator, Object expression) {
		super();

        if (operator == null)
            throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = (operator instanceof Token) ? ((Token) operator).getText() : (String) operator;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

		updatePositions(operator, expression);
	}


    // ----------------------------------
    // logicUnary: expression -> operator:string expression

	// Child 'operator:string' 

	public void setOperator(String operator) {
		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

	}

    public String getOperator() {
        return operator;
    }


	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LogicUnary{" + " operator=" + this.getOperator() + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
