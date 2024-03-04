// Generated with VGen 2.0.0

package ast.type;

import ast.expression.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	arrayType: type -> intLiteral:intLiteral type:type
	type -> 
*/
public class ArrayType extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// arrayType: type -> intLiteral type
	private IntLiteral intLiteral;
	private Type type;

    // ----------------------------------
    // Constructors

	public ArrayType(IntLiteral intLiteral, Type type) {
		super();

		if (intLiteral == null)
			throw new IllegalArgumentException("Parameter 'intLiteral' can't be null. Pass a non-null value or use 'intLiteral?' in the abstract grammar");
		this.intLiteral = intLiteral;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(intLiteral, type);
	}

	public ArrayType(Object intLiteral, Object type) {
		super();

        if (intLiteral == null)
            throw new IllegalArgumentException("Parameter 'intLiteral' can't be null. Pass a non-null value or use 'intLiteral?' in the abstract grammar");
		this.intLiteral = (IntLiteral) intLiteral;

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(intLiteral, type);
	}


    // ----------------------------------
    // arrayType: type -> intLiteral type

	// Child 'intLiteral' 

	public void setIntLiteral(IntLiteral intLiteral) {
		if (intLiteral == null)
			throw new IllegalArgumentException("Parameter 'intLiteral' can't be null. Pass a non-null value or use 'intLiteral?' in the abstract grammar");
		this.intLiteral = intLiteral;

	}

    public IntLiteral getIntLiteral() {
        return intLiteral;
    }


	// Child 'type' 

	public void setType(Type type) {
		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

	}

    public Type getType() {
        return type;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayType{" + " intLiteral=" + this.getIntLiteral() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
