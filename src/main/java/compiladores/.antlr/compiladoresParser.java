// Generated from c://Users//lucia//Desktop//TC//BaseCompiladores-master//src//main//java//compiladores//compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PI=2, PD=3, LI=4, LD=5, PYC=6, COMA=7, PUNTO=8, DOSPUNTOS=9, IF=10, 
		ELSE=11, COMPARE=12, SWITCH=13, CASE=14, DEFAULT=15, FOR=16, WHILE=17, 
		CADENA=18, COMENTARIO=19, COMENTARIO_MULTILINEA=20, RETURN=21, BREAK=22, 
		MAS=23, MENOS=24, MULTI=25, DIVI=26, ACUM=27, IGUAL=28, ANDOR=29, VOID=30, 
		DOUBLE=31, FLOAT=32, INT=33, LONG=34, STRING=35, NOMBRE=36, NUMERO=37;
	public static final int
		RULE_programa = 0, RULE_tipo = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_expresion = 4, RULE_condicion = 5, RULE_llaves = 6, RULE_declaracion = 7, 
		RULE_declaracion_continua = 8, RULE_asignacion = 9, RULE_myIf = 10, RULE_expresionFor = 11, 
		RULE_myFor = 12, RULE_myWhile = 13, RULE_mySwitch = 14, RULE_bloqueSwitch = 15, 
		RULE_myCase = 16, RULE_myBreak = 17, RULE_default = 18, RULE_llamadaFuncion = 19, 
		RULE_argumentos = 20, RULE_declaracionFuncion = 21, RULE_parametros = 22, 
		RULE_myReturn = 23, RULE_comentario = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "tipo", "instrucciones", "instruccion", "expresion", "condicion", 
			"llaves", "declaracion", "declaracion_continua", "asignacion", "myIf", 
			"expresionFor", "myFor", "myWhile", "mySwitch", "bloqueSwitch", "myCase", 
			"myBreak", "default", "llamadaFuncion", "argumentos", "declaracionFuncion", 
			"parametros", "myReturn", "comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "'.'", "':'", "'if'", 
			"'else'", null, "'switch'", "'case'", "'default'", "'for'", "'while'", 
			null, null, null, "'return'", "'break'", "'+'", "'-'", "'*'", "'/'", 
			null, "'='", null, "'void'", "'double'", "'float'", "'int'", "'long'", 
			"'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PI", "PD", "LI", "LD", "PYC", "COMA", "PUNTO", "DOSPUNTOS", 
			"IF", "ELSE", "COMPARE", "SWITCH", "CASE", "DEFAULT", "FOR", "WHILE", 
			"CADENA", "COMENTARIO", "COMENTARIO_MULTILINEA", "RETURN", "BREAK", "MAS", 
			"MENOS", "MULTI", "DIVI", "ACUM", "IGUAL", "ANDOR", "VOID", "DOUBLE", 
			"FLOAT", "INT", "LONG", "STRING", "NOMBRE", "NUMERO"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(50);
				declaracionFuncion();
				}
				break;
			case 2:
				{
				setState(51);
				instrucciones();
				}
				break;
			}
			setState(54);
			match(EOF);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode LONG() { return getToken(compiladoresParser.LONG, 0); }
		public TerminalNode STRING() { return getToken(compiladoresParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136373281808L) != 0)) {
				{
				{
				setState(58);
				instruccion();
				}
				}
				setState(63);
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
	public static class InstruccionContext extends ParserRuleContext {
		public LlavesContext llaves() {
			return getRuleContext(LlavesContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public MyIfContext myIf() {
			return getRuleContext(MyIfContext.class,0);
		}
		public MyForContext myFor() {
			return getRuleContext(MyForContext.class,0);
		}
		public MyWhileContext myWhile() {
			return getRuleContext(MyWhileContext.class,0);
		}
		public MySwitchContext mySwitch() {
			return getRuleContext(MySwitchContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public MyReturnContext myReturn() {
			return getRuleContext(MyReturnContext.class,0);
		}
		public MyBreakContext myBreak() {
			return getRuleContext(MyBreakContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				llaves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				myIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				myFor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				myWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				mySwitch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				declaracionFuncion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				llamadaFuncion();
				setState(73);
				match(PYC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				myReturn();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				myBreak();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				comentario();
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
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminalNode> NOMBRE() { return getTokens(compiladoresParser.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(compiladoresParser.NOMBRE, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(compiladoresParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(compiladoresParser.NUMERO, i);
		}
		public List<LlamadaFuncionContext> llamadaFuncion() {
			return getRuleContexts(LlamadaFuncionContext.class);
		}
		public LlamadaFuncionContext llamadaFuncion(int i) {
			return getRuleContext(LlamadaFuncionContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(compiladoresParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(compiladoresParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(compiladoresParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(compiladoresParser.MENOS, i);
		}
		public List<TerminalNode> MULTI() { return getTokens(compiladoresParser.MULTI); }
		public TerminalNode MULTI(int i) {
			return getToken(compiladoresParser.MULTI, i);
		}
		public List<TerminalNode> DIVI() { return getTokens(compiladoresParser.DIVI); }
		public TerminalNode DIVI(int i) {
			return getToken(compiladoresParser.DIVI, i);
		}
		public List<TerminalNode> ANDOR() { return getTokens(compiladoresParser.ANDOR); }
		public TerminalNode ANDOR(int i) {
			return getToken(compiladoresParser.ANDOR, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(80);
				match(NOMBRE);
				}
				break;
			case 2:
				{
				setState(81);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(82);
				llamadaFuncion();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 662700032L) != 0)) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 662700032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(86);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(87);
					match(NUMERO);
					}
					break;
				case 3:
					{
					setState(88);
					llamadaFuncion();
					}
					break;
				}
				}
				}
				setState(95);
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
	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> NOMBRE() { return getTokens(compiladoresParser.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(compiladoresParser.NOMBRE, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(compiladoresParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(compiladoresParser.NUMERO, i);
		}
		public List<LlamadaFuncionContext> llamadaFuncion() {
			return getRuleContexts(LlamadaFuncionContext.class);
		}
		public LlamadaFuncionContext llamadaFuncion(int i) {
			return getRuleContext(LlamadaFuncionContext.class,i);
		}
		public List<TerminalNode> COMPARE() { return getTokens(compiladoresParser.COMPARE); }
		public TerminalNode COMPARE(int i) {
			return getToken(compiladoresParser.COMPARE, i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				match(NOMBRE);
				}
				break;
			case 2:
				{
				setState(97);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(98);
				llamadaFuncion();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARE) {
				{
				{
				setState(101);
				match(COMPARE);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(102);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(103);
					match(NUMERO);
					}
					break;
				case 3:
					{
					setState(104);
					llamadaFuncion();
					}
					break;
				}
				}
				}
				setState(111);
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
	public static class LlavesContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(compiladoresParser.LI, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LD() { return getToken(compiladoresParser.LD, 0); }
		public LlavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llaves; }
	}

	public final LlavesContext llaves() throws RecognitionException {
		LlavesContext _localctx = new LlavesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_llaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LI);
			setState(113);
			instrucciones();
			setState(114);
			match(LD);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public Declaracion_continuaContext declaracion_continua() {
			return getRuleContext(Declaracion_continuaContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				tipo();
				setState(117);
				match(NOMBRE);
				setState(118);
				declaracion_continua();
				setState(119);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				tipo();
				setState(122);
				asignacion();
				setState(123);
				declaracion_continua();
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
	public static class Declaracion_continuaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public Declaracion_continuaContext declaracion_continua() {
			return getRuleContext(Declaracion_continuaContext.class,0);
		}
		public Declaracion_continuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_continua; }
	}

	public final Declaracion_continuaContext declaracion_continua() throws RecognitionException {
		Declaracion_continuaContext _localctx = new Declaracion_continuaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_continua);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(COMA);
				setState(128);
				tipo();
				setState(129);
				match(NOMBRE);
				setState(130);
				declaracion_continua();
				}
				break;
			case EOF:
			case LI:
			case LD:
			case PYC:
			case IF:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case FOR:
			case WHILE:
			case COMENTARIO:
			case COMENTARIO_MULTILINEA:
			case RETURN:
			case BREAK:
			case VOID:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case STRING:
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NOMBRE);
			setState(136);
			match(IGUAL);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(137);
				expresion();
				}
				break;
			case 2:
				{
				setState(138);
				match(NUMERO);
				}
				break;
			}
			setState(141);
			match(PYC);
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
	public static class MyIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public List<LlavesContext> llaves() {
			return getRuleContexts(LlavesContext.class);
		}
		public LlavesContext llaves(int i) {
			return getRuleContext(LlavesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public MyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myIf; }
	}

	public final MyIfContext myIf() throws RecognitionException {
		MyIfContext _localctx = new MyIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_myIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IF);
			setState(144);
			match(PI);
			setState(145);
			condicion();
			setState(146);
			match(PD);
			setState(147);
			llaves();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(148);
				match(ELSE);
				setState(149);
				llaves();
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
	public static class ExpresionForContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public TerminalNode ACUM() { return getToken(compiladoresParser.ACUM, 0); }
		public ExpresionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionFor; }
	}

	public final ExpresionForContext expresionFor() throws RecognitionException {
		ExpresionForContext _localctx = new ExpresionForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresionFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(INT);
			setState(153);
			asignacion();
			setState(154);
			condicion();
			setState(155);
			match(PYC);
			setState(156);
			match(NOMBRE);
			setState(157);
			match(ACUM);
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
	public static class MyForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladoresParser.FOR, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public ExpresionForContext expresionFor() {
			return getRuleContext(ExpresionForContext.class,0);
		}
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public LlavesContext llaves() {
			return getRuleContext(LlavesContext.class,0);
		}
		public MyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFor; }
	}

	public final MyForContext myFor() throws RecognitionException {
		MyForContext _localctx = new MyForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_myFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(PI);
			setState(161);
			expresionFor();
			setState(162);
			match(PD);
			setState(163);
			llaves();
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
	public static class MyWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public LlavesContext llaves() {
			return getRuleContext(LlavesContext.class,0);
		}
		public MyWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myWhile; }
	}

	public final MyWhileContext myWhile() throws RecognitionException {
		MyWhileContext _localctx = new MyWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_myWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WHILE);
			setState(166);
			match(PI);
			setState(167);
			condicion();
			setState(168);
			match(PD);
			setState(169);
			llaves();
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
	public static class MySwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(compiladoresParser.SWITCH, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public BloqueSwitchContext bloqueSwitch() {
			return getRuleContext(BloqueSwitchContext.class,0);
		}
		public MySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mySwitch; }
	}

	public final MySwitchContext mySwitch() throws RecognitionException {
		MySwitchContext _localctx = new MySwitchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mySwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(SWITCH);
			setState(172);
			match(PI);
			setState(173);
			expresion();
			setState(174);
			match(PD);
			setState(175);
			bloqueSwitch();
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
	public static class BloqueSwitchContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(compiladoresParser.LI, 0); }
		public MyCaseContext myCase() {
			return getRuleContext(MyCaseContext.class,0);
		}
		public TerminalNode LD() { return getToken(compiladoresParser.LD, 0); }
		public BloqueSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueSwitch; }
	}

	public final BloqueSwitchContext bloqueSwitch() throws RecognitionException {
		BloqueSwitchContext _localctx = new BloqueSwitchContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloqueSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LI);
			setState(178);
			myCase();
			setState(179);
			match(LD);
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
	public static class MyCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(compiladoresParser.CASE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(compiladoresParser.DOSPUNTOS, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public MyCaseContext myCase() {
			return getRuleContext(MyCaseContext.class,0);
		}
		public DefaultContext default_() {
			return getRuleContext(DefaultContext.class,0);
		}
		public MyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myCase; }
	}

	public final MyCaseContext myCase() throws RecognitionException {
		MyCaseContext _localctx = new MyCaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_myCase);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(CASE);
				setState(182);
				expresion();
				setState(183);
				match(DOSPUNTOS);
				setState(184);
				instrucciones();
				setState(185);
				myCase();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				default_();
				}
				break;
			case LD:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class MyBreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(compiladoresParser.BREAK, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public MyBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myBreak; }
	}

	public final MyBreakContext myBreak() throws RecognitionException {
		MyBreakContext _localctx = new MyBreakContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_myBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BREAK);
			setState(192);
			match(PYC);
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
	public static class DefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(compiladoresParser.DEFAULT, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(compiladoresParser.DOSPUNTOS, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(DEFAULT);
			setState(195);
			match(DOSPUNTOS);
			setState(196);
			instrucciones();
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
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(NOMBRE);
			setState(199);
			match(PI);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE || _la==NUMERO) {
				{
				setState(200);
				argumentos();
				}
			}

			setState(203);
			match(PD);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(compiladoresParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(compiladoresParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expresion();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(206);
				match(COMA);
				setState(207);
				expresion();
				}
				}
				setState(212);
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
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode NOMBRE() { return getToken(compiladoresParser.NOMBRE, 0); }
		public TerminalNode PI() { return getToken(compiladoresParser.PI, 0); }
		public TerminalNode PD() { return getToken(compiladoresParser.PD, 0); }
		public LlavesContext llaves() {
			return getRuleContext(LlavesContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			tipo();
			setState(214);
			match(NOMBRE);
			setState(215);
			match(PI);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				setState(216);
				parametros();
				}
			}

			setState(219);
			match(PD);
			setState(220);
			llaves();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> NOMBRE() { return getTokens(compiladoresParser.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(compiladoresParser.NOMBRE, i);
		}
		public List<TerminalNode> COMA() { return getTokens(compiladoresParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(compiladoresParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			tipo();
			setState(223);
			match(NOMBRE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(224);
				match(COMA);
				setState(225);
				tipo();
				setState(226);
				match(NOMBRE);
				}
				}
				setState(232);
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
	public static class MyReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public MyReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myReturn; }
	}

	public final MyReturnContext myReturn() throws RecognitionException {
		MyReturnContext _localctx = new MyReturnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_myReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(RETURN);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(234);
				expresion();
				}
				break;
			case 2:
				{
				setState(235);
				match(NUMERO);
				}
				break;
			}
			setState(238);
			match(PYC);
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
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO() { return getToken(compiladoresParser.COMENTARIO, 0); }
		public TerminalNode COMENTARIO_MULTILINEA() { return getToken(compiladoresParser.COMENTARIO_MULTILINEA, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO || _la==COMENTARIO_MULTILINEA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001%\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002"+
		"?\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0005\u0004\\\b\u0004\n"+
		"\u0004\f\u0004_\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"j\b\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0086\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0097\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00be\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ca\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00d1\b\u0014\n\u0014\f\u0014\u00d4\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00da\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00e5\b\u0016\n\u0016\f\u0016\u00e8\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00ed\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0\u0000\u0003\u0001\u0000\u001e#\u0002\u0000\u0017\u001a\u001d\u001d"+
		"\u0001\u0000\u0013\u0014\u00fc\u00004\u0001\u0000\u0000\u0000\u00028\u0001"+
		"\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000"+
		"\u0000\bS\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fp\u0001"+
		"\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000"+
		"\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000"+
		"\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000"+
		"\u0000\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000"+
		"\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000"+
		"\u0000\"\u00bf\u0001\u0000\u0000\u0000$\u00c2\u0001\u0000\u0000\u0000"+
		"&\u00c6\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000\u0000\u0000*\u00d5"+
		"\u0001\u0000\u0000\u0000,\u00de\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000"+
		"\u0000\u00000\u00f0\u0001\u0000\u0000\u000025\u0003*\u0015\u000035\u0003"+
		"\u0004\u0002\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001\u0001\u0000"+
		"\u0000\u000089\u0007\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000"+
		":<\u0003\u0006\u0003\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@O\u0003\f\u0006\u0000AO\u0003"+
		"\u000e\u0007\u0000BO\u0003\u0012\t\u0000CO\u0003\u0014\n\u0000DO\u0003"+
		"\u0018\f\u0000EO\u0003\u001a\r\u0000FO\u0003\u001c\u000e\u0000GO\u0003"+
		"*\u0015\u0000HI\u0003&\u0013\u0000IJ\u0005\u0006\u0000\u0000JO\u0001\u0000"+
		"\u0000\u0000KO\u0003.\u0017\u0000LO\u0003\"\u0011\u0000MO\u00030\u0018"+
		"\u0000N@\u0001\u0000\u0000\u0000NA\u0001\u0000\u0000\u0000NB\u0001\u0000"+
		"\u0000\u0000NC\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000NE\u0001"+
		"\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000"+
		"NH\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PT\u0005"+
		"$\u0000\u0000QT\u0005%\u0000\u0000RT\u0003&\u0013\u0000SP\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T]\u0001"+
		"\u0000\u0000\u0000UY\u0007\u0001\u0000\u0000VZ\u0005$\u0000\u0000WZ\u0005"+
		"%\u0000\u0000XZ\u0003&\u0013\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[U\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\t\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`d\u0005$\u0000\u0000ad\u0005%\u0000\u0000bd\u0003&\u0013\u0000"+
		"c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000dm\u0001\u0000\u0000\u0000ei\u0005\f\u0000\u0000fj\u0005$\u0000"+
		"\u0000gj\u0005%\u0000\u0000hj\u0003&\u0013\u0000if\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ke\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000qr\u0003\u0004\u0002"+
		"\u0000rs\u0005\u0005\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0003\u0002"+
		"\u0001\u0000uv\u0005$\u0000\u0000vw\u0003\u0010\b\u0000wx\u0005\u0006"+
		"\u0000\u0000x~\u0001\u0000\u0000\u0000yz\u0003\u0002\u0001\u0000z{\u0003"+
		"\u0012\t\u0000{|\u0003\u0010\b\u0000|~\u0001\u0000\u0000\u0000}t\u0001"+
		"\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000~\u000f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0081\u0003\u0002\u0001"+
		"\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000"+
		"\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0011\u0001\u0000\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088"+
		"\u008b\u0005\u001c\u0000\u0000\u0089\u008c\u0003\b\u0004\u0000\u008a\u008c"+
		"\u0005%\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0006\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\n\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091\u0092\u0003\n"+
		"\u0005\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0096\u0003\f\u0006"+
		"\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0097\u0003\f\u0006\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u0099\u0005!\u0000\u0000\u0099"+
		"\u009a\u0003\u0012\t\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c"+
		"\u0005\u0006\u0000\u0000\u009c\u009d\u0005$\u0000\u0000\u009d\u009e\u0005"+
		"\u001b\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u0010\u0000\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0016\u000b\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003"+
		"\f\u0006\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0011"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0002\u0000\u0000\u00a7\u00a8\u0003\n\u0005"+
		"\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa\u0003\f\u0006\u0000"+
		"\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\r\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0002\u0000\u0000\u00ad\u00ae\u0003\b\u0004\u0000\u00ae\u00af"+
		"\u0005\u0003\u0000\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u001d"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0004\u0000\u0000\u00b2\u00b3"+
		"\u0003 \u0010\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u001f\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6\u00b7\u0003"+
		"\b\u0004\u0000\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0003\u0004"+
		"\u0002\u0000\u00b9\u00ba\u0003 \u0010\u0000\u00ba\u00be\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0003$\u0012\u0000\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b5\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be!\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0016\u0000\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000\u00c1"+
		"#\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u000f\u0000\u0000\u00c3\u00c4"+
		"\u0005\t\u0000\u0000\u00c4\u00c5\u0003\u0004\u0002\u0000\u00c5%\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005$\u0000\u0000\u00c7\u00c9\u0005\u0002"+
		"\u0000\u0000\u00c8\u00ca\u0003(\u0014\u0000\u00c9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0003\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d2\u0003\b\u0004\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf"+
		"\u00d1\u0003\b\u0004\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0003\u0002\u0001\u0000\u00d6\u00d7\u0005"+
		"$\u0000\u0000\u00d7\u00d9\u0005\u0002\u0000\u0000\u00d8\u00da\u0003,\u0016"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0003\u0000"+
		"\u0000\u00dc\u00dd\u0003\f\u0006\u0000\u00dd+\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003\u0002\u0001\u0000\u00df\u00e6\u0005$\u0000\u0000\u00e0"+
		"\u00e1\u0005\u0007\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001\u0000\u00e2"+
		"\u00e3\u0005$\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7-\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0005"+
		"\u0015\u0000\u0000\u00ea\u00ed\u0003\b\u0004\u0000\u00eb\u00ed\u0005%"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0006\u0000\u0000\u00ef/\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0007\u0002\u0000\u0000\u00f11\u0001\u0000\u0000\u0000"+
		"\u00134=NSY]cim}\u0085\u008b\u0096\u00bd\u00c9\u00d2\u00d9\u00e6\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}