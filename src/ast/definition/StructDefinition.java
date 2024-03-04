// Generated with VGen 2.0.0

package ast.definition;

import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structDefinition: definition -> name:string fields:field*
	definition -> 
*/
public class StructDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// structDefinition: definition -> string field*
	private String name;
	private List<Field> fields;

    // ----------------------------------
    // Constructors

	public StructDefinition(String name, List<Field> fields) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (fields == null)
			fields = new ArrayList<>();
		this.fields = fields;

		updatePositions(name, fields);
	}

	public StructDefinition(Object name, Object fields) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.fields = castList(fields, unwrapIfContext.andThen(Field.class::cast));
		updatePositions(name, fields);
	}


    // ----------------------------------
    // structDefinition: definition -> string field*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'field*' 

	public void setFields(List<Field> fields) {
		if (fields == null)
			fields = new ArrayList<>();
		this.fields = fields;

	}

    public List<Field> getFields() {
        return fields;
    }

    public Stream<Field> fields() {
        return fields.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructDefinition{" + " name=" + this.getName() + " fields=" + this.getFields() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
