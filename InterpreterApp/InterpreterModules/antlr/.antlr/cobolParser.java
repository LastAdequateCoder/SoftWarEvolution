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
		IDENTIFIER=22, INT=23, SPACE=24, DOT=25, LITERAL=26;
	public static final int
		RULE_program = 0, RULE_identification_division = 1, RULE_data_division = 2, 
		RULE_picture = 3, RULE_like = 4, RULE_procedure_division = 5, RULE_using = 6, 
		RULE_use = 7, RULE_sentence = 8, RULE_statement = 9, RULE_display = 10, 
		RULE_withnoadvancing = 11, RULE_atomic = 12, RULE_identifiers = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "identification_division", "data_division", "picture", "like", 
			"procedure_division", "using", "use", "sentence", "statement", "display", 
			"withnoadvancing", "atomic", "identifiers"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REPRESENTATION", "IDENTIFICATION", "DIVISION", "OCCURS", 
			"TIMES", "PICTURE", "IS", "PROCEDURE", "USING", "BY", "REFERENCE", "CONTENT", 
			"VALUE", "LIKE", "DISPLAY", "OF", "WITH", "NO", "ADVANCING", "IDENTIFIER", 
			"INT", "SPACE", "DOT", "LITERAL"
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
			setState(28);
			identification_division();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(29);
				data_division();
				}
			}

			{
			setState(32);
			procedure_division();
			}
			setState(33);
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
			setState(35);
			match(IDENTIFICATION);
			setState(36);
			match(DIVISION);
			setState(37);
			match(DOT);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(38);
				match(IDENTIFIER);
				setState(39);
				match(DOT);
				setState(40);
				match(LITERAL);
				setState(41);
				match(DOT);
				}
				}
				setState(46);
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
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
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
		public TerminalNode TIMES() { return getToken(cobolParser.TIMES, 0); }
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
			setState(47);
			match(INT);
			setState(48);
			match(IDENTIFIER);
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PICTURE:
				{
				setState(49);
				picture();
				}
				break;
			case LIKE:
				{
				setState(50);
				like();
				}
				break;
			case OCCURS:
			case DOT:
				break;
			default:
				break;
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OCCURS) {
				{
				setState(53);
				match(OCCURS);
				setState(54);
				match(INT);
				setState(55);
				match(TIMES);
				}
			}

			setState(58);
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
		enterRule(_localctx, 6, RULE_picture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PICTURE);
			setState(61);
			match(IS);
			setState(62);
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
		enterRule(_localctx, 8, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LIKE);
			setState(65);
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
		enterRule(_localctx, 10, RULE_procedure_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PROCEDURE);
			setState(68);
			match(DIVISION);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(69);
				using();
				}
			}

			setState(72);
			match(DOT);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				sentence();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DISPLAY || _la==IDENTIFIER );
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
		enterRule(_localctx, 12, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(USING);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				use();
				}
				}
				setState(82); 
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
		enterRule(_localctx, 14, RULE_use);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(BY);
				setState(85);
				match(REFERENCE);
				setState(86);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(BY);
				setState(88);
				match(CONTENT);
				setState(89);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(BY);
				setState(91);
				match(VALUE);
				setState(92);
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
		enterRule(_localctx, 16, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(95);
				match(IDENTIFIER);
				setState(96);
				match(DOT);
				}
			}

			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DISPLAY );
			setState(104);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			display();
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
		enterRule(_localctx, 20, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DISPLAY);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				atomic();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 79691776L) != 0) );
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(114);
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
		enterRule(_localctx, 22, RULE_withnoadvancing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WITH);
			setState(118);
			match(NO);
			setState(119);
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
		enterRule(_localctx, 24, RULE_atomic);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				identifiers();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(INT);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
		enterRule(_localctx, 26, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OF) {
				{
				{
				setState(127);
				match(OF);
				setState(128);
				match(IDENTIFIER);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(134);
				match(T__0);
				setState(135);
				match(INT);
				setState(136);
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
		"\u0004\u0001\u001a\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003\u0000\u001f"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b"+
		"\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005K\b\u0005\u000b\u0005\f\u0005L\u0001\u0006\u0001\u0006\u0004\u0006"+
		"Q\b\u0006\u000b\u0006\f\u0006R\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007^\b\u0007\u0001\b\u0001\b\u0003\bb\b\b\u0001\b\u0004\be\b\b\u000b"+
		"\b\f\bf\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0004\no\b\n\u000b"+
		"\n\f\np\u0001\n\u0003\nt\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0003\f}\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0082\b\r\n\r\f\r\u0085\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u008a\b"+
		"\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u008f\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000"+
		"\u0006<\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nC\u0001\u0000"+
		"\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000"+
		"\u0010a\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014l"+
		"\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018|\u0001\u0000"+
		"\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001"+
		"\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0003\n\u0005\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0004\u0000\u0000$%\u0005\u0005\u0000\u0000%,\u0005"+
		"\u0019\u0000\u0000&\'\u0005\u0016\u0000\u0000\'(\u0005\u0019\u0000\u0000"+
		"()\u0005\u001a\u0000\u0000)+\u0005\u0019\u0000\u0000*&\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-\u0003\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0017\u0000\u000003\u0005\u0016\u0000\u000014\u0003\u0006\u0003"+
		"\u000024\u0003\b\u0004\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000048\u0001\u0000\u0000\u000056\u0005\u0006"+
		"\u0000\u000067\u0005\u0017\u0000\u000079\u0005\u0007\u0000\u000085\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0005\u0019\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\b\u0000"+
		"\u0000=>\u0005\t\u0000\u0000>?\u0005\u0003\u0000\u0000?\u0007\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0010\u0000\u0000AB\u0003\u001a\r\u0000B\t\u0001"+
		"\u0000\u0000\u0000CD\u0005\n\u0000\u0000DF\u0005\u0005\u0000\u0000EG\u0003"+
		"\f\u0006\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0005\u0019\u0000\u0000IK\u0003\u0010\b\u0000JI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NP\u0005\u000b"+
		"\u0000\u0000OQ\u0003\u000e\u0007\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\r\u0001\u0000\u0000\u0000TU\u0005\f\u0000\u0000UV\u0005\r\u0000\u0000"+
		"V^\u0003\u001a\r\u0000WX\u0005\f\u0000\u0000XY\u0005\u000e\u0000\u0000"+
		"Y^\u0003\u0018\f\u0000Z[\u0005\f\u0000\u0000[\\\u0005\u000f\u0000\u0000"+
		"\\^\u0003\u0018\f\u0000]T\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]Z\u0001\u0000\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0016\u0000\u0000`b\u0005\u0019\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ce\u0003\u0012\t\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0019"+
		"\u0000\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0003\u0014\n\u0000k\u0013"+
		"\u0001\u0000\u0000\u0000ln\u0005\u0011\u0000\u0000mo\u0003\u0018\f\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rt\u0003\u0016"+
		"\u000b\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0015"+
		"\u0001\u0000\u0000\u0000uv\u0005\u0013\u0000\u0000vw\u0005\u0014\u0000"+
		"\u0000wx\u0005\u0015\u0000\u0000x\u0017\u0001\u0000\u0000\u0000y}\u0003"+
		"\u001a\r\u0000z}\u0005\u0017\u0000\u0000{}\u0005\u001a\u0000\u0000|y\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0019\u0001\u0000\u0000\u0000~\u0083\u0005\u0016\u0000\u0000\u007f\u0080"+
		"\u0005\u0012\u0000\u0000\u0080\u0082\u0005\u0016\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0089"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\u0001\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u008a"+
		"\u0005\u0002\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u001b\u0001\u0000\u0000\u0000\u000f\u001e"+
		",38FLR]afps|\u0083\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}