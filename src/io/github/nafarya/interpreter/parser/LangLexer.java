// Generated from /home/dan/Desktop/University/IVCourse/interpreter/src/io/github/nafarya/interpreter/Lang.g4 by ANTLR 4.5.1
package io.github.nafarya.interpreter.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NAME=11, EQ=12, ADD=13, SUB=14, MUL=15, DIV=16, SEMICOLON=17, 
		NUM=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NAME", "EQ", "ADD", "SUB", "MUL", "DIV", "SEMICOLON", "NUM", 
		"WS"
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


	HashMap mp = new HashMap();


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\fR\n\f\f\f\16\fU\13\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23d"+
		"\n\23\r\23\16\23e\3\24\6\24i\n\24\r\24\16\24j\3\24\3\24\2\2\25\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25\3\2\6\3\2C|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"p\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2"+
		"\2\13\64\3\2\2\2\r\66\3\2\2\2\17:\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25I"+
		"\3\2\2\2\27O\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2"+
		"!^\3\2\2\2#`\3\2\2\2%c\3\2\2\2\'h\3\2\2\2)*\7h\2\2*+\7w\2\2+,\7p\2\2,"+
		"-\7e\2\2-\4\3\2\2\2./\7*\2\2/\6\3\2\2\2\60\61\7+\2\2\61\b\3\2\2\2\62\63"+
		"\7}\2\2\63\n\3\2\2\2\64\65\7\177\2\2\65\f\3\2\2\2\66\67\7h\2\2\678\7q"+
		"\2\289\7t\2\29\16\3\2\2\2:;\7k\2\2;<\7h\2\2<\20\3\2\2\2=>\7g\2\2>?\7n"+
		"\2\2?@\7u\2\2@A\7g\2\2A\22\3\2\2\2BC\7t\2\2CD\7g\2\2DE\7v\2\2EF\7w\2\2"+
		"FG\7t\2\2GH\7p\2\2H\24\3\2\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7"+
		"v\2\2N\26\3\2\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST"+
		"\3\2\2\2T\30\3\2\2\2US\3\2\2\2VW\7?\2\2W\32\3\2\2\2XY\7-\2\2Y\34\3\2\2"+
		"\2Z[\7/\2\2[\36\3\2\2\2\\]\7,\2\2] \3\2\2\2^_\7\61\2\2_\"\3\2\2\2`a\7"+
		"=\2\2a$\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f&\3"+
		"\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b"+
		"\24\2\2m(\3\2\2\2\6\2Sej\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}