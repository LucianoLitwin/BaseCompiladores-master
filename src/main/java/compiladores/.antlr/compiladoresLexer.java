// Generated from c:/Users/falet/Desktop/TC/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PYC=1, LLA=2, LLC=3, INT=4, IGUAL=5, DOUBLE=6, ID=7, NUMERO=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PYC", "LLA", "LLC", "INT", "IGUAL", "DOUBLE", "ID", 
			"NUMERO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'int'", "'='", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PYC", "LLA", "LLC", "INT", "IGUAL", "DOUBLE", "ID", "NUMERO", 
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\tF\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003"+
		"\b1\b\b\u0001\b\u0001\b\u0001\b\u0005\b6\b\b\n\b\f\b9\t\b\u0001\t\u0004"+
		"\t<\b\t\u000b\t\f\t=\u0001\n\u0004\nA\b\n\u000b\n\f\nB\u0001\n\u0001\n"+
		"\u0000\u0000\u000b\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003"+
		"\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  I\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000"+
		"\u0000\u0000\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001d\u0001\u0000"+
		"\u0000\u0000\t\u001f\u0001\u0000\u0000\u0000\u000b!\u0001\u0000\u0000"+
		"\u0000\r%\u0001\u0000\u0000\u0000\u000f\'\u0001\u0000\u0000\u0000\u0011"+
		"0\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015@\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0002\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0007\u0001\u0000\u0000\u001a\u0004\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005;\u0000\u0000\u001c\u0006\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005{\u0000\u0000\u001e\b\u0001\u0000\u0000"+
		"\u0000\u001f \u0005}\u0000\u0000 \n\u0001\u0000\u0000\u0000!\"\u0005i"+
		"\u0000\u0000\"#\u0005n\u0000\u0000#$\u0005t\u0000\u0000$\f\u0001\u0000"+
		"\u0000\u0000%&\u0005=\u0000\u0000&\u000e\u0001\u0000\u0000\u0000\'(\u0005"+
		"d\u0000\u0000()\u0005o\u0000\u0000)*\u0005u\u0000\u0000*+\u0005b\u0000"+
		"\u0000+,\u0005l\u0000\u0000,-\u0005e\u0000\u0000-\u0010\u0001\u0000\u0000"+
		"\u0000.1\u0003\u0001\u0000\u0000/1\u0005_\u0000\u00000.\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u000017\u0001\u0000\u0000\u000026\u0003\u0001"+
		"\u0000\u000036\u0003\u0003\u0001\u000046\u0005_\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0012\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0003\u0003"+
		"\u0001\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0014\u0001\u0000\u0000"+
		"\u0000?A\u0007\u0002\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0006\n\u0000\u0000E\u0016\u0001\u0000\u0000\u0000"+
		"\u0006\u0000057=B\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}