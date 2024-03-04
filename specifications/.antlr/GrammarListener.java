// Generated from c:/Users/dono/OneDrive - Universidad de Oviedo/Asignaturas/DLP/ProyectoDLP/specifications/Grammar.g4 by ANTLR 4.13.1

	import ast.*;
	import ast.type.*;
	import ast.statement.*;
	import ast.expression.*;
	import ast.definition.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(GrammarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(GrammarParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(GrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(GrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(GrammarParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(GrammarParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
}