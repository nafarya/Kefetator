// Generated from /home/dan/Desktop/University/IVCourse/interpreter/src/io/github/nafarya/interpreter/Lang.g4 by ANTLR 4.5.1
package io.github.nafarya.interpreter.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NAME=11, EQ=12, ADD=13, SUB=14, MUL=15, DIV=16, SEMICOLON=17, 
		NUM=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_function = 1, RULE_funcDeclArgs = 2, RULE_funcBody = 3, 
		RULE_ifBranch = 4, RULE_forbody = 5, RULE_statement = 6, RULE_funccall = 7, 
		RULE_funcargs = 8, RULE_forloop = 9, RULE_condition = 10, RULE_ifclause = 11, 
		RULE_ret = 12, RULE_assignment = 13, RULE_assignmentBody = 14, RULE_print = 15, 
		RULE_expr = 16, RULE_term = 17, RULE_mulExpr = 18, RULE_factor = 19, RULE_atom = 20;
	public static final String[] ruleNames = {
		"prog", "function", "funcDeclArgs", "funcBody", "ifBranch", "forbody", 
		"statement", "funccall", "funcargs", "forloop", "condition", "ifclause", 
		"ret", "assignment", "assignmentBody", "print", "expr", "term", "mulExpr", 
		"factor", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "'}'", "'for'", "'if'", "'else'", 
		"'return'", "'print'", null, "'='", "'+'", "'-'", "'*'", "'/'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NAME", 
		"EQ", "ADD", "SUB", "MUL", "DIV", "SEMICOLON", "NUM", "WS"
	};
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	HashMap mp = new HashMap();

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public int value;
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				function();
				}
				}
				setState(47);
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

	public static class FunctionContext extends ParserRuleContext {
		public Map<String, Integer> vc =  new HashMap<>();
		public Token name;
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			((FunctionContext)_localctx).name = match(NAME);
			setState(50);
			match(T__1);
			setState(51);
			funcDeclArgs();
			setState(52);
			match(T__2);
			setState(53);
			match(T__3);
			setState(54);
			funcBody();
			setState(55);
			match(T__4);
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

	public static class FuncDeclArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LangParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LangParser.NAME, i);
		}
		public FuncDeclArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFuncDeclArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFuncDeclArgs(this);
		}
	}

	public final FuncDeclArgsContext funcDeclArgs() throws RecognitionException {
		FuncDeclArgsContext _localctx = new FuncDeclArgsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDeclArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(57);
				match(NAME);
				}
				}
				setState(62);
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

	public static class FuncBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFuncBody(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << NAME))) != 0)) {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(68);
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

	public static class IfBranchContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfBranch(this);
		}
	}

	public final IfBranchContext ifBranch() throws RecognitionException {
		IfBranchContext _localctx = new IfBranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << NAME))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
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

	public static class ForbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForbody(this);
		}
	}

	public final ForbodyContext forbody() throws RecognitionException {
		ForbodyContext _localctx = new ForbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << NAME))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
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

	public static class StatementContext extends ParserRuleContext {
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfclauseContext ifclause() {
			return getRuleContext(IfclauseContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				ret();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				ifclause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				forloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				funccall();
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NAME);
			setState(90);
			match(T__1);
			setState(91);
			funcargs();
			setState(92);
			match(T__2);
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

	public static class FuncargsContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public FuncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFuncargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFuncargs(this);
		}
	}

	public final FuncargsContext funcargs() throws RecognitionException {
		FuncargsContext _localctx = new FuncargsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NAME) | (1L << NUM))) != 0)) {
				{
				{
				setState(94);
				atom();
				}
				}
				setState(99);
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

	public static class ForloopContext extends ParserRuleContext {
		public Map<String, Integer> vc =  new HashMap<>();
		public List<AssignmentBodyContext> assignmentBody() {
			return getRuleContexts(AssignmentBodyContext.class);
		}
		public AssignmentBodyContext assignmentBody(int i) {
			return getRuleContext(AssignmentBodyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LangParser.SEMICOLON, i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ForbodyContext forbody() {
			return getRuleContext(ForbodyContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
			assignmentBody();
			setState(102);
			match(SEMICOLON);
			setState(103);
			atom();
			setState(104);
			match(SEMICOLON);
			setState(105);
			assignmentBody();
			setState(106);
			match(T__3);
			setState(107);
			forbody();
			setState(108);
			match(T__4);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expr();
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

	public static class IfclauseContext extends ParserRuleContext {
		public Map<String, Integer> vc =  new HashMap<>();
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IfBranchContext> ifBranch() {
			return getRuleContexts(IfBranchContext.class);
		}
		public IfBranchContext ifBranch(int i) {
			return getRuleContext(IfBranchContext.class,i);
		}
		public IfclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfclause(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifclause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__6);
			setState(113);
			match(T__1);
			setState(114);
			expr();
			setState(115);
			match(T__2);
			setState(116);
			match(T__3);
			setState(117);
			ifBranch();
			setState(118);
			match(T__4);
			setState(124);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(119);
				match(T__7);
				setState(120);
				match(T__3);
				setState(121);
				ifBranch();
				setState(122);
				match(T__4);
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

	public static class RetContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ret);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__8);
				setState(127);
				expr();
				setState(128);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__8);
				setState(131);
				match(NAME);
				setState(132);
				match(SEMICOLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public int value;
		public AssignmentBodyContext assignmentBody() {
			return getRuleContext(AssignmentBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			assignmentBody();
			setState(136);
			match(SEMICOLON);
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

	public static class AssignmentBodyContext extends ParserRuleContext {
		public int value;
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public AssignmentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignmentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignmentBody(this);
		}
	}

	public final AssignmentBodyContext assignmentBody() throws RecognitionException {
		AssignmentBodyContext _localctx = new AssignmentBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NAME);
			setState(139);
			match(EQ);
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(140);
				expr();
				}
				break;
			case 2:
				{
				setState(141);
				funccall();
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__9);
			setState(145);
			match(T__1);
			setState(146);
			atom();
			setState(147);
			match(T__2);
			setState(148);
			match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			mulExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(151);
				term();
				}
				}
				setState(156);
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

	public static class TermContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(LangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LangParser.SUB, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(158);
			mulExpr();
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

	public static class MulExprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMulExpr(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			atom();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(161);
				factor();
				}
				}
				setState(166);
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

	public static class FactorContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(168);
			atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__1);
				setState(173);
				expr();
				setState(174);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				funccall();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\7"+
		"\5C\n\5\f\5\16\5F\13\5\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\7\7O\n\7\f\7\16"+
		"\7R\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\n\7\n"+
		"b\n\n\f\n\16\ne\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\7\22\u009b\n\22\f\22\16\22\u009e\13\22\3\23\3\23\3\23\3\24\3\24\7\24"+
		"\u00a5\n\24\f\24\16\24\u00a8\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00b4\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\4\3\2\17\20\3\2\21\22\u00b3\2/\3\2\2\2\4\62\3\2"+
		"\2\2\6>\3\2\2\2\bD\3\2\2\2\nJ\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20[\3\2\2"+
		"\2\22c\3\2\2\2\24f\3\2\2\2\26p\3\2\2\2\30r\3\2\2\2\32\u0087\3\2\2\2\34"+
		"\u0089\3\2\2\2\36\u008c\3\2\2\2 \u0092\3\2\2\2\"\u0098\3\2\2\2$\u009f"+
		"\3\2\2\2&\u00a2\3\2\2\2(\u00a9\3\2\2\2*\u00b3\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\62\63"+
		"\7\3\2\2\63\64\7\r\2\2\64\65\7\4\2\2\65\66\5\6\4\2\66\67\7\5\2\2\678\7"+
		"\6\2\289\5\b\5\29:\7\7\2\2:\5\3\2\2\2;=\7\r\2\2<;\3\2\2\2=@\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GI\5\16\b\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2MO\5\16\b\2NM\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2SZ\5\32\16\2TZ\5 \21\2"+
		"UZ\5\34\17\2VZ\5\30\r\2WZ\5\24\13\2XZ\5\20\t\2YS\3\2\2\2YT\3\2\2\2YU\3"+
		"\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\7\r\2\2\\]\7\4\2\2"+
		"]^\5\22\n\2^_\7\5\2\2_\21\3\2\2\2`b\5*\26\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2d\23\3\2\2\2ec\3\2\2\2fg\7\b\2\2gh\5\36\20\2hi\7\23\2\2"+
		"ij\5*\26\2jk\7\23\2\2kl\5\36\20\2lm\7\6\2\2mn\5\f\7\2no\7\7\2\2o\25\3"+
		"\2\2\2pq\5\"\22\2q\27\3\2\2\2rs\7\t\2\2st\7\4\2\2tu\5\"\22\2uv\7\5\2\2"+
		"vw\7\6\2\2wx\5\n\6\2x~\7\7\2\2yz\7\n\2\2z{\7\6\2\2{|\5\n\6\2|}\7\7\2\2"+
		"}\177\3\2\2\2~y\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080\u0081\7\13\2"+
		"\2\u0081\u0082\5\"\22\2\u0082\u0083\7\23\2\2\u0083\u0088\3\2\2\2\u0084"+
		"\u0085\7\13\2\2\u0085\u0086\7\r\2\2\u0086\u0088\7\23\2\2\u0087\u0080\3"+
		"\2\2\2\u0087\u0084\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\5\36\20\2\u008a"+
		"\u008b\7\23\2\2\u008b\35\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u0090\7\16"+
		"\2\2\u008e\u0091\5\"\22\2\u008f\u0091\5\20\t\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093\7\f\2\2\u0093\u0094\7\4\2"+
		"\2\u0094\u0095\5*\26\2\u0095\u0096\7\5\2\2\u0096\u0097\7\23\2\2\u0097"+
		"!\3\2\2\2\u0098\u009c\5&\24\2\u0099\u009b\5$\23\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d#\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\5&\24\2\u00a1"+
		"%\3\2\2\2\u00a2\u00a6\5*\26\2\u00a3\u00a5\5(\25\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\'\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\u00ab\5*\26\2\u00ab"+
		")\3\2\2\2\u00ac\u00b4\7\24\2\2\u00ad\u00b4\7\r\2\2\u00ae\u00af\7\4\2\2"+
		"\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\5\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4"+
		"\5\20\t\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae\3\2\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4+\3\2\2\2\17/>DJPYc~\u0087\u0090\u009c\u00a6"+
		"\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}