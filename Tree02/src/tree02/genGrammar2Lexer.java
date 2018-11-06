// Generated from genGrammar2.g4 by ANTLR 4.5.3

        package tree02;
        import java.util.*;
        import java.lang.*;
        import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class genGrammar2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		End=1, Function=2, Break=3, Case=4, Else=5, ElseIf=6, For=7, If=8, Return=9, 
		Switch=10, While=11, Global=12, Try=13, Catch=14, Continue=15, MLock=16, 
		Strcat=17, Disp=18, Num2str=19, Feval=20, Nargout=21, LeftParen=22, RightParen=23, 
		LeftBracket=24, RightBracket=25, LeftBrace=26, RightBrace=27, Less=28, 
		LessEqual=29, Greater=30, GreaterEqual=31, Plus=32, Minus=33, Star=34, 
		Div=35, And=36, Or=37, AndAnd=38, OrOr=39, Caret=40, Not=41, Tilde=42, 
		At=43, Question=44, Colon=45, Semi=46, Comma=47, Point=48, Assign=49, 
		StarAssign=50, DivAssign=51, ModAssign=52, PlusAssign=53, MinusAssign=54, 
		TildaAssign=55, Equal=56, NotEqual=57, ID=58, CONST=59, Int=60, DigitSequence=61, 
		StringLit=62, WHITESPACE=63, COMMENT=64, NEWLINE=65, ELLIPSIS=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"End", "Function", "Break", "Case", "Else", "ElseIf", "For", "If", "Return", 
		"Switch", "While", "Global", "Try", "Catch", "Continue", "MLock", "Strcat", 
		"Disp", "Num2str", "Feval", "Nargout", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "Plus", "Minus", "Star", "Div", "And", "Or", "AndAnd", 
		"OrOr", "Caret", "Not", "Tilde", "At", "Question", "Colon", "Semi", "Comma", 
		"Point", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
		"MinusAssign", "TildaAssign", "Equal", "NotEqual", "ID", "Nondigit", "Digit", 
		"CONST", "Int", "NozeroDigit", "Float", "FractionalConstant", "Exp", "Sign", 
		"DigitSequence", "StringLit", "SCharSequence", "SChar", "WHITESPACE", 
		"COMMENT", "NEWLINE", "ELLIPSIS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'function'", "'break'", "'case'", "'else'", "'elseif'", 
		"'for'", "'if'", "'return'", "'switch'", "'while'", "'global'", "'try'", 
		"'catch'", "'continue'", "'mlock'", "'strcat'", "'disp'", "'num2str'", 
		"'feval'", "'nargout'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
		"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'&&'", 
		"'||'", "'^'", "'!'", "'~'", "'@'", "'?'", "':'", "';'", "','", "'.'", 
		"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'~='", "'=='", "'!='", 
		null, null, null, null, null, null, null, null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "End", "Function", "Break", "Case", "Else", "ElseIf", "For", "If", 
		"Return", "Switch", "While", "Global", "Try", "Catch", "Continue", "MLock", 
		"Strcat", "Disp", "Num2str", "Feval", "Nargout", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
		"Greater", "GreaterEqual", "Plus", "Minus", "Star", "Div", "And", "Or", 
		"AndAnd", "OrOr", "Caret", "Not", "Tilde", "At", "Question", "Colon", 
		"Semi", "Comma", "Point", "Assign", "StarAssign", "DivAssign", "ModAssign", 
		"PlusAssign", "MinusAssign", "TildaAssign", "Equal", "NotEqual", "ID", 
		"CONST", "Int", "DigitSequence", "StringLit", "WHITESPACE", "COMMENT", 
		"NEWLINE", "ELLIPSIS"
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


		public String memory = new String("");
	                    public String dop = new String("");


	public genGrammar2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "genGrammar2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\7;\u0172\n;\f;\16;\u0175\13"+
		";\6;\u0177\n;\r;\16;\u0178\3<\3<\3=\3=\3>\3>\5>\u0181\n>\3?\5?\u0184\n"+
		"?\3?\3?\7?\u0188\n?\f?\16?\u018b\13?\3@\3@\3A\3A\5A\u0191\nA\3A\3A\3A"+
		"\5A\u0196\nA\3B\5B\u0199\nB\3B\3B\3B\3B\3B\5B\u01a0\nB\3C\3C\5C\u01a4"+
		"\nC\3C\3C\3C\5C\u01a9\nC\3C\5C\u01ac\nC\3D\3D\3E\6E\u01b1\nE\rE\16E\u01b2"+
		"\3F\3F\5F\u01b7\nF\3F\3F\3G\6G\u01bc\nG\rG\16G\u01bd\3H\3H\3H\3H\5H\u01c4"+
		"\nH\3I\3I\3I\3I\3J\3J\7J\u01cc\nJ\fJ\16J\u01cf\13J\3J\3J\3K\3K\5K\u01d5"+
		"\nK\3K\5K\u01d8\nK\3K\3K\3L\3L\3L\3L\3L\3L\2\2M\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{=}>\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089?\u008b@\u008d\2\u008f\2\u0091"+
		"A\u0093B\u0095C\u0097D\3\2\b\5\2C\\aac|\3\2\62;\3\2\63;\6\2\f\f\17\17"+
		"$$^^\4\2\13\13\"\"\4\2\f\f\17\17\u01ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099"+
		"\3\2\2\2\5\u009d\3\2\2\2\7\u00a6\3\2\2\2\t\u00ac\3\2\2\2\13\u00b1\3\2"+
		"\2\2\r\u00b6\3\2\2\2\17\u00bd\3\2\2\2\21\u00c1\3\2\2\2\23\u00c4\3\2\2"+
		"\2\25\u00cb\3\2\2\2\27\u00d2\3\2\2\2\31\u00d8\3\2\2\2\33\u00df\3\2\2\2"+
		"\35\u00e3\3\2\2\2\37\u00e9\3\2\2\2!\u00f2\3\2\2\2#\u00f8\3\2\2\2%\u00ff"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u010c\3\2\2\2+\u0112\3\2\2\2-\u011a\3\2\2\2"+
		"/\u011c\3\2\2\2\61\u011e\3\2\2\2\63\u0120\3\2\2\2\65\u0122\3\2\2\2\67"+
		"\u0124\3\2\2\29\u0126\3\2\2\2;\u0128\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2"+
		"\2\2A\u0130\3\2\2\2C\u0132\3\2\2\2E\u0134\3\2\2\2G\u0136\3\2\2\2I\u0138"+
		"\3\2\2\2K\u013a\3\2\2\2M\u013c\3\2\2\2O\u013f\3\2\2\2Q\u0142\3\2\2\2S"+
		"\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014c\3\2"+
		"\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c\u0154\3\2\2\2e\u0156"+
		"\3\2\2\2g\u0159\3\2\2\2i\u015c\3\2\2\2k\u015f\3\2\2\2m\u0162\3\2\2\2o"+
		"\u0165\3\2\2\2q\u0168\3\2\2\2s\u016b\3\2\2\2u\u0176\3\2\2\2w\u017a\3\2"+
		"\2\2y\u017c\3\2\2\2{\u0180\3\2\2\2}\u0183\3\2\2\2\177\u018c\3\2\2\2\u0081"+
		"\u0195\3\2\2\2\u0083\u019f\3\2\2\2\u0085\u01ab\3\2\2\2\u0087\u01ad\3\2"+
		"\2\2\u0089\u01b0\3\2\2\2\u008b\u01b4\3\2\2\2\u008d\u01bb\3\2\2\2\u008f"+
		"\u01c3\3\2\2\2\u0091\u01c5\3\2\2\2\u0093\u01c9\3\2\2\2\u0095\u01d7\3\2"+
		"\2\2\u0097\u01db\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7f\2\2\u009c\4\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7p\2\2\u00a5\6\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7m\2\2"+
		"\u00ab\b\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7u"+
		"\2\2\u00af\u00b0\7g\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\f\3\2\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7h\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\24\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7"+
		"k\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7j\2\2\u00d1\26"+
		"\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7i\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7c\2\2"+
		"\u00dd\u00de\7n\2\2\u00de\32\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7{\2\2\u00e2\34\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\36\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7p\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7w\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7n\2"+
		"\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7m\2\2\u00f7\"\3"+
		"\2\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7v\2\2\u00fe$\3\2\2\2\u00ff"+
		"\u0100\7f\2\2\u0100\u0101\7k\2\2\u0101\u0102\7u\2\2\u0102\u0103\7r\2\2"+
		"\u0103&\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106\7w\2\2\u0106\u0107\7o\2"+
		"\2\u0107\u0108\7\64\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b"+
		"\7t\2\2\u010b(\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\7x\2\2\u010f\u0110\7c\2\2\u0110\u0111\7n\2\2\u0111*\3\2\2\2\u0112\u0113"+
		"\7p\2\2\u0113\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7i\2\2\u0116"+
		"\u0117\7q\2\2\u0117\u0118\7w\2\2\u0118\u0119\7v\2\2\u0119,\3\2\2\2\u011a"+
		"\u011b\7*\2\2\u011b.\3\2\2\2\u011c\u011d\7+\2\2\u011d\60\3\2\2\2\u011e"+
		"\u011f\7]\2\2\u011f\62\3\2\2\2\u0120\u0121\7_\2\2\u0121\64\3\2\2\2\u0122"+
		"\u0123\7}\2\2\u0123\66\3\2\2\2\u0124\u0125\7\177\2\2\u01258\3\2\2\2\u0126"+
		"\u0127\7>\2\2\u0127:\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7?\2\2\u012a"+
		"<\3\2\2\2\u012b\u012c\7@\2\2\u012c>\3\2\2\2\u012d\u012e\7@\2\2\u012e\u012f"+
		"\7?\2\2\u012f@\3\2\2\2\u0130\u0131\7-\2\2\u0131B\3\2\2\2\u0132\u0133\7"+
		"/\2\2\u0133D\3\2\2\2\u0134\u0135\7,\2\2\u0135F\3\2\2\2\u0136\u0137\7\61"+
		"\2\2\u0137H\3\2\2\2\u0138\u0139\7(\2\2\u0139J\3\2\2\2\u013a\u013b\7~\2"+
		"\2\u013bL\3\2\2\2\u013c\u013d\7(\2\2\u013d\u013e\7(\2\2\u013eN\3\2\2\2"+
		"\u013f\u0140\7~\2\2\u0140\u0141\7~\2\2\u0141P\3\2\2\2\u0142\u0143\7`\2"+
		"\2\u0143R\3\2\2\2\u0144\u0145\7#\2\2\u0145T\3\2\2\2\u0146\u0147\7\u0080"+
		"\2\2\u0147V\3\2\2\2\u0148\u0149\7B\2\2\u0149X\3\2\2\2\u014a\u014b\7A\2"+
		"\2\u014bZ\3\2\2\2\u014c\u014d\7<\2\2\u014d\\\3\2\2\2\u014e\u014f\7=\2"+
		"\2\u014f^\3\2\2\2\u0150\u0151\7.\2\2\u0151`\3\2\2\2\u0152\u0153\7\60\2"+
		"\2\u0153b\3\2\2\2\u0154\u0155\7?\2\2\u0155d\3\2\2\2\u0156\u0157\7,\2\2"+
		"\u0157\u0158\7?\2\2\u0158f\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\7"+
		"?\2\2\u015bh\3\2\2\2\u015c\u015d\7\'\2\2\u015d\u015e\7?\2\2\u015ej\3\2"+
		"\2\2\u015f\u0160\7-\2\2\u0160\u0161\7?\2\2\u0161l\3\2\2\2\u0162\u0163"+
		"\7/\2\2\u0163\u0164\7?\2\2\u0164n\3\2\2\2\u0165\u0166\7\u0080\2\2\u0166"+
		"\u0167\7?\2\2\u0167p\3\2\2\2\u0168\u0169\7?\2\2\u0169\u016a\7?\2\2\u016a"+
		"r\3\2\2\2\u016b\u016c\7#\2\2\u016c\u016d\7?\2\2\u016dt\3\2\2\2\u016e\u0173"+
		"\5w<\2\u016f\u0172\5w<\2\u0170\u0172\5y=\2\u0171\u016f\3\2\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u016e\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179v\3\2\2\2\u017a\u017b"+
		"\t\2\2\2\u017bx\3\2\2\2\u017c\u017d\t\3\2\2\u017dz\3\2\2\2\u017e\u0181"+
		"\5}?\2\u017f\u0181\5\u0081A\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2"+
		"\u0181|\3\2\2\2\u0182\u0184\5\u0087D\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\5\177@\2\u0186\u0188\5y=\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a~\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\t\4\2\2\u018d\u0080"+
		"\3\2\2\2\u018e\u0190\5\u0083B\2\u018f\u0191\5\u0085C\2\u0190\u018f\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0196\3\2\2\2\u0192\u0193\5\u0089E\2\u0193"+
		"\u0194\5\u0085C\2\u0194\u0196\3\2\2\2\u0195\u018e\3\2\2\2\u0195\u0192"+
		"\3\2\2\2\u0196\u0082\3\2\2\2\u0197\u0199\5\u0089E\2\u0198\u0197\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\60\2\2\u019b"+
		"\u01a0\5\u0089E\2\u019c\u019d\5\u0089E\2\u019d\u019e\7\60\2\2\u019e\u01a0"+
		"\3\2\2\2\u019f\u0198\3\2\2\2\u019f\u019c\3\2\2\2\u01a0\u0084\3\2\2\2\u01a1"+
		"\u01a3\7g\2\2\u01a2\u01a4\5\u0087D\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ac\5\u0089E\2\u01a6\u01a8\7G\2\2\u01a7"+
		"\u01a9\5\u0087D\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ac\5\u0089E\2\u01ab\u01a1\3\2\2\2\u01ab\u01a6\3\2\2"+
		"\2\u01ac\u0086\3\2\2\2\u01ad\u01ae\7/\2\2\u01ae\u0088\3\2\2\2\u01af\u01b1"+
		"\5y=\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u008a\3\2\2\2\u01b4\u01b6\7)\2\2\u01b5\u01b7\5\u008d"+
		"G\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\7)\2\2\u01b9\u008c\3\2\2\2\u01ba\u01bc\5\u008fH\2\u01bb\u01ba\3"+
		"\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u008e\3\2\2\2\u01bf\u01c4\n\5\2\2\u01c0\u01c4\7$\2\2\u01c1\u01c2\7^\2"+
		"\2\u01c2\u01c4\13\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u0090\3\2\2\2\u01c5\u01c6\t\6\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\bI\2\2\u01c8\u0092\3\2\2\2\u01c9\u01cd\7\'\2\2\u01ca"+
		"\u01cc\n\7\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d1\bJ\2\2\u01d1\u0094\3\2\2\2\u01d2\u01d4\7\17\2\2\u01d3\u01d5\7\f"+
		"\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d8\7\f\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\bK\2\2\u01da\u0096\3\2\2\2\u01db\u01dc\7\60\2\2\u01dc"+
		"\u01dd\7\60\2\2\u01dd\u01de\7\60\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\b"+
		"L\2\2\u01e0\u0098\3\2\2\2\27\2\u0171\u0173\u0178\u0180\u0183\u0189\u0190"+
		"\u0195\u0198\u019f\u01a3\u01a8\u01ab\u01b2\u01b6\u01bd\u01c3\u01cd\u01d4"+
		"\u01d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}