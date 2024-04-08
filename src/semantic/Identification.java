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

	private ContextMap<FunctionDefinition> functionDefinitions = new ContextMap<>();
	private ContextMap<VarDefinition> varDefinitions = new ContextMap<>();
	private ContextMap<StructDefinition> structDefinitions = new ContextMap<>();
	private ContextMap<FieldDefinition> fieldDefinitions = new ContextMap<>();

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		varDefinitions.set();

		if (functionDefinitions.getFromAny(functionDefinition.getName()) != null) {
			notifyError("Function " + functionDefinition.getName() + " already defined", functionDefinition);
			varDefinitions.reset();
			return null;
		}

		functionDefinitions.put(functionDefinition.getName(), functionDefinition);

		functionDefinition.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));
		functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));

		varDefinitions.reset();

		return null;
	}

	// class FunctionCallStatement(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		FunctionDefinition functionDefinition = functionDefinitions.getFromAny(functionCallStatement.getName());
		
		if (functionDefinition == null) {
			notifyError("Function " + functionCallStatement.getName() + " not defined", functionCallStatement);
			return null;
		}

		functionCallStatement.setFunctionDefinition(functionDefinition);

		functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));

		return null;
	}

	// class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		FunctionDefinition functionDefinition = functionDefinitions.getFromAny(functionCallExpression.getName());
		
		if (functionDefinition == null) {
			notifyError("Function " + functionCallExpression.getName() + " not defined", functionCallExpression);
			return null;
		}

		functionCallExpression.setFunctionDefinition(functionDefinition);

		functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));

		return null;
	}

	// class StructDefinition(String name, List<Field> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		if (structDefinitions.getFromTop(structDefinition.getName()) != null) {
			notifyError("Struct " + structDefinition.getName() + " already defined", structDefinition);
			return null;
		}

		structDefinitions.put(structDefinition.getName(), structDefinition);

		structDefinition.getFieldDefinitions().forEach(field -> field.accept(this, param));

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition structDefinition }
	@Override
	public Object visit(StructType structType, Object param) {

		StructDefinition structDefinition = structDefinitions.getFromAny(structType.getName());

		if (structDefinition == null) {
			notifyError("Struct " + structType.getName() + " not defined", structType);
			return null;
		}

		for (FieldDefinition field : structDefinition.getFieldDefinitions()) {
			field.accept(this, param);
		}

		structType.setStructDefinition(structDefinition);

		return null;
	}

	// class Field(String name, Type type)
	@Override
	public Object visit(FieldDefinition field, Object param) {

		if (fieldDefinitions.getFromTop(field.getName()) != null) {
			notifyError("Field " + field.getName() + " already defined", field);
			return null;
		}

		field.getType().accept(this, param);

		fieldDefinitions.put(field.getName(), field);

		return null;
	}

	// class StructAccess(Expression expression, String name)
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		structAccess.getExpression().accept(this, param);

		return null;
	}

	// class VarDefinition(String name, Type type)
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		if (varDefinitions.getFromTop(varDefinition.getName()) != null) {
			notifyError("Variable " + varDefinition.getName() + " already defined", varDefinition);
			return null;
		}

		varDefinitions.put(varDefinition.getName(), varDefinition);

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	@Override
	public Object visit(Variable variable, Object param) {

		VarDefinition varDefinition = varDefinitions.getFromAny(variable.getName());

		if (varDefinition == null) {
			notifyError("Variable " + variable.getName() + " not defined", variable);
			return null;
		}

		variable.setVarDefinition(varDefinition);

		return null;
	}


    // --------------------------------------------------------
    // Auxiliary methods

	private void notifyError(String msg, AST node) {
		notifyError(msg, node.start());
	}
	
    private void notifyError(String msg, Position position) {
		errorManager.notify("Identification", msg, position);
    }
	
	// private void notifyError(String msg) {
	//     errorManager.notify("Identification", msg);
	// }

}
