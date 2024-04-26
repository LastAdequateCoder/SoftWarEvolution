// Generated from c:/Users/baran/SoftWarEvolution/InterpreterApp/InterpreterModules/antlr/cobol.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class cobolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, REPRESENTATION=4, ARITHMETIC_OPERATOR=5, COMPARISON_OPERATOR=6, 
		BOOLEAN_OPERATOR=7, IDENTIFICATION=8, DIVISION=9, OCCURS=10, TIMES=11, 
		PICTURE=12, IS=13, PROCEDURE=14, USING=15, BY=16, FROM=17, REFERENCE=18, 
		CONTENT=19, VALUE=20, LIKE=21, DISPLAY=22, OF=23, WITH=24, NO=25, ADVANCING=26, 
		DATA=27, ADD=28, TO=29, INTO=30, GIVING=31, REMAINDER=32, ACCEPT=33, MULTIPLY=34, 
		SUBTRACT=35, DIVIDE=36, IF=37, ELSE=38, THEN=39, END=40, TRUE=41, FALSE=42, 
		NOT=43, WHEN=44, ALSO=45, OTHER=46, EVALUATE=47, STOP=48, NEXT=49, SENTENCE=50, 
		PERFORM=51, THROUGH=52, COPY=53, REPLACING=54, LOOP=55, VARYING=56, WHILE=57, 
		UNTIL=58, GO=59, IDENTIFIER=60, INT=61, SPACE=62, DOT=63, LITERAL=64, 
		COPY_LITERAL=65;
	public static final int
		RULE_program = 0, RULE_identification_division = 1, RULE_data_division = 2, 
		RULE_variables = 3, RULE_occurs = 4, RULE_level = 5, RULE_picture = 6, 
		RULE_like = 7, RULE_procedure_division = 8, RULE_using = 9, RULE_use = 10, 
		RULE_sentence = 11, RULE_proc = 12, RULE_statement = 13, RULE_display = 14, 
		RULE_add = 15, RULE_multiply = 16, RULE_divide = 17, RULE_subtract = 18, 
		RULE_accept = 19, RULE_withnoadvancing = 20, RULE_atomic = 21, RULE_giving = 22, 
		RULE_identifiers = 23, RULE_remainder = 24, RULE_if = 25, RULE_arithmetic_expression = 26, 
		RULE_string_expression = 27, RULE_boolean = 28, RULE_expressions = 29, 
		RULE_evaluate = 30, RULE_when_block = 31, RULE_stop = 32, RULE_next_sentence = 33, 
		RULE_perform = 34, RULE_through = 35, RULE_times = 36, RULE_copy = 37, 
		RULE_replacing = 38, RULE_replacements = 39, RULE_loop = 40, RULE_loop_expression = 41, 
		RULE_goto = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "identification_division", "data_division", "variables", "occurs", 
			"level", "picture", "like", "procedure_division", "using", "use", "sentence", 
			"proc", "statement", "display", "add", "multiply", "divide", "subtract", 
			"accept", "withnoadvancing", "atomic", "giving", "identifiers", "remainder", 
			"if", "arithmetic_expression", "string_expression", "boolean", "expressions", 
			"evaluate", "when_block", "stop", "next_sentence", "perform", "through", 
			"times", "copy", "replacing", "replacements", "loop", "loop_expression", 
			"goto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "REPRESENTATION", "ARITHMETIC_OPERATOR", "COMPARISON_OPERATOR", 
			"BOOLEAN_OPERATOR", "IDENTIFICATION", "DIVISION", "OCCURS", "TIMES", 
			"PICTURE", "IS", "PROCEDURE", "USING", "BY", "FROM", "REFERENCE", "CONTENT", 
			"VALUE", "LIKE", "DISPLAY", "OF", "WITH", "NO", "ADVANCING", "DATA", 
			"ADD", "TO", "INTO", "GIVING", "REMAINDER", "ACCEPT", "MULTIPLY", "SUBTRACT", 
			"DIVIDE", "IF", "ELSE", "THEN", "END", "TRUE", "FALSE", "NOT", "WHEN", 
			"ALSO", "OTHER", "EVALUATE", "STOP", "NEXT", "SENTENCE", "PERFORM", "THROUGH", 
			"COPY", "REPLACING", "LOOP", "VARYING", "WHILE", "UNTIL", "GO", "IDENTIFIER", 
			"INT", "SPACE", "DOT", "LITERAL", "COPY_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "cobol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cobolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Identification_divisionContext identification_division() {
			return getRuleContext(Identification_divisionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cobolParser.EOF, 0); }
		public Procedure_divisionContext procedure_division() {
			return getRuleContext(Procedure_divisionContext.class,0);
		}
		public Data_divisionContext data_division() {
			return getRuleContext(Data_divisionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			identification_division();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(87);
				data_division();
				}
			}

			{
			setState(90);
			procedure_division();
			}
			setState(91);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Identification_divisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION() { return getToken(cobolParser.IDENTIFICATION, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(cobolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(cobolParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(cobolParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(cobolParser.LITERAL, i);
		}
		public Identification_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division; }
	}

	public final Identification_divisionContext identification_division() throws RecognitionException {
		Identification_divisionContext _localctx = new Identification_divisionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identification_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFICATION);
			setState(94);
			match(DIVISION);
			setState(95);
			match(DOT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(DOT);
				setState(98);
				match(LITERAL);
				setState(99);
				match(DOT);
				}
				}
				setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_divisionContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(cobolParser.DATA, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public Data_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_division; }
	}

	public final Data_divisionContext data_division() throws RecognitionException {
		Data_divisionContext _localctx = new Data_divisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DATA);
			setState(106);
			match(DIVISION);
			setState(107);
			match(DOT);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(108);
				variables();
				}
				}
				setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(cobolParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public PictureContext picture() {
			return getRuleContext(PictureContext.class,0);
		}
		public LikeContext like() {
			return getRuleContext(LikeContext.class,0);
		}
		public OccursContext occurs() {
			return getRuleContext(OccursContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			level();
			setState(115);
			match(IDENTIFIER);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PICTURE:
				{
				setState(116);
				picture();
				}
				break;
			case LIKE:
				{
				setState(117);
				like();
				}
				break;
			case OCCURS:
			case DOT:
				break;
			default:
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OCCURS) {
				{
				setState(120);
				occurs();
				}
			}

			setState(123);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OccursContext extends ParserRuleContext {
		public TerminalNode OCCURS() { return getToken(cobolParser.OCCURS, 0); }
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public TerminalNode TIMES() { return getToken(cobolParser.TIMES, 0); }
		public OccursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_occurs; }
	}

	public final OccursContext occurs() throws RecognitionException {
		OccursContext _localctx = new OccursContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_occurs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OCCURS);
			setState(126);
			match(INT);
			setState(127);
			match(TIMES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PictureContext extends ParserRuleContext {
		public TerminalNode PICTURE() { return getToken(cobolParser.PICTURE, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode REPRESENTATION() { return getToken(cobolParser.REPRESENTATION, 0); }
		public PictureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picture; }
	}

	public final PictureContext picture() throws RecognitionException {
		PictureContext _localctx = new PictureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_picture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PICTURE);
			setState(132);
			match(IS);
			setState(133);
			match(REPRESENTATION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LikeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(cobolParser.LIKE, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public LikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like; }
	}

	public final LikeContext like() throws RecognitionException {
		LikeContext _localctx = new LikeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LIKE);
			setState(136);
			identifiers();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_divisionContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(cobolParser.PROCEDURE, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Procedure_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_division; }
	}

	public final Procedure_divisionContext procedure_division() throws RecognitionException {
		Procedure_divisionContext _localctx = new Procedure_divisionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedure_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PROCEDURE);
			setState(139);
			match(DIVISION);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(140);
				using();
				}
			}

			setState(143);
			match(DOT);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				sentence();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1777655481976750080L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(cobolParser.USING, 0); }
		public List<UseContext> use() {
			return getRuleContexts(UseContext.class);
		}
		public UseContext use(int i) {
			return getRuleContext(UseContext.class,i);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(USING);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				use();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BY );
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(cobolParser.BY, 0); }
		public TerminalNode REFERENCE() { return getToken(cobolParser.REFERENCE, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode CONTENT() { return getToken(cobolParser.CONTENT, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(cobolParser.VALUE, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_use);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(BY);
				setState(156);
				match(REFERENCE);
				setState(157);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(BY);
				setState(159);
				match(CONTENT);
				setState(160);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(BY);
				setState(162);
				match(VALUE);
				setState(163);
				atomic();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(166);
				proc();
				setState(167);
				match(DOT);
				}
			}

			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				statement();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 624733977369903104L) != 0) );
			setState(176);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(cobolParser.IDENTIFIER, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public AcceptContext accept() {
			return getRuleContext(AcceptContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public SubtractContext subtract() {
			return getRuleContext(SubtractContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public EvaluateContext evaluate() {
			return getRuleContext(EvaluateContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public Next_sentenceContext next_sentence() {
			return getRuleContext(Next_sentenceContext.class,0);
		}
		public PerformContext perform() {
			return getRuleContext(PerformContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				display();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				add();
				}
				break;
			case ACCEPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				accept();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				multiply();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				subtract();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				divide();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				if_();
				}
				break;
			case EVALUATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				evaluate();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				stop();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				next_sentence();
				}
				break;
			case PERFORM:
				enterOuterAlt(_localctx, 11);
				{
				setState(190);
				perform();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 12);
				{
				setState(191);
				copy();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 13);
				{
				setState(192);
				loop();
				}
				break;
			case GO:
				enterOuterAlt(_localctx, 14);
				{
				setState(193);
				goto_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(cobolParser.DISPLAY, 0); }
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public WithnoadvancingContext withnoadvancing() {
			return getRuleContext(WithnoadvancingContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(DISPLAY);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				atomic();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 19L) != 0) );
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(202);
				withnoadvancing();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public Token INT;
		public List<Token> additions = new ArrayList<Token>();
		public Token base;
		public TerminalNode ADD() { return getToken(cobolParser.ADD, 0); }
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
		}
		public GivingContext giving() {
			return getRuleContext(GivingContext.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_add);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ADD);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(211);
				match(TO);
				setState(212);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(ADD);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(219);
				match(TO);
				setState(220);
				((AddContext)_localctx).base = match(INT);
				setState(221);
				giving();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyContext extends ParserRuleContext {
		public Token multiplier;
		public Token base;
		public TerminalNode MULTIPLY() { return getToken(cobolParser.MULTIPLY, 0); }
		public TerminalNode BY() { return getToken(cobolParser.BY, 0); }
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
		}
		public List<IdentifiersContext> identifiers() {
			return getRuleContexts(IdentifiersContext.class);
		}
		public IdentifiersContext identifiers(int i) {
			return getRuleContext(IdentifiersContext.class,i);
		}
		public GivingContext giving() {
			return getRuleContext(GivingContext.class,0);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiply);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(MULTIPLY);
				setState(225);
				((MultiplyContext)_localctx).multiplier = match(INT);
				setState(226);
				match(BY);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					identifiers();
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(MULTIPLY);
				setState(233);
				((MultiplyContext)_localctx).multiplier = match(INT);
				setState(234);
				match(BY);
				setState(235);
				((MultiplyContext)_localctx).base = match(INT);
				setState(236);
				giving();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends ParserRuleContext {
		public Token divisor;
		public Token base;
		public TerminalNode DIVIDE() { return getToken(cobolParser.DIVIDE, 0); }
		public TerminalNode INTO() { return getToken(cobolParser.INTO, 0); }
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
		}
		public List<IdentifiersContext> identifiers() {
			return getRuleContexts(IdentifiersContext.class);
		}
		public IdentifiersContext identifiers(int i) {
			return getRuleContext(IdentifiersContext.class,i);
		}
		public GivingContext giving() {
			return getRuleContext(GivingContext.class,0);
		}
		public RemainderContext remainder() {
			return getRuleContext(RemainderContext.class,0);
		}
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_divide);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(DIVIDE);
				setState(240);
				((DivideContext)_localctx).divisor = match(INT);
				setState(241);
				match(INTO);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					identifiers();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(DIVIDE);
				setState(248);
				((DivideContext)_localctx).divisor = match(INT);
				setState(249);
				match(INTO);
				setState(250);
				((DivideContext)_localctx).base = match(INT);
				setState(251);
				giving();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(DIVIDE);
				setState(253);
				((DivideContext)_localctx).divisor = match(INT);
				setState(254);
				match(INTO);
				setState(255);
				((DivideContext)_localctx).base = match(INT);
				setState(256);
				giving();
				setState(257);
				remainder();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubtractContext extends ParserRuleContext {
		public Token INT;
		public List<Token> subtractors = new ArrayList<Token>();
		public Token base;
		public TerminalNode SUBTRACT() { return getToken(cobolParser.SUBTRACT, 0); }
		public TerminalNode FROM() { return getToken(cobolParser.FROM, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
		}
		public GivingContext giving() {
			return getRuleContext(GivingContext.class,0);
		}
		public SubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract; }
	}

	public final SubtractContext subtract() throws RecognitionException {
		SubtractContext _localctx = new SubtractContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subtract);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(SUBTRACT);
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					((SubtractContext)_localctx).INT = match(INT);
					((SubtractContext)_localctx).subtractors.add(((SubtractContext)_localctx).INT);
					}
					}
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(267);
				match(FROM);
				setState(268);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(SUBTRACT);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					((SubtractContext)_localctx).INT = match(INT);
					((SubtractContext)_localctx).subtractors.add(((SubtractContext)_localctx).INT);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(275);
				match(FROM);
				setState(276);
				((SubtractContext)_localctx).base = match(INT);
				setState(277);
				giving();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcceptContext extends ParserRuleContext {
		public TerminalNode ACCEPT() { return getToken(cobolParser.ACCEPT, 0); }
		public List<IdentifiersContext> identifiers() {
			return getRuleContexts(IdentifiersContext.class);
		}
		public IdentifiersContext identifiers(int i) {
			return getRuleContext(IdentifiersContext.class,i);
		}
		public AcceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accept; }
	}

	public final AcceptContext accept() throws RecognitionException {
		AcceptContext _localctx = new AcceptContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ACCEPT);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				identifiers();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class WithnoadvancingContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public TerminalNode NO() { return getToken(cobolParser.NO, 0); }
		public TerminalNode ADVANCING() { return getToken(cobolParser.ADVANCING, 0); }
		public WithnoadvancingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withnoadvancing; }
	}

	public final WithnoadvancingContext withnoadvancing() throws RecognitionException {
		WithnoadvancingContext _localctx = new WithnoadvancingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_withnoadvancing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(WITH);
			setState(287);
			match(NO);
			setState(288);
			match(ADVANCING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public TerminalNode LITERAL() { return getToken(cobolParser.LITERAL, 0); }
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atomic);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				identifiers();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(INT);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GivingContext extends ParserRuleContext {
		public TerminalNode GIVING() { return getToken(cobolParser.GIVING, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public GivingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giving; }
	}

	public final GivingContext giving() throws RecognitionException {
		GivingContext _localctx = new GivingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_giving);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(GIVING);
			setState(296);
			identifiers();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(cobolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(cobolParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OF() { return getTokens(cobolParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(cobolParser.OF, i);
		}
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IDENTIFIER);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(OF);
					setState(300);
					match(IDENTIFIER);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(306);
				match(T__0);
				setState(307);
				match(INT);
				setState(308);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RemainderContext extends ParserRuleContext {
		public TerminalNode REMAINDER() { return getToken(cobolParser.REMAINDER, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public RemainderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remainder; }
	}

	public final RemainderContext remainder() throws RecognitionException {
		RemainderContext _localctx = new RemainderContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_remainder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(REMAINDER);
			setState(312);
			identifiers();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> i = new ArrayList<StatementContext>();
		public List<StatementContext> e = new ArrayList<StatementContext>();
		public TerminalNode IF() { return getToken(cobolParser.IF, 0); }
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public TerminalNode THEN() { return getToken(cobolParser.THEN, 0); }
		public TerminalNode END() { return getToken(cobolParser.END, 0); }
		public TerminalNode ELSE() { return getToken(cobolParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(IF);
			setState(315);
			boolean_(0);
			setState(316);
			match(THEN);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				((IfContext)_localctx).statement = statement();
				((IfContext)_localctx).i.add(((IfContext)_localctx).statement);
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 624733977369903104L) != 0) );
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(322);
				match(ELSE);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					((IfContext)_localctx).statement = statement();
					((IfContext)_localctx).e.add(((IfContext)_localctx).statement);
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 624733977369903104L) != 0) );
				}
			}

			setState(330);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode ARITHMETIC_OPERATOR() { return getToken(cobolParser.ARITHMETIC_OPERATOR, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			atomic();
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
					setState(335);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(336);
					match(ARITHMETIC_OPERATOR);
					setState(337);
					arithmetic_expression(2);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_expressionContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			atomic();
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
					setState(346);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(347);
					match(T__2);
					setState(348);
					string_expression(2);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(cobolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(cobolParser.FALSE, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode COMPARISON_OPERATOR() { return getToken(cobolParser.COMPARISON_OPERATOR, 0); }
		public TerminalNode NOT() { return getToken(cobolParser.NOT, 0); }
		public List<BooleanContext> boolean_() {
			return getRuleContexts(BooleanContext.class);
		}
		public BooleanContext boolean_(int i) {
			return getRuleContext(BooleanContext.class,i);
		}
		public TerminalNode BOOLEAN_OPERATOR() { return getToken(cobolParser.BOOLEAN_OPERATOR, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
	}

	public final BooleanContext boolean_() throws RecognitionException {
		return boolean_(0);
	}

	private BooleanContext boolean_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanContext _localctx = new BooleanContext(_ctx, _parentState);
		BooleanContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_boolean, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(355);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(356);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
			case INT:
			case LITERAL:
				{
				setState(357);
				arithmetic_expression(0);
				setState(358);
				match(COMPARISON_OPERATOR);
				setState(359);
				arithmetic_expression(0);
				}
				break;
			case NOT:
				{
				setState(361);
				match(NOT);
				setState(362);
				boolean_(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolean);
					setState(365);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(366);
					match(BOOLEAN_OPERATOR);
					setState(367);
					boolean_(2);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressions);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				boolean_(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				arithmetic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				string_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EvaluateContext extends ParserRuleContext {
		public TerminalNode EVALUATE() { return getToken(cobolParser.EVALUATE, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public TerminalNode END() { return getToken(cobolParser.END, 0); }
		public List<TerminalNode> ALSO() { return getTokens(cobolParser.ALSO); }
		public TerminalNode ALSO(int i) {
			return getToken(cobolParser.ALSO, i);
		}
		public List<When_blockContext> when_block() {
			return getRuleContexts(When_blockContext.class);
		}
		public When_blockContext when_block(int i) {
			return getRuleContext(When_blockContext.class,i);
		}
		public EvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluate; }
	}

	public final EvaluateContext evaluate() throws RecognitionException {
		EvaluateContext _localctx = new EvaluateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_evaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(EVALUATE);
			setState(379);
			expressions();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALSO) {
				{
				{
				setState(380);
				match(ALSO);
				setState(381);
				expressions();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(387);
				when_block();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class When_blockContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(cobolParser.WHEN, 0); }
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public List<TerminalNode> ALSO() { return getTokens(cobolParser.ALSO); }
		public TerminalNode ALSO(int i) {
			return getToken(cobolParser.ALSO, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode OTHER() { return getToken(cobolParser.OTHER, 0); }
		public When_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_block; }
	}

	public final When_blockContext when_block() throws RecognitionException {
		When_blockContext _localctx = new When_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_when_block);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(WHEN);
				setState(396);
				atomic();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALSO) {
					{
					{
					setState(397);
					match(ALSO);
					setState(398);
					atomic();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					statement();
					}
					}
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 624733977369903104L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(WHEN);
				setState(410);
				match(OTHER);
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					statement();
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 624733977369903104L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StopContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(cobolParser.STOP, 0); }
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(STOP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Next_sentenceContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(cobolParser.NEXT, 0); }
		public TerminalNode SENTENCE() { return getToken(cobolParser.SENTENCE, 0); }
		public Next_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_sentence; }
	}

	public final Next_sentenceContext next_sentence() throws RecognitionException {
		Next_sentenceContext _localctx = new Next_sentenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_next_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(NEXT);
			setState(421);
			match(SENTENCE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PerformContext extends ParserRuleContext {
		public TerminalNode PERFORM() { return getToken(cobolParser.PERFORM, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ThroughContext through() {
			return getRuleContext(ThroughContext.class,0);
		}
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public PerformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform; }
	}

	public final PerformContext perform() throws RecognitionException {
		PerformContext _localctx = new PerformContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_perform);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(PERFORM);
			setState(424);
			proc();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROUGH) {
				{
				setState(425);
				through();
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(428);
				times();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThroughContext extends ParserRuleContext {
		public TerminalNode THROUGH() { return getToken(cobolParser.THROUGH, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ThroughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_through; }
	}

	public final ThroughContext through() throws RecognitionException {
		ThroughContext _localctx = new ThroughContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_through);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(THROUGH);
			setState(432);
			proc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public TerminalNode TIMES() { return getToken(cobolParser.TIMES, 0); }
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(INT);
			setState(435);
			match(TIMES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CopyContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(cobolParser.COPY, 0); }
		public TerminalNode LITERAL() { return getToken(cobolParser.LITERAL, 0); }
		public ReplacingContext replacing() {
			return getRuleContext(ReplacingContext.class,0);
		}
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(COPY);
			setState(438);
			match(LITERAL);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACING) {
				{
				setState(439);
				replacing();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReplacingContext extends ParserRuleContext {
		public TerminalNode REPLACING() { return getToken(cobolParser.REPLACING, 0); }
		public List<ReplacementsContext> replacements() {
			return getRuleContexts(ReplacementsContext.class);
		}
		public ReplacementsContext replacements(int i) {
			return getRuleContext(ReplacementsContext.class,i);
		}
		public ReplacingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacing; }
	}

	public final ReplacingContext replacing() throws RecognitionException {
		ReplacingContext _localctx = new ReplacingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_replacing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(REPLACING);
			setState(444); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(443);
				replacements();
				}
				}
				setState(446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COPY_LITERAL );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReplacementsContext extends ParserRuleContext {
		public List<TerminalNode> COPY_LITERAL() { return getTokens(cobolParser.COPY_LITERAL); }
		public TerminalNode COPY_LITERAL(int i) {
			return getToken(cobolParser.COPY_LITERAL, i);
		}
		public TerminalNode BY() { return getToken(cobolParser.BY, 0); }
		public ReplacementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacements; }
	}

	public final ReplacementsContext replacements() throws RecognitionException {
		ReplacementsContext _localctx = new ReplacementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_replacements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(COPY_LITERAL);
			setState(449);
			match(BY);
			setState(450);
			match(COPY_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(cobolParser.LOOP, 0); }
		public TerminalNode END() { return getToken(cobolParser.END, 0); }
		public List<Loop_expressionContext> loop_expression() {
			return getRuleContexts(Loop_expressionContext.class);
		}
		public Loop_expressionContext loop_expression(int i) {
			return getRuleContext(Loop_expressionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(LOOP);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1129137135635398656L) != 0)) {
				{
				{
				setState(453);
				loop_expression();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_expressionContext extends ParserRuleContext {
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
	 
		public Loop_expressionContext() { }
		public void copyFrom(Loop_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_while_expressionContext extends Loop_expressionContext {
		public TerminalNode WHILE() { return getToken(cobolParser.WHILE, 0); }
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public Loop_while_expressionContext(Loop_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_varying_expressionContext extends Loop_expressionContext {
		public AtomicContext from;
		public AtomicContext to;
		public AtomicContext by;
		public TerminalNode VARYING() { return getToken(cobolParser.VARYING, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode FROM() { return getToken(cobolParser.FROM, 0); }
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public TerminalNode BY() { return getToken(cobolParser.BY, 0); }
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public Loop_varying_expressionContext(Loop_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_statement_expessionContext extends Loop_expressionContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_statement_expessionContext(Loop_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_until_expressionContext extends Loop_expressionContext {
		public TerminalNode UNTIL() { return getToken(cobolParser.UNTIL, 0); }
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public Loop_until_expressionContext(Loop_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_loop_expression);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARYING:
				_localctx = new Loop_varying_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(VARYING);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(462);
					identifiers();
					}
				}

				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(465);
					match(FROM);
					setState(466);
					((Loop_varying_expressionContext)_localctx).from = atomic();
					}
				}

				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(469);
					match(TO);
					setState(470);
					((Loop_varying_expressionContext)_localctx).to = atomic();
					}
				}

				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(473);
					match(BY);
					setState(474);
					((Loop_varying_expressionContext)_localctx).by = atomic();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new Loop_while_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(WHILE);
				setState(478);
				boolean_(0);
				}
				break;
			case UNTIL:
				_localctx = new Loop_until_expressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(UNTIL);
				setState(480);
				boolean_(0);
				}
				break;
			case DISPLAY:
			case ADD:
			case ACCEPT:
			case MULTIPLY:
			case SUBTRACT:
			case DIVIDE:
			case IF:
			case EVALUATE:
			case STOP:
			case NEXT:
			case PERFORM:
			case COPY:
			case LOOP:
			case GO:
				_localctx = new Loop_statement_expessionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(cobolParser.GO, 0); }
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(cobolParser.IDENTIFIER, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(GO);
			setState(485);
			match(TO);
			setState(486);
			match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		case 27:
			return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		case 28:
			return boolean_sempred((BooleanContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolean_sempred(BooleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u01e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0003\u0000"+
		"Y\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"e\b\u0001\n\u0001\f\u0001h\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002n\b\u0002\n\u0002\f\u0002q\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003w\b\u0003\u0001\u0003"+
		"\u0003\u0003z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0004\b\u0092\b\b\u000b\b"+
		"\f\b\u0093\u0001\t\u0001\t\u0004\t\u0098\b\t\u000b\t\f\t\u0099\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a5\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00aa\b\u000b"+
		"\u0001\u000b\u0004\u000b\u00ad\b\u000b\u000b\u000b\f\u000b\u00ae\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c3\b\r\u0001\u000e\u0001\u000e\u0004\u000e\u00c7\b\u000e"+
		"\u000b\u000e\f\u000e\u00c8\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u00d0\b\u000f\u000b\u000f\f\u000f\u00d1"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00d8\b\u000f"+
		"\u000b\u000f\f\u000f\u00d9\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00df\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00e5\b\u0010\u000b\u0010\f\u0010\u00e6\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ee\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00f4\b\u0011\u000b\u0011\f"+
		"\u0011\u00f5\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0104\b\u0011\u0001\u0012\u0001\u0012\u0004\u0012"+
		"\u0108\b\u0012\u000b\u0012\f\u0012\u0109\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u0110\b\u0012\u000b\u0012\f\u0012\u0111"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0117\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u011b\b\u0013\u000b\u0013\f\u0013\u011c\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0126\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u012e\b\u0017\n\u0017\f\u0017"+
		"\u0131\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0136\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u013f\b\u0019\u000b\u0019\f\u0019\u0140"+
		"\u0001\u0019\u0001\u0019\u0004\u0019\u0145\b\u0019\u000b\u0019\f\u0019"+
		"\u0146\u0003\u0019\u0149\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0153"+
		"\b\u001a\n\u001a\f\u001a\u0156\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u015e\b\u001b\n\u001b"+
		"\f\u001b\u0161\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u016c\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0171\b"+
		"\u001c\n\u001c\f\u001c\u0174\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0179\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u017f\b\u001e\n\u001e\f\u001e\u0182\t\u001e\u0001\u001e\u0005"+
		"\u001e\u0185\b\u001e\n\u001e\f\u001e\u0188\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0190\b\u001f"+
		"\n\u001f\f\u001f\u0193\t\u001f\u0001\u001f\u0004\u001f\u0196\b\u001f\u000b"+
		"\u001f\f\u001f\u0197\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u019d"+
		"\b\u001f\u000b\u001f\f\u001f\u019e\u0003\u001f\u01a1\b\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u01ab\b\"\u0001"+
		"\"\u0003\"\u01ae\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%"+
		"\u0001%\u0001%\u0003%\u01b9\b%\u0001&\u0001&\u0004&\u01bd\b&\u000b&\f"+
		"&\u01be\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u01c7\b("+
		"\n(\f(\u01ca\t(\u0001(\u0001(\u0001)\u0001)\u0003)\u01d0\b)\u0001)\u0001"+
		")\u0003)\u01d4\b)\u0001)\u0001)\u0003)\u01d8\b)\u0001)\u0001)\u0003)\u01dc"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01e3\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0000\u0003468+\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"T\u0000\u0000\u0206\u0000V\u0001\u0000\u0000\u0000\u0002]\u0001\u0000"+
		"\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000"+
		"\b}\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u0083\u0001"+
		"\u0000\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u008a\u0001"+
		"\u0000\u0000\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u00a4\u0001"+
		"\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018\u00b2\u0001"+
		"\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c\u00c4\u0001"+
		"\u0000\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00ed\u0001\u0000"+
		"\u0000\u0000\"\u0103\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000"+
		"\u0000&\u0118\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*"+
		"\u0125\u0001\u0000\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u012a\u0001"+
		"\u0000\u0000\u00000\u0137\u0001\u0000\u0000\u00002\u013a\u0001\u0000\u0000"+
		"\u00004\u014c\u0001\u0000\u0000\u00006\u0157\u0001\u0000\u0000\u00008"+
		"\u016b\u0001\u0000\u0000\u0000:\u0178\u0001\u0000\u0000\u0000<\u017a\u0001"+
		"\u0000\u0000\u0000>\u01a0\u0001\u0000\u0000\u0000@\u01a2\u0001\u0000\u0000"+
		"\u0000B\u01a4\u0001\u0000\u0000\u0000D\u01a7\u0001\u0000\u0000\u0000F"+
		"\u01af\u0001\u0000\u0000\u0000H\u01b2\u0001\u0000\u0000\u0000J\u01b5\u0001"+
		"\u0000\u0000\u0000L\u01ba\u0001\u0000\u0000\u0000N\u01c0\u0001\u0000\u0000"+
		"\u0000P\u01c4\u0001\u0000\u0000\u0000R\u01e2\u0001\u0000\u0000\u0000T"+
		"\u01e4\u0001\u0000\u0000\u0000VX\u0003\u0002\u0001\u0000WY\u0003\u0004"+
		"\u0002\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0003\u0010\b\u0000[\\\u0005\u0000\u0000\u0001\\"+
		"\u0001\u0001\u0000\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\t\u0000\u0000"+
		"_f\u0005?\u0000\u0000`a\u0005<\u0000\u0000ab\u0005?\u0000\u0000bc\u0005"+
		"@\u0000\u0000ce\u0005?\u0000\u0000d`\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0003"+
		"\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u001b\u0000"+
		"\u0000jk\u0005\t\u0000\u0000ko\u0005?\u0000\u0000ln\u0003\u0006\u0003"+
		"\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u0005\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rs\u0003\n\u0005\u0000sv\u0005<\u0000\u0000"+
		"tw\u0003\f\u0006\u0000uw\u0003\u000e\u0007\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xz\u0003\b\u0004\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0005?\u0000\u0000|\u0007\u0001\u0000"+
		"\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f\u0080"+
		"\u0005\u000b\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"=\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000\u0083\u0084\u0005\f"+
		"\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0086\u0005\u0004\u0000"+
		"\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0015\u0000\u0000"+
		"\u0088\u0089\u0003.\u0017\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u000e\u0000\u0000\u008b\u008d\u0005\t\u0000\u0000\u008c\u008e"+
		"\u0003\u0012\t\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0005"+
		"?\u0000\u0000\u0090\u0092\u0003\u0016\u000b\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0011\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0005\u000f\u0000\u0000\u0096\u0098\u0003\u0014"+
		"\n\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u0013\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0010\u0000"+
		"\u0000\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u00a5\u0003.\u0017\u0000"+
		"\u009e\u009f\u0005\u0010\u0000\u0000\u009f\u00a0\u0005\u0013\u0000\u0000"+
		"\u00a0\u00a5\u0003*\u0015\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0014\u0000\u0000\u00a3\u00a5\u0003*\u0015\u0000\u00a4\u009b"+
		"\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0018\f\u0000\u00a7\u00a8\u0005?\u0000\u0000\u00a8\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003"+
		"\u001a\r\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005?\u0000"+
		"\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005<\u0000\u0000"+
		"\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00c3\u0003\u001c\u000e\u0000"+
		"\u00b5\u00c3\u0003\u001e\u000f\u0000\u00b6\u00c3\u0003&\u0013\u0000\u00b7"+
		"\u00c3\u0003 \u0010\u0000\u00b8\u00c3\u0003$\u0012\u0000\u00b9\u00c3\u0003"+
		"\"\u0011\u0000\u00ba\u00c3\u00032\u0019\u0000\u00bb\u00c3\u0003<\u001e"+
		"\u0000\u00bc\u00c3\u0003@ \u0000\u00bd\u00c3\u0003B!\u0000\u00be\u00c3"+
		"\u0003D\"\u0000\u00bf\u00c3\u0003J%\u0000\u00c0\u00c3\u0003P(\u0000\u00c1"+
		"\u00c3\u0003T*\u0000\u00c2\u00b4\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b6\u0001\u0000\u0000\u0000\u00c2\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b8\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005"+
		"\u0016\u0000\u0000\u00c5\u00c7\u0003*\u0015\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005\u001c\u0000\u0000\u00ce\u00d0\u0005=\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001d\u0000\u0000"+
		"\u00d4\u00df\u0003.\u0017\u0000\u00d5\u00d7\u0005\u001c\u0000\u0000\u00d6"+
		"\u00d8\u0005=\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\u001d\u0000\u0000\u00dc\u00dd\u0005=\u0000\u0000\u00dd\u00df\u0003"+
		",\u0016\u0000\u00de\u00cd\u0001\u0000\u0000\u0000\u00de\u00d5\u0001\u0000"+
		"\u0000\u0000\u00df\u001f\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\"\u0000"+
		"\u0000\u00e1\u00e2\u0005=\u0000\u0000\u00e2\u00e4\u0005\u0010\u0000\u0000"+
		"\u00e3\u00e5\u0003.\u0017\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ee\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\"\u0000\u0000\u00e9\u00ea\u0005=\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0010\u0000\u0000\u00eb\u00ec\u0005=\u0000\u0000\u00ec\u00ee\u0003"+
		",\u0016\u0000\u00ed\u00e0\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005$\u0000\u0000"+
		"\u00f0\u00f1\u0005=\u0000\u0000\u00f1\u00f3\u0005\u001e\u0000\u0000\u00f2"+
		"\u00f4\u0003.\u0017\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u0104\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005$\u0000\u0000\u00f8\u00f9\u0005=\u0000\u0000\u00f9\u00fa\u0005\u001e"+
		"\u0000\u0000\u00fa\u00fb\u0005=\u0000\u0000\u00fb\u0104\u0003,\u0016\u0000"+
		"\u00fc\u00fd\u0005$\u0000\u0000\u00fd\u00fe\u0005=\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001e\u0000\u0000\u00ff\u0100\u0005=\u0000\u0000\u0100\u0101\u0003"+
		",\u0016\u0000\u0101\u0102\u00030\u0018\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103\u00f7\u0001\u0000\u0000"+
		"\u0000\u0103\u00fc\u0001\u0000\u0000\u0000\u0104#\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0005#\u0000\u0000\u0106\u0108\u0005=\u0000\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0011\u0000\u0000\u010c\u0117"+
		"\u0003.\u0017\u0000\u010d\u010f\u0005#\u0000\u0000\u010e\u0110\u0005="+
		"\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0011"+
		"\u0000\u0000\u0114\u0115\u0005=\u0000\u0000\u0115\u0117\u0003,\u0016\u0000"+
		"\u0116\u0105\u0001\u0000\u0000\u0000\u0116\u010d\u0001\u0000\u0000\u0000"+
		"\u0117%\u0001\u0000\u0000\u0000\u0118\u011a\u0005!\u0000\u0000\u0119\u011b"+
		"\u0003.\u0017\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0018"+
		"\u0000\u0000\u011f\u0120\u0005\u0019\u0000\u0000\u0120\u0121\u0005\u001a"+
		"\u0000\u0000\u0121)\u0001\u0000\u0000\u0000\u0122\u0126\u0003.\u0017\u0000"+
		"\u0123\u0126\u0005=\u0000\u0000\u0124\u0126\u0005@\u0000\u0000\u0125\u0122"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126+\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"\u001f\u0000\u0000\u0128\u0129\u0003.\u0017\u0000\u0129-\u0001\u0000\u0000"+
		"\u0000\u012a\u012f\u0005<\u0000\u0000\u012b\u012c\u0005\u0017\u0000\u0000"+
		"\u012c\u012e\u0005<\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e"+
		"\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0135\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0001\u0000\u0000\u0133"+
		"\u0134\u0005=\u0000\u0000\u0134\u0136\u0005\u0002\u0000\u0000\u0135\u0132"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136/\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005 \u0000\u0000\u0138\u0139\u0003.\u0017"+
		"\u0000\u01391\u0001\u0000\u0000\u0000\u013a\u013b\u0005%\u0000\u0000\u013b"+
		"\u013c\u00038\u001c\u0000\u013c\u013e\u0005\'\u0000\u0000\u013d\u013f"+
		"\u0003\u001a\r\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0148\u0001\u0000\u0000\u0000\u0142\u0144\u0005"+
		"&\u0000\u0000\u0143\u0145\u0003\u001a\r\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000"+
		"\u0000\u0000\u0148\u0142\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0005(\u0000"+
		"\u0000\u014b3\u0001\u0000\u0000\u0000\u014c\u014d\u0006\u001a\uffff\uffff"+
		"\u0000\u014d\u014e\u0003*\u0015\u0000\u014e\u0154\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\n\u0001\u0000\u0000\u0150\u0151\u0005\u0005\u0000\u0000\u0151"+
		"\u0153\u00034\u001a\u0002\u0152\u014f\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u01555\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0006\u001b\uffff\uffff\u0000\u0158\u0159"+
		"\u0003*\u0015\u0000\u0159\u015f\u0001\u0000\u0000\u0000\u015a\u015b\n"+
		"\u0001\u0000\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015e\u0003"+
		"6\u001b\u0002\u015d\u015a\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u01607\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0006\u001c\uffff\uffff\u0000\u0163\u016c\u0005)\u0000"+
		"\u0000\u0164\u016c\u0005*\u0000\u0000\u0165\u0166\u00034\u001a\u0000\u0166"+
		"\u0167\u0005\u0006\u0000\u0000\u0167\u0168\u00034\u001a\u0000\u0168\u016c"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0005+\u0000\u0000\u016a\u016c\u0003"+
		"8\u001c\u0002\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u0164\u0001\u0000"+
		"\u0000\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u0172\u0001\u0000\u0000\u0000\u016d\u016e\n\u0001\u0000"+
		"\u0000\u016e\u016f\u0005\u0007\u0000\u0000\u016f\u0171\u00038\u001c\u0002"+
		"\u0170\u016d\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u01739\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0179\u00038\u001c\u0000\u0176\u0179\u00034\u001a\u0000\u0177\u0179\u0003"+
		"6\u001b\u0000\u0178\u0175\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179;\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0005/\u0000\u0000\u017b\u0180\u0003:\u001d\u0000\u017c"+
		"\u017d\u0005-\u0000\u0000\u017d\u017f\u0003:\u001d\u0000\u017e\u017c\u0001"+
		"\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0186\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0185\u0003"+
		">\u001f\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005(\u0000\u0000\u018a=\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005,\u0000\u0000\u018c\u0191\u0003*\u0015\u0000\u018d\u018e"+
		"\u0005-\u0000\u0000\u018e\u0190\u0003*\u0015\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0196\u0003\u001a"+
		"\r\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u01a1\u0001\u0000\u0000\u0000\u0199\u019a\u0005,\u0000\u0000"+
		"\u019a\u019c\u0005.\u0000\u0000\u019b\u019d\u0003\u001a\r\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a0\u018b\u0001\u0000\u0000\u0000\u01a0"+
		"\u0199\u0001\u0000\u0000\u0000\u01a1?\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u00050\u0000\u0000\u01a3A\u0001\u0000\u0000\u0000\u01a4\u01a5\u00051"+
		"\u0000\u0000\u01a5\u01a6\u00052\u0000\u0000\u01a6C\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u00053\u0000\u0000\u01a8\u01aa\u0003\u0018\f\u0000\u01a9"+
		"\u01ab\u0003F#\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003"+
		"H$\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01aeE\u0001\u0000\u0000\u0000\u01af\u01b0\u00054\u0000\u0000\u01b0"+
		"\u01b1\u0003\u0018\f\u0000\u01b1G\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0005=\u0000\u0000\u01b3\u01b4\u0005\u000b\u0000\u0000\u01b4I\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u00055\u0000\u0000\u01b6\u01b8\u0005@\u0000\u0000"+
		"\u01b7\u01b9\u0003L&\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9K\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005"+
		"6\u0000\u0000\u01bb\u01bd\u0003N\'\u0000\u01bc\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bfM\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0005A\u0000\u0000\u01c1\u01c2\u0005\u0010\u0000\u0000\u01c2"+
		"\u01c3\u0005A\u0000\u0000\u01c3O\u0001\u0000\u0000\u0000\u01c4\u01c8\u0005"+
		"7\u0000\u0000\u01c5\u01c7\u0003R)\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005(\u0000\u0000"+
		"\u01ccQ\u0001\u0000\u0000\u0000\u01cd\u01cf\u00058\u0000\u0000\u01ce\u01d0"+
		"\u0003.\u0017\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005"+
		"\u0011\u0000\u0000\u01d2\u01d4\u0003*\u0015\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0005\u001d\u0000\u0000\u01d6\u01d8\u0003*\u0015"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u0010\u0000"+
		"\u0000\u01da\u01dc\u0003*\u0015\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01e3\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u00059\u0000\u0000\u01de\u01e3\u00038\u001c\u0000\u01df\u01e0"+
		"\u0005:\u0000\u0000\u01e0\u01e3\u00038\u001c\u0000\u01e1\u01e3\u0003\u001a"+
		"\r\u0000\u01e2\u01cd\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e3S\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005;\u0000\u0000\u01e5"+
		"\u01e6\u0005\u001d\u0000\u0000\u01e6\u01e7\u0005<\u0000\u0000\u01e7U\u0001"+
		"\u0000\u0000\u00004Xfovy\u008d\u0093\u0099\u00a4\u00a9\u00ae\u00c2\u00c8"+
		"\u00cb\u00d1\u00d9\u00de\u00e6\u00ed\u00f5\u0103\u0109\u0111\u0116\u011c"+
		"\u0125\u012f\u0135\u0140\u0146\u0148\u0154\u015f\u016b\u0172\u0178\u0180"+
		"\u0186\u0191\u0197\u019e\u01a0\u01aa\u01ad\u01b8\u01be\u01c8\u01cf\u01d3"+
		"\u01d7\u01db\u01e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}