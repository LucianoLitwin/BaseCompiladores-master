// Generated from D:/UBP/TC/tp completo/git/BaseCompiladores-master-main/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
package compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion_continua}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_continua(compiladoresParser.Expresion_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion_continua}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_continua(compiladoresParser.Expresion_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino_continua}.
	 * @param ctx the parse tree
	 */
	void enterTermino_continua(compiladoresParser.Termino_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino_continua}.
	 * @param ctx the parse tree
	 */
	void exitTermino_continua(compiladoresParser.Termino_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicion_continua}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_continua(compiladoresParser.Condicion_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicion_continua}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_continua(compiladoresParser.Condicion_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llaves}.
	 * @param ctx the parse tree
	 */
	void enterLlaves(compiladoresParser.LlavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llaves}.
	 * @param ctx the parse tree
	 */
	void exitLlaves(compiladoresParser.LlavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_continua}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_continua(compiladoresParser.Declaracion_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_continua}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_continua(compiladoresParser.Declaracion_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#myIf}.
	 * @param ctx the parse tree
	 */
	void enterMyIf(compiladoresParser.MyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#myIf}.
	 * @param ctx the parse tree
	 */
	void exitMyIf(compiladoresParser.MyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionFor}.
	 * @param ctx the parse tree
	 */
	void enterExpresionFor(compiladoresParser.ExpresionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionFor}.
	 * @param ctx the parse tree
	 */
	void exitExpresionFor(compiladoresParser.ExpresionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#myFor}.
	 * @param ctx the parse tree
	 */
	void enterMyFor(compiladoresParser.MyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#myFor}.
	 * @param ctx the parse tree
	 */
	void exitMyFor(compiladoresParser.MyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#myWhile}.
	 * @param ctx the parse tree
	 */
	void enterMyWhile(compiladoresParser.MyWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#myWhile}.
	 * @param ctx the parse tree
	 */
	void exitMyWhile(compiladoresParser.MyWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos_continua}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_continua(compiladoresParser.Argumentos_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos_continua}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_continua(compiladoresParser.Argumentos_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros_continua}.
	 * @param ctx the parse tree
	 */
	void enterParametros_continua(compiladoresParser.Parametros_continuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros_continua}.
	 * @param ctx the parse tree
	 */
	void exitParametros_continua(compiladoresParser.Parametros_continuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#myReturn}.
	 * @param ctx the parse tree
	 */
	void enterMyReturn(compiladoresParser.MyReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#myReturn}.
	 * @param ctx the parse tree
	 */
	void exitMyReturn(compiladoresParser.MyReturnContext ctx);
}