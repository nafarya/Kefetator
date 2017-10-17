// Generated from /home/dan/Desktop/University/IVCourse/interpreter/src/io/github/nafarya/interpreter/Lang.g4 by ANTLR 4.5.1
package io.github.nafarya.interpreter.parser;

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(LangParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LangParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfbody(LangParser.IfbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForbody(LangParser.ForbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(LangParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfclause(LangParser.IfclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(LangParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(LangParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LangParser.AtomContext ctx);
}