// Generated with VGen 2.0.0

package ast.definition;

import ast.type.*;
import ast.statement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionDefinition: definition -> name:string varDefinitions:varDefinition* type:type? definitions:definition* statements:statement*
	definition -> 
	
	PHASE MemoryAllocation
	functionDefinition -> address:int
*/
public class FunctionDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// functionDefinition: definition -> string varDefinition* type? definition* statement*
	private String name;
	private List<VarDefinition> varDefinitions;
	private Optional<Type> type;
	private List<Definition> definitions;
	private List<Statement> statements;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (varDefinitions == null)
			varDefinitions = new ArrayList<>();
		this.varDefinitions = varDefinitions;

		if (type == null)
			type = Optional.empty();
		this.type = type;

		if (definitions == null)
			definitions = new ArrayList<>();
		this.definitions = definitions;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(name, varDefinitions, type, definitions, statements);
	}

	public FunctionDefinition(Object name, Object varDefinitions, Object type, Object definitions, Object statements) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.varDefinitions = castList(varDefinitions, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.type = castOptional(type, Type.class);
        this.definitions = castList(definitions, unwrapIfContext.andThen(Definition.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(name, varDefinitions, type, definitions, statements);
	}


    // ----------------------------------
    // functionDefinition: definition -> string varDefinition* type? definition* statement*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'varDefinition*' 

	public void setVarDefinitions(List<VarDefinition> varDefinitions) {
		if (varDefinitions == null)
			varDefinitions = new ArrayList<>();
		this.varDefinitions = varDefinitions;

	}

    public List<VarDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public Stream<VarDefinition> varDefinitions() {
        return varDefinitions.stream();
    }


	// Child 'type?' 

	public void setType(Optional<Type> type) {
		if (type == null)
			type = Optional.empty();
		this.type = type;

	}

    public Optional<Type> getType() {
        return type;
    }


	// Child 'definition*' 

	public void setDefinitions(List<Definition> definitions) {
		if (definitions == null)
			definitions = new ArrayList<>();
		this.definitions = definitions;

	}

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public Stream<Definition> definitions() {
        return definitions.stream();
    }


	// Child 'statement*' 

	public void setStatements(List<Statement> statements) {
		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

	}

    public List<Statement> getStatements() {
        return statements;
    }

    public Stream<Statement> statements() {
        return statements.stream();
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" + " name=" + this.getName() + " varDefinitions=" + this.getVarDefinitions() + " type=" + this.getType() + " definitions=" + this.getDefinitions() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
