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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, EQ=16, SEMICOLON=17, 
		NUM=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_function = 1, RULE_args = 2, RULE_arg = 3, RULE_funcbody = 4, 
		RULE_ifbody = 5, RULE_forbody = 6, RULE_statement = 7, RULE_forloop = 8, 
		RULE_condition = 9, RULE_ifclause = 10, RULE_ret = 11, RULE_assignment = 12, 
		RULE_print = 13, RULE_expr = 14, RULE_mulExpr = 15, RULE_atom = 16;
	public static final String[] ruleNames = {
		"prog", "function", "args", "arg", "funcbody", "ifbody", "forbody", "statement", 
		"forloop", "condition", "ifclause", "ret", "assignment", "print", "expr", 
		"mulExpr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "'}'", "'for'", "'if'", "'else'", 
		"'return'", "'print'", "'+'", "'-'", "'*'", "'/'", null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NAME", "EQ", "SEMICOLON", "NUM", "WS"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(34);
				function();
				}
				}
				setState(39);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
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
			setState(40);
			match(T__0);
			setState(41);
			((FunctionContext)_localctx).name = match(NAME);
			setState(42);
			match(T__1);
			setState(43);
			args();
			setState(44);
			match(T__2);
			setState(45);
			match(T__3);
			setState(46);
			funcbody();
			setState(47);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==NUM) {
				{
				{
				setState(49);
				arg();
				}
				}
				setState(54);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FuncbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFuncbody(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << NAME))) != 0)) {
				{
				{
				setState(57);
				statement();
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

	public static class IfbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfbody(this);
		}
	}

	public final IfbodyContext ifbody() throws RecognitionException {
		IfbodyContext _localctx = new IfbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifbody);
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
		enterRule(_localctx, 12, RULE_forbody);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				ret();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				print();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				assignment();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				ifclause();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				forloop();
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

	public static class ForloopContext extends ParserRuleContext {
		public ForbodyContext forbody() {
			return getRuleContext(ForbodyContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
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
		enterRule(_localctx, 16, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			match(T__1);
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			setState(87);
			forbody();
			setState(88);
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
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IfbodyContext> ifbody() {
			return getRuleContexts(IfbodyContext.class);
		}
		public IfbodyContext ifbody(int i) {
			return getRuleContext(IfbodyContext.class,i);
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
		enterRule(_localctx, 20, RULE_ifclause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			match(T__1);
			setState(94);
			expr();
			setState(95);
			match(T__2);
			setState(96);
			match(T__3);
			setState(97);
			ifbody();
			setState(98);
			match(T__4);
			setState(104);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(99);
				match(T__7);
				setState(100);
				match(T__3);
				setState(101);
				ifbody();
				setState(102);
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
		enterRule(_localctx, 22, RULE_ret);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__8);
				setState(107);
				expr();
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__8);
				setState(111);
				match(NAME);
				setState(112);
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
		public Token NAME;
		public ExprContext x;
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((AssignmentContext)_localctx).NAME = match(NAME);
			setState(116);
			match(EQ);
			setState(117);
			((AssignmentContext)_localctx).x = expr();
			setState(118);
			match(SEMICOLON);

			        mp.put((((AssignmentContext)_localctx).NAME!=null?((AssignmentContext)_localctx).NAME.getText():null), ((AssignmentContext)_localctx).x.value);
			        ((AssignmentContext)_localctx).value =  ((AssignmentContext)_localctx).x.value;
			    
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
		public ExprContext x;
		public Token NAME;
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
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
		enterRule(_localctx, 26, RULE_print);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__9);
				setState(122);
				match(T__1);
				setState(123);
				((PrintContext)_localctx).x = expr();
				setState(124);
				match(T__2);
				setState(125);
				match(SEMICOLON);
				 System.out.println(((PrintContext)_localctx).x.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__9);
				setState(129);
				match(T__1);
				setState(130);
				((PrintContext)_localctx).NAME = match(NAME);
				setState(131);
				match(T__2);
				setState(132);
				match(SEMICOLON);

				        Integer v = (Integer)mp.get((((PrintContext)_localctx).NAME!=null?((PrintContext)_localctx).NAME.getText():null));
				        if (v == null) {
				            System.out.println("Undefined variable: " + (((PrintContext)_localctx).NAME!=null?((PrintContext)_localctx).NAME.getText():null));
				        } else {
				            System.out.println(v.intValue());
				        }
				    
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MulExprContext x;
		public MulExprContext y;
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
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
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((ExprContext)_localctx).x = mulExpr();
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).x.value; 
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(138);
					match(T__10);
					setState(139);
					((ExprContext)_localctx).y = mulExpr();
					 _localctx.value += ((ExprContext)_localctx).y.value; 
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((ExprContext)_localctx).x = mulExpr();
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).x.value; 
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(149);
					match(T__11);
					setState(150);
					((ExprContext)_localctx).y = mulExpr();
					 _localctx.value -= ((ExprContext)_localctx).y.value; 
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MulExprContext extends ParserRuleContext {
		public int value;
		public AtomContext x;
		public AtomContext y;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
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
		enterRule(_localctx, 30, RULE_mulExpr);
		int _la;
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((MulExprContext)_localctx).x = atom();
				 ((MulExprContext)_localctx).value =  ((MulExprContext)_localctx).x.value; 
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(162);
					match(T__12);
					setState(163);
					((MulExprContext)_localctx).y = atom();
					 _localctx.value *= ((MulExprContext)_localctx).y.value; 
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((MulExprContext)_localctx).x = atom();
				 ((MulExprContext)_localctx).value =  ((MulExprContext)_localctx).y.value; 
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(173);
					match(T__13);
					setState(174);
					((MulExprContext)_localctx).y = atom();
					 _localctx.value /= ((MulExprContext)_localctx).y.value; 
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token NUM;
		public Token NAME;
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public TerminalNode NAME() { return getToken(LangParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				((AtomContext)_localctx).NUM = match(NUM);
				 ((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).NUM!=null?((AtomContext)_localctx).NUM.getText():null)); 
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((AtomContext)_localctx).NAME = match(NAME);

				        Integer v = (Integer)mp.get((((AtomContext)_localctx).NAME!=null?((AtomContext)_localctx).NAME.getText():null));
				        if (v == null) {
				            System.err.println("Undefined variable: " + (((AtomContext)_localctx).NAME!=null?((AtomContext)_localctx).NAME.getText():null));
				        } else {
				            ((AtomContext)_localctx).value =  v.intValue();
				        }
				      
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__1);
				setState(189);
				expr();
				setState(190);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\5\3\5\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\7\7C"+
		"\n\7\f\7\16\7F\13\7\3\b\7\bI\n\b\f\b\16\bL\13\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\tS\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"t\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0091\n\20\f\20\16\20\u0094\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u009c\n\20\f\20\16\20\u009f\13\20\5\20\u00a1\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00b4\n\21\f\21\16\21\u00b7\13\21\5\21\u00b9"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\22\2\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\21\21\24\24\u00c7"+
		"\2\'\3\2\2\2\4*\3\2\2\2\6\66\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fD\3\2\2\2"+
		"\16J\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30s\3\2"+
		"\2\2\32u\3\2\2\2\34\u0088\3\2\2\2\36\u00a0\3\2\2\2 \u00b8\3\2\2\2\"\u00c2"+
		"\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2"+
		"\2)\'\3\2\2\2*+\7\3\2\2+,\7\21\2\2,-\7\4\2\2-.\5\6\4\2./\7\5\2\2/\60\7"+
		"\6\2\2\60\61\5\n\6\2\61\62\7\7\2\2\62\5\3\2\2\2\63\65\5\b\5\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2"+
		"\29:\t\2\2\2:\t\3\2\2\2;=\5\20\t\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?\13\3\2\2\2@>\3\2\2\2AC\5\20\t\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE"+
		"\3\2\2\2E\r\3\2\2\2FD\3\2\2\2GI\5\20\t\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2"+
		"JK\3\2\2\2K\17\3\2\2\2LJ\3\2\2\2MS\5\30\r\2NS\5\34\17\2OS\5\32\16\2PS"+
		"\5\26\f\2QS\5\22\n\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2"+
		"S\21\3\2\2\2TU\7\b\2\2UV\7\4\2\2VW\t\2\2\2WX\7\5\2\2XY\7\6\2\2YZ\5\16"+
		"\b\2Z[\7\7\2\2[\23\3\2\2\2\\]\5\36\20\2]\25\3\2\2\2^_\7\t\2\2_`\7\4\2"+
		"\2`a\5\36\20\2ab\7\5\2\2bc\7\6\2\2cd\5\f\7\2dj\7\7\2\2ef\7\n\2\2fg\7\6"+
		"\2\2gh\5\f\7\2hi\7\7\2\2ik\3\2\2\2je\3\2\2\2jk\3\2\2\2k\27\3\2\2\2lm\7"+
		"\13\2\2mn\5\36\20\2no\7\23\2\2ot\3\2\2\2pq\7\13\2\2qr\7\21\2\2rt\7\23"+
		"\2\2sl\3\2\2\2sp\3\2\2\2t\31\3\2\2\2uv\7\21\2\2vw\7\22\2\2wx\5\36\20\2"+
		"xy\7\23\2\2yz\b\16\1\2z\33\3\2\2\2{|\7\f\2\2|}\7\4\2\2}~\5\36\20\2~\177"+
		"\7\5\2\2\177\u0080\7\23\2\2\u0080\u0081\b\17\1\2\u0081\u0089\3\2\2\2\u0082"+
		"\u0083\7\f\2\2\u0083\u0084\7\4\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7"+
		"\5\2\2\u0086\u0087\7\23\2\2\u0087\u0089\b\17\1\2\u0088{\3\2\2\2\u0088"+
		"\u0082\3\2\2\2\u0089\35\3\2\2\2\u008a\u008b\5 \21\2\u008b\u0092\b\20\1"+
		"\2\u008c\u008d\7\r\2\2\u008d\u008e\5 \21\2\u008e\u008f\b\20\1\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u00a1\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\5 \21\2\u0096\u009d\b\20\1\2\u0097\u0098\7\16\2\2\u0098\u0099\5"+
		" \21\2\u0099\u009a\b\20\1\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u008a\3\2\2\2\u00a0\u0095\3\2\2\2\u00a1"+
		"\37\3\2\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00aa\b\21\1\2\u00a4\u00a5\7\17"+
		"\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\b\21\1\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00b9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\"\22\2\u00ae"+
		"\u00b5\b\21\1\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2"+
		"\b\21\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b9!\3\2\2\2\u00ba"+
		"\u00bb\7\24\2\2\u00bb\u00c3\b\22\1\2\u00bc\u00bd\7\21\2\2\u00bd\u00c3"+
		"\b\22\1\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7\5\2"+
		"\2\u00c1\u00c3\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00be"+
		"\3\2\2\2\u00c3#\3\2\2\2\22\'\66>DJRjs\u0088\u0092\u009d\u00a0\u00aa\u00b5"+
		"\u00b8\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}