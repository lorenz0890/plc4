// Generated from /home/lorenz/Code/calculator_student/src/main/antlr4/AdvancedCalculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdvancedCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, DIGIT=9, 
		NEWLINE=10, WS=11, CHAR=12, VAR=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUMBER", "DIGIT", 
		"NEWLINE", "WS", "CHAR", "VAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NUMBER", "DIGIT", "NEWLINE", 
		"WS", "CHAR", "VAR"
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


	public AdvancedCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AdvancedCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\7\t-\n\t\f\t\16\t\60\13\t\3\t\3\t\6\t\64\n\t\r\t"+
		"\16\t\65\3\t\6\t9\n\t\r\t\16\t:\5\t=\n\t\3\n\3\n\3\13\5\13B\n\13\3\13"+
		"\3\13\3\f\6\fG\n\f\r\f\16\fH\3\f\3\f\3\r\3\r\3\16\6\16P\n\16\r\16\16\16"+
		"Q\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\3\2\5\3\2\62;\4\2\13\13\"\"\3\2c|\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3"+
		"\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)"+
		"\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25A\3\2\2\2\27F\3\2\2\2\31L\3\2\2\2\33"+
		"O\3\2\2\2\35\36\7*\2\2\36\4\3\2\2\2\37 \7+\2\2 \6\3\2\2\2!\"\7,\2\2\""+
		"\b\3\2\2\2#$\7\61\2\2$\n\3\2\2\2%&\7-\2\2&\f\3\2\2\2\'(\7/\2\2(\16\3\2"+
		"\2\2)*\7?\2\2*\20\3\2\2\2+-\5\23\n\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\63\7\60\2\2\62\64\5\23\n\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66=\3\2\2\2\679\5\23"+
		"\n\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<.\3\2\2\2<8\3"+
		"\2\2\2=\22\3\2\2\2>?\t\2\2\2?\24\3\2\2\2@B\7\17\2\2A@\3\2\2\2AB\3\2\2"+
		"\2BC\3\2\2\2CD\7\f\2\2D\26\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\f\2\2K\30\3\2\2\2LM\t\4\2\2M\32\3\2\2\2N"+
		"P\5\31\r\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\34\3\2\2\2\n\2.\65"+
		":<AHQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}