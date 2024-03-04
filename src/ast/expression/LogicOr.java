// Generated with VGen 2.0.0

package ast.expression;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	logicOr: expression -> left:expression right:expression
	expression -> 
*/
public class LogicOr extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// logicOr: expression -> left:expression right:expression
	private Expression left;
	private Expression right;

    // ----------------------------------
    // Constructors

	public LogicOr(Expression left, Expression right) {
		super();

		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

		updatePositions(left, right);
	}

	public LogicOr(Object left, Object right) {
		super();

        if (left == null)
            throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = (Expression) left;

        if (right == null)
            throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = (Expression) right;

		updatePositions(left, right);
	}


    // ----------------------------------
    // logicOr: expression -> left:expression right:expression

	// Child 'left:expression' 

	public void setLeft(Expression left) {
		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

	}

    public Expression getLeft() {
        return left;
    }


	// Child 'right:expression' 

	public void setRight(Expression right) {
		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

	}

    public Expression getRight() {
        return right;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LogicOr{" + " left=" + this.getLeft() + " right=" + this.getRight() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
