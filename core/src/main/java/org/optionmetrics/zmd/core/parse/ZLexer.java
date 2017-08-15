// Generated from org/optionmetrics/zmd/core/parse/ZLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZED=1, SCH=2, AX=3, TEXT=4, NUMERAL=5, STROKE=6, LEFT_PARENTHESIS=7, RIGHT_PARENTHESIS=8, 
		LEFT_SQUARE_BRACKET=9, RIGHT_SQUARE_BRACKET=10, LEFT_CURLY_BRACKET=11, 
		RIGHT_CURLY_BRACKET=12, LEFT_BINDING_BRACKET=13, RIGHT_BINDING_BRACKET=14, 
		LEFT_DOUBLE_ANGLE_BRACKET=15, RIGHT_DOUBLE_ANGLE_BRACKET=16, GEN=17, END=18, 
		WS=19, NL=20, IGNORE_NL=21, ELSE=22, FALSE=23, FUNCTION=24, GENERIC=25, 
		IF=26, LEFTASSOC=27, LET=28, POWERSET=29, PARENTS=30, PRE_KEY=31, RELATION=32, 
		RIGHTASSOC=33, SECTION=34, THEN=35, TRUE=36, COLON=37, DEFINE_EQUAL=38, 
		COMMA=39, FREE_EQUALS=40, VERTICAL_LINE=41, AMPERSAND=42, REVERSE_SOLIDUS=43, 
		SOLIDUS=44, FULL_STOP=45, SEMICOLON=46, ARGUMENT=47, LIST=48, EQUALS_SIGN=49, 
		CONJECTURE=50, FOR_ALL=51, SPOT=52, THERE_EXISTS=53, UNIQUE_EXISTS=54, 
		LEFT_RIGHT_DOUBLE_ARROW=55, RIGHTWARDS_DOUBLE_ARROW=56, LOGICAL_OR=57, 
		LOGICAL_AND=58, NOT_SIGN=59, ELEMENT_OF=60, SCHEMA_PROJECTION=61, MULTIPLICATION_SIGN=62, 
		GREEK_SMALL_LETTER_THETA=63, GREEK_SMALL_LETTER_LAMBDA=64, GREEK_SMALL_LETTER_MU=65, 
		SCHEMA_COMPOSITION=66, SCHEMA_PIPING=67, NAME=68, WORDPART=69, GREEK_CAPITAL_LETTER_DELTA=70, 
		GREEK_CAPITAL_LETTER_XI=71, MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_A=72, DOUBLE_STRUCK_CAPITAL_N=73, 
		MODIFIER_LETTER_PRIME=74, EXCLAMATION_MARK=75, QUESTION_MARK=76, NORTH_EAST_ARROW=77, 
		SOUTH_WEST_ARROW=78, SOUTH_EAST_ARROW=79, NORTH_WEST_ARROW=80, RIGHT_TACK=81, 
		BIG_REVERSE_SOLIDUS=82, PLUS_SIGN=83, MATHEMATICAL_TOOLKIT_SYMBOLS=84, 
		LEFT_RIGHT_ARROW=85, RIGHTWARDS_ARROW=86, NOT_EQUAL_TO=87, NOT_AN_ELEMENT_OF=88, 
		EMPTY_SET=89, SUBSET_OF_OR_EQUAL_TO=90, SUBSET_OF=91, UNION=92, INTERSECTION=93, 
		SET_MINUS=94, CIRCLED_MINUS=95, N_ARY_UNION=96, N_ARY_INTERSECTION=97, 
		MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_F=98, RIGHTWARDS_ARROW_FROM_BAR=99, 
		RELATIONAL_COMPOSITION=100, RING_OPERATOR=101, WHITE_LEFT_POINTING_TRIANGLE=102, 
		WHITE_RIGHT_POINTING_TRIANGLE=103, DOMAIN_ANTIRESTRICTION=104, RANGE_ANTIRESTRICTION=105, 
		TILDE_OPERATOR=106, LEFT_IMAGE_BRACKET=107, RIGHT_IMAGE_BRACKET=108, CIRCLED_PLUS=109, 
		RIGHTWARDS_ARROW_WITH_VERTICAL_STROKE=110, RIGHTWARDS_ARROW_WITH_TAIL_WITH_VERTICAL_STROKE=111, 
		RIGHTWARDS_ARROW_WITH_TAIL=112, RIGHTWARDS_TWO_HEADED_ARROW_WITH_VERTICAL_STROKE=113, 
		RIGHTWARDS_TWO_HEADED_ARROW=114, RIGHTWARDS_TWO_HEADED_ARROW_WITH_TAIL=115, 
		RIGHTWARDS_ARROW_WITH_DOUBLE_VERTICAL_STROKE=116, RIGHTWARDS_ARROW_WITH_TAIL_WITH_DOUBLE_VERTICAL_STROKE=117, 
		DOUBLE_STRUCK_CAPITAL_Z=118, HYPHEN_MINUS=119, MINUS_SIGN=120, LESS_THAN_OR_EQUAL_TO=121, 
		LESS_THAN_SIGN=122, GREATER_THAN_OR_EQUAL_TO=123, GREATER_THAN_SIGN=124, 
		ASTERISK=125, NUMBER_SIGN=126, CHARACTER_TIE=127, UPWARDS_HARPOON_WITH_BARB_LEFTWARDS=128, 
		UPWARDS_HARPOON_WITH_BARB_RIGHTWARDS=129, LEFT_ANGLE_BRACKET=130, RIGHT_ANGLE_BRACKET=131, 
		ID0=132, ID1=133, ID=134, PREP=135, PRE=136, POSTP=137, POST=138, IP=139, 
		I=140, LP=141, L=142, ELP=143, EL=144, ERP=145, ER=146, SRP=147, SR=148, 
		EREP=149, ERE=150, SREP=151, SRE=152, ES=153, SS=154, UNKNOWN=155, NLCHAR=156;
	public static final int
		Z=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "Z"
	};

	public static final String[] ruleNames = {
		"ZED", "SCH", "AX", "TEXT", "NUMERAL", "STROKE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET", 
		"LEFT_BINDING_BRACKET", "RIGHT_BINDING_BRACKET", "LEFT_DOUBLE_ANGLE_BRACKET", 
		"RIGHT_DOUBLE_ANGLE_BRACKET", "GEN", "END", "NLCHAR", "WS", "NL", "IGNORE_NL", 
		"ELSE", "FALSE", "FUNCTION", "GENERIC", "IF", "LEFTASSOC", "LET", "POWERSET", 
		"PARENTS", "PRE_KEY", "RELATION", "RIGHTASSOC", "SECTION", "THEN", "TRUE", 
		"COLON", "DEFINE_EQUAL", "COMMA", "FREE_EQUALS", "VERTICAL_LINE", "AMPERSAND", 
		"REVERSE_SOLIDUS", "SOLIDUS", "FULL_STOP", "SEMICOLON", "ARGUMENT", "LIST", 
		"EQUALS_SIGN", "CONJECTURE", "FOR_ALL", "SPOT", "THERE_EXISTS", "UNIQUE_EXISTS", 
		"LEFT_RIGHT_DOUBLE_ARROW", "RIGHTWARDS_DOUBLE_ARROW", "LOGICAL_OR", "LOGICAL_AND", 
		"NOT_SIGN", "ELEMENT_OF", "SCHEMA_PROJECTION", "MULTIPLICATION_SIGN", 
		"GREEK_SMALL_LETTER_THETA", "GREEK_SMALL_LETTER_LAMBDA", "GREEK_SMALL_LETTER_MU", 
		"SCHEMA_COMPOSITION", "SCHEMA_PIPING", "NAME", "WORD", "WORDGLUE", "WORDPART", 
		"ALPHASTR", "SYMBOLSTR", "DIGIT", "DECIMAL", "NONDECIMAL", "LETTER", "OTHER_MATH_TOOLKIT_LETTERS", 
		"OTHER_UCS_LETTERS", "LATIN", "GREEK", "GREEK_CAPITAL_LETTER_DELTA", "GREEK_CAPITAL_LETTER_XI", 
		"MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_A", "DOUBLE_STRUCK_CAPITAL_N", "OTHERLETTER", 
		"PUNCT", "STROKECHAR", "MODIFIER_LETTER_PRIME", "EXCLAMATION_MARK", "QUESTION_MARK", 
		"NORTH_EAST_ARROW", "SOUTH_WEST_ARROW", "SOUTH_EAST_ARROW", "NORTH_WEST_ARROW", 
		"SYMBOL", "OTHER_UCS_SYMBOLS", "RIGHT_TACK", "BIG_REVERSE_SOLIDUS", "PLUS_SIGN", 
		"MATHEMATICAL_TOOLKIT_SYMBOLS", "LEFT_RIGHT_ARROW", "RIGHTWARDS_ARROW", 
		"NOT_EQUAL_TO", "NOT_AN_ELEMENT_OF", "EMPTY_SET", "SUBSET_OF_OR_EQUAL_TO", 
		"SUBSET_OF", "UNION", "INTERSECTION", "SET_MINUS", "CIRCLED_MINUS", "N_ARY_UNION", 
		"N_ARY_INTERSECTION", "MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_F", "SET_TOOLKIT", 
		"RIGHTWARDS_ARROW_FROM_BAR", "RELATIONAL_COMPOSITION", "RING_OPERATOR", 
		"WHITE_LEFT_POINTING_TRIANGLE", "WHITE_RIGHT_POINTING_TRIANGLE", "DOMAIN_ANTIRESTRICTION", 
		"RANGE_ANTIRESTRICTION", "TILDE_OPERATOR", "LEFT_IMAGE_BRACKET", "RIGHT_IMAGE_BRACKET", 
		"CIRCLED_PLUS", "RELATION_TOOLKIT", "RIGHTWARDS_ARROW_WITH_VERTICAL_STROKE", 
		"RIGHTWARDS_ARROW_WITH_TAIL_WITH_VERTICAL_STROKE", "RIGHTWARDS_ARROW_WITH_TAIL", 
		"RIGHTWARDS_TWO_HEADED_ARROW_WITH_VERTICAL_STROKE", "RIGHTWARDS_TWO_HEADED_ARROW", 
		"RIGHTWARDS_TWO_HEADED_ARROW_WITH_TAIL", "RIGHTWARDS_ARROW_WITH_DOUBLE_VERTICAL_STROKE", 
		"RIGHTWARDS_ARROW_WITH_TAIL_WITH_DOUBLE_VERTICAL_STROKE", "FUNCTION_TOOLKIT", 
		"DOUBLE_STRUCK_CAPITAL_Z", "HYPHEN_MINUS", "MINUS_SIGN", "LESS_THAN_OR_EQUAL_TO", 
		"LESS_THAN_SIGN", "GREATER_THAN_OR_EQUAL_TO", "GREATER_THAN_SIGN", "ASTERISK", 
		"NUMBER_TOOLKIT", "NUMBER_SIGN", "CHARACTER_TIE", "UPWARDS_HARPOON_WITH_BARB_LEFTWARDS", 
		"UPWARDS_HARPOON_WITH_BARB_RIGHTWARDS", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", 
		"SEQUENCE_TOOLKIT", "ID0", "ID1", "ID", "PREP", "PRE", "POSTP", "POST", 
		"IP", "I", "LP", "L", "ELP", "EL", "ERP", "ER", "SRP", "SR", "EREP", "ERE", 
		"SREP", "SRE", "ES", "SS", "UNKNOWN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u2500'", "'\u250C'", "'\u2577'", null, null, null, "'\u0028'", 
		"'\u0029'", "'\u005B'", "'\u005D'", "'\u007B'", "'\u007D'", "'\u2989'", 
		"'\u298A'", "'\u27EA'", "'\u27EB'", "'\u2550'", "'\u2514'", null, null, 
		null, "'else'", "'false'", "'function'", "'generic'", "'if'", "'leftassoc'", 
		"'let'", "'\u2119'", "'parents'", "'pre'", "'relation'", "'rightassoc'", 
		"'section'", "'then'", "'true'", "':'", "'=='", "','", "'::='", "'|'", 
		"'\u0026'", "'\u005C'", "'/'", "'.'", "';'", "'_'", "',,'", "'='", null, 
		"'\u2200'", "'\u2981'", "'\u2203'", null, "'\u21D4'", "'\u21D2'", "'\u2228'", 
		"'\u2227'", "'\u00AC'", "'\u2208'", "'\u2A21'", "'\u00D7'", "'\u03B8'", 
		"'\u03BB'", "'\u03BC'", "'\u2A1F'", "'\u2A20'", null, null, "'\u0394'", 
		"'\u039E'", "'\uD835\uDD38'", "'\u2115'", "'\u2032'", "'\u0021'", "'\u003F'", 
		"'\u2197'", "'\u2199'", "'\u2198'", "'\u2196'", "'\u22A2'", "'\u29F9'", 
		"'\u002B'", null, "'\u2194'", "'\u2192'", "'\u2260'", "'\u2209'", "'\u2205'", 
		"'\u2286'", "'\u2282'", "'\u222A'", "'\u2229'", "'\u2216'", "'\u2296'", 
		"'\u22C3'", "'\u22C2'", "'\uD835\uDD3D'", "'\u21A6'", "'\u2A3E'", "'\u2218'", 
		"'\u25C1'", "'\u25B7'", "'\u2A64'", "'\u2A65'", "'\u223C'", "'\u2987'", 
		"'\u2988'", "'\u2295'", "'\u21F8'", "'\u2914'", "'\u21A3'", "'\u2900'", 
		"'\u21A0'", "'\u2916'", "'\u21FB'", "'\u2915'", "'\u2124'", "'\u002D'", 
		"'\u2212'", "'\u2264'", "'\u003C'", "'\u2265'", "'\u003E'", "'\u002A'", 
		"'\u0023'", "'\u2040'", "'\u21BF'", "'\u21BE'", "'\u27E8'", "'\u27E9'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'\u2028'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZED", "SCH", "AX", "TEXT", "NUMERAL", "STROKE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", 
		"RIGHT_CURLY_BRACKET", "LEFT_BINDING_BRACKET", "RIGHT_BINDING_BRACKET", 
		"LEFT_DOUBLE_ANGLE_BRACKET", "RIGHT_DOUBLE_ANGLE_BRACKET", "GEN", "END", 
		"WS", "NL", "IGNORE_NL", "ELSE", "FALSE", "FUNCTION", "GENERIC", "IF", 
		"LEFTASSOC", "LET", "POWERSET", "PARENTS", "PRE_KEY", "RELATION", "RIGHTASSOC", 
		"SECTION", "THEN", "TRUE", "COLON", "DEFINE_EQUAL", "COMMA", "FREE_EQUALS", 
		"VERTICAL_LINE", "AMPERSAND", "REVERSE_SOLIDUS", "SOLIDUS", "FULL_STOP", 
		"SEMICOLON", "ARGUMENT", "LIST", "EQUALS_SIGN", "CONJECTURE", "FOR_ALL", 
		"SPOT", "THERE_EXISTS", "UNIQUE_EXISTS", "LEFT_RIGHT_DOUBLE_ARROW", "RIGHTWARDS_DOUBLE_ARROW", 
		"LOGICAL_OR", "LOGICAL_AND", "NOT_SIGN", "ELEMENT_OF", "SCHEMA_PROJECTION", 
		"MULTIPLICATION_SIGN", "GREEK_SMALL_LETTER_THETA", "GREEK_SMALL_LETTER_LAMBDA", 
		"GREEK_SMALL_LETTER_MU", "SCHEMA_COMPOSITION", "SCHEMA_PIPING", "NAME", 
		"WORDPART", "GREEK_CAPITAL_LETTER_DELTA", "GREEK_CAPITAL_LETTER_XI", "MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_A", 
		"DOUBLE_STRUCK_CAPITAL_N", "MODIFIER_LETTER_PRIME", "EXCLAMATION_MARK", 
		"QUESTION_MARK", "NORTH_EAST_ARROW", "SOUTH_WEST_ARROW", "SOUTH_EAST_ARROW", 
		"NORTH_WEST_ARROW", "RIGHT_TACK", "BIG_REVERSE_SOLIDUS", "PLUS_SIGN", 
		"MATHEMATICAL_TOOLKIT_SYMBOLS", "LEFT_RIGHT_ARROW", "RIGHTWARDS_ARROW", 
		"NOT_EQUAL_TO", "NOT_AN_ELEMENT_OF", "EMPTY_SET", "SUBSET_OF_OR_EQUAL_TO", 
		"SUBSET_OF", "UNION", "INTERSECTION", "SET_MINUS", "CIRCLED_MINUS", "N_ARY_UNION", 
		"N_ARY_INTERSECTION", "MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_F", "RIGHTWARDS_ARROW_FROM_BAR", 
		"RELATIONAL_COMPOSITION", "RING_OPERATOR", "WHITE_LEFT_POINTING_TRIANGLE", 
		"WHITE_RIGHT_POINTING_TRIANGLE", "DOMAIN_ANTIRESTRICTION", "RANGE_ANTIRESTRICTION", 
		"TILDE_OPERATOR", "LEFT_IMAGE_BRACKET", "RIGHT_IMAGE_BRACKET", "CIRCLED_PLUS", 
		"RIGHTWARDS_ARROW_WITH_VERTICAL_STROKE", "RIGHTWARDS_ARROW_WITH_TAIL_WITH_VERTICAL_STROKE", 
		"RIGHTWARDS_ARROW_WITH_TAIL", "RIGHTWARDS_TWO_HEADED_ARROW_WITH_VERTICAL_STROKE", 
		"RIGHTWARDS_TWO_HEADED_ARROW", "RIGHTWARDS_TWO_HEADED_ARROW_WITH_TAIL", 
		"RIGHTWARDS_ARROW_WITH_DOUBLE_VERTICAL_STROKE", "RIGHTWARDS_ARROW_WITH_TAIL_WITH_DOUBLE_VERTICAL_STROKE", 
		"DOUBLE_STRUCK_CAPITAL_Z", "HYPHEN_MINUS", "MINUS_SIGN", "LESS_THAN_OR_EQUAL_TO", 
		"LESS_THAN_SIGN", "GREATER_THAN_OR_EQUAL_TO", "GREATER_THAN_SIGN", "ASTERISK", 
		"NUMBER_SIGN", "CHARACTER_TIE", "UPWARDS_HARPOON_WITH_BARB_LEFTWARDS", 
		"UPWARDS_HARPOON_WITH_BARB_RIGHTWARDS", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", 
		"ID0", "ID1", "ID", "PREP", "PRE", "POSTP", "POST", "IP", "I", "LP", "L", 
		"ELP", "EL", "ERP", "ER", "SRP", "SR", "EREP", "ERE", "SREP", "SRE", "ES", 
		"SS", "UNKNOWN", "NLCHAR"
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


		public static final Integer[] BOTH_VALUES = new Integer[] { ELSE, FUNCTION, GENERIC, LEFTASSOC, PARENTS, RELATION, RIGHTASSOC, SECTION, THEN, FREE_EQUALS, VERTICAL_LINE, LEFT_DOUBLE_ANGLE_BRACKET, RIGHT_DOUBLE_ANGLE_BRACKET, AMPERSAND, RIGHT_TACK, LIST, LOGICAL_AND, LOGICAL_OR, RIGHTWARDS_DOUBLE_ARROW, LEFT_RIGHT_DOUBLE_ARROW, MULTIPLICATION_SIGN, SOLIDUS, EQUALS_SIGN, ELEMENT_OF, DEFINE_EQUAL, COLON, SEMICOLON, COMMA, FULL_STOP, SPOT, BIG_REVERSE_SOLIDUS, SCHEMA_PROJECTION, SCHEMA_COMPOSITION, SCHEMA_PIPING };
		public static final Integer[] AFTER_VALUES = new Integer[] { IF, LET, PRE_KEY, LEFT_SQUARE_BRACKET, ARGUMENT, NOT_SIGN, FOR_ALL, THERE_EXISTS, POWERSET, LEFT_PARENTHESIS, LEFT_CURLY_BRACKET, LEFT_BINDING_BRACKET, GREEK_SMALL_LETTER_LAMBDA, GREEK_SMALL_LETTER_MU, GREEK_SMALL_LETTER_THETA, ZED, AX, SCH /*GENAX GENSCH*/};
		public static final Integer[] BEFORE_VALUES = new Integer[] { RIGHT_SQUARE_BRACKET, RIGHT_PARENTHESIS, RIGHT_CURLY_BRACKET, RIGHT_BINDING_BRACKET, END};
		
		public static final java.util.Set<Integer> BOTH = new java.util.HashSet<Integer>(java.util.Arrays.asList(BOTH_VALUES));
		public static final java.util.Set<Integer> AFTER = new java.util.HashSet<Integer>(java.util.Arrays.asList(AFTER_VALUES));
		public static final java.util.Set<Integer> BEFORE = new java.util.HashSet<Integer>(java.util.Arrays.asList(BEFORE_VALUES));
		
		int lastTokenType = 0;
		public void emit(Token token) {
	 	   super.emit(token);
	 	   lastTokenType = token.getType();
		}
		
		public boolean shouldNL(int nextToken) {
			if(BOTH.contains(lastTokenType)) {
				return false;
			} else if(AFTER.contains(lastTokenType)) {
				return false;
			} else if(BEFORE.contains(nextToken)) {
				return false;
			}

			return true;
		}


	public ZLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ZLexer.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return NL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return shouldNL(_input.LA(1));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u009e\u03dd\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080"+
		"\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\6\5\u0176\n\5\r\5\16\5\u0177\3\5\3\5\3\6\6\6\u017d\n\6"+
		"\r\6\16\6\u017e\3\7\3\7\3\7\3\7\3\7\5\7\u0186\n\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u01a7\n\25"+
		"\r\25\16\25\u01a8\3\25\3\25\3\26\6\26\u01ae\n\26\r\26\16\26\u01af\3\26"+
		"\3\26\3\27\6\27\u01b5\n\27\r\27\16\27\u01b6\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\39\39\3:"+
		"\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E"+
		"\3F\3F\7F\u0264\nF\fF\16F\u0267\13F\3G\6G\u026a\nG\rG\16G\u026b\3G\3G"+
		"\5G\u0270\nG\3G\3G\7G\u0274\nG\fG\16G\u0277\13G\3G\3G\3G\7G\u027c\nG\f"+
		"G\16G\u027f\13G\3G\6G\u0282\nG\rG\16G\u0283\3G\5G\u0287\nG\5G\u0289\n"+
		"G\3H\3H\3H\3H\3H\5H\u0290\nH\3I\3I\3I\5I\u0295\nI\3J\3J\7J\u0299\nJ\f"+
		"J\16J\u029c\13J\3K\7K\u029f\nK\fK\16K\u02a2\13K\3L\3L\5L\u02a6\nL\3M\3"+
		"M\3N\5N\u02ab\nN\3O\3O\3O\3O\3O\5O\u02b2\nO\3P\3P\5P\u02b6\nP\3Q\3Q\3"+
		"R\3R\3S\3S\3S\3S\3S\5S\u02c1\nS\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\5X\u02ce"+
		"\nX\3Y\3Y\3Y\3Y\5Y\u02d4\nY\3Z\3Z\3Z\5Z\u02d9\nZ\3[\3[\3\\\3\\\3]\3]\3"+
		"^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\5b\u02ff\nb\3c\5c\u0302\nc\3d\3d\3e\3e\3f\3f\3g\3"+
		"g\3g\3g\3g\5g\u030f\ng\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3"+
		"o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3v\3v\5v\u033a\nv\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3"+
		"\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u035d"+
		"\n\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0377"+
		"\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0390\n\u0094"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\5\u009b\u03a4\n\u009b\3\u009c\5\u009c\u03a7\n\u009c\3\u009d\3\u009d\5"+
		"\u009d\u03ab\n\u009d\3\u009e\3\u009e\7\u009e\u03af\n\u009e\f\u009e\16"+
		"\u009e\u03b2\13\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\2\2\u00b4\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34"+
		"\17\36\20 \21\"\22$\23&\24(\u009e*\25,\26.\27\60\30\62\31\64\32\66\33"+
		"8\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64"+
		"j\65l\66n\67p8r9t:v;x<z=|>~?\u0080@\u0082A\u0084B\u0086C\u0088D\u008a"+
		"E\u008cF\u008e\2\u0090\2\u0092G\u0094\2\u0096\2\u0098\2\u009a\2\u009c"+
		"\2\u009e\2\u00a0\2\u00a2\2\u00a4\2\u00a6\2\u00a8H\u00aaI\u00acJ\u00ae"+
		"K\u00b0\2\u00b2\2\u00b4\2\u00b6L\u00b8M\u00baN\u00bcO\u00beP\u00c0Q\u00c2"+
		"R\u00c4\2\u00c6\2\u00c8S\u00caT\u00ccU\u00ceV\u00d0W\u00d2X\u00d4Y\u00d6"+
		"Z\u00d8[\u00da\\\u00dc]\u00de^\u00e0_\u00e2`\u00e4a\u00e6b\u00e8c\u00ea"+
		"d\u00ec\2\u00eee\u00f0f\u00f2g\u00f4h\u00f6i\u00f8j\u00fak\u00fcl\u00fe"+
		"m\u0100n\u0102o\u0104\2\u0106p\u0108q\u010ar\u010cs\u010et\u0110u\u0112"+
		"v\u0114w\u0116\2\u0118x\u011ay\u011cz\u011e{\u0120|\u0122}\u0124~\u0126"+
		"\177\u0128\2\u012a\u0080\u012c\u0081\u012e\u0082\u0130\u0083\u0132\u0084"+
		"\u0134\u0085\u0136\2\u0138\u0086\u013a\u0087\u013c\u0088\u013e\u0089\u0140"+
		"\u008a\u0142\u008b\u0144\u008c\u0146\u008d\u0148\u008e\u014a\u008f\u014c"+
		"\u0090\u014e\u0091\u0150\u0092\u0152\u0093\u0154\u0094\u0156\u0095\u0158"+
		"\u0096\u015a\u0097\u015c\u0098\u015e\u0099\u0160\u009a\u0162\u009b\u0164"+
		"\u009c\u0166\u009d\4\2\3\6\5\2\u2502\u2502\u250e\u250e\u2579\u2579\t\2"+
		"\"\"\u00a2\u00a2\u1682\u1682\u2002\u200c\u2031\u2031\u2061\u2061\u3002"+
		"\u3002\4\2\f\f\17\17\4\2C\\c|\t8\2\62\2;\2\u0662\2\u066b\2\u06f2\2\u06fb"+
		"\2\u07c2\2\u07cb\2\u0968\2\u0971\2\u09e8\2\u09f1\2\u0a68\2\u0a71\2\u0ae8"+
		"\2\u0af1\2\u0b68\2\u0b71\2\u0be8\2\u0bf1\2\u0c68\2\u0c71\2\u0ce8\2\u0cf1"+
		"\2\u0d68\2\u0d71\2\u0de8\2\u0df1\2\u0e52\2\u0e5b\2\u0ed2\2\u0edb\2\u0f22"+
		"\2\u0f2b\2\u1042\2\u104b\2\u1092\2\u109b\2\u17e2\2\u17eb\2\u1812\2\u181b"+
		"\2\u1948\2\u1951\2\u19d2\2\u19db\2\u1a82\2\u1a8b\2\u1a92\2\u1a9b\2\u1b52"+
		"\2\u1b5b\2\u1bb2\2\u1bbb\2\u1c42\2\u1c4b\2\u1c52\2\u1c5b\2\ua622\2\ua62b"+
		"\2\ua8d2\2\ua8db\2\ua902\2\ua90b\2\ua9d2\2\ua9db\2\ua9f2\2\ua9fb\2\uaa52"+
		"\2\uaa5b\2\uabf2\2\uabfb\2\uff12\2\uff1b\2\u04a2\3\u04ab\3\u1068\3\u1071"+
		"\3\u10f2\3\u10fb\3\u1138\3\u1141\3\u11d2\3\u11db\3\u12f2\3\u12fb\3\u1452"+
		"\3\u145b\3\u14d2\3\u14db\3\u1652\3\u165b\3\u16c2\3\u16cb\3\u1732\3\u173b"+
		"\3\u18e2\3\u18eb\3\u1c52\3\u1c5b\3\u6a62\3\u6a6b\3\u6b52\3\u6b5b\3\ud7d0"+
		"\3\ud801\3\ue952\3\ue95b\3G\2\u00b4\2\u00b5\2\u00bb\2\u00bb\2\u00be\2"+
		"\u00c0\2\u09f6\2\u09fb\2\u0b74\2\u0b79\2\u0bf2\2\u0bf4\2\u0c7a\2\u0c80"+
		"\2\u0d5a\2\u0d60\2\u0d72\2\u0d7a\2\u0f2c\2\u0f35\2\u136b\2\u137e\2\u16f0"+
		"\2\u16f2\2\u17f2\2\u17fb\2\u19dc\2\u19dc\2\u2072\2\u2072\2\u2076\2\u207b"+
		"\2\u2082\2\u208b\2\u2152\2\u2184\2\u2187\2\u218b\2\u2462\2\u249d\2\u24ec"+
		"\2\u2501\2\u2778\2\u2795\2\u2cff\2\u2cff\2\u3009\2\u3009\2\u3023\2\u302b"+
		"\2\u303a\2\u303c\2\u3194\2\u3197\2\u3222\2\u322b\2\u324a\2\u3251\2\u3253"+
		"\2\u3261\2\u3282\2\u328b\2\u32b3\2\u32c1\2\ua6e8\2\ua6f1\2\ua832\2\ua837"+
		"\2\u0109\3\u0135\3\u0142\3\u017a\3\u018c\3\u018d\3\u02e3\3\u02fd\3\u0322"+
		"\3\u0325\3\u0343\3\u0343\3\u034c\3\u034c\3\u03d3\3\u03d7\3\u085a\3\u0861"+
		"\3\u087b\3\u0881\3\u08a9\3\u08b1\3\u08fd\3\u0901\3\u0918\3\u091d\3\u09be"+
		"\3\u09bf\3\u09c2\3\u09d1\3\u09d4\3\u0a01\3\u0a42\3\u0a49\3\u0a7f\3\u0a80"+
		"\3\u0a9f\3\u0aa1\3\u0aed\3\u0af1\3\u0b5a\3\u0b61\3\u0b7a\3\u0b81\3\u0bab"+
		"\3\u0bb1\3\u0cfc\3\u0d01\3\u0e62\3\u0e80\3\u1054\3\u1067\3\u11e3\3\u11f6"+
		"\3\u173c\3\u173d\3\u18ec\3\u18f4\3\u1c5c\3\u1c6e\3\u2402\3\u2470\3\u6b5d"+
		"\3\u6b63\3\ud362\3\ud373\3\ue8c9\3\ue8d1\3\uf102\3\uf10e\3\u023d\2C\2"+
		"\\\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2\u00bc\2\u00c2\2\u00d8"+
		"\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2\2\u02e6\2\u02ee"+
		"\2\u02ee\2\u02f0\2\u02f0\2\u0372\2\u0376\2\u0378\2\u0379\2\u037c\2\u037f"+
		"\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e\2\u038e\2\u0390"+
		"\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c\2\u0531\2\u0533\2\u0558"+
		"\2\u055b\2\u055b\2\u0563\2\u0589\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0622"+
		"\2\u064c\2\u0670\2\u0671\2\u0673\2\u06d5\2\u06d7\2\u06d7\2\u06e7\2\u06e8"+
		"\2\u06f0\2\u06f1\2\u06fc\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0712\2\u0714"+
		"\2\u0731\2\u074f\2\u07a7\2\u07b3\2\u07b3\2\u07cc\2\u07ec\2\u07f6\2\u07f7"+
		"\2\u07fc\2\u07fc\2\u0802\2\u0817\2\u081c\2\u081c\2\u0826\2\u0826\2\u082a"+
		"\2\u082a\2\u0842\2\u085a\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u0906\2\u093b"+
		"\2\u093f\2\u093f\2\u0952\2\u0952\2\u095a\2\u0963\2\u0973\2\u0982\2\u0987"+
		"\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4"+
		"\2\u09b8\2\u09bb\2\u09bf\2\u09bf\2\u09d0\2\u09d0\2\u09de\2\u09df\2\u09e1"+
		"\2\u09e3\2\u09f2\2\u09f3\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a"+
		"\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a5b"+
		"\2\u0a5e\2\u0a60\2\u0a60\2\u0a74\2\u0a76\2\u0a87\2\u0a8f\2\u0a91\2\u0a93"+
		"\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf"+
		"\2\u0abf\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae3\2\u0afb\2\u0afb\2\u0b07\2\u0b0e"+
		"\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34\2\u0b35\2\u0b37"+
		"\2\u0b3b\2\u0b3f\2\u0b3f\2\u0b5e\2\u0b5f\2\u0b61\2\u0b63\2\u0b73\2\u0b73"+
		"\2\u0b85\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b"+
		"\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac"+
		"\2\u0bb0\2\u0bbb\2\u0bd2\2\u0bd2\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14"+
		"\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c3f\2\u0c5a\2\u0c5c\2\u0c62\2\u0c63"+
		"\2\u0c82\2\u0c82\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac"+
		"\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cbf\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce3"+
		"\2\u0cf3\2\u0cf4\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f"+
		"\2\u0d3f\2\u0d50\2\u0d50\2\u0d56\2\u0d58\2\u0d61\2\u0d63\2\u0d7c\2\u0d81"+
		"\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2"+
		"\2\u0dc8\2\u0e03\2\u0e32\2\u0e34\2\u0e35\2\u0e42\2\u0e48\2\u0e83\2\u0e84"+
		"\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f\2\u0e8f\2\u0e96"+
		"\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9\2\u0ea9"+
		"\2\u0eac\2\u0ead\2\u0eaf\2\u0eb2\2\u0eb4\2\u0eb5\2\u0ebf\2\u0ebf\2\u0ec2"+
		"\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ede\2\u0ee1\2\u0f02\2\u0f02\2\u0f42\2\u0f49"+
		"\2\u0f4b\2\u0f6e\2\u0f8a\2\u0f8e\2\u1002\2\u102c\2\u1041\2\u1041\2\u1052"+
		"\2\u1057\2\u105c\2\u105f\2\u1063\2\u1063\2\u1067\2\u1068\2\u1070\2\u1072"+
		"\2\u1077\2\u1083\2\u1090\2\u1090\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf"+
		"\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258"+
		"\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292"+
		"\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7"+
		"\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c\2\u1382"+
		"\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681"+
		"\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f3\2\u16fa\2\u1702\2\u170e\2\u1710"+
		"\2\u1713\2\u1722\2\u1733\2\u1742\2\u1753\2\u1762\2\u176e\2\u1770\2\u1772"+
		"\2\u1782\2\u17b5\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822\2\u1879\2\u1882"+
		"\2\u1886\2\u1889\2\u18aa\2\u18ac\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920"+
		"\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb\2\u1a02"+
		"\2\u1a18\2\u1a22\2\u1a56\2\u1aa9\2\u1aa9\2\u1b07\2\u1b35\2\u1b47\2\u1b4d"+
		"\2\u1b85\2\u1ba2\2\u1bb0\2\u1bb1\2\u1bbc\2\u1be7\2\u1c02\2\u1c25\2\u1c4f"+
		"\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf3"+
		"\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22"+
		"\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d"+
		"\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0"+
		"\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd"+
		"\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073\2\u2073\2\u2081"+
		"\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115"+
		"\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a"+
		"\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147\2\u214b"+
		"\2\u2150\2\u2150\2\u2185\2\u2186\2\u2c02\2\u2c30\2\u2c32\2\u2c60\2\u2c62"+
		"\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27\2\u2d29\2\u2d29"+
		"\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d82\2\u2d98\2\u2da2"+
		"\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8"+
		"\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2e31\2\u2e31\2\u3007"+
		"\2\u3008\2\u3033\2\u3037\2\u303d\2\u303e\2\u3043\2\u3098\2\u309f\2\u30a1"+
		"\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u312f\2\u3133\2\u3190\2\u31a2"+
		"\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fd7\2\ua002\2\ua48e"+
		"\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d\2\ua642"+
		"\2\ua670\2\ua681\2\ua69f\2\ua6a2\2\ua6e7\2\ua719\2\ua721\2\ua724\2\ua78a"+
		"\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807\2\ua809"+
		"\2\ua80c\2\ua80e\2\ua824\2\ua842\2\ua875\2\ua884\2\ua8b5\2\ua8f4\2\ua8f9"+
		"\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua927\2\ua932\2\ua948\2\ua962"+
		"\2\ua97e\2\ua986\2\ua9b4\2\ua9d1\2\ua9d1\2\ua9e2\2\ua9e6\2\ua9e8\2\ua9f1"+
		"\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42\2\uaa44\2\uaa46\2\uaa4d\2\uaa62"+
		"\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaab1\2\uaab3\2\uaab3\2\uaab7\2\uaab8"+
		"\2\uaabb\2\uaabf\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd\2\uaadf\2\uaae2"+
		"\2\uaaec\2\uaaf4\2\uaaf6\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13\2\uab18"+
		"\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e\2\uab67\2\uab72"+
		"\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f"+
		"\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb1f\2\ufb21"+
		"\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42\2\ufb43"+
		"\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52\2\ufd91\2\ufd94"+
		"\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe\2\uff23\2\uff3c"+
		"\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1\2\uffd4"+
		"\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082"+
		"\3\u00fc\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3\u0332\3\u0342"+
		"\3\u0344\3\u034b\3\u0352\3\u0377\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca"+
		"\3\u03d1\3\u0402\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502\3\u0529"+
		"\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769\3\u0802"+
		"\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e\3\u083e"+
		"\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4\3\u08f6"+
		"\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0\3\u09c1"+
		"\3\u0a02\3\u0a02\3\u0a12\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a62"+
		"\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02\3\u0b37"+
		"\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82"+
		"\3\u0cb4\3\u0cc2\3\u0cf4\3\u1005\3\u1039\3\u1085\3\u10b1\3\u10d2\3\u10ea"+
		"\3\u1105\3\u1128\3\u1152\3\u1174\3\u1178\3\u1178\3\u1185\3\u11b4\3\u11c3"+
		"\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u122d"+
		"\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1"+
		"\3\u12aa\3\u12b2\3\u12e0\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a"+
		"\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f\3\u133f\3\u1352"+
		"\3\u1352\3\u135f\3\u1363\3\u1402\3\u1436\3\u1449\3\u144c\3\u1482\3\u14b1"+
		"\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b0\3\u15da\3\u15dd\3\u1602"+
		"\3\u1631\3\u1646\3\u1646\3\u1682\3\u16ac\3\u1702\3\u171b\3\u18a2\3\u18e1"+
		"\3\u1901\3\u1901\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42"+
		"\3\u1c42\3\u1c74\3\u1c91\3\u2002\3\u239b\3\u2482\3\u2545\3\u3002\3\u3430"+
		"\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02"+
		"\3\u6b31\3\u6b42\3\u6b45\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46"+
		"\3\u6f52\3\u6f52\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe2\3\u7002\3\u87ee\3\u8802"+
		"\3\u8af4\3\ub002\3\ub003\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a"+
		"\3\ubc92\3\ubc9b\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4"+
		"\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd"+
		"\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518"+
		"\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548"+
		"\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de"+
		"\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770"+
		"\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue802"+
		"\3\ue8c6\3\ue902\3\ue945\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24"+
		"\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b"+
		"\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b"+
		"\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59"+
		"\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61"+
		"\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76"+
		"\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d"+
		"\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\2\4\ua6d8\4\ua702\4"+
		"\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4\uf802\4\ufa1f\4\3\2\ud53a\3\ud53a"+
		"\3\u01c5\2#\2\61\2<\2B\2]\2b\2}\2\u0080\2\u00a3\2\u00ab\2\u00ad\2\u00ae"+
		"\2\u00b0\2\u00b3\2\u00b6\2\u00b6\2\u00b8\2\u00ba\2\u00bd\2\u00bd\2\u00c1"+
		"\2\u00c1\2\u00d9\2\u00d9\2\u00f9\2\u00f9\2\u02c4\2\u02c7\2\u02d4\2\u02e1"+
		"\2\u02e7\2\u02ed\2\u02ef\2\u02ef\2\u02f1\2\u0301\2\u0377\2\u0377\2\u0380"+
		"\2\u0380\2\u0386\2\u0387\2\u0389\2\u0389\2\u03f8\2\u03f8\2\u0484\2\u0484"+
		"\2\u055c\2\u0561\2\u058b\2\u058c\2\u058f\2\u0591\2\u05c0\2\u05c0\2\u05c2"+
		"\2\u05c2\2\u05c5\2\u05c5\2\u05c8\2\u05c8\2\u05f5\2\u05f6\2\u0608\2\u0611"+
		"\2\u061d\2\u061d\2\u0620\2\u0621\2\u066c\2\u066f\2\u06d6\2\u06d6\2\u06e0"+
		"\2\u06e0\2\u06eb\2\u06eb\2\u06ff\2\u0700\2\u0702\2\u070f\2\u07f8\2\u07fb"+
		"\2\u0832\2\u0840\2\u0860\2\u0860\2\u0905\2\u0905\2\u093d\2\u093d\2\u0940"+
		"\2\u0942\2\u094b\2\u094e\2\u0950\2\u0951\2\u0966\2\u0967\2\u0972\2\u0972"+
		"\2\u0984\2\u0985\2\u09c0\2\u09c2\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u09d9"+
		"\2\u09d9\2\u09f4\2\u09f5\2\u09fc\2\u09fd\2\u0a05\2\u0a05\2\u0a40\2\u0a42"+
		"\2\u0a85\2\u0a85\2\u0ac0\2\u0ac2\2\u0acb\2\u0acb\2\u0acd\2\u0ace\2\u0af2"+
		"\2\u0af3\2\u0b04\2\u0b05\2\u0b40\2\u0b40\2\u0b42\2\u0b42\2\u0b49\2\u0b4a"+
		"\2\u0b4d\2\u0b4e\2\u0b59\2\u0b59\2\u0b72\2\u0b72\2\u0bc0\2\u0bc1\2\u0bc3"+
		"\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce\2\u0bd9\2\u0bd9\2\u0bf5\2\u0bfc"+
		"\2\u0c03\2\u0c05\2\u0c43\2\u0c46\2\u0c81\2\u0c81\2\u0c84\2\u0c85\2\u0cc0"+
		"\2\u0cc0\2\u0cc2\2\u0cc6\2\u0cc9\2\u0cca\2\u0ccc\2\u0ccd\2\u0cd7\2\u0cd8"+
		"\2\u0d04\2\u0d05\2\u0d40\2\u0d42\2\u0d48\2\u0d4a\2\u0d4c\2\u0d4e\2\u0d51"+
		"\2\u0d51\2\u0d59\2\u0d59\2\u0d7b\2\u0d7b\2\u0d84\2\u0d85\2\u0dd1\2\u0dd3"+
		"\2\u0dda\2\u0de1\2\u0df4\2\u0df6\2\u0e41\2\u0e41\2\u0e51\2\u0e51\2\u0e5c"+
		"\2\u0e5d\2\u0f03\2\u0f19\2\u0f1c\2\u0f21\2\u0f36\2\u0f36\2\u0f38\2\u0f38"+
		"\2\u0f3a\2\u0f3a\2\u0f3c\2\u0f41\2\u0f81\2\u0f81\2\u0f87\2\u0f87\2\u0fc0"+
		"\2\u0fc7\2\u0fc9\2\u0fce\2\u0fd0\2\u0fdc\2\u102d\2\u102e\2\u1033\2\u1033"+
		"\2\u103a\2\u103a\2\u103d\2\u103e\2\u104c\2\u1051\2\u1058\2\u1059\2\u1064"+
		"\2\u1066\2\u1069\2\u106f\2\u1085\2\u1086\2\u1089\2\u108e\2\u1091\2\u1091"+
		"\2\u109c\2\u109e\2\u10a0\2\u10a1\2\u10fd\2\u10fd\2\u1362\2\u136a\2\u1392"+
		"\2\u139b\2\u1402\2\u1402\2\u166f\2\u1670\2\u169d\2\u169e\2\u16ed\2\u16ef"+
		"\2\u1737\2\u1738\2\u17b8\2\u17b8\2\u17c0\2\u17c7\2\u17c9\2\u17ca\2\u17d6"+
		"\2\u17d8\2\u17da\2\u17dd\2\u1802\2\u180c\2\u1925\2\u1928\2\u192b\2\u192d"+
		"\2\u1932\2\u1933\2\u1935\2\u193a\2\u1942\2\u1942\2\u1946\2\u1947\2\u19e0"+
		"\2\u1a01\2\u1a1b\2\u1a1c\2\u1a20\2\u1a21\2\u1a57\2\u1a57\2\u1a59\2\u1a59"+
		"\2\u1a63\2\u1a63\2\u1a65\2\u1a66\2\u1a6f\2\u1a74\2\u1aa2\2\u1aa8\2\u1aaa"+
		"\2\u1aaf\2\u1b06\2\u1b06\2\u1b37\2\u1b37\2\u1b3d\2\u1b3d\2\u1b3f\2\u1b43"+
		"\2\u1b45\2\u1b46\2\u1b5c\2\u1b6c\2\u1b76\2\u1b7e\2\u1b84\2\u1b84\2\u1ba3"+
		"\2\u1ba3\2\u1ba8\2\u1ba9\2\u1bac\2\u1bac\2\u1be9\2\u1be9\2\u1bec\2\u1bee"+
		"\2\u1bf0\2\u1bf0\2\u1bf4\2\u1bf5\2\u1bfe\2\u1c01\2\u1c26\2\u1c2d\2\u1c36"+
		"\2\u1c37\2\u1c3d\2\u1c41\2\u1c80\2\u1c81\2\u1cc2\2\u1cc9\2\u1cd5\2\u1cd5"+
		"\2\u1ce3\2\u1ce3\2\u1cf4\2\u1cf5\2\u1fbf\2\u1fbf\2\u1fc1\2\u1fc3\2\u1fcf"+
		"\2\u1fd1\2\u1fdf\2\u1fe1\2\u1fef\2\u1ff1\2\u1fff\2\u2000\2\u2012\2\u2029"+
		"\2\u2032\2\u2060\2\u207c\2\u2080\2\u208c\2\u2090\2\u20a2\2\u20c0\2\u2102"+
		"\2\u2103\2\u2105\2\u2108\2\u210a\2\u210b\2\u2116\2\u2116\2\u2118\2\u211a"+
		"\2\u2120\2\u2125\2\u2127\2\u2127\2\u2129\2\u2129\2\u212b\2\u212b\2\u2130"+
		"\2\u2130\2\u213c\2\u213d\2\u2142\2\u2146\2\u214c\2\u214f\2\u2151\2\u2151"+
		"\2\u218c\2\u218d\2\u2192\2\u2400\2\u2402\2\u2428\2\u2442\2\u244c\2\u249e"+
		"\2\u24eb\2\u2502\2\u2777\2\u2796\2\u2b75\2\u2b78\2\u2b97\2\u2b9a\2\u2bbb"+
		"\2\u2bbf\2\u2bca\2\u2bcc\2\u2bd3\2\u2bee\2\u2bf1\2\u2ce7\2\u2cec\2\u2cfb"+
		"\2\u2cfe\2\u2d00\2\u2d01\2\u2d72\2\u2d72\2\u2e02\2\u2e30\2\u2e32\2\u2e46"+
		"\2\u2e82\2\u2e9b\2\u2e9d\2\u2ef5\2\u2f02\2\u2fd7\2\u2ff2\2\u2ffd\2\u3003"+
		"\2\u3006\2\u300a\2\u3022\2\u3030\2\u3032\2\u3038\2\u3039\2\u303f\2\u3041"+
		"\2\u309d\2\u309e\2\u30a2\2\u30a2\2\u30fd\2\u30fd\2\u3192\2\u3193\2\u3198"+
		"\2\u31a1\2\u31c2\2\u31e5\2\u3202\2\u3220\2\u322c\2\u3249\2\u3252\2\u3252"+
		"\2\u3262\2\u3281\2\u328c\2\u32b2\2\u32c2\2\u3300\2\u3302\2\u3401\2\u4dc2"+
		"\2\u4e01\2\ua492\2\ua4c8\2\ua500\2\ua501\2\ua60f\2\ua611\2\ua675\2\ua675"+
		"\2\ua680\2\ua680\2\ua6f4\2\ua6f9\2\ua702\2\ua718\2\ua722\2\ua723\2\ua78b"+
		"\2\ua78c\2\ua825\2\ua826\2\ua829\2\ua82d\2\ua838\2\ua83b\2\ua876\2\ua879"+
		"\2\ua882\2\ua883\2\ua8b6\2\ua8c5\2\ua8d0\2\ua8d1\2\ua8fa\2\ua8fc\2\ua8fe"+
		"\2\ua8fe\2\ua930\2\ua931\2\ua954\2\ua955\2\ua961\2\ua961\2\ua985\2\ua985"+
		"\2\ua9b6\2\ua9b7\2\ua9bc\2\ua9bd\2\ua9bf\2\ua9cf\2\ua9e0\2\ua9e1\2\uaa31"+
		"\2\uaa32\2\uaa35\2\uaa36\2\uaa4f\2\uaa4f\2\uaa5e\2\uaa61\2\uaa79\2\uaa7b"+
		"\2\uaa7d\2\uaa7d\2\uaa7f\2\uaa7f\2\uaae0\2\uaae1\2\uaaed\2\uaaed\2\uaaf0"+
		"\2\uaaf3\2\uaaf7\2\uaaf7\2\uab5d\2\uab5d\2\uabe5\2\uabe6\2\uabe8\2\uabe9"+
		"\2\uabeb\2\uabee\2\ufb2b\2\ufb2b\2\ufbb4\2\ufbc3\2\ufd40\2\ufd41\2\ufdfe"+
		"\2\ufdff\2\ufe12\2\ufe1b\2\ufe32\2\ufe54\2\ufe56\2\ufe68\2\ufe6a\2\ufe6d"+
		"\2\uff03\2\uff11\2\uff1c\2\uff22\2\uff3d\2\uff42\2\uff5d\2\uff67\2\uffe2"+
		"\2\uffe8\2\uffea\2\ufff0\2\ufffe\2\uffff\2\u0102\3\u0104\3\u0139\3\u0141"+
		"\3\u017b\3\u018b\3\u018e\3\u0190\3\u0192\3\u019d\3\u01a2\3\u01a2\3\u01d2"+
		"\3\u01fe\3\u03a1\3\u03a1\3\u03d2\3\u03d2\3\u0571\3\u0571\3\u0859\3\u0859"+
		"\3\u0879\3\u087a\3\u0921\3\u0921\3\u0941\3\u0941\3\u0a52\3\u0a5a\3\u0a81"+
		"\3\u0a81\3\u0aca\3\u0aca\3\u0af2\3\u0af8\3\u0b3b\3\u0b41\3\u0b9b\3\u0b9e"+
		"\3\u1002\3\u1002\3\u1004\3\u1004\3\u1049\3\u104f\3\u1084\3\u1084\3\u10b2"+
		"\3\u10b4\3\u10b9\3\u10ba\3\u10bd\3\u10be\3\u10c0\3\u10c3\3\u112e\3\u112e"+
		"\3\u1142\3\u1145\3\u1176\3\u1177\3\u1184\3\u1184\3\u11b5\3\u11b7\3\u11c1"+
		"\3\u11c2\3\u11c7\3\u11cb\3\u11cf\3\u11cf\3\u11dd\3\u11dd\3\u11df\3\u11e1"+
		"\3\u122e\3\u1230\3\u1234\3\u1235\3\u1237\3\u1237\3\u123a\3\u123f\3\u12ab"+
		"\3\u12ab\3\u12e2\3\u12e4\3\u1304\3\u1305\3\u1340\3\u1341\3\u1343\3\u1346"+
		"\3\u1349\3\u134a\3\u134d\3\u134f\3\u1359\3\u1359\3\u1364\3\u1365\3\u1437"+
		"\3\u1439\3\u1442\3\u1443\3\u1447\3\u1447\3\u144d\3\u1451\3\u145d\3\u145d"+
		"\3\u145f\3\u145f\3\u14b2\3\u14b4\3\u14bb\3\u14bb\3\u14bd\3\u14c0\3\u14c3"+
		"\3\u14c3\3\u14c8\3\u14c8\3\u15b1\3\u15b3\3\u15ba\3\u15bd\3\u15c0\3\u15c0"+
		"\3\u15c3\3\u15d9\3\u1632\3\u1634\3\u163d\3\u163e\3\u1640\3\u1640\3\u1643"+
		"\3\u1645\3\u1662\3\u166e\3\u16ae\3\u16ae\3\u16b0\3\u16b1\3\u16b8\3\u16b8"+
		"\3\u1722\3\u1723\3\u1728\3\u1728\3\u173e\3\u1741\3\u1c31\3\u1c31\3\u1c40"+
		"\3\u1c40\3\u1c43\3\u1c47\3\u1c72\3\u1c73\3\u1cab\3\u1cab\3\u1cb3\3\u1cb3"+
		"\3\u1cb6\3\u1cb6\3\u2472\3\u2476\3\u6a70\3\u6a71\3\u6af7\3\u6af7\3\u6b39"+
		"\3\u6b41\3\u6b46\3\u6b47\3\u6f53\3\u6f80\3\ubc9e\3\ubc9e\3\ubca1\3\ubca1"+
		"\3\ud002\3\ud0f7\3\ud102\3\ud128\3\ud12b\3\ud168\3\ud16c\3\ud174\3\ud185"+
		"\3\ud186\3\ud18e\3\ud1ab\3\ud1b0\3\ud1ea\3\ud202\3\ud243\3\ud247\3\ud247"+
		"\3\ud302\3\ud358\3\ud6c3\3\ud6c3\3\ud6dd\3\ud6dd\3\ud6fd\3\ud6fd\3\ud717"+
		"\3\ud717\3\ud737\3\ud737\3\ud751\3\ud751\3\ud771\3\ud771\3\ud78b\3\ud78b"+
		"\3\ud7ab\3\ud7ab\3\ud7c5\3\ud7c5\3\ud802\3\uda01\3\uda39\3\uda3c\3\uda6f"+
		"\3\uda76\3\uda78\3\uda85\3\uda87\3\uda8d\3\ue960\3\ue961\3\ueef2\3\ueef3"+
		"\3\uf002\3\uf02d\3\uf032\3\uf095\3\uf0a2\3\uf0b0\3\uf0b3\3\uf0c1\3\uf0c3"+
		"\3\uf0d1\3\uf0d3\3\uf0f7\3\uf112\3\uf130\3\uf132\3\uf16d\3\uf172\3\uf1ae"+
		"\3\uf1e8\3\uf204\3\uf212\3\uf23d\3\uf242\3\uf24a\3\uf252\3\uf253\3\uf302"+
		"\3\uf6d4\3\uf6e2\3\uf6ee\3\uf6f2\3\uf6f8\3\uf702\3\uf775\3\uf782\3\uf7d6"+
		"\3\uf802\3\uf80d\3\uf812\3\uf849\3\uf852\3\uf85b\3\uf862\3\uf889\3\uf892"+
		"\3\uf8af\3\uf912\3\uf920\3\uf922\3\uf929\3\uf932\3\uf932\3\uf935\3\uf940"+
		"\3\uf942\3\uf94d\3\uf952\3\uf960\3\uf982\3\uf993\3\uf9c2\3\uf9c2\3\3\2"+
		"\ud53f\3\ud53f\3\u023e\2C\2\\\2a\2a\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7"+
		"\2\u00bc\2\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8"+
		"\2\u02d3\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0372\2\u0376"+
		"\2\u0378\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a"+
		"\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483"+
		"\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05d2"+
		"\2\u05ec\2\u05f2\2\u05f4\2\u0622\2\u064c\2\u0670\2\u0671\2\u0673\2\u06d5"+
		"\2\u06d7\2\u06d7\2\u06e7\2\u06e8\2\u06f0\2\u06f1\2\u06fc\2\u06fe\2\u0701"+
		"\2\u0701\2\u0712\2\u0712\2\u0714\2\u0731\2\u074f\2\u07a7\2\u07b3\2\u07b3"+
		"\2\u07cc\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0817\2\u081c"+
		"\2\u081c\2\u0826\2\u0826\2\u082a\2\u082a\2\u0842\2\u085a\2\u08a2\2\u08b6"+
		"\2\u08b8\2\u08bf\2\u0906\2\u093b\2\u093f\2\u093f\2\u0952\2\u0952\2\u095a"+
		"\2\u0963\2\u0973\2\u0982\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa"+
		"\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09bf\2\u09d0"+
		"\2\u09d0\2\u09de\2\u09df\2\u09e1\2\u09e3\2\u09f2\2\u09f3\2\u0a07\2\u0a0c"+
		"\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37"+
		"\2\u0a38\2\u0a3a\2\u0a3b\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a74\2\u0a76"+
		"\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4"+
		"\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0abf\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae3"+
		"\2\u0afb\2\u0afb\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c"+
		"\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b3f\2\u0b5e\2\u0b5f"+
		"\2\u0b61\2\u0b63\2\u0b73\2\u0b73\2\u0b85\2\u0b85\2\u0b87\2\u0b8c\2\u0b90"+
		"\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1"+
		"\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bd2\2\u0bd2\2\u0c07"+
		"\2\u0c0e\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c3f"+
		"\2\u0c5a\2\u0c5c\2\u0c62\2\u0c63\2\u0c82\2\u0c82\2\u0c87\2\u0c8e\2\u0c90"+
		"\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cbf"+
		"\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce3\2\u0cf3\2\u0cf4\2\u0d07\2\u0d0e\2\u0d10"+
		"\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d3f\2\u0d50\2\u0d50\2\u0d56\2\u0d58"+
		"\2\u0d61\2\u0d63\2\u0d7c\2\u0d81\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5"+
		"\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0e03\2\u0e32\2\u0e34\2\u0e35"+
		"\2\u0e42\2\u0e48\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c"+
		"\2\u0e8c\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5"+
		"\2\u0ea7\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0eb2\2\u0eb4"+
		"\2\u0eb5\2\u0ebf\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ede\2\u0ee1"+
		"\2\u0f02\2\u0f02\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f8a\2\u0f8e\2\u1002"+
		"\2\u102c\2\u1041\2\u1041\2\u1052\2\u1057\2\u105c\2\u105f\2\u1063\2\u1063"+
		"\2\u1067\2\u1068\2\u1070\2\u1072\2\u1077\2\u1083\2\u1090\2\u1090\2\u10a2"+
		"\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a"+
		"\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262"+
		"\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0"+
		"\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314"+
		"\2\u1317\2\u131a\2\u135c\2\u1382\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff"+
		"\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f3"+
		"\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1713\2\u1722\2\u1733\2\u1742\2\u1753"+
		"\2\u1762\2\u176e\2\u1770\2\u1772\2\u1782\2\u17b5\2\u17d9\2\u17d9\2\u17de"+
		"\2\u17de\2\u1822\2\u1879\2\u1882\2\u1886\2\u1889\2\u18aa\2\u18ac\2\u18ac"+
		"\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982"+
		"\2\u19ad\2\u19b2\2\u19cb\2\u1a02\2\u1a18\2\u1a22\2\u1a56\2\u1aa9\2\u1aa9"+
		"\2\u1b07\2\u1b35\2\u1b47\2\u1b4d\2\u1b85\2\u1ba2\2\u1bb0\2\u1bb1\2\u1bbc"+
		"\2\u1be7\2\u1c02\2\u1c25\2\u1c4f\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a"+
		"\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf3\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1\2\u1e02"+
		"\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59"+
		"\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82"+
		"\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce"+
		"\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8"+
		"\2\u1ffe\2\u2073\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104"+
		"\2\u2109\2\u2109\2\u210c\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126"+
		"\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b"+
		"\2\u213e\2\u2141\2\u2147\2\u214b\2\u2150\2\u2150\2\u2185\2\u2186\2\u2c02"+
		"\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5"+
		"\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71"+
		"\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8"+
		"\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda"+
		"\2\u2de0\2\u2e31\2\u2e31\2\u3007\2\u3008\2\u3033\2\u3037\2\u303d\2\u303e"+
		"\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107"+
		"\2\u312f\2\u3133\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7"+
		"\2\u4e02\2\u9fd7\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612"+
		"\2\ua621\2\ua62c\2\ua62d\2\ua642\2\ua670\2\ua681\2\ua69f\2\ua6a2\2\ua6e7"+
		"\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9"+
		"\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua824\2\ua842\2\ua875"+
		"\2\ua884\2\ua8b5\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c"+
		"\2\ua927\2\ua932\2\ua948\2\ua962\2\ua97e\2\ua986\2\ua9b4\2\ua9d1\2\ua9d1"+
		"\2\ua9e2\2\ua9e6\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42"+
		"\2\uaa44\2\uaa46\2\uaa4d\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaab1"+
		"\2\uaab3\2\uaab3\2\uaab7\2\uaab8\2\uaabb\2\uaabf\2\uaac2\2\uaac2\2\uaac4"+
		"\2\uaac4\2\uaadd\2\uaadf\2\uaae2\2\uaaec\2\uaaf4\2\uaaf6\2\uab03\2\uab08"+
		"\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32"+
		"\2\uab5c\2\uab5e\2\uab67\2\uab72\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8"+
		"\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15"+
		"\2\ufb19\2\ufb1f\2\ufb1f\2\ufb21\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e"+
		"\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5"+
		"\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76"+
		"\2\ufe78\2\ufefe\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4"+
		"\2\uffc9\2\uffcc\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17"+
		"\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0282\3\u029e\3\u02a2\3"+
		"\u02d2\3\u0302\3\u0321\3\u0332\3\u0342\3\u0344\3\u034b\3\u0352\3\u0377"+
		"\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u0402\3\u049f\3\u04b2"+
		"\3\u04d5\3\u04da\3\u04fd\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738"+
		"\3\u0742\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c"+
		"\3\u0837\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878"+
		"\3\u0882\3\u08a0\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922"+
		"\3\u093b\3\u0982\3\u09b9\3\u09c0\3\u09c1\3\u0a02\3\u0a02\3\u0a12\3\u0a15"+
		"\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2"+
		"\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74"+
		"\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1005"+
		"\3\u1039\3\u1085\3\u10b1\3\u10d2\3\u10ea\3\u1105\3\u1128\3\u1152\3\u1174"+
		"\3\u1178\3\u1178\3\u1185\3\u11b4\3\u11c3\3\u11c6\3\u11dc\3\u11dc\3\u11de"+
		"\3\u11de\3\u1202\3\u1213\3\u1215\3\u122d\3\u1282\3\u1288\3\u128a\3\u128a"+
		"\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12e0\3\u1307"+
		"\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335"+
		"\3\u1337\3\u133b\3\u133f\3\u133f\3\u1352\3\u1352\3\u135f\3\u1363\3\u1402"+
		"\3\u1436\3\u1449\3\u144c\3\u1482\3\u14b1\3\u14c6\3\u14c7\3\u14c9\3\u14c9"+
		"\3\u1582\3\u15b0\3\u15da\3\u15dd\3\u1602\3\u1631\3\u1646\3\u1646\3\u1682"+
		"\3\u16ac\3\u1702\3\u171b\3\u18a2\3\u18e1\3\u1901\3\u1901\3\u1ac2\3\u1afa"+
		"\3\u1c02\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42\3\u1c42\3\u1c74\3\u1c91\3\u2002"+
		"\3\u239b\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a"+
		"\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b31\3\u6b42\3\u6b45\3\u6b65"+
		"\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f52\3\u6f95\3\u6fa1"+
		"\3\u6fe2\3\u6fe2\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub003\3\ubc02"+
		"\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ud402\3\ud456"+
		"\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab"+
		"\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507"+
		"\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d"+
		"\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7"+
		"\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718"+
		"\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa"+
		"\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue802\3\ue8c6\3\ue902\3\ue945\3\uee02"+
		"\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29"+
		"\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44"+
		"\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51"+
		"\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d"+
		"\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66"+
		"\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80"+
		"\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab"+
		"\3\ueead\3\ueebd\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4"+
		"\ucea3\4\uf802\4\ufa1f\4\u0431\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2"+
		"\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3"+
		" \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3"+
		"\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2"+
		"\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D"+
		"\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2"+
		"\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2"+
		"\2\3^\3\2\2\2\3`\3\2\2\2\3b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\3"+
		"j\3\2\2\2\3l\3\2\2\2\3n\3\2\2\2\3p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3"+
		"\2\2\2\3x\3\2\2\2\3z\3\2\2\2\3|\3\2\2\2\3~\3\2\2\2\3\u0080\3\2\2\2\3\u0082"+
		"\3\2\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\3\u0088\3\2\2\2\3\u008a\3\2\2"+
		"\2\3\u008c\3\2\2\2\3\u0092\3\2\2\2\3\u00a8\3\2\2\2\3\u00aa\3\2\2\2\3\u00ac"+
		"\3\2\2\2\3\u00ae\3\2\2\2\3\u00b6\3\2\2\2\3\u00b8\3\2\2\2\3\u00ba\3\2\2"+
		"\2\3\u00bc\3\2\2\2\3\u00be\3\2\2\2\3\u00c0\3\2\2\2\3\u00c2\3\2\2\2\3\u00c8"+
		"\3\2\2\2\3\u00ca\3\2\2\2\3\u00cc\3\2\2\2\3\u00ce\3\2\2\2\3\u00d0\3\2\2"+
		"\2\3\u00d2\3\2\2\2\3\u00d4\3\2\2\2\3\u00d6\3\2\2\2\3\u00d8\3\2\2\2\3\u00da"+
		"\3\2\2\2\3\u00dc\3\2\2\2\3\u00de\3\2\2\2\3\u00e0\3\2\2\2\3\u00e2\3\2\2"+
		"\2\3\u00e4\3\2\2\2\3\u00e6\3\2\2\2\3\u00e8\3\2\2\2\3\u00ea\3\2\2\2\3\u00ee"+
		"\3\2\2\2\3\u00f0\3\2\2\2\3\u00f2\3\2\2\2\3\u00f4\3\2\2\2\3\u00f6\3\2\2"+
		"\2\3\u00f8\3\2\2\2\3\u00fa\3\2\2\2\3\u00fc\3\2\2\2\3\u00fe\3\2\2\2\3\u0100"+
		"\3\2\2\2\3\u0102\3\2\2\2\3\u0106\3\2\2\2\3\u0108\3\2\2\2\3\u010a\3\2\2"+
		"\2\3\u010c\3\2\2\2\3\u010e\3\2\2\2\3\u0110\3\2\2\2\3\u0112\3\2\2\2\3\u0114"+
		"\3\2\2\2\3\u0118\3\2\2\2\3\u011a\3\2\2\2\3\u011c\3\2\2\2\3\u011e\3\2\2"+
		"\2\3\u0120\3\2\2\2\3\u0122\3\2\2\2\3\u0124\3\2\2\2\3\u0126\3\2\2\2\3\u012a"+
		"\3\2\2\2\3\u012c\3\2\2\2\3\u012e\3\2\2\2\3\u0130\3\2\2\2\3\u0132\3\2\2"+
		"\2\3\u0134\3\2\2\2\3\u0138\3\2\2\2\3\u013a\3\2\2\2\3\u013c\3\2\2\2\3\u013e"+
		"\3\2\2\2\3\u0140\3\2\2\2\3\u0142\3\2\2\2\3\u0144\3\2\2\2\3\u0146\3\2\2"+
		"\2\3\u0148\3\2\2\2\3\u014a\3\2\2\2\3\u014c\3\2\2\2\3\u014e\3\2\2\2\3\u0150"+
		"\3\2\2\2\3\u0152\3\2\2\2\3\u0154\3\2\2\2\3\u0156\3\2\2\2\3\u0158\3\2\2"+
		"\2\3\u015a\3\2\2\2\3\u015c\3\2\2\2\3\u015e\3\2\2\2\3\u0160\3\2\2\2\3\u0162"+
		"\3\2\2\2\3\u0164\3\2\2\2\3\u0166\3\2\2\2\4\u0168\3\2\2\2\6\u016c\3\2\2"+
		"\2\b\u0170\3\2\2\2\n\u0175\3\2\2\2\f\u017c\3\2\2\2\16\u0185\3\2\2\2\20"+
		"\u0187\3\2\2\2\22\u0189\3\2\2\2\24\u018b\3\2\2\2\26\u018d\3\2\2\2\30\u018f"+
		"\3\2\2\2\32\u0191\3\2\2\2\34\u0193\3\2\2\2\36\u0195\3\2\2\2 \u0197\3\2"+
		"\2\2\"\u0199\3\2\2\2$\u019b\3\2\2\2&\u019d\3\2\2\2(\u01a1\3\2\2\2*\u01a6"+
		"\3\2\2\2,\u01ad\3\2\2\2.\u01b4\3\2\2\2\60\u01ba\3\2\2\2\62\u01bf\3\2\2"+
		"\2\64\u01c5\3\2\2\2\66\u01ce\3\2\2\28\u01d6\3\2\2\2:\u01d9\3\2\2\2<\u01e3"+
		"\3\2\2\2>\u01e7\3\2\2\2@\u01e9\3\2\2\2B\u01f1\3\2\2\2D\u01f5\3\2\2\2F"+
		"\u01fe\3\2\2\2H\u0209\3\2\2\2J\u0211\3\2\2\2L\u0216\3\2\2\2N\u021b\3\2"+
		"\2\2P\u021d\3\2\2\2R\u0220\3\2\2\2T\u0222\3\2\2\2V\u0226\3\2\2\2X\u0228"+
		"\3\2\2\2Z\u022a\3\2\2\2\\\u022c\3\2\2\2^\u022e\3\2\2\2`\u0230\3\2\2\2"+
		"b\u0232\3\2\2\2d\u0234\3\2\2\2f\u0237\3\2\2\2h\u0239\3\2\2\2j\u023c\3"+
		"\2\2\2l\u023e\3\2\2\2n\u0240\3\2\2\2p\u0242\3\2\2\2r\u0247\3\2\2\2t\u0249"+
		"\3\2\2\2v\u024b\3\2\2\2x\u024d\3\2\2\2z\u024f\3\2\2\2|\u0251\3\2\2\2~"+
		"\u0253\3\2\2\2\u0080\u0255\3\2\2\2\u0082\u0257\3\2\2\2\u0084\u0259\3\2"+
		"\2\2\u0086\u025b\3\2\2\2\u0088\u025d\3\2\2\2\u008a\u025f\3\2\2\2\u008c"+
		"\u0261\3\2\2\2\u008e\u0288\3\2\2\2\u0090\u028f\3\2\2\2\u0092\u0291\3\2"+
		"\2\2\u0094\u029a\3\2\2\2\u0096\u02a0\3\2\2\2\u0098\u02a5\3\2\2\2\u009a"+
		"\u02a7\3\2\2\2\u009c\u02aa\3\2\2\2\u009e\u02b1\3\2\2\2\u00a0\u02b5\3\2"+
		"\2\2\u00a2\u02b7\3\2\2\2\u00a4\u02b9\3\2\2\2\u00a6\u02c0\3\2\2\2\u00a8"+
		"\u02c2\3\2\2\2\u00aa\u02c4\3\2\2\2\u00ac\u02c6\3\2\2\2\u00ae\u02c8\3\2"+
		"\2\2\u00b0\u02cd\3\2\2\2\u00b2\u02d3\3\2\2\2\u00b4\u02d8\3\2\2\2\u00b6"+
		"\u02da\3\2\2\2\u00b8\u02dc\3\2\2\2\u00ba\u02de\3\2\2\2\u00bc\u02e0\3\2"+
		"\2\2\u00be\u02e2\3\2\2\2\u00c0\u02e4\3\2\2\2\u00c2\u02e6\3\2\2\2\u00c4"+
		"\u02fe\3\2\2\2\u00c6\u0301\3\2\2\2\u00c8\u0303\3\2\2\2\u00ca\u0305\3\2"+
		"\2\2\u00cc\u0307\3\2\2\2\u00ce\u030e\3\2\2\2\u00d0\u0310\3\2\2\2\u00d2"+
		"\u0312\3\2\2\2\u00d4\u0314\3\2\2\2\u00d6\u0316\3\2\2\2\u00d8\u0318\3\2"+
		"\2\2\u00da\u031a\3\2\2\2\u00dc\u031c\3\2\2\2\u00de\u031e\3\2\2\2\u00e0"+
		"\u0320\3\2\2\2\u00e2\u0322\3\2\2\2\u00e4\u0324\3\2\2\2\u00e6\u0326\3\2"+
		"\2\2\u00e8\u0328\3\2\2\2\u00ea\u032a\3\2\2\2\u00ec\u0339\3\2\2\2\u00ee"+
		"\u033b\3\2\2\2\u00f0\u033d\3\2\2\2\u00f2\u033f\3\2\2\2\u00f4\u0341\3\2"+
		"\2\2\u00f6\u0343\3\2\2\2\u00f8\u0345\3\2\2\2\u00fa\u0347\3\2\2\2\u00fc"+
		"\u0349\3\2\2\2\u00fe\u034b\3\2\2\2\u0100\u034d\3\2\2\2\u0102\u034f\3\2"+
		"\2\2\u0104\u035c\3\2\2\2\u0106\u035e\3\2\2\2\u0108\u0360\3\2\2\2\u010a"+
		"\u0362\3\2\2\2\u010c\u0364\3\2\2\2\u010e\u0366\3\2\2\2\u0110\u0368\3\2"+
		"\2\2\u0112\u036a\3\2\2\2\u0114\u036c\3\2\2\2\u0116\u0376\3\2\2\2\u0118"+
		"\u0378\3\2\2\2\u011a\u037a\3\2\2\2\u011c\u037c\3\2\2\2\u011e\u037e\3\2"+
		"\2\2\u0120\u0380\3\2\2\2\u0122\u0382\3\2\2\2\u0124\u0384\3\2\2\2\u0126"+
		"\u0386\3\2\2\2\u0128\u038f\3\2\2\2\u012a\u0391\3\2\2\2\u012c\u0393\3\2"+
		"\2\2\u012e\u0395\3\2\2\2\u0130\u0397\3\2\2\2\u0132\u0399\3\2\2\2\u0134"+
		"\u039b\3\2\2\2\u0136\u03a3\3\2\2\2\u0138\u03a6\3\2\2\2\u013a\u03aa\3\2"+
		"\2\2\u013c\u03ac\3\2\2\2\u013e\u03b3\3\2\2\2\u0140\u03b5\3\2\2\2\u0142"+
		"\u03b7\3\2\2\2\u0144\u03b9\3\2\2\2\u0146\u03bb\3\2\2\2\u0148\u03bd\3\2"+
		"\2\2\u014a\u03bf\3\2\2\2\u014c\u03c1\3\2\2\2\u014e\u03c3\3\2\2\2\u0150"+
		"\u03c5\3\2\2\2\u0152\u03c7\3\2\2\2\u0154\u03c9\3\2\2\2\u0156\u03cb\3\2"+
		"\2\2\u0158\u03cd\3\2\2\2\u015a\u03cf\3\2\2\2\u015c\u03d1\3\2\2\2\u015e"+
		"\u03d3\3\2\2\2\u0160\u03d5\3\2\2\2\u0162\u03d7\3\2\2\2\u0164\u03d9\3\2"+
		"\2\2\u0166\u03db\3\2\2\2\u0168\u0169\7\u2502\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\b\2\2\2\u016b\5\3\2\2\2\u016c\u016d\7\u250e\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\b\3\2\2\u016f\7\3\2\2\2\u0170\u0171\7\u2579\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\b\4\2\2\u0173\t\3\2\2\2\u0174\u0176\n\2\2\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b\5\3\2\u017a\13\3\2\2\2\u017b"+
		"\u017d\5\u009aM\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\r\3\2\2\2\u0180\u0186\5\u00b4Z\2\u0181"+
		"\u0182\5\u00c0`\2\u0182\u0183\5\u009aM\2\u0183\u0184\5\u00c2a\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0186\17\3\2\2"+
		"\2\u0187\u0188\7*\2\2\u0188\21\3\2\2\2\u0189\u018a\7+\2\2\u018a\23\3\2"+
		"\2\2\u018b\u018c\7]\2\2\u018c\25\3\2\2\2\u018d\u018e\7_\2\2\u018e\27\3"+
		"\2\2\2\u018f\u0190\7}\2\2\u0190\31\3\2\2\2\u0191\u0192\7\177\2\2\u0192"+
		"\33\3\2\2\2\u0193\u0194\7\u298b\2\2\u0194\35\3\2\2\2\u0195\u0196\7\u298c"+
		"\2\2\u0196\37\3\2\2\2\u0197\u0198\7\u27ec\2\2\u0198!\3\2\2\2\u0199\u019a"+
		"\7\u27ed\2\2\u019a#\3\2\2\2\u019b\u019c\7\u2552\2\2\u019c%\3\2\2\2\u019d"+
		"\u019e\7\u2516\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b\23\4\2\u01a0\'\3"+
		"\2\2\2\u01a1\u01a2\7\u202a\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\24\5"+
		"\2\u01a4)\3\2\2\2\u01a5\u01a7\t\3\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\b\25\6\2\u01ab+\3\2\2\2\u01ac\u01ae\t\4\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\6\26\2\2\u01b2-\3\2\2\2\u01b3\u01b5\t\4\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b\27\6\2\u01b9/\3\2\2\2\u01ba\u01bb"+
		"\7g\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7g\2\2\u01be"+
		"\61\3\2\2\2\u01bf\u01c0\7h\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7n\2\2\u01c2"+
		"\u01c3\7u\2\2\u01c3\u01c4\7g\2\2\u01c4\63\3\2\2\2\u01c5\u01c6\7h\2\2\u01c6"+
		"\u01c7\7w\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7v\2\2"+
		"\u01ca\u01cb\7k\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7p\2\2\u01cd\65\3\2"+
		"\2\2\u01ce\u01cf\7i\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2"+
		"\7g\2\2\u01d2\u01d3\7t\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7e\2\2\u01d5"+
		"\67\3\2\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7h\2\2\u01d89\3\2\2\2\u01d9"+
		"\u01da\7n\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7h\2\2\u01dc\u01dd\7v\2\2"+
		"\u01dd\u01de\7c\2\2\u01de\u01df\7u\2\2\u01df\u01e0\7u\2\2\u01e0\u01e1"+
		"\7q\2\2\u01e1\u01e2\7e\2\2\u01e2;\3\2\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5"+
		"\7g\2\2\u01e5\u01e6\7v\2\2\u01e6=\3\2\2\2\u01e7\u01e8\7\u211b\2\2\u01e8"+
		"?\3\2\2\2\u01e9\u01ea\7r\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7t\2\2\u01ec"+
		"\u01ed\7g\2\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7v\2\2\u01ef\u01f0\7u\2\2"+
		"\u01f0A\3\2\2\2\u01f1\u01f2\7r\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7g\2"+
		"\2\u01f4C\3\2\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7"+
		"n\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc"+
		"\7q\2\2\u01fc\u01fd\7p\2\2\u01fdE\3\2\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200"+
		"\7k\2\2\u0200\u0201\7i\2\2\u0201\u0202\7j\2\2\u0202\u0203\7v\2\2\u0203"+
		"\u0204\7c\2\2\u0204\u0205\7u\2\2\u0205\u0206\7u\2\2\u0206\u0207\7q\2\2"+
		"\u0207\u0208\7e\2\2\u0208G\3\2\2\2\u0209\u020a\7u\2\2\u020a\u020b\7g\2"+
		"\2\u020b\u020c\7e\2\2\u020c\u020d\7v\2\2\u020d\u020e\7k\2\2\u020e\u020f"+
		"\7q\2\2\u020f\u0210\7p\2\2\u0210I\3\2\2\2\u0211\u0212\7v\2\2\u0212\u0213"+
		"\7j\2\2\u0213\u0214\7g\2\2\u0214\u0215\7p\2\2\u0215K\3\2\2\2\u0216\u0217"+
		"\7v\2\2\u0217\u0218\7t\2\2\u0218\u0219\7w\2\2\u0219\u021a\7g\2\2\u021a"+
		"M\3\2\2\2\u021b\u021c\7<\2\2\u021cO\3\2\2\2\u021d\u021e\7?\2\2\u021e\u021f"+
		"\7?\2\2\u021fQ\3\2\2\2\u0220\u0221\7.\2\2\u0221S\3\2\2\2\u0222\u0223\7"+
		"<\2\2\u0223\u0224\7<\2\2\u0224\u0225\7?\2\2\u0225U\3\2\2\2\u0226\u0227"+
		"\7~\2\2\u0227W\3\2\2\2\u0228\u0229\7(\2\2\u0229Y\3\2\2\2\u022a\u022b\7"+
		"^\2\2\u022b[\3\2\2\2\u022c\u022d\7\61\2\2\u022d]\3\2\2\2\u022e\u022f\7"+
		"\60\2\2\u022f_\3\2\2\2\u0230\u0231\7=\2\2\u0231a\3\2\2\2\u0232\u0233\7"+
		"a\2\2\u0233c\3\2\2\2\u0234\u0235\7.\2\2\u0235\u0236\7.\2\2\u0236e\3\2"+
		"\2\2\u0237\u0238\7?\2\2\u0238g\3\2\2\2\u0239\u023a\7\u22a4\2\2\u023a\u023b"+
		"\5\u00ba]\2\u023bi\3\2\2\2\u023c\u023d\7\u2202\2\2\u023dk\3\2\2\2\u023e"+
		"\u023f\7\u2983\2\2\u023fm\3\2\2\2\u0240\u0241\7\u2205\2\2\u0241o\3\2\2"+
		"\2\u0242\u0243\5n\67\2\u0243\u0244\5\u00c0`\2\u0244\u0245\7\63\2\2\u0245"+
		"\u0246\5\u00c2a\2\u0246q\3\2\2\2\u0247\u0248\7\u21d6\2\2\u0248s\3\2\2"+
		"\2\u0249\u024a\7\u21d4\2\2\u024au\3\2\2\2\u024b\u024c\7\u222a\2\2\u024c"+
		"w\3\2\2\2\u024d\u024e\7\u2229\2\2\u024ey\3\2\2\2\u024f\u0250\7\u00ae\2"+
		"\2\u0250{\3\2\2\2\u0251\u0252\7\u220a\2\2\u0252}\3\2\2\2\u0253\u0254\7"+
		"\u2a23\2\2\u0254\177\3\2\2\2\u0255\u0256\7\u00d9\2\2\u0256\u0081\3\2\2"+
		"\2\u0257\u0258\7\u03ba\2\2\u0258\u0083\3\2\2\2\u0259\u025a\7\u03bd\2\2"+
		"\u025a\u0085\3\2\2\2\u025b\u025c\7\u03be\2\2\u025c\u0087\3\2\2\2\u025d"+
		"\u025e\7\u2a21\2\2\u025e\u0089\3\2\2\2\u025f\u0260\7\u2a22\2\2\u0260\u008b"+
		"\3\2\2\2\u0261\u0265\5\u008eG\2\u0262\u0264\5\16\7\2\u0263\u0262\3\2\2"+
		"\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u008d"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026a\5\u0092I\2\u0269\u0268\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0289"+
		"\3\2\2\2\u026d\u0270\5\u009eO\2\u026e\u0270\5\u009cN\2\u026f\u026d\3\2"+
		"\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275\5\u0094J\2\u0272"+
		"\u0274\5\u0092I\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273"+
		"\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0289\3\2\2\2\u0277\u0275\3\2\2\2\u0278"+
		"\u0279\5\u00c4b\2\u0279\u027d\5\u0096K\2\u027a\u027c\5\u0092I\2\u027b"+
		"\u027a\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u0289\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282\5\u00b2Y\2\u0281"+
		"\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0286\3\2\2\2\u0285\u0287\5f\63\2\u0286\u0285\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u0269\3\2\2\2\u0288\u026f\3\2"+
		"\2\2\u0288\u0278\3\2\2\2\u0288\u0281\3\2\2\2\u0289\u008f\3\2\2\2\u028a"+
		"\u0290\5\u00c0`\2\u028b\u0290\5\u00c2a\2\u028c\u0290\5\u00bc^\2\u028d"+
		"\u0290\5\u00be_\2\u028e\u0290\7a\2\2\u028f\u028a\3\2\2\2\u028f\u028b\3"+
		"\2\2\2\u028f\u028c\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0091\3\2\2\2\u0291\u0294\5\u0090H\2\u0292\u0295\5\u0094J\2\u0293\u0295"+
		"\5\u0096K\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0093\3\2\2"+
		"\2\u0296\u0299\5\u009eO\2\u0297\u0299\5\u0098L\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u0095\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\5\u00c4b\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u0097\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\5\u009aM\2\u02a4"+
		"\u02a6\5\u009cN\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u0099"+
		"\3\2\2\2\u02a7\u02a8\t\6\2\2\u02a8\u009b\3\2\2\2\u02a9\u02ab\t\7\2\2\u02aa"+
		"\u02a9\3\2\2\2\u02ab\u009d\3\2\2\2\u02ac\u02b2\5\u00a4R\2\u02ad\u02b2"+
		"\5\u00a6S\2\u02ae\u02b2\5\u00b0X\2\u02af\u02b2\5\u00a0P\2\u02b0\u02b2"+
		"\5\u00a2Q\2\u02b1\u02ac\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2"+
		"\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u009f\3\2\2\2\u02b3\u02b6"+
		"\5\u00eau\2\u02b4\u02b6\5\u0118\u008c\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4"+
		"\3\2\2\2\u02b6\u00a1\3\2\2\2\u02b7\u02b8\t\b\2\2\u02b8\u00a3\3\2\2\2\u02b9"+
		"\u02ba\t\5\2\2\u02ba\u00a5\3\2\2\2\u02bb\u02c1\5\u00a8T\2\u02bc\u02c1"+
		"\5\u00aaU\2\u02bd\u02c1\5\u0082A\2\u02be\u02c1\5\u0084B\2\u02bf\u02c1"+
		"\5\u0086C\2\u02c0\u02bb\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c0\u02bd\3\2\2"+
		"\2\u02c0\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u00a7\3\2\2\2\u02c2\u02c3"+
		"\7\u0396\2\2\u02c3\u00a9\3\2\2\2\u02c4\u02c5\7\u03a0\2\2\u02c5\u00ab\3"+
		"\2\2\2\u02c6\u02c7\t\t\2\2\u02c7\u00ad\3\2\2\2\u02c8\u02c9\7\u2117\2\2"+
		"\u02c9\u00af\3\2\2\2\u02ca\u02ce\5\u00acV\2\u02cb\u02ce\5\u00aeW\2\u02cc"+
		"\u02ce\5>\37\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02ce\u00b1\3\2\2\2\u02cf\u02d4\5R)\2\u02d0\u02d4\5`\60\2\u02d1\u02d4"+
		"\5N\'\2\u02d2\u02d4\5^/\2\u02d3\u02cf\3\2\2\2\u02d3\u02d0\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u00b3\3\2\2\2\u02d5\u02d9\5\u00b6"+
		"[\2\u02d6\u02d9\5\u00b8\\\2\u02d7\u02d9\5\u00ba]\2\u02d8\u02d5\3\2\2\2"+
		"\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u00b5\3\2\2\2\u02da\u02db"+
		"\7\u2034\2\2\u02db\u00b7\3\2\2\2\u02dc\u02dd\7#\2\2\u02dd\u00b9\3\2\2"+
		"\2\u02de\u02df\7A\2\2\u02df\u00bb\3\2\2\2\u02e0\u02e1\7\u2199\2\2\u02e1"+
		"\u00bd\3\2\2\2\u02e2\u02e3\7\u219b\2\2\u02e3\u00bf\3\2\2\2\u02e4\u02e5"+
		"\7\u219a\2\2\u02e5\u00c1\3\2\2\2\u02e6\u02e7\7\u2198\2\2\u02e7\u00c3\3"+
		"\2\2\2\u02e8\u02ff\5V+\2\u02e9\u02ff\5X,\2\u02ea\u02ff\5\u00c8d\2\u02eb"+
		"\u02ff\5x<\2\u02ec\u02ff\5v;\2\u02ed\u02ff\5t:\2\u02ee\u02ff\5r9\2\u02ef"+
		"\u02ff\5z=\2\u02f0\u02ff\5j\65\2\u02f1\u02ff\5n\67\2\u02f2\u02ff\5\u0080"+
		"@\2\u02f3\u02ff\5\\.\2\u02f4\u02ff\5f\63\2\u02f5\u02ff\5|>\2\u02f6\u02ff"+
		"\5l\66\2\u02f7\u02ff\5\u00cae\2\u02f8\u02ff\5~?\2\u02f9\u02ff\5\u0088"+
		"D\2\u02fa\u02ff\5\u008aE\2\u02fb\u02ff\5\u00ccf\2\u02fc\u02ff\5\u00ce"+
		"g\2\u02fd\u02ff\5\u00c6c\2\u02fe\u02e8\3\2\2\2\u02fe\u02e9\3\2\2\2\u02fe"+
		"\u02ea\3\2\2\2\u02fe\u02eb\3\2\2\2\u02fe\u02ec\3\2\2\2\u02fe\u02ed\3\2"+
		"\2\2\u02fe\u02ee\3\2\2\2\u02fe\u02ef\3\2\2\2\u02fe\u02f0\3\2\2\2\u02fe"+
		"\u02f1\3\2\2\2\u02fe\u02f2\3\2\2\2\u02fe\u02f3\3\2\2\2\u02fe\u02f4\3\2"+
		"\2\2\u02fe\u02f5\3\2\2\2\u02fe\u02f6\3\2\2\2\u02fe\u02f7\3\2\2\2\u02fe"+
		"\u02f8\3\2\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02fb\3\2"+
		"\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u00c5\3\2\2\2\u0300"+
		"\u0302\t\n\2\2\u0301\u0300\3\2\2\2\u0302\u00c7\3\2\2\2\u0303\u0304\7\u22a4"+
		"\2\2\u0304\u00c9\3\2\2\2\u0305\u0306\7\u29fb\2\2\u0306\u00cb\3\2\2\2\u0307"+
		"\u0308\7-\2\2\u0308\u00cd\3\2\2\2\u0309\u030f\5\u00ecv\2\u030a\u030f\5"+
		"\u0104\u0082\2\u030b\u030f\5\u0116\u008b\2\u030c\u030f\5\u0128\u0094\2"+
		"\u030d\u030f\5\u0136\u009b\2\u030e\u0309\3\2\2\2\u030e\u030a\3\2\2\2\u030e"+
		"\u030b\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f\u00cf\3\2"+
		"\2\2\u0310\u0311\7\u2196\2\2\u0311\u00d1\3\2\2\2\u0312\u0313\7\u2194\2"+
		"\2\u0313\u00d3\3\2\2\2\u0314\u0315\7\u2262\2\2\u0315\u00d5\3\2\2\2\u0316"+
		"\u0317\7\u220b\2\2\u0317\u00d7\3\2\2\2\u0318\u0319\7\u2207\2\2\u0319\u00d9"+
		"\3\2\2\2\u031a\u031b\7\u2288\2\2\u031b\u00db\3\2\2\2\u031c\u031d\7\u2284"+
		"\2\2\u031d\u00dd\3\2\2\2\u031e\u031f\7\u222c\2\2\u031f\u00df\3\2\2\2\u0320"+
		"\u0321\7\u222b\2\2\u0321\u00e1\3\2\2\2\u0322\u0323\7\u2218\2\2\u0323\u00e3"+
		"\3\2\2\2\u0324\u0325\7\u2298\2\2\u0325\u00e5\3\2\2\2\u0326\u0327\7\u22c5"+
		"\2\2\u0327\u00e7\3\2\2\2\u0328\u0329\7\u22c4\2\2\u0329\u00e9\3\2\2\2\u032a"+
		"\u032b\t\13\2\2\u032b\u00eb\3\2\2\2\u032c\u033a\5\u00d0h\2\u032d\u033a"+
		"\5\u00d2i\2\u032e\u033a\5\u00d4j\2\u032f\u033a\5\u00d6k\2\u0330\u033a"+
		"\5\u00d8l\2\u0331\u033a\5\u00dam\2\u0332\u033a\5\u00dcn\2\u0333\u033a"+
		"\5\u00deo\2\u0334\u033a\5\u00e0p\2\u0335\u033a\5Z-\2\u0336\u033a\5\u00e4"+
		"r\2\u0337\u033a\5\u00e6s\2\u0338\u033a\5\u00e8t\2\u0339\u032c\3\2\2\2"+
		"\u0339\u032d\3\2\2\2\u0339\u032e\3\2\2\2\u0339\u032f\3\2\2\2\u0339\u0330"+
		"\3\2\2\2\u0339\u0331\3\2\2\2\u0339\u0332\3\2\2\2\u0339\u0333\3\2\2\2\u0339"+
		"\u0334\3\2\2\2\u0339\u0335\3\2\2\2\u0339\u0336\3\2\2\2\u0339\u0337\3\2"+
		"\2\2\u0339\u0338\3\2\2\2\u033a\u00ed\3\2\2\2\u033b\u033c\7\u21a8\2\2\u033c"+
		"\u00ef\3\2\2\2\u033d\u033e\7\u2a40\2\2\u033e\u00f1\3\2\2\2\u033f\u0340"+
		"\7\u221a\2\2\u0340\u00f3\3\2\2\2\u0341\u0342\7\u25c3\2\2\u0342\u00f5\3"+
		"\2\2\2\u0343\u0344\7\u25b9\2\2\u0344\u00f7\3\2\2\2\u0345\u0346\7\u2a66"+
		"\2\2\u0346\u00f9\3\2\2\2\u0347\u0348\7\u2a67\2\2\u0348\u00fb\3\2\2\2\u0349"+
		"\u034a\7\u223e\2\2\u034a\u00fd\3\2\2\2\u034b\u034c\7\u2989\2\2\u034c\u00ff"+
		"\3\2\2\2\u034d\u034e\7\u298a\2\2\u034e\u0101\3\2\2\2\u034f\u0350\7\u2297"+
		"\2\2\u0350\u0103\3\2\2\2\u0351\u035d\5\u00eew\2\u0352\u035d\5\u00f0x\2"+
		"\u0353\u035d\5\u00f2y\2\u0354\u035d\5\u00f4z\2\u0355\u035d\5\u00f6{\2"+
		"\u0356\u035d\5\u00f8|\2\u0357\u035d\5\u00fa}\2\u0358\u035d\5\u00fc~\2"+
		"\u0359\u035d\5\u00fe\177\2\u035a\u035d\5\u0100\u0080\2\u035b\u035d\5\u0102"+
		"\u0081\2\u035c\u0351\3\2\2\2\u035c\u0352\3\2\2\2\u035c\u0353\3\2\2\2\u035c"+
		"\u0354\3\2\2\2\u035c\u0355\3\2\2\2\u035c\u0356\3\2\2\2\u035c\u0357\3\2"+
		"\2\2\u035c\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035b\3\2\2\2\u035d\u0105\3\2\2\2\u035e\u035f\7\u21fa\2\2\u035f\u0107"+
		"\3\2\2\2\u0360\u0361\7\u2916\2\2\u0361\u0109\3\2\2\2\u0362\u0363\7\u21a5"+
		"\2\2\u0363\u010b\3\2\2\2\u0364\u0365\7\u2902\2\2\u0365\u010d\3\2\2\2\u0366"+
		"\u0367\7\u21a2\2\2\u0367\u010f\3\2\2\2\u0368\u0369\7\u2918\2\2\u0369\u0111"+
		"\3\2\2\2\u036a\u036b\7\u21fd\2\2\u036b\u0113\3\2\2\2\u036c\u036d\7\u2917"+
		"\2\2\u036d\u0115\3\2\2\2\u036e\u0377\5\u0106\u0083\2\u036f\u0377\5\u0108"+
		"\u0084\2\u0370\u0377\5\u010a\u0085\2\u0371\u0377\5\u010c\u0086\2\u0372"+
		"\u0377\5\u010e\u0087\2\u0373\u0377\5\u0110\u0088\2\u0374\u0377\5\u0112"+
		"\u0089\2\u0375\u0377\5\u0114\u008a\2\u0376\u036e\3\2\2\2\u0376\u036f\3"+
		"\2\2\2\u0376\u0370\3\2\2\2\u0376\u0371\3\2\2\2\u0376\u0372\3\2\2\2\u0376"+
		"\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u0117\3\2"+
		"\2\2\u0378\u0379\7\u2126\2\2\u0379\u0119\3\2\2\2\u037a\u037b\7/\2\2\u037b"+
		"\u011b\3\2\2\2\u037c\u037d\7\u2214\2\2\u037d\u011d\3\2\2\2\u037e\u037f"+
		"\7\u2266\2\2\u037f\u011f\3\2\2\2\u0380\u0381\7>\2\2\u0381\u0121\3\2\2"+
		"\2\u0382\u0383\7\u2267\2\2\u0383\u0123\3\2\2\2\u0384\u0385\7@\2\2\u0385"+
		"\u0125\3\2\2\2\u0386\u0387\7,\2\2\u0387\u0127\3\2\2\2\u0388\u0390\5\u011a"+
		"\u008d\2\u0389\u0390\5\u011c\u008e\2\u038a\u0390\5\u011e\u008f\2\u038b"+
		"\u0390\5\u0120\u0090\2\u038c\u0390\5\u0122\u0091\2\u038d\u0390\5\u0124"+
		"\u0092\2\u038e\u0390\5\u0126\u0093\2\u038f\u0388\3\2\2\2\u038f\u0389\3"+
		"\2\2\2\u038f\u038a\3\2\2\2\u038f\u038b\3\2\2\2\u038f\u038c\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390\u0129\3\2\2\2\u0391\u0392\7%"+
		"\2\2\u0392\u012b\3\2\2\2\u0393\u0394\7\u2042\2\2\u0394\u012d\3\2\2\2\u0395"+
		"\u0396\7\u21c1\2\2\u0396\u012f\3\2\2\2\u0397\u0398\7\u21c0\2\2\u0398\u0131"+
		"\3\2\2\2\u0399\u039a\7\u27ea\2\2\u039a\u0133\3\2\2\2\u039b\u039c\7\u27eb"+
		"\2\2\u039c\u0135\3\2\2\2\u039d\u03a4\5\u012a\u0095\2\u039e\u03a4\5\u0132"+
		"\u0099\2\u039f\u03a4\5\u0134\u009a\2\u03a0\u03a4\5\u012c\u0096\2\u03a1"+
		"\u03a4\5\u012e\u0097\2\u03a2\u03a4\5\u0130\u0098\2\u03a3\u039d\3\2\2\2"+
		"\u03a3\u039e\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1"+
		"\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4\u0137\3\2\2\2\u03a5\u03a7\t\f\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a7\u0139\3\2\2\2\u03a8\u03ab\5\u0138\u009c\2\u03a9\u03ab"+
		"\t\6\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u013b\3\2\2\2\u03ac"+
		"\u03b0\5\u0138\u009c\2\u03ad\u03af\5\u013a\u009d\2\u03ae\u03ad\3\2\2\2"+
		"\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u013d"+
		"\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\5\u008cF\2\u03b4\u013f\3\2\2"+
		"\2\u03b5\u03b6\5\u008cF\2\u03b6\u0141\3\2\2\2\u03b7\u03b8\5\u008cF\2\u03b8"+
		"\u0143\3\2\2\2\u03b9\u03ba\5\u008cF\2\u03ba\u0145\3\2\2\2\u03bb\u03bc"+
		"\5\u008cF\2\u03bc\u0147\3\2\2\2\u03bd\u03be\5\u008cF\2\u03be\u0149\3\2"+
		"\2\2\u03bf\u03c0\5\u008cF\2\u03c0\u014b\3\2\2\2\u03c1\u03c2\5\u008cF\2"+
		"\u03c2\u014d\3\2\2\2\u03c3\u03c4\5\u008cF\2\u03c4\u014f\3\2\2\2\u03c5"+
		"\u03c6\5\u008cF\2\u03c6\u0151\3\2\2\2\u03c7\u03c8\5\u008cF\2\u03c8\u0153"+
		"\3\2\2\2\u03c9\u03ca\5\u008cF\2\u03ca\u0155\3\2\2\2\u03cb\u03cc\5\u008c"+
		"F\2\u03cc\u0157\3\2\2\2\u03cd\u03ce\5\u008cF\2\u03ce\u0159\3\2\2\2\u03cf"+
		"\u03d0\5\u008cF\2\u03d0\u015b\3\2\2\2\u03d1\u03d2\5\u008cF\2\u03d2\u015d"+
		"\3\2\2\2\u03d3\u03d4\5\u008cF\2\u03d4\u015f\3\2\2\2\u03d5\u03d6\5\u008c"+
		"F\2\u03d6\u0161\3\2\2\2\u03d7\u03d8\5\u008cF\2\u03d8\u0163\3\2\2\2\u03d9"+
		"\u03da\5\u008cF\2\u03da\u0165\3\2\2\2\u03db\u03dc\13\2\2\2\u03dc\u0167"+
		"\3\2\2\2*\2\3\u0177\u017e\u0185\u01a8\u01af\u01b6\u0265\u026b\u026f\u0275"+
		"\u027d\u0283\u0286\u0288\u028f\u0294\u0298\u029a\u02a0\u02a5\u02aa\u02b1"+
		"\u02b5\u02c0\u02cd\u02d3\u02d8\u02fe\u0301\u030e\u0339\u035c\u0376\u038f"+
		"\u03a3\u03a6\u03aa\u03b0\7\4\3\2\2\3\2\4\2\2\t\26\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}