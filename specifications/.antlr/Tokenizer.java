// Generated from c:/Users/dono/OneDrive - Universidad de Oviedo/Asignaturas/DLP/ProyectoDLP/specifications/Tokenizer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Tokenizer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LITERAL=1, FLOAT_LITERAL=2, CHAR_LITERAL=3, IDENT=4, LINE_COMMENT=5, 
		MULTILINE_COMMENT=6, WHITESPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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


	public Tokenizer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokenizer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0001\u0004"+
		"\u0001\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t"+
		"\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005K\b\u0005\n\u0005"+
		"\f\u0005N\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006V\b\u0006\u000b\u0006\f\u0006W\u0001\u0006"+
		"\u0001\u0006\u0002>L\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0006\u0001\u000009\u0002"+
		"\u0000\n\n\r\r\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0001\n\n\u0003"+
		"\u0000\t\n\r\r  b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000"+
		"\u0000\u0003\u0015\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u00071\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000bF\u0001"+
		"\u0000\u0000\u0000\rU\u0001\u0000\u0000\u0000\u000f\u0011\u0007\u0000"+
		"\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0002\u0001\u0000\u0000\u0000\u0014\u0016\u0007\u0000"+
		"\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0005.\u0000"+
		"\u0000\u001a\u001c\u0007\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0004\u0001\u0000\u0000"+
		"\u0000\u001f \u0005 \u0000\u0000 !\u0005\'\u0000\u0000!\"\u0005 \u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\b\u0001\u0000\u0000$%\u0005 \u0000"+
		"\u0000%&\u0005\'\u0000\u0000&0\u0005 \u0000\u0000\'(\u0005 \u0000\u0000"+
		"()\u0005\'\u0000\u0000)*\u0005 \u0000\u0000*+\u0005\\\u0000\u0000+,\u0005"+
		"n\u0000\u0000,-\u0005 \u0000\u0000-.\u0005\'\u0000\u0000.0\u0005 \u0000"+
		"\u0000/\u001f\u0001\u0000\u0000\u0000/\'\u0001\u0000\u0000\u00000\u0006"+
		"\u0001\u0000\u0000\u000015\u0007\u0002\u0000\u000024\u0007\u0003\u0000"+
		"\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\b\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000089\u0005/\u0000\u00009:\u0005/\u0000\u0000:>\u0001\u0000"+
		"\u0000\u0000;=\t\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0007\u0004\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\u0004\u0000"+
		"\u0000E\n\u0001\u0000\u0000\u0000FG\u0005/\u0000\u0000GH\u0005*\u0000"+
		"\u0000HL\u0001\u0000\u0000\u0000IK\t\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"*\u0000\u0000PQ\u0005/\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u0005"+
		"\u0000\u0000S\f\u0001\u0000\u0000\u0000TV\u0007\u0005\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\u0006\u0000"+
		"\u0000Z\u000e\u0001\u0000\u0000\u0000\n\u0000\u0012\u0017\u001d/5>BLW"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}