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
	 * Enter a parse tree produced by {@link LangParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclArgs(LangParser.FuncDeclArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclArgs(LangParser.FuncDeclArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(LangParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(LangParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void enterIfBranch(LangParser.IfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifBranch}.
	 * @param ctx the parse tree
	 */
	void exitIfBranch(LangParser.IfBranchContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(LangParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(LangParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcargs}.
	 * @param ctx the parse tree
	 */
	void enterFuncargs(LangParser.FuncargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcargs}.
	 * @param ctx the parse tree
	 */
	void exitFuncargs(LangParser.FuncargsContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#assignmentBody}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBody(LangParser.AssignmentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignmentBody}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBody(LangParser.AssignmentBodyContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LangParser.TermContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LangParser.FactorContext ctx);
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