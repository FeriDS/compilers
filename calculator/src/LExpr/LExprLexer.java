// Generated from /home/feri/Documents/compilers/calculator/LExpr.g4 by ANTLR 4.13.2
package LExpr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPARENT=1, RPARENT=2, MULT=3, POW=4, DIV=5, MINUS=6, ADD=7, DOUBLE=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPARENT", "RPARENT", "MULT", "POW", "DIV", "MINUS", "ADD", "DOUBLE", 
			"WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", null, "'/'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPARENT", "RPARENT", "MULT", "POW", "DIV", "MINUS", "ADD", "DOUBLE", 
			"WS"
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


	public LExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LExpr.g4"; }

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
		"\u0004\u0000\tI\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u001f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007(\b\u0007\u000b"+
		"\u0007\f\u0007)\u0001\u0007\u0005\u0007-\b\u0007\n\u0007\f\u00070\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"7\b\u0007\u0001\u0007\u0005\u0007:\b\u0007\n\u0007\f\u0007=\t\u0007\u0003"+
		"\u0007?\b\u0007\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0001\u0000\u0002"+
		"\u0002\u0000\t\n  \u0001\u000009N\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0015"+
		"\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005\u0019"+
		"\u0001\u0000\u0000\u0000\u0007\u001e\u0001\u0000\u0000\u0000\t \u0001"+
		"\u0000\u0000\u0000\u000b\"\u0001\u0000\u0000\u0000\r$\u0001\u0000\u0000"+
		"\u0000\u000f>\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015\u0016\u0005(\u0000\u0000\u0016\u0002\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005)\u0000\u0000\u0018\u0004\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005*\u0000\u0000\u001a\u0006\u0001\u0000\u0000"+
		"\u0000\u001b\u001f\u0005^\u0000\u0000\u001c\u001d\u0005*\u0000\u0000\u001d"+
		"\u001f\u0005*\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001f\b\u0001\u0000\u0000\u0000 !\u0005/\u0000"+
		"\u0000!\n\u0001\u0000\u0000\u0000\"#\u0005-\u0000\u0000#\f\u0001\u0000"+
		"\u0000\u0000$%\u0005+\u0000\u0000%\u000e\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0013\t\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*?\u0001\u0000\u0000"+
		"\u0000+-\u0003\u0013\t\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/6\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000012\u0005.\u0000\u000027\u0003\u0013"+
		"\t\u000034\u0003\u0013\t\u000045\u0005.\u0000\u000057\u0001\u0000\u0000"+
		"\u000061\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u00007;\u0001\u0000"+
		"\u0000\u00008:\u0003\u0013\t\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>\'\u0001\u0000\u0000\u0000"+
		">.\u0001\u0000\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@B\u0007\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0006\b\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0007\u0001\u0000"+
		"\u0000H\u0014\u0001\u0000\u0000\u0000\b\u0000\u001e).6;>C\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}