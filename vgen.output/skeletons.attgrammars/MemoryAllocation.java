// Generated with VGen 2.0.0

/*

Este fichero es un esqueleto para facilitar la implementación de una gramática atribuida
('ATTRIBUTE GRAMMAR' de VGen). Para usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha
   ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos los
   hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y se
   pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

NOTA 1. En los visit en los que haya que inicializar atributos heredados de los hijos
antes de recorrerlos, se han añadido recordatorios en los puntos en los que es
aconsejable hacerlo.

NOTA 2. En los visit de los nodos que tengan atributos sintetizados, se han añadido
recordatorios de que se deben inicializar dichos atributos.

*/

// TODO: write package name
// package ...;

import visitor.DefaultVisitor;
import ast.*;
import ast.definition.*;
import ast.statement.*;
import ast.type.*;
import ast.expression.*;


public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Definition> definitions)
	@Override
	public Object visit(Program program, Object param) {

        for (var varDefinition : program.definitions()
                .filter(VarDefinition.class::isInstance)
                .map(VarDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

        for (var structDefinition : program.definitions()
                .filter(StructDefinition.class::isInstance)
                .map(StructDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// structDefinition.setAddress(?);
		}

		// program.getDefinitions().forEach(definition -> definition.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class VarDefinition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getType().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class StructDefinition(String name, List<Field> fields)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// structDefinition.getFields().forEach(field -> field.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		for (var varDefinition : functionDefinition.getVarDefinitions()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

        for (var varDefinition : functionDefinition.definitions()
                .filter(VarDefinition.class::isInstance)
                .map(VarDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

        for (var structDefinition : functionDefinition.definitions()
                .filter(StructDefinition.class::isInstance)
                .map(StructDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// structDefinition.setAddress(?);
		}

		// functionDefinition.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		// functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));
		// functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

	// class Field(String name, Type type)
	@Override
	public Object visit(Field field, Object param) {

		// field.getType().accept(this, param);
		super.visit(field, param);

		return null;
	}

	// class Print(Expression expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Print print, Object param) {

		// print.getExpression().accept(this, param);
		super.visit(print, param);

		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Read read, Object param) {

		// read.getExpression().accept(this, param);
		super.visit(read, param);

		return null;
	}

	// class FunctionCallStatement(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		// functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallStatement, param);

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Assignment assignment, Object param) {

		// assignment.getLeft().accept(this, param);
		// assignment.getRight().accept(this, param);
		super.visit(assignment, param);

		return null;
	}

	// class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Conditional conditional, Object param) {

		// conditional.getExpression().accept(this, param);
		// conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
		// conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
		super.visit(conditional, param);

		return null;
	}

	// class While(Expression expression, List<Statement> loopStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(While whileValue, Object param) {

		// whileValue.getExpression().accept(this, param);
		// whileValue.getLoopStatements().forEach(statement -> statement.accept(this, param));
		super.visit(whileValue, param);

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnValue, param);

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

	// class ArrayType(int intValue, Type type)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		// arrayType.getType().accept(this, param);
		super.visit(arrayType, param);

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition structDefinition }
	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	// class IntLiteral(int intValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		return null;
	}

	// class FloatLiteral(float floatValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(FloatLiteral floatLiteral, Object param) {

		return null;
	}

	// class CharLiteral(char charValue)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		return null;
	}

	// class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		// functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpression, param);

		return null;
	}

	// class StructAccess(Expression expression, String name)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// structAccess.getExpression().accept(this, param);
		super.visit(structAccess, param);

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getLeft().accept(this, param);
		// arrayAccess.getRight().accept(this, param);
		super.visit(arrayAccess, param);

		return null;
	}

	// class Cast(Type castType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

		// cast.getCastType().accept(this, param);
		// cast.getExpression().accept(this, param);
		super.visit(cast, param);

		return null;
	}

	// class Arithmetic(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Arithmetic arithmetic, Object param) {

		// arithmetic.getLeft().accept(this, param);
		// arithmetic.getRight().accept(this, param);
		super.visit(arithmetic, param);

		return null;
	}

	// class Comparison(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Comparison comparison, Object param) {

		// comparison.getLeft().accept(this, param);
		// comparison.getRight().accept(this, param);
		super.visit(comparison, param);

		return null;
	}

	// class LogicBinary(Expression left, String operator, Expression right)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		// logicBinary.getLeft().accept(this, param);
		// logicBinary.getRight().accept(this, param);
		super.visit(logicBinary, param);

		return null;
	}

	// class LogicUnary(String operator, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		// logicUnary.getExpression().accept(this, param);
		super.visit(logicUnary, param);

		return null;
	}

}
