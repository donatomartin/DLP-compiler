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

    // Visit Methods --------------------------------------------------------------

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
