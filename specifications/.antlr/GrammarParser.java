// Generated from c:/Users/dono/OneDrive - Universidad de Oviedo/Asignaturas/DLP/ProyectoDLP/specifications/Grammar.g4 by ANTLR 4.13.1

	import ast.*;
	import ast.type.*;
	import ast.statement.*;
	import ast.expression.*;
	import ast.definition.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_LITERAL=39, FLOAT_LITERAL=40, CHAR_LITERAL=41, IDENT=42, LINE_COMMENT=43, 
		MULTILINE_COMMENT=44, WHITESPACE=45;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_functionDefinition = 2, RULE_fields = 3, 
		RULE_field = 4, RULE_parameters = 5, RULE_parameter = 6, RULE_statement = 7, 
		RULE_expression = 8, RULE_arguments = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "functionDefinition", "fields", "field", "parameters", 
			"parameter", "statement", "expression", "arguments", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'('", "')'", 
			"','", "'print'", "'printsp'", "'println'", "'read'", "'='", "'if'", 
			"'else'", "'while'", "'return'", "'.'", "'['", "']'", "'<'", "'>'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", 
			"'!'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "IDENT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefinitionContext definition;
		public List<DefinitionContext> definitions = new ArrayList<DefinitionContext>();
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046511122L) != 0)) {
				{
				{
				setState(22);
				((ProgramContext)_localctx).definition = definition();
				((ProgramContext)_localctx).definitions.add(((ProgramContext)_localctx).definition);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).definitions); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Definition ast;
		public Token IDENT;
		public TypeContext type;
		public FieldsContext fields;
		public FunctionDefinitionContext functionDefinition;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__0);
				setState(32);
				((DefinitionContext)_localctx).IDENT = match(IDENT);
				setState(33);
				match(T__1);
				setState(34);
				((DefinitionContext)_localctx).type = type();
				setState(35);
				match(T__2);
				 ((DefinitionContext)_localctx).ast =  new VarDefinition(((DefinitionContext)_localctx).IDENT, ((DefinitionContext)_localctx).type.ast); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__3);
				setState(39);
				((DefinitionContext)_localctx).IDENT = match(IDENT);
				setState(40);
				match(T__4);
				setState(41);
				((DefinitionContext)_localctx).fields = fields();
				setState(42);
				match(T__5);
				 ((DefinitionContext)_localctx).ast =  new StructDefinition(((DefinitionContext)_localctx).IDENT, ((DefinitionContext)_localctx).fields.list); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				((DefinitionContext)_localctx).functionDefinition = functionDefinition();
				 ((DefinitionContext)_localctx).ast =  ((DefinitionContext)_localctx).functionDefinition.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token IDENT;
		public ParametersContext parameters;
		public TypeContext type;
		public DefinitionContext definition;
		public List<DefinitionContext> definitions = new ArrayList<DefinitionContext>();
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((FunctionDefinitionContext)_localctx).IDENT = match(IDENT);
				setState(51);
				match(T__6);
				setState(52);
				((FunctionDefinitionContext)_localctx).parameters = parameters();
				setState(53);
				match(T__7);
				setState(54);
				match(T__1);
				setState(55);
				((FunctionDefinitionContext)_localctx).type = type();
				setState(56);
				match(T__4);
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						((FunctionDefinitionContext)_localctx).definition = definition();
						((FunctionDefinitionContext)_localctx).definitions.add(((FunctionDefinitionContext)_localctx).definition);
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(63);
					((FunctionDefinitionContext)_localctx).statement = statement();
					((FunctionDefinitionContext)_localctx).statements.add(((FunctionDefinitionContext)_localctx).statement);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(T__5);
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).IDENT, ((FunctionDefinitionContext)_localctx).parameters.list, ((FunctionDefinitionContext)_localctx).type.ast, ((FunctionDefinitionContext)_localctx).definitions, ((FunctionDefinitionContext)_localctx).statements); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((FunctionDefinitionContext)_localctx).IDENT = match(IDENT);
				setState(73);
				match(T__6);
				setState(74);
				((FunctionDefinitionContext)_localctx).parameters = parameters();
				setState(75);
				match(T__7);
				setState(76);
				match(T__4);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						((FunctionDefinitionContext)_localctx).definition = definition();
						((FunctionDefinitionContext)_localctx).definitions.add(((FunctionDefinitionContext)_localctx).definition);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(83);
					((FunctionDefinitionContext)_localctx).statement = statement();
					((FunctionDefinitionContext)_localctx).statements.add(((FunctionDefinitionContext)_localctx).statement);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__5);
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).IDENT, ((FunctionDefinitionContext)_localctx).parameters.list, null, ((FunctionDefinitionContext)_localctx).definitions, ((FunctionDefinitionContext)_localctx).statements); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldsContext extends ParserRuleContext {
		public List<Field> list = new ArrayList<Field>();
		public FieldContext field;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(94);
				((FieldsContext)_localctx).field = field();
				_localctx.list.add(((FieldsContext)_localctx).field.ast);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public Field ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((FieldContext)_localctx).IDENT = match(IDENT);
			setState(103);
			match(T__1);
			setState(104);
			((FieldContext)_localctx).type = type();
			setState(105);
			match(T__2);
			 ((FieldContext)_localctx).ast =  new Field(((FieldContext)_localctx).IDENT, ((FieldContext)_localctx).type.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<Parameter> list = new ArrayList<Parameter>();
		public ParameterContext p1;
		public ParameterContext p2;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(108);
				((ParametersContext)_localctx).p1 = parameter();
				 _localctx.list.add(((ParametersContext)_localctx).p1.ast); 
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(110);
					match(T__8);
					setState(111);
					((ParametersContext)_localctx).p2 = parameter();
					_localctx.list.add(((ParametersContext)_localctx).p2.ast);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Parameter ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((ParameterContext)_localctx).IDENT = match(IDENT);
			setState(122);
			match(T__1);
			setState(123);
			((ParameterContext)_localctx).type = type();
			 ((ParameterContext)_localctx).ast =  new Parameter(((ParameterContext)_localctx).IDENT, ((ParameterContext)_localctx).type.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext expression;
		public ExpressionContext e;
		public ExpressionContext left;
		public ExpressionContext right;
		public StatementContext statement;
		public List<StatementContext> ifStatements = new ArrayList<StatementContext>();
		public List<StatementContext> elseStatements = new ArrayList<StatementContext>();
		public List<StatementContext> loopStatements = new ArrayList<StatementContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				((StatementContext)_localctx).expression = expression(0);
				setState(128);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__12);
				setState(132);
				((StatementContext)_localctx).expression = expression(0);
				setState(133);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				((StatementContext)_localctx).e = expression(0);
				setState(137);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Call(((StatementContext)_localctx).e.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				((StatementContext)_localctx).left = expression(0);
				setState(141);
				match(T__13);
				setState(142);
				((StatementContext)_localctx).right = expression(0);
				setState(143);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(T__14);
				setState(147);
				match(T__6);
				setState(148);
				((StatementContext)_localctx).e = expression(0);
				setState(149);
				match(T__7);
				setState(150);
				match(T__4);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(151);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__5);
				setState(158);
				match(T__15);
				setState(159);
				match(T__4);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(160);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).elseStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).ifStatements, ((StatementContext)_localctx).elseStatements); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(T__14);
				setState(170);
				match(T__6);
				setState(171);
				((StatementContext)_localctx).e = expression(0);
				setState(172);
				match(T__7);
				setState(173);
				match(T__4);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(174);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).ifStatements, null); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(T__16);
				setState(184);
				match(T__6);
				setState(185);
				((StatementContext)_localctx).e = expression(0);
				setState(186);
				match(T__7);
				setState(187);
				match(T__4);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(188);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).loopStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).loopStatements); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(T__17);
				setState(198);
				((StatementContext)_localctx).e = expression(0);
				setState(199);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).e.ast); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(T__17);
				setState(203);
				match(T__2);
				((StatementContext)_localctx).ast =  new Return(null); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e;
		public ExpressionContext left;
		public Token IDENT;
		public Token INT_LITERAL;
		public Token FLOAT_LITERAL;
		public Token CHAR_LITERAL;
		public ArgumentsContext arguments;
		public ExpressionContext expression;
		public TypeContext type;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(208);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).IDENT); 
				}
				break;
			case 2:
				{
				setState(210);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_LITERAL); 
				}
				break;
			case 3:
				{
				setState(212);
				((ExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new FloatLiteral(((ExpressionContext)_localctx).FLOAT_LITERAL); 
				}
				break;
			case 4:
				{
				setState(214);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 5:
				{
				setState(216);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				setState(217);
				match(T__6);
				setState(218);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(219);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).IDENT, ((ExpressionContext)_localctx).arguments.list); 
				}
				break;
			case 6:
				{
				setState(222);
				match(T__6);
				setState(223);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(224);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 7:
				{
				setState(227);
				match(T__21);
				setState(228);
				((ExpressionContext)_localctx).type = type();
				setState(229);
				match(T__22);
				setState(230);
				match(T__6);
				setState(231);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(232);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 8:
				{
				setState(235);
				match(T__34);
				setState(236);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(1);
				 ((ExpressionContext)_localctx).ast =  new LogicNot(((ExpressionContext)_localctx).e.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(242);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(247);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(252);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1623195648L) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(257);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						 ((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(T__32);
						setState(263);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						 ((ExpressionContext)_localctx).ast =  new LogicAnd(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						match(T__33);
						setState(268);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						 ((ExpressionContext)_localctx).ast =  new LogicOr(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(272);
						match(T__18);
						setState(273);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).e.ast, ((ExpressionContext)_localctx).IDENT); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(276);
						match(T__19);
						setState(277);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(278);
						match(T__20);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701141120L) != 0)) {
				{
				setState(286);
				((ArgumentsContext)_localctx).e1 = expression(0);
				 _localctx.list.add(((ArgumentsContext)_localctx).e1.ast); 
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(288);
					match(T__8);
					setState(289);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.list.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token INT_LITERAL;
		public TypeContext type;
		public Token IDENT;
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__35);
				 ((TypeContext)_localctx).ast =  new IntType(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__36);
				 ((TypeContext)_localctx).ast =  new FloatType(); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(T__37);
				 ((TypeContext)_localctx).ast =  new CharType(); 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(T__19);
				setState(306);
				((TypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(307);
				match(T__20);
				setState(308);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).INT_LITERAL, ((TypeContext)_localctx).type.ast); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).IDENT); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u013c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"1\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002"+
		">\t\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t"+
		"\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005s\b\u0005\n\u0005\f\u0005v\t\u0005\u0003\u0005x\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007\n\u0007\f\u0007"+
		"\u00a5\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b0\b\u0007"+
		"\n\u0007\f\u0007\u00b3\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f0\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u011a\b\b\n\b\f\b\u011d\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u0125\b\t\n\t\f\t\u0128\t\t\u0003\t\u012a"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u013a\b\n\u0001\n\u0000"+
		"\u0001\u0010\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0005\u0001\u0000\n\f\u0001\u0000\u0018\u001a\u0001\u0000\u001b"+
		"\u001c\u0002\u0000\u0016\u0017\u001d\u001e\u0001\u0000\u001f \u015c\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004\\"+
		"\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\bf\u0001\u0000"+
		"\u0000\u0000\nw\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e"+
		"\u00cd\u0001\u0000\u0000\u0000\u0010\u00ef\u0001\u0000\u0000\u0000\u0012"+
		"\u0129\u0001\u0000\u0000\u0000\u0014\u0139\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d"+
		"\u001e\u0006\u0000\uffff\uffff\u0000\u001e\u0001\u0001\u0000\u0000\u0000"+
		"\u001f \u0005\u0001\u0000\u0000 !\u0005*\u0000\u0000!\"\u0005\u0002\u0000"+
		"\u0000\"#\u0003\u0014\n\u0000#$\u0005\u0003\u0000\u0000$%\u0006\u0001"+
		"\uffff\uffff\u0000%1\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000"+
		"\'(\u0005*\u0000\u0000()\u0005\u0005\u0000\u0000)*\u0003\u0006\u0003\u0000"+
		"*+\u0005\u0006\u0000\u0000+,\u0006\u0001\uffff\uffff\u0000,1\u0001\u0000"+
		"\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0006\u0001\uffff\uffff\u0000"+
		"/1\u0001\u0000\u0000\u00000\u001f\u0001\u0000\u0000\u00000&\u0001\u0000"+
		"\u0000\u00000-\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u0000"+
		"23\u0005*\u0000\u000034\u0005\u0007\u0000\u000045\u0003\n\u0005\u0000"+
		"56\u0005\b\u0000\u000067\u0005\u0002\u0000\u000078\u0003\u0014\n\u0000"+
		"8<\u0005\u0005\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=B\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0003"+
		"\u000e\u0007\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0006\u0002"+
		"\uffff\uffff\u0000G]\u0001\u0000\u0000\u0000HI\u0005*\u0000\u0000IJ\u0005"+
		"\u0007\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\b\u0000\u0000LP\u0005"+
		"\u0005\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QV\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0003\u000e"+
		"\u0007\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000Z[\u0006\u0002\uffff"+
		"\uffff\u0000[]\u0001\u0000\u0000\u0000\\2\u0001\u0000\u0000\u0000\\H\u0001"+
		"\u0000\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0003\b\u0004\u0000"+
		"_`\u0006\u0003\uffff\uffff\u0000`b\u0001\u0000\u0000\u0000a^\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u0007\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000fg\u0005*\u0000\u0000gh\u0005\u0002\u0000\u0000hi\u0003\u0014\n"+
		"\u0000ij\u0005\u0003\u0000\u0000jk\u0006\u0004\uffff\uffff\u0000k\t\u0001"+
		"\u0000\u0000\u0000lm\u0003\f\u0006\u0000mt\u0006\u0005\uffff\uffff\u0000"+
		"no\u0005\t\u0000\u0000op\u0003\f\u0006\u0000pq\u0006\u0005\uffff\uffff"+
		"\u0000qs\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wl\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0005*\u0000"+
		"\u0000z{\u0005\u0002\u0000\u0000{|\u0003\u0014\n\u0000|}\u0006\u0006\uffff"+
		"\uffff\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0007\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\u0010\b\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081"+
		"\u0082\u0006\u0007\uffff\uffff\u0000\u0082\u00ce\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085"+
		"\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0006\u0007\uffff\uffff\u0000"+
		"\u0087\u00ce\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u0010\b\u0000\u0089"+
		"\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0006\u0007\uffff\uffff\u0000"+
		"\u008b\u00ce\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0010\b\u0000\u008d"+
		"\u008e\u0005\u000e\u0000\u0000\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090"+
		"\u0005\u0003\u0000\u0000\u0090\u0091\u0006\u0007\uffff\uffff\u0000\u0091"+
		"\u00ce\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093"+
		"\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u0003\u0010\b\u0000\u0095\u0096"+
		"\u0005\b\u0000\u0000\u0096\u009a\u0005\u0005\u0000\u0000\u0097\u0099\u0003"+
		"\u000e\u0007\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005\u0006\u0000\u0000\u009e\u009f\u0005"+
		"\u0010\u0000\u0000\u009f\u00a3\u0005\u0005\u0000\u0000\u00a0\u00a2\u0003"+
		"\u000e\u0007\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0006"+
		"\u0007\uffff\uffff\u0000\u00a8\u00ce\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u000f\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac"+
		"\u0003\u0010\b\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00b1\u0005"+
		"\u0005\u0000\u0000\u00ae\u00b0\u0003\u000e\u0007\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0006\u0000\u0000\u00b5\u00b6\u0006\u0007\uffff\uffff\u0000\u00b6\u00ce"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0011\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0007\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb\u0005"+
		"\b\u0000\u0000\u00bb\u00bf\u0005\u0005\u0000\u0000\u00bc\u00be\u0003\u000e"+
		"\u0007\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0006\u0007"+
		"\uffff\uffff\u0000\u00c4\u00ce\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0012\u0000\u0000\u00c6\u00c7\u0003\u0010\b\u0000\u00c7\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c8\u00c9\u0006\u0007\uffff\uffff\u0000\u00c9\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0003\u0000\u0000\u00cc\u00ce\u0006\u0007\uffff\uffff\u0000\u00cd~\u0001"+
		"\u0000\u0000\u0000\u00cd\u0083\u0001\u0000\u0000\u0000\u00cd\u0088\u0001"+
		"\u0000\u0000\u0000\u00cd\u008c\u0001\u0000\u0000\u0000\u00cd\u0092\u0001"+
		"\u0000\u0000\u0000\u00cd\u00a9\u0001\u0000\u0000\u0000\u00cd\u00b7\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ce\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006"+
		"\b\uffff\uffff\u0000\u00d0\u00d1\u0005*\u0000\u0000\u00d1\u00f0\u0006"+
		"\b\uffff\uffff\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3\u00f0\u0006"+
		"\b\uffff\uffff\u0000\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00f0\u0006"+
		"\b\uffff\uffff\u0000\u00d6\u00d7\u0005)\u0000\u0000\u00d7\u00f0\u0006"+
		"\b\uffff\uffff\u0000\u00d8\u00d9\u0005*\u0000\u0000\u00d9\u00da\u0005"+
		"\u0007\u0000\u0000\u00da\u00db\u0003\u0012\t\u0000\u00db\u00dc\u0005\b"+
		"\u0000\u0000\u00dc\u00dd\u0006\b\uffff\uffff\u0000\u00dd\u00f0\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000\u00df\u00e0\u0003\u0010"+
		"\b\u0000\u00e0\u00e1\u0005\b\u0000\u0000\u00e1\u00e2\u0006\b\uffff\uffff"+
		"\u0000\u00e2\u00f0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0016\u0000"+
		"\u0000\u00e4\u00e5\u0003\u0014\n\u0000\u00e5\u00e6\u0005\u0017\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7\u00e8\u0003\u0010\b\u0000\u00e8"+
		"\u00e9\u0005\b\u0000\u0000\u00e9\u00ea\u0006\b\uffff\uffff\u0000\u00ea"+
		"\u00f0\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005#\u0000\u0000\u00ec\u00ed"+
		"\u0003\u0010\b\u0001\u00ed\u00ee\u0006\b\uffff\uffff\u0000\u00ee\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ef\u00cf\u0001\u0000\u0000\u0000\u00ef\u00d2"+
		"\u0001\u0000\u0000\u0000\u00ef\u00d4\u0001\u0000\u0000\u0000\u00ef\u00d6"+
		"\u0001\u0000\u0000\u0000\u00ef\u00d8\u0001\u0000\u0000\u0000\u00ef\u00de"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00eb"+
		"\u0001\u0000\u0000\u0000\u00f0\u011b\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\n\u0007\u0000\u0000\u00f2\u00f3\u0007\u0001\u0000\u0000\u00f3\u00f4\u0003"+
		"\u0010\b\b\u00f4\u00f5\u0006\b\uffff\uffff\u0000\u00f5\u011a\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\n\u0006\u0000\u0000\u00f7\u00f8\u0007\u0002\u0000"+
		"\u0000\u00f8\u00f9\u0003\u0010\b\u0007\u00f9\u00fa\u0006\b\uffff\uffff"+
		"\u0000\u00fa\u011a\u0001\u0000\u0000\u0000\u00fb\u00fc\n\u0005\u0000\u0000"+
		"\u00fc\u00fd\u0007\u0003\u0000\u0000\u00fd\u00fe\u0003\u0010\b\u0006\u00fe"+
		"\u00ff\u0006\b\uffff\uffff\u0000\u00ff\u011a\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\n\u0004\u0000\u0000\u0101\u0102\u0007\u0004\u0000\u0000\u0102\u0103"+
		"\u0003\u0010\b\u0005\u0103\u0104\u0006\b\uffff\uffff\u0000\u0104\u011a"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\n\u0003\u0000\u0000\u0106\u0107\u0005"+
		"!\u0000\u0000\u0107\u0108\u0003\u0010\b\u0004\u0108\u0109\u0006\b\uffff"+
		"\uffff\u0000\u0109\u011a\u0001\u0000\u0000\u0000\u010a\u010b\n\u0002\u0000"+
		"\u0000\u010b\u010c\u0005\"\u0000\u0000\u010c\u010d\u0003\u0010\b\u0003"+
		"\u010d\u010e\u0006\b\uffff\uffff\u0000\u010e\u011a\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\n\u000b\u0000\u0000\u0110\u0111\u0005\u0013\u0000\u0000\u0111"+
		"\u0112\u0005*\u0000\u0000\u0112\u011a\u0006\b\uffff\uffff\u0000\u0113"+
		"\u0114\n\n\u0000\u0000\u0114\u0115\u0005\u0014\u0000\u0000\u0115\u0116"+
		"\u0003\u0010\b\u0000\u0116\u0117\u0005\u0015\u0000\u0000\u0117\u0118\u0006"+
		"\b\uffff\uffff\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u00f1\u0001"+
		"\u0000\u0000\u0000\u0119\u00f6\u0001\u0000\u0000\u0000\u0119\u00fb\u0001"+
		"\u0000\u0000\u0000\u0119\u0100\u0001\u0000\u0000\u0000\u0119\u0105\u0001"+
		"\u0000\u0000\u0000\u0119\u010a\u0001\u0000\u0000\u0000\u0119\u010f\u0001"+
		"\u0000\u0000\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0011\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0003\u0010\b\u0000\u011f\u0126\u0006\t"+
		"\uffff\uffff\u0000\u0120\u0121\u0005\t\u0000\u0000\u0121\u0122\u0003\u0010"+
		"\b\u0000\u0122\u0123\u0006\t\uffff\uffff\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u011e\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u0013\u0001\u0000\u0000\u0000\u012b\u012c\u0005$\u0000"+
		"\u0000\u012c\u013a\u0006\n\uffff\uffff\u0000\u012d\u012e\u0005%\u0000"+
		"\u0000\u012e\u013a\u0006\n\uffff\uffff\u0000\u012f\u0130\u0005&\u0000"+
		"\u0000\u0130\u013a\u0006\n\uffff\uffff\u0000\u0131\u0132\u0005\u0014\u0000"+
		"\u0000\u0132\u0133\u0005\'\u0000\u0000\u0133\u0134\u0005\u0015\u0000\u0000"+
		"\u0134\u0135\u0003\u0014\n\u0000\u0135\u0136\u0006\n\uffff\uffff\u0000"+
		"\u0136\u013a\u0001\u0000\u0000\u0000\u0137\u0138\u0005*\u0000\u0000\u0138"+
		"\u013a\u0006\n\uffff\uffff\u0000\u0139\u012b\u0001\u0000\u0000\u0000\u0139"+
		"\u012d\u0001\u0000\u0000\u0000\u0139\u012f\u0001\u0000\u0000\u0000\u0139"+
		"\u0131\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u00190<BPV\\ctw\u009a\u00a3\u00b1"+
		"\u00bf\u00cd\u00ef\u0119\u011b\u0126\u0129\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}