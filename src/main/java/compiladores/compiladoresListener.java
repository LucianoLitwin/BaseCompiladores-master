// Generated from c:/Users/falet/Desktop/TC/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

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
	 * Enter a parse tree produced by {@link compiladoresParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(compiladoresParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(compiladoresParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(compiladoresParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(compiladoresParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(compiladoresParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(compiladoresParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(compiladoresParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(compiladoresParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(compiladoresParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(compiladoresParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaPrintf}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaPrintf(compiladoresParser.LlamadaPrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaPrintf}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaPrintf(compiladoresParser.LlamadaPrintfContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(compiladoresParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(compiladoresParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(compiladoresParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(compiladoresParser.ComentarioContext ctx);
}