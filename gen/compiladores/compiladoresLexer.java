// Generated from D:/UBP/TC/tp completo/git/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
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
		WS=1, PI=2, PD=3, LI=4, LD=5, PYC=6, COMA=7, PUNTO=8, DOSPUNTOS=9, IF=10, 
		ELSE=11, COMPARE=12, SWITCH=13, CASE=14, DEFAULT=15, FOR=16, WHILE=17, 
		RETURN=18, BREAK=19, MAS=20, MENOS=21, MULTI=22, DIVI=23, ACUM=24, IGUAL=25, 
		ANDOR=26, VOID=27, DOUBLE=28, FLOAT=29, INT=30, STRING=31, NOMBRE=32, 
		NUMERO=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PI", "PD", "LI", "LD", "PYC", "COMA", "PUNTO", 
			"DOSPUNTOS", "IF", "ELSE", "COMPARE", "SWITCH", "CASE", "DEFAULT", "FOR", 
			"WHILE", "RETURN", "BREAK", "MAS", "MENOS", "MULTI", "DIVI", "ACUM", 
			"IGUAL", "ANDOR", "VOID", "DOUBLE", "FLOAT", "INT", "STRING", "NOMBRE", 
			"NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "'.'", "':'", "'if'", 
			"'else'", null, "'switch'", "'case'", "'default'", "'for'", "'while'", 
			"'return'", "'break'", "'+'", "'-'", "'*'", "'/'", null, "'='", null, 
			"'void'", "'double'", "'float'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PI", "PD", "LI", "LD", "PYC", "COMA", "PUNTO", "DOSPUNTOS", 
			"IF", "ELSE", "COMPARE", "SWITCH", "CASE", "DEFAULT", "FOR", "WHILE", 
			"RETURN", "BREAK", "MAS", "MENOS", "MULTI", "DIVI", "ACUM", "IGUAL", 
			"ANDOR", "VOID", "DOUBLE", "FLOAT", "INT", "STRING", "NOMBRE", "NUMERO"
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
		"\u0004\u0000!\u00f2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002M\b\u0002\u000b\u0002\f\u0002N\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\ru\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00ae\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u00b6\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0003!\u00d7\b!\u0001!\u0001!\u0001!\u0005!\u00dc\b!\n!\f!\u00df"+
		"\t!\u0001\"\u0004\"\u00e2\b\"\u000b\"\f\"\u00e3\u0001\"\u0004\"\u00e7"+
		"\b\"\u000b\"\f\"\u00e8\u0001\"\u0001\"\u0004\"\u00ed\b\"\u000b\"\f\"\u00ee"+
		"\u0003\"\u00f1\b\"\u0000\u0000#\u0001\u0000\u0003\u0000\u0005\u0001\u0007"+
		"\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015"+
		"\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011"+
		"\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b"+
		";\u001c=\u001d?\u001eA\u001fC E!\u0001\u0000\u0003\u0002\u0000AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00ff\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000\u0000\u0003"+
		"I\u0001\u0000\u0000\u0000\u0005L\u0001\u0000\u0000\u0000\u0007R\u0001"+
		"\u0000\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000bV\u0001\u0000\u0000"+
		"\u0000\rX\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011"+
		"\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000\u0015`\u0001"+
		"\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000"+
		"\u0000\u001bt\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001f"+
		"}\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#\u008a\u0001"+
		"\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000\'\u0094\u0001\u0000"+
		"\u0000\u0000)\u009b\u0001\u0000\u0000\u0000+\u00a1\u0001\u0000\u0000\u0000"+
		"-\u00a3\u0001\u0000\u0000\u0000/\u00a5\u0001\u0000\u0000\u00001\u00a7"+
		"\u0001\u0000\u0000\u00003\u00ad\u0001\u0000\u0000\u00005\u00af\u0001\u0000"+
		"\u0000\u00007\u00b5\u0001\u0000\u0000\u00009\u00b7\u0001\u0000\u0000\u0000"+
		";\u00bc\u0001\u0000\u0000\u0000=\u00c3\u0001\u0000\u0000\u0000?\u00c9"+
		"\u0001\u0000\u0000\u0000A\u00cd\u0001\u0000\u0000\u0000C\u00d6\u0001\u0000"+
		"\u0000\u0000E\u00f0\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000"+
		"H\u0002\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000J\u0004\u0001"+
		"\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\u0002\u0000\u0000Q\u0006\u0001"+
		"\u0000\u0000\u0000RS\u0005(\u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005"+
		")\u0000\u0000U\n\u0001\u0000\u0000\u0000VW\u0005{\u0000\u0000W\f\u0001"+
		"\u0000\u0000\u0000XY\u0005}\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000"+
		"Z[\u0005;\u0000\u0000[\u0010\u0001\u0000\u0000\u0000\\]\u0005,\u0000\u0000"+
		"]\u0012\u0001\u0000\u0000\u0000^_\u0005.\u0000\u0000_\u0014\u0001\u0000"+
		"\u0000\u0000`a\u0005:\u0000\u0000a\u0016\u0001\u0000\u0000\u0000bc\u0005"+
		"i\u0000\u0000cd\u0005f\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ef\u0005"+
		"e\u0000\u0000fg\u0005l\u0000\u0000gh\u0005s\u0000\u0000hi\u0005e\u0000"+
		"\u0000i\u001a\u0001\u0000\u0000\u0000ju\u0005<\u0000\u0000kl\u0005<\u0000"+
		"\u0000lu\u0005=\u0000\u0000mu\u0005>\u0000\u0000no\u0005>\u0000\u0000"+
		"ou\u0005=\u0000\u0000pq\u0005=\u0000\u0000qu\u0005=\u0000\u0000rs\u0005"+
		"!\u0000\u0000su\u0005=\u0000\u0000tj\u0001\u0000\u0000\u0000tk\u0001\u0000"+
		"\u0000\u0000tm\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000tp\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000u\u001c\u0001\u0000\u0000"+
		"\u0000vw\u0005s\u0000\u0000wx\u0005w\u0000\u0000xy\u0005i\u0000\u0000"+
		"yz\u0005t\u0000\u0000z{\u0005c\u0000\u0000{|\u0005h\u0000\u0000|\u001e"+
		"\u0001\u0000\u0000\u0000}~\u0005c\u0000\u0000~\u007f\u0005a\u0000\u0000"+
		"\u007f\u0080\u0005s\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081 "+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005d\u0000\u0000\u0083\u0084\u0005"+
		"e\u0000\u0000\u0084\u0085\u0005f\u0000\u0000\u0085\u0086\u0005a\u0000"+
		"\u0000\u0086\u0087\u0005u\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088"+
		"\u0089\u0005t\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005f\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005r"+
		"\u0000\u0000\u008d$\u0001\u0000\u0000\u0000\u008e\u008f\u0005w\u0000\u0000"+
		"\u008f\u0090\u0005h\u0000\u0000\u0090\u0091\u0005i\u0000\u0000\u0091\u0092"+
		"\u0005l\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093&\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005r\u0000\u0000\u0095\u0096\u0005e\u0000\u0000"+
		"\u0096\u0097\u0005t\u0000\u0000\u0097\u0098\u0005u\u0000\u0000\u0098\u0099"+
		"\u0005r\u0000\u0000\u0099\u009a\u0005n\u0000\u0000\u009a(\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005b\u0000\u0000\u009c\u009d\u0005r\u0000\u0000"+
		"\u009d\u009e\u0005e\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f\u00a0"+
		"\u0005k\u0000\u0000\u00a0*\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005+"+
		"\u0000\u0000\u00a2,\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005-\u0000\u0000"+
		"\u00a4.\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005*\u0000\u0000\u00a60"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005/\u0000\u0000\u00a82\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005+\u0000\u0000\u00aa\u00ae\u0005+\u0000\u0000"+
		"\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u00ae\u0005-\u0000\u0000\u00ad\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae4\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005=\u0000\u0000\u00b06\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005&\u0000\u0000\u00b2\u00b6\u0005&\u0000\u0000\u00b3"+
		"\u00b4\u0005|\u0000\u0000\u00b4\u00b6\u0005|\u0000\u0000\u00b5\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b68\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005v\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000"+
		"\u00b9\u00ba\u0005i\u0000\u0000\u00ba\u00bb\u0005d\u0000\u0000\u00bb:"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005d\u0000\u0000\u00bd\u00be\u0005"+
		"o\u0000\u0000\u00be\u00bf\u0005u\u0000\u0000\u00bf\u00c0\u0005b\u0000"+
		"\u0000\u00c0\u00c1\u0005l\u0000\u0000\u00c1\u00c2\u0005e\u0000\u0000\u00c2"+
		"<\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005f\u0000\u0000\u00c4\u00c5\u0005"+
		"l\u0000\u0000\u00c5\u00c6\u0005o\u0000\u0000\u00c6\u00c7\u0005a\u0000"+
		"\u0000\u00c7\u00c8\u0005t\u0000\u0000\u00c8>\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005i\u0000\u0000\u00ca\u00cb\u0005n\u0000\u0000\u00cb\u00cc\u0005"+
		"t\u0000\u0000\u00cc@\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005s\u0000"+
		"\u0000\u00ce\u00cf\u0005t\u0000\u0000\u00cf\u00d0\u0005r\u0000\u0000\u00d0"+
		"\u00d1\u0005i\u0000\u0000\u00d1\u00d2\u0005n\u0000\u0000\u00d2\u00d3\u0005"+
		"g\u0000\u0000\u00d3B\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003\u0001\u0000"+
		"\u0000\u00d5\u00d7\u0005_\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00dd\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dc\u0003\u0001\u0000\u0000\u00d9\u00dc\u0003\u0003\u0001\u0000"+
		"\u00da\u00dc\u0005_\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00deD\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003\u0003\u0001\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00f1"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u0003\u0001\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u0013\t\u0000\u00eb\u00ed\u0003"+
		"\u0003\u0001\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00e6\u0001\u0000\u0000\u0000\u00f1F\u0001\u0000"+
		"\u0000\u0000\f\u0000Nt\u00ad\u00b5\u00d6\u00db\u00dd\u00e3\u00e8\u00ee"+
		"\u00f0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}