// Generated from /home/dan/Desktop/University/IVCourse/interpreter/src/io/github/nafarya/interpreter/Lang.g4 by ANTLR 4.5.1
package io.github.nafarya.interpreter.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LangParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(LangParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(LangParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(LangParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(LangParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void enterIfbody(LangParser.IfbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void exitIfbody(LangParser.IfbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#forbody}.
	 * @param ctx the parse tree
	 */
	void enterForbody(LangParser.ForbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forbody}.
	 * @param ctx the parse tree
	 */
	void exitForbody(LangParser.ForbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(LangParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(LangParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void enterIfclause(LangParser.IfclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void exitIfclause(LangParser.IfclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(LangParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(LangParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(LangParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(LangParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LangParser.AtomContext ctx);
}