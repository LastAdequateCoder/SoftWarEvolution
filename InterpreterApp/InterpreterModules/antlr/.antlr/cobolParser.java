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
		T__0=1, T__1=2, REPRESENTATION=3, IDENTIFICATION=4, DIVISION=5, OCCURS=6, 
		TIMES=7, PICTURE=8, IS=9, PROCEDURE=10, USING=11, BY=12, REFERENCE=13, 
		CONTENT=14, VALUE=15, LIKE=16, DISPLAY=17, OF=18, WITH=19, NO=20, ADVANCING=21, 
		DATA=22, ADD=23, TO=24, GIVING=25, ACCEPT=26, IDENTIFIER=27, INT=28, SPACE=29, 
		DOT=30, LITERAL=31;
	public static final int
		RULE_program = 0, RULE_identification_division = 1, RULE_data_division = 2, 
		RULE_variables = 3, RULE_level = 4, RULE_picture = 5, RULE_like = 6, RULE_procedure_division = 7, 
		RULE_using = 8, RULE_use = 9, RULE_sentence = 10, RULE_statement = 11, 
		RULE_display = 12, RULE_add = 13, RULE_accept = 14, RULE_withnoadvancing = 15, 
		RULE_atomic = 16, RULE_giving = 17, RULE_identifiers = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "identification_division", "data_division", "variables", "level", 
			"picture", "like", "procedure_division", "using", "use", "sentence", 
			"statement", "display", "add", "accept", "withnoadvancing", "atomic", 
			"giving", "identifiers"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REPRESENTATION", "IDENTIFICATION", "DIVISION", "OCCURS", 
			"TIMES", "PICTURE", "IS", "PROCEDURE", "USING", "BY", "REFERENCE", "CONTENT", 
			"VALUE", "LIKE", "DISPLAY", "OF", "WITH", "NO", "ADVANCING", "DATA", 
			"ADD", "TO", "GIVING", "ACCEPT", "IDENTIFIER", "INT", "SPACE", "DOT", 
			"LITERAL"
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
			setState(38);
			identification_division();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(39);
				data_division();
				}
			}

			{
			setState(42);
			procedure_division();
			}
			setState(43);
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
			setState(45);
			match(IDENTIFICATION);
			setState(46);
			match(DIVISION);
			setState(47);
			match(DOT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(DOT);
				setState(50);
				match(LITERAL);
				setState(51);
				match(DOT);
				}
				}
				setState(56);
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
			setState(57);
			match(DATA);
			setState(58);
			match(DIVISION);
			setState(59);
			match(DOT);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(60);
				variables();
				}
				}
				setState(65);
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
		public TerminalNode OCCURS() { return getToken(cobolParser.OCCURS, 0); }
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public TerminalNode TIMES() { return getToken(cobolParser.TIMES, 0); }
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
			setState(66);
			level();
			setState(67);
			match(IDENTIFIER);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PICTURE:
				{
				setState(68);
				picture();
				}
				break;
			case LIKE:
				{
				setState(69);
				like();
				}
				break;
			case OCCURS:
			case DOT:
				break;
			default:
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OCCURS) {
				{
				setState(72);
				match(OCCURS);
				setState(73);
				match(INT);
				setState(74);
				match(TIMES);
				}
			}

			setState(77);
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
	public static class LevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(cobolParser.INT, 0); }
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 10, RULE_picture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PICTURE);
			setState(82);
			match(IS);
			setState(83);
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
		enterRule(_localctx, 12, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LIKE);
			setState(86);
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
		enterRule(_localctx, 14, RULE_procedure_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PROCEDURE);
			setState(89);
			match(DIVISION);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(90);
				using();
				}
			}

			setState(93);
			match(DOT);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				sentence();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 209846272L) != 0) );
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
		enterRule(_localctx, 16, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(USING);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				use();
				}
				}
				setState(103); 
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
		enterRule(_localctx, 18, RULE_use);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(BY);
				setState(106);
				match(REFERENCE);
				setState(107);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(BY);
				setState(109);
				match(CONTENT);
				setState(110);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(BY);
				setState(112);
				match(VALUE);
				setState(113);
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
		public TerminalNode IDENTIFIER() { return getToken(cobolParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(116);
				match(IDENTIFIER);
				setState(117);
				match(DOT);
				}
			}

			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 75628544L) != 0) );
			setState(125);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				display();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				add();
				}
				break;
			case ACCEPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				accept();
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
		enterRule(_localctx, 24, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DISPLAY);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				atomic();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2550136832L) != 0) );
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(138);
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
		enterRule(_localctx, 26, RULE_add);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ADD);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(147);
				match(TO);
				setState(148);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ADD);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(155);
				match(TO);
				setState(156);
				((AddContext)_localctx).base = match(INT);
				setState(157);
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
		enterRule(_localctx, 28, RULE_accept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ACCEPT);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				identifiers();
				}
				}
				setState(164); 
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
		enterRule(_localctx, 30, RULE_withnoadvancing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WITH);
			setState(167);
			match(NO);
			setState(168);
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
		enterRule(_localctx, 32, RULE_atomic);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				identifiers();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(INT);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
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
		enterRule(_localctx, 34, RULE_giving);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(GIVING);
			setState(176);
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
		enterRule(_localctx, 36, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OF) {
				{
				{
				setState(179);
				match(OF);
				setState(180);
				match(IDENTIFIER);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(186);
				match(T__0);
				setState(187);
				match(INT);
				setState(188);
				match(T__1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b"+
		"\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007`\b\u0007\u000b\u0007\f\u0007a\u0001\b\u0001"+
		"\b\u0004\bf\b\b\u000b\b\f\bg\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\ts\b\t\u0001\n\u0001\n\u0003\nw\b\n\u0001"+
		"\n\u0004\nz\b\n\u000b\n\f\n{\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0083\b\u000b\u0001\f\u0001\f\u0004\f\u0087\b\f\u000b"+
		"\f\f\f\u0088\u0001\f\u0003\f\u008c\b\f\u0001\r\u0001\r\u0004\r\u0090\b"+
		"\r\u000b\r\f\r\u0091\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0098\b\r"+
		"\u000b\r\f\r\u0099\u0001\r\u0001\r\u0001\r\u0003\r\u009f\b\r\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00a3\b\u000e\u000b\u000e\f\u000e\u00a4\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00ae\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b6\b\u0012\n\u0012\f\u0012"+
		"\u00b9\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00be\b"+
		"\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0000\u00c5"+
		"\u0000&\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00049"+
		"\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bO\u0001\u0000"+
		"\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e"+
		"X\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012r\u0001"+
		"\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000"+
		"\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000"+
		"\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00a6\u0001\u0000"+
		"\u0000\u0000 \u00ad\u0001\u0000\u0000\u0000\"\u00af\u0001\u0000\u0000"+
		"\u0000$\u00b2\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\')\u0003"+
		"\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0003\u000e\u0007\u0000+,\u0005\u0000\u0000"+
		"\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005"+
		"\u0005\u0000\u0000/6\u0005\u001e\u0000\u000001\u0005\u001b\u0000\u0000"+
		"12\u0005\u001e\u0000\u000023\u0005\u001f\u0000\u000035\u0005\u001e\u0000"+
		"\u000040\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009:\u0005\u0016\u0000\u0000:;\u0005\u0005\u0000"+
		"\u0000;?\u0005\u001e\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0003\b\u0004\u0000CF\u0005\u001b\u0000\u0000DG\u0003\n\u0005"+
		"\u0000EG\u0003\f\u0006\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GK\u0001\u0000\u0000\u0000HI\u0005\u0006"+
		"\u0000\u0000IJ\u0005\u001c\u0000\u0000JL\u0005\u0007\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0005\u001e\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005\u001c"+
		"\u0000\u0000P\t\u0001\u0000\u0000\u0000QR\u0005\b\u0000\u0000RS\u0005"+
		"\t\u0000\u0000ST\u0005\u0003\u0000\u0000T\u000b\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0010\u0000\u0000VW\u0003$\u0012\u0000W\r\u0001\u0000\u0000\u0000"+
		"XY\u0005\n\u0000\u0000Y[\u0005\u0005\u0000\u0000Z\\\u0003\u0010\b\u0000"+
		"[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0005\u001e\u0000\u0000^`\u0003\u0014\n\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u000f\u0001\u0000\u0000\u0000ce\u0005\u000b\u0000\u0000"+
		"df\u0003\u0012\t\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0011\u0001\u0000"+
		"\u0000\u0000ij\u0005\f\u0000\u0000jk\u0005\r\u0000\u0000ks\u0003$\u0012"+
		"\u0000lm\u0005\f\u0000\u0000mn\u0005\u000e\u0000\u0000ns\u0003 \u0010"+
		"\u0000op\u0005\f\u0000\u0000pq\u0005\u000f\u0000\u0000qs\u0003 \u0010"+
		"\u0000ri\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005\u001b\u0000\u0000"+
		"uw\u0005\u001e\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xz\u0003\u0016\u000b\u0000yx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u001e\u0000\u0000"+
		"~\u0015\u0001\u0000\u0000\u0000\u007f\u0083\u0003\u0018\f\u0000\u0080"+
		"\u0083\u0003\u001a\r\u0000\u0081\u0083\u0003\u001c\u000e\u0000\u0082\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0005\u0011\u0000\u0000\u0085\u0087\u0003 \u0010\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0003\u001e\u000f\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0019\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0005\u0017\u0000\u0000\u008e\u0090\u0005"+
		"\u001c\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0018\u0000\u0000\u0094\u009f\u0003$\u0012\u0000\u0095\u0097\u0005\u0017"+
		"\u0000\u0000\u0096\u0098\u0005\u001c\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d\u0005\u001c"+
		"\u0000\u0000\u009d\u009f\u0003\"\u0011\u0000\u009e\u008d\u0001\u0000\u0000"+
		"\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009f\u001b\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0005\u001a\u0000\u0000\u00a1\u00a3\u0003$\u0012\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u001d\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000"+
		"\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003$\u0012\u0000\u00ab"+
		"\u00ae\u0005\u001c\u0000\u0000\u00ac\u00ae\u0005\u001f\u0000\u0000\u00ad"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae!\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0019\u0000\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1#\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b7\u0005\u001b\u0000\u0000\u00b3\u00b4\u0005\u0012"+
		"\u0000\u0000\u00b4\u00b6\u0005\u001b\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0001"+
		"\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000\u00bc\u00be\u0005\u0002"+
		"\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be%\u0001\u0000\u0000\u0000\u0015(6?FK[agrv{\u0082\u0088"+
		"\u008b\u0091\u0099\u009e\u00a4\u00ad\u00b7\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}