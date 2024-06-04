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
		WS=1, PYC=2, LLA=3, LLC=4, LP=5, RP=6, INT=7, IF=8, FOR=9, WHILE=10, ELSE=11, 
		RETURN=12, PRINTF=13, VOID=14, COMPARE=15, ACUM=16, IGUAL=17, MAS=18, 
		MENOS=19, MULT=20, DIV=21, DOUBLE=22, FLOAT=23, COMMA=24, PUNTO=25, COMENTARIO=26, 
		STRING=27, ID=28, NUMERO=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PYC", "LLA", "LLC", "LP", "RP", "INT", "IF", 
			"FOR", "WHILE", "ELSE", "RETURN", "PRINTF", "VOID", "COMPARE", "ACUM", 
			"IGUAL", "MAS", "MENOS", "MULT", "DIV", "DOUBLE", "FLOAT", "COMMA", "PUNTO", 
			"COMENTARIO", "STRING", "ID", "NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "'{'", "'}'", "'('", "')'", "'int'", "'if'", "'for'", 
			"'while'", "'else'", "'return'", "'printf'", "'void'", null, null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "'double'", "'float'", "','", "'.'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PYC", "LLA", "LLC", "LP", "RP", "INT", "IF", "FOR", "WHILE", 
			"ELSE", "RETURN", "PRINTF", "VOID", "COMPARE", "ACUM", "IGUAL", "MAS", 
			"MENOS", "MULT", "DIV", "DOUBLE", "FLOAT", "COMMA", "PUNTO", "COMENTARIO", 
			"STRING", "ID", "NUMERO"
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
		"\u0004\u0000\u001d\u00d5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0004\u0002E\b\u0002\u000b\u0002\f\u0002F\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0087\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u008d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u00b1\b\u001c\n\u001c\f\u001c\u00b4\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u00ba\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u00bf\b\u001d\n\u001d\f\u001d\u00c2\t\u001d\u0001\u001e"+
		"\u0004\u001e\u00c5\b\u001e\u000b\u001e\f\u001e\u00c6\u0001\u001e\u0004"+
		"\u001e\u00ca\b\u001e\u000b\u001e\f\u001e\u00cb\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u00d0\b\u001e\u000b\u001e\f\u001e\u00d1\u0003\u001e\u00d4"+
		"\b\u001e\u0000\u0000\u001f\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002"+
		"\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017"+
		"\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012"+
		")\u0013+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c"+
		"=\u001d\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  \u0002\u0000<<>>\u0002\u0000\"\"\\\\\u00e2\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001"+
		"?\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005D\u0001"+
		"\u0000\u0000\u0000\u0007J\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000"+
		"\u0000\u000bN\u0001\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000f"+
		"R\u0001\u0000\u0000\u0000\u0011T\u0001\u0000\u0000\u0000\u0013X\u0001"+
		"\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000"+
		"\u0000\u0019e\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001d"+
		"q\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!\u0086\u0001"+
		"\u0000\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000"+
		"\u0000\'\u0090\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000"+
		"+\u0094\u0001\u0000\u0000\u0000-\u0096\u0001\u0000\u0000\u0000/\u0098"+
		"\u0001\u0000\u0000\u00001\u009f\u0001\u0000\u0000\u00003\u00a5\u0001\u0000"+
		"\u0000\u00005\u00a7\u0001\u0000\u0000\u00007\u00a9\u0001\u0000\u0000\u0000"+
		"9\u00ac\u0001\u0000\u0000\u0000;\u00b9\u0001\u0000\u0000\u0000=\u00d3"+
		"\u0001\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000@\u0002\u0001\u0000"+
		"\u0000\u0000AB\u0007\u0001\u0000\u0000B\u0004\u0001\u0000\u0000\u0000"+
		"CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0006\u0002\u0000\u0000I\u0006\u0001\u0000\u0000\u0000"+
		"JK\u0005;\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005{\u0000\u0000"+
		"M\n\u0001\u0000\u0000\u0000NO\u0005}\u0000\u0000O\f\u0001\u0000\u0000"+
		"\u0000PQ\u0005(\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005)\u0000"+
		"\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005t\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005i\u0000"+
		"\u0000YZ\u0005f\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005f\u0000"+
		"\u0000\\]\u0005o\u0000\u0000]^\u0005r\u0000\u0000^\u0016\u0001\u0000\u0000"+
		"\u0000_`\u0005w\u0000\u0000`a\u0005h\u0000\u0000ab\u0005i\u0000\u0000"+
		"bc\u0005l\u0000\u0000cd\u0005e\u0000\u0000d\u0018\u0001\u0000\u0000\u0000"+
		"ef\u0005e\u0000\u0000fg\u0005l\u0000\u0000gh\u0005s\u0000\u0000hi\u0005"+
		"e\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jk\u0005r\u0000\u0000kl\u0005"+
		"e\u0000\u0000lm\u0005t\u0000\u0000mn\u0005u\u0000\u0000no\u0005r\u0000"+
		"\u0000op\u0005n\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005p\u0000"+
		"\u0000rs\u0005r\u0000\u0000st\u0005i\u0000\u0000tu\u0005n\u0000\u0000"+
		"uv\u0005t\u0000\u0000vw\u0005f\u0000\u0000w\u001e\u0001\u0000\u0000\u0000"+
		"xy\u0005v\u0000\u0000yz\u0005o\u0000\u0000z{\u0005i\u0000\u0000{|\u0005"+
		"d\u0000\u0000| \u0001\u0000\u0000\u0000}\u0087\u0007\u0003\u0000\u0000"+
		"~\u007f\u0005<\u0000\u0000\u007f\u0087\u0005=\u0000\u0000\u0080\u0081"+
		"\u0005>\u0000\u0000\u0081\u0087\u0005=\u0000\u0000\u0082\u0083\u0005="+
		"\u0000\u0000\u0083\u0087\u0005=\u0000\u0000\u0084\u0085\u0005!\u0000\u0000"+
		"\u0085\u0087\u0005=\u0000\u0000\u0086}\u0001\u0000\u0000\u0000\u0086~"+
		"\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\"\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005+\u0000\u0000\u0089\u008d\u0005+\u0000"+
		"\u0000\u008a\u008b\u0005-\u0000\u0000\u008b\u008d\u0005-\u0000\u0000\u008c"+
		"\u0088\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"$\u0001\u0000\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f&\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005+\u0000\u0000\u0091(\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005-\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005*\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"/\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005d\u0000"+
		"\u0000\u0099\u009a\u0005o\u0000\u0000\u009a\u009b\u0005u\u0000\u0000\u009b"+
		"\u009c\u0005b\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005"+
		"e\u0000\u0000\u009e0\u0001\u0000\u0000\u0000\u009f\u00a0\u0005f\u0000"+
		"\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2"+
		"\u00a3\u0005a\u0000\u0000\u00a3\u00a4\u0005t\u0000\u0000\u00a42\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005,\u0000\u0000\u00a64\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005.\u0000\u0000\u00a86\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005/\u0000\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab8\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b2\u0005\"\u0000\u0000\u00ad\u00b1\b\u0004"+
		"\u0000\u0000\u00ae\u00af\u0005\\\u0000\u0000\u00af\u00b1\t\u0000\u0000"+
		"\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\"\u0000\u0000"+
		"\u00b6:\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003\u0001\u0000\u0000\u00b8"+
		"\u00ba\u0005_\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb\u00bf"+
		"\u0003\u0001\u0000\u0000\u00bc\u00bf\u0003\u0003\u0001\u0000\u00bd\u00bf"+
		"\u0005_\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1<\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0003\u0003\u0001\u0000\u00c4\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d4\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0003\u0003\u0001\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u00035\u001a\u0000\u00ce\u00d0\u0003\u0003\u0001"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00d3\u00c9\u0001\u0000\u0000\u0000\u00d4>\u0001\u0000\u0000\u0000"+
		"\r\u0000F\u0086\u008c\u00b0\u00b2\u00b9\u00be\u00c0\u00c6\u00cb\u00d1"+
		"\u00d3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}