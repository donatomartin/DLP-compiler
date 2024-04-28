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
	functionDefinition: definition -> name:string parameters:varDefinition* type:type? localVariables:varDefinition* statements:statement*
	definition -> 
	
	PHASE MemoryAllocation
	functionDefinition -> address:int
*/
public class FunctionDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// functionDefinition: definition -> string parameters:varDefinition* type? localVariables:varDefinition* statement*
	private String name;
	private List<VarDefinition> parameters;
	private Optional<Type> type;
	private List<VarDefinition> localVariables;
	private List<Statement> statements;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> localVariables, List<Statement> statements) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

		if (type == null)
			type = Optional.empty();
		this.type = type;

		if (localVariables == null)
			localVariables = new ArrayList<>();
		this.localVariables = localVariables;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(name, parameters, type, localVariables, statements);
	}

	public FunctionDefinition(Object name, Object parameters, Object type, Object localVariables, Object statements) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.parameters = castList(parameters, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.type = castOptional(type, Type.class);
        this.localVariables = castList(localVariables, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(name, parameters, type, localVariables, statements);
	}


    // ----------------------------------
    // functionDefinition: definition -> string parameters:varDefinition* type? localVariables:varDefinition* statement*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'parameters:varDefinition*' 

	public void setParameters(List<VarDefinition> parameters) {
		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

	}

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    public Stream<VarDefinition> parameters() {
        return parameters.stream();
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


	// Child 'localVariables:varDefinition*' 

	public void setLocalVariables(List<VarDefinition> localVariables) {
		if (localVariables == null)
			localVariables = new ArrayList<>();
		this.localVariables = localVariables;

	}

    public List<VarDefinition> getLocalVariables() {
        return localVariables;
    }

    public Stream<VarDefinition> localVariables() {
        return localVariables.stream();
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
        return "FunctionDefinition{" + " name=" + this.getName() + " parameters=" + this.getParameters() + " type=" + this.getType() + " localVariables=" + this.getLocalVariables() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
