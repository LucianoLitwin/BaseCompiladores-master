// Generated from D:/UBP/TC/tp completo/git/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
package compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion_continua}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_continua(compiladoresParser.Expresion_continuaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlaves(compiladoresParser.LlavesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_continua}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_continua(compiladoresParser.Declaracion_continuaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyIf(compiladoresParser.MyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionFor(compiladoresParser.ExpresionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyFor(compiladoresParser.MyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyWhile(compiladoresParser.MyWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#mySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMySwitch(compiladoresParser.MySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloqueSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueSwitch(compiladoresParser.BloqueSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyCase(compiladoresParser.MyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyBreak(compiladoresParser.MyBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(compiladoresParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumentos_continuos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_continuos(compiladoresParser.Argumentos_continuosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros_continuos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_continuos(compiladoresParser.Parametros_continuosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#myReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyReturn(compiladoresParser.MyReturnContext ctx);
}