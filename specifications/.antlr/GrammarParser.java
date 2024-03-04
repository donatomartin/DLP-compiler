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
		RULE_program = 0, RULE_definition = 1, RULE_fields = 2, RULE_field = 3, 
		RULE_parameters = 4, RULE_parameter = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_arguments = 8, RULE_type = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "fields", "field", "parameters", "parameter", 
			"statement", "expression", "arguments", "type"
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046511122L) != 0)) {
				{
				{
				setState(20);
				((ProgramContext)_localctx).definition = definition();
				((ProgramContext)_localctx).definitions.add(((ProgramContext)_localctx).definition);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
		public ParametersContext parameters;
		public DefinitionContext definition;
		public List<DefinitionContext> definitions = new ArrayList<DefinitionContext>();
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				((DefinitionContext)_localctx).IDENT = match(IDENT);
				setState(31);
				match(T__1);
				setState(32);
				((DefinitionContext)_localctx).type = type();
				setState(33);
				match(T__2);
				 ((DefinitionContext)_localctx).ast =  new VarDefinition(((DefinitionContext)_localctx).IDENT, ((DefinitionContext)_localctx).type.ast); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__3);
				setState(37);
				((DefinitionContext)_localctx).IDENT = match(IDENT);
				setState(38);
				match(T__4);
				setState(39);
				((DefinitionContext)_localctx).fields = fields();
				setState(40);
				match(T__5);
				 ((DefinitionContext)_localctx).ast =  new StructDefinition(((DefinitionContext)_localctx).IDENT, ((DefinitionContext)_localctx).fields.list); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((DefinitionContext)_localctx).IDENT = match(IDENT);
				setState(44);
				match(T__6);
				setState(45);
				((DefinitionContext)_localctx).parameters = parameters();
				setState(46);
				match(T__7);
				setState(47);
				match(T__1);
				setState(48);
				((DefinitionContext)_localctx).type = type();
				setState(49);
				match(T__4);
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						((DefinitionContext)_localctx).definition = definition();
						((DefinitionContext)_localctx).definitions.add(((DefinitionContext)_localctx).definition);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(56);
					((DefinitionContext)_localctx).statement = statement();
					((DefinitionContext)_localctx).statements.add(((DefinitionContext)_localctx).statement);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(T__5);
				 ((DefinitionContext)_localctx).ast =  new FunctionDefinition(((DefinitionContext)_localctx).IDENT, ((DefinitionContext)_localctx).parameters.list, ((DefinitionContext)_localctx).type.ast, ((DefinitionContext)_localctx).definitions, ((DefinitionContext)_localctx).statements); 
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
		enterRule(_localctx, 4, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(67);
				((FieldsContext)_localctx).field = field();
				_localctx.list.add(((FieldsContext)_localctx).field.ast);
				}
				}
				setState(74);
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
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((FieldContext)_localctx).IDENT = match(IDENT);
			setState(76);
			match(T__1);
			setState(77);
			((FieldContext)_localctx).type = type();
			setState(78);
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
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(81);
				((ParametersContext)_localctx).p1 = parameter();
				 _localctx.list.add(((ParametersContext)_localctx).p1.ast); 
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(83);
					match(T__8);
					setState(84);
					((ParametersContext)_localctx).p2 = parameter();
					_localctx.list.add(((ParametersContext)_localctx).p2.ast);
					}
					}
					setState(91);
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
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((ParameterContext)_localctx).IDENT = match(IDENT);
			setState(95);
			match(T__1);
			setState(96);
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				((StatementContext)_localctx).expression = expression(0);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(101);
					match(T__8);
					setState(102);
					((StatementContext)_localctx).expression = expression(0);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__12);
				setState(112);
				((StatementContext)_localctx).expression = expression(0);
				setState(113);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((StatementContext)_localctx).expression = expression(0);
				setState(117);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Call(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				((StatementContext)_localctx).left = expression(0);
				setState(121);
				match(T__13);
				setState(122);
				((StatementContext)_localctx).right = expression(0);
				setState(123);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__14);
				setState(127);
				match(T__6);
				setState(128);
				((StatementContext)_localctx).expression = expression(0);
				setState(129);
				match(T__7);
				setState(130);
				match(T__4);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(131);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__5);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(138);
					match(T__15);
					setState(139);
					match(T__4);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
						{
						{
						setState(140);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).elseStatements.add(((StatementContext)_localctx).statement);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(146);
					match(T__5);
					}
				}

				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).ifStatements, ((StatementContext)_localctx).elseStatements); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(T__16);
				setState(152);
				match(T__6);
				setState(153);
				((StatementContext)_localctx).expression = expression(0);
				setState(154);
				match(T__7);
				setState(155);
				match(T__4);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701582464L) != 0)) {
					{
					{
					setState(156);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).loopStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).loopStatements); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				match(T__17);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701141120L) != 0)) {
					{
					setState(166);
					((StatementContext)_localctx).expression = expression(0);
					}
				}

				setState(169);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast); 
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
		public ExpressionContext left;
		public Token IDENT;
		public Token INT_LITERAL;
		public Token FLOAT_LITERAL;
		public Token CHAR_LITERAL;
		public ArgumentsContext arguments;
		public ExpressionContext expression;
		public TypeContext type;
		public ExpressionContext e;
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(174);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).IDENT); 
				}
				break;
			case 2:
				{
				setState(176);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_LITERAL); 
				}
				break;
			case 3:
				{
				setState(178);
				((ExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new FloatLiteral(((ExpressionContext)_localctx).FLOAT_LITERAL); 
				}
				break;
			case 4:
				{
				setState(180);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 5:
				{
				setState(182);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				setState(183);
				match(T__6);
				setState(184);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(185);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).IDENT, ((ExpressionContext)_localctx).arguments.list); 
				}
				break;
			case 6:
				{
				setState(188);
				match(T__6);
				setState(189);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(190);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 7:
				{
				setState(193);
				match(T__21);
				setState(194);
				((ExpressionContext)_localctx).type = type();
				setState(195);
				match(T__22);
				setState(196);
				match(T__6);
				setState(197);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(198);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 8:
				{
				setState(201);
				match(T__34);
				setState(202);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(1);
				 ((ExpressionContext)_localctx).ast =  new LogicNot(((ExpressionContext)_localctx).e.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
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
						setState(209);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(213);
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
						setState(214);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(218);
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
						setState(219);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
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
						setState(224);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						 ((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
						match(T__32);
						setState(229);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						 ((ExpressionContext)_localctx).ast =  new LogicAnd(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(233);
						match(T__33);
						setState(234);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						 ((ExpressionContext)_localctx).ast =  new LogicOr(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(238);
						match(T__18);
						setState(239);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).expression.ast, ((ExpressionContext)_localctx).IDENT); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(242);
						match(T__19);
						setState(243);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(244);
						match(T__20);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 16, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8280701141120L) != 0)) {
				{
				setState(252);
				((ArgumentsContext)_localctx).e1 = expression(0);
				 _localctx.list.add(((ArgumentsContext)_localctx).e1.ast); 
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(254);
					match(T__8);
					setState(255);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.list.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(262);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__35);
				 ((TypeContext)_localctx).ast =  new IntType(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__36);
				 ((TypeContext)_localctx).ast =  new FloatType(); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(T__37);
				 ((TypeContext)_localctx).ast =  new CharType(); 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(T__19);
				setState(272);
				((TypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(273);
				match(T__20);
				setState(274);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).INT_LITERAL, ((TypeContext)_localctx).type.ast); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
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
		case 7:
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
		"\u0004\u0001-\u011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u0001"+
		"7\t\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004\u0003\u0004]\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0085\b\u0006\n\u0006\f\u0006\u0088\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006"+
		"\u0091\t\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u009e\b\u0006\n\u0006\f\u0006\u00a1\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ce\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00f8\b\u0007\n\u0007\f\u0007\u00fb\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0103\b\b\n\b\f\b\u0106\t\b"+
		"\u0003\b\u0108\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0118"+
		"\b\t\u0001\t\u0000\u0001\u000e\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0005\u0001\u0000\n\f\u0001\u0000\u0018\u001a\u0001\u0000"+
		"\u001b\u001c\u0002\u0000\u0016\u0017\u001d\u001e\u0001\u0000\u001f \u0138"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004"+
		"H\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\b\\\u0001\u0000"+
		"\u0000\u0000\n^\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000\u0000\u0000"+
		"\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u0107\u0001\u0000\u0000\u0000"+
		"\u0012\u0117\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u001c\u0006\u0000\uffff\uffff"+
		"\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000"+
		"\u0000\u001e\u001f\u0005*\u0000\u0000\u001f \u0005\u0002\u0000\u0000 "+
		"!\u0003\u0012\t\u0000!\"\u0005\u0003\u0000\u0000\"#\u0006\u0001\uffff"+
		"\uffff\u0000#B\u0001\u0000\u0000\u0000$%\u0005\u0004\u0000\u0000%&\u0005"+
		"*\u0000\u0000&\'\u0005\u0005\u0000\u0000\'(\u0003\u0004\u0002\u0000()"+
		"\u0005\u0006\u0000\u0000)*\u0006\u0001\uffff\uffff\u0000*B\u0001\u0000"+
		"\u0000\u0000+,\u0005*\u0000\u0000,-\u0005\u0007\u0000\u0000-.\u0003\b"+
		"\u0004\u0000./\u0005\b\u0000\u0000/0\u0005\u0002\u0000\u000001\u0003\u0012"+
		"\t\u000015\u0005\u0005\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006;\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8:\u0003\f\u0006\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0006\u0001"+
		"\uffff\uffff\u0000@B\u0001\u0000\u0000\u0000A\u001d\u0001\u0000\u0000"+
		"\u0000A$\u0001\u0000\u0000\u0000A+\u0001\u0000\u0000\u0000B\u0003\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0006\u0003\u0000DE\u0006\u0002\uffff\uffff"+
		"\u0000EG\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0005"+
		"\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000"+
		"LM\u0005\u0002\u0000\u0000MN\u0003\u0012\t\u0000NO\u0005\u0003\u0000\u0000"+
		"OP\u0006\u0003\uffff\uffff\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0003"+
		"\n\u0005\u0000RY\u0006\u0004\uffff\uffff\u0000ST\u0005\t\u0000\u0000T"+
		"U\u0003\n\u0005\u0000UV\u0006\u0004\uffff\uffff\u0000VX\u0001\u0000\u0000"+
		"\u0000WS\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\Q\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]\t\u0001\u0000\u0000\u0000^_\u0005*\u0000\u0000_`\u0005\u0002\u0000\u0000"+
		"`a\u0003\u0012\t\u0000ab\u0006\u0005\uffff\uffff\u0000b\u000b\u0001\u0000"+
		"\u0000\u0000cd\u0007\u0000\u0000\u0000di\u0003\u000e\u0007\u0000ef\u0005"+
		"\t\u0000\u0000fh\u0003\u000e\u0007\u0000ge\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0003\u0000"+
		"\u0000mn\u0006\u0006\uffff\uffff\u0000n\u00ac\u0001\u0000\u0000\u0000"+
		"op\u0005\r\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0005\u0003\u0000\u0000"+
		"rs\u0006\u0006\uffff\uffff\u0000s\u00ac\u0001\u0000\u0000\u0000tu\u0003"+
		"\u000e\u0007\u0000uv\u0005\u0003\u0000\u0000vw\u0006\u0006\uffff\uffff"+
		"\u0000w\u00ac\u0001\u0000\u0000\u0000xy\u0003\u000e\u0007\u0000yz\u0005"+
		"\u000e\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0005\u0003\u0000\u0000"+
		"|}\u0006\u0006\uffff\uffff\u0000}\u00ac\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u000f\u0000\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0081"+
		"\u0003\u000e\u0007\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0086\u0005"+
		"\u0005\u0000\u0000\u0083\u0085\u0003\f\u0006\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0093\u0005\u0006"+
		"\u0000\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u008f\u0005\u0005"+
		"\u0000\u0000\u008c\u008e\u0003\f\u0006\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0005\u0006\u0000"+
		"\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0006\uffff"+
		"\uffff\u0000\u0096\u00ac\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0011"+
		"\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u009a\u0003\u000e"+
		"\u0007\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009f\u0005\u0005\u0000"+
		"\u0000\u009c\u009e\u0003\f\u0006\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000"+
		"\u00a3\u00a4\u0006\u0006\uffff\uffff\u0000\u00a4\u00ac\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0005\u0012\u0000\u0000\u00a6\u00a8\u0003\u000e\u0007"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000"+
		"\u0000\u00aa\u00ac\u0006\u0006\uffff\uffff\u0000\u00abc\u0001\u0000\u0000"+
		"\u0000\u00abo\u0001\u0000\u0000\u0000\u00abt\u0001\u0000\u0000\u0000\u00ab"+
		"x\u0001\u0000\u0000\u0000\u00ab~\u0001\u0000\u0000\u0000\u00ab\u0097\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0006\u0007\uffff\uffff\u0000\u00ae\u00af\u0005"+
		"*\u0000\u0000\u00af\u00ce\u0006\u0007\uffff\uffff\u0000\u00b0\u00b1\u0005"+
		"\'\u0000\u0000\u00b1\u00ce\u0006\u0007\uffff\uffff\u0000\u00b2\u00b3\u0005"+
		"(\u0000\u0000\u00b3\u00ce\u0006\u0007\uffff\uffff\u0000\u00b4\u00b5\u0005"+
		")\u0000\u0000\u00b5\u00ce\u0006\u0007\uffff\uffff\u0000\u00b6\u00b7\u0005"+
		"*\u0000\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00b9\u0003\u0010"+
		"\b\u0000\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00bb\u0006\u0007\uffff"+
		"\uffff\u0000\u00bb\u00ce\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0007"+
		"\u0000\u0000\u00bd\u00be\u0003\u000e\u0007\u0000\u00be\u00bf\u0005\b\u0000"+
		"\u0000\u00bf\u00c0\u0006\u0007\uffff\uffff\u0000\u00c0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000\u00c2\u00c3\u0003\u0012"+
		"\t\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u00c5\u0005\u0007\u0000"+
		"\u0000\u00c5\u00c6\u0003\u000e\u0007\u0000\u00c6\u00c7\u0005\b\u0000\u0000"+
		"\u00c7\u00c8\u0006\u0007\uffff\uffff\u0000\u00c8\u00ce\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca\u00cb\u0003\u000e\u0007\u0001"+
		"\u00cb\u00cc\u0006\u0007\uffff\uffff\u0000\u00cc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ad\u0001\u0000\u0000\u0000\u00cd\u00b0\u0001\u0000\u0000"+
		"\u0000\u00cd\u00b2\u0001\u0000\u0000\u0000\u00cd\u00b4\u0001\u0000\u0000"+
		"\u0000\u00cd\u00b6\u0001\u0000\u0000\u0000\u00cd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c1\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ce\u00f9\u0001\u0000\u0000\u0000\u00cf\u00d0\n\u0007\u0000\u0000"+
		"\u00d0\u00d1\u0007\u0001\u0000\u0000\u00d1\u00d2\u0003\u000e\u0007\b\u00d2"+
		"\u00d3\u0006\u0007\uffff\uffff\u0000\u00d3\u00f8\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\n\u0006\u0000\u0000\u00d5\u00d6\u0007\u0002\u0000\u0000\u00d6"+
		"\u00d7\u0003\u000e\u0007\u0007\u00d7\u00d8\u0006\u0007\uffff\uffff\u0000"+
		"\u00d8\u00f8\u0001\u0000\u0000\u0000\u00d9\u00da\n\u0005\u0000\u0000\u00da"+
		"\u00db\u0007\u0003\u0000\u0000\u00db\u00dc\u0003\u000e\u0007\u0006\u00dc"+
		"\u00dd\u0006\u0007\uffff\uffff\u0000\u00dd\u00f8\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\n\u0004\u0000\u0000\u00df\u00e0\u0007\u0004\u0000\u0000\u00e0"+
		"\u00e1\u0003\u000e\u0007\u0005\u00e1\u00e2\u0006\u0007\uffff\uffff\u0000"+
		"\u00e2\u00f8\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u0003\u0000\u0000\u00e4"+
		"\u00e5\u0005!\u0000\u0000\u00e5\u00e6\u0003\u000e\u0007\u0004\u00e6\u00e7"+
		"\u0006\u0007\uffff\uffff\u0000\u00e7\u00f8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\n\u0002\u0000\u0000\u00e9\u00ea\u0005\"\u0000\u0000\u00ea\u00eb"+
		"\u0003\u000e\u0007\u0003\u00eb\u00ec\u0006\u0007\uffff\uffff\u0000\u00ec"+
		"\u00f8\u0001\u0000\u0000\u0000\u00ed\u00ee\n\u000b\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0013\u0000\u0000\u00ef\u00f0\u0005*\u0000\u0000\u00f0\u00f8\u0006"+
		"\u0007\uffff\uffff\u0000\u00f1\u00f2\n\n\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0014\u0000\u0000\u00f3\u00f4\u0003\u000e\u0007\u0000\u00f4\u00f5\u0005"+
		"\u0015\u0000\u0000\u00f5\u00f6\u0006\u0007\uffff\uffff\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00cf\u0001\u0000\u0000\u0000\u00f7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00d9\u0001\u0000\u0000\u0000\u00f7\u00de"+
		"\u0001\u0000\u0000\u0000\u00f7\u00e3\u0001\u0000\u0000\u0000\u00f7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f7\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u000f"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0003\u000e\u0007\u0000\u00fd\u0104\u0006\b\uffff\uffff\u0000\u00fe\u00ff"+
		"\u0005\t\u0000\u0000\u00ff\u0100\u0003\u000e\u0007\u0000\u0100\u0101\u0006"+
		"\b\uffff\uffff\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00fe\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u00fc\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0011\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005$\u0000\u0000\u010a\u0118\u0006\t"+
		"\uffff\uffff\u0000\u010b\u010c\u0005%\u0000\u0000\u010c\u0118\u0006\t"+
		"\uffff\uffff\u0000\u010d\u010e\u0005&\u0000\u0000\u010e\u0118\u0006\t"+
		"\uffff\uffff\u0000\u010f\u0110\u0005\u0014\u0000\u0000\u0110\u0111\u0005"+
		"\'\u0000\u0000\u0111\u0112\u0005\u0015\u0000\u0000\u0112\u0113\u0003\u0012"+
		"\t\u0000\u0113\u0114\u0006\t\uffff\uffff\u0000\u0114\u0118\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005*\u0000\u0000\u0116\u0118\u0006\t\uffff"+
		"\uffff\u0000\u0117\u0109\u0001\u0000\u0000\u0000\u0117\u010b\u0001\u0000"+
		"\u0000\u0000\u0117\u010d\u0001\u0000\u0000\u0000\u0117\u010f\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0013\u0001\u0000"+
		"\u0000\u0000\u0014\u00175;AHY\\i\u0086\u008f\u0093\u009f\u00a7\u00ab\u00cd"+
		"\u00f7\u00f9\u0104\u0107\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}