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
		DATA=22, ADD=23, TO=24, GIVING=25, IDENTIFIER=26, INT=27, SPACE=28, DOT=29, 
		LITERAL=30;
	public static final int
		RULE_program = 0, RULE_identification_division = 1, RULE_data_division = 2, 
		RULE_picture = 3, RULE_like = 4, RULE_procedure_division = 5, RULE_using = 6, 
		RULE_use = 7, RULE_sentence = 8, RULE_statement = 9, RULE_display = 10, 
		RULE_add = 11, RULE_withnoadvancing = 12, RULE_atomic = 13, RULE_giving = 14, 
		RULE_identifiers = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "identification_division", "data_division", "picture", "like", 
			"procedure_division", "using", "use", "sentence", "statement", "display", 
			"add", "withnoadvancing", "atomic", "giving", "identifiers"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REPRESENTATION", "IDENTIFICATION", "DIVISION", "OCCURS", 
			"TIMES", "PICTURE", "IS", "PROCEDURE", "USING", "BY", "REFERENCE", "CONTENT", 
			"VALUE", "LIKE", "DISPLAY", "OF", "WITH", "NO", "ADVANCING", "DATA", 
			"ADD", "TO", "GIVING", "IDENTIFIER", "INT", "SPACE", "DOT", "LITERAL"
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
			setState(32);
			identification_division();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(33);
				data_division();
				}
			}

			{
			setState(36);
			procedure_division();
			}
			setState(37);
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
			setState(39);
			match(IDENTIFICATION);
			setState(40);
			match(DIVISION);
			setState(41);
			match(DOT);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(42);
				match(IDENTIFIER);
				setState(43);
				match(DOT);
				setState(44);
				match(LITERAL);
				setState(45);
				match(DOT);
				}
				}
				setState(50);
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
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<TerminalNode> INT() { return getTokens(cobolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(cobolParser.INT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(cobolParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(cobolParser.IDENTIFIER, i);
		}
		public List<PictureContext> picture() {
			return getRuleContexts(PictureContext.class);
		}
		public PictureContext picture(int i) {
			return getRuleContext(PictureContext.class,i);
		}
		public List<LikeContext> like() {
			return getRuleContexts(LikeContext.class);
		}
		public LikeContext like(int i) {
			return getRuleContext(LikeContext.class,i);
		}
		public List<TerminalNode> OCCURS() { return getTokens(cobolParser.OCCURS); }
		public TerminalNode OCCURS(int i) {
			return getToken(cobolParser.OCCURS, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(cobolParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(cobolParser.TIMES, i);
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
			setState(51);
			match(DATA);
			setState(52);
			match(DIVISION);
			setState(53);
			match(DOT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(54);
				match(INT);
				setState(55);
				match(IDENTIFIER);
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PICTURE:
					{
					setState(56);
					picture();
					}
					break;
				case LIKE:
					{
					setState(57);
					like();
					}
					break;
				case OCCURS:
				case DOT:
					break;
				default:
					break;
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OCCURS) {
					{
					setState(60);
					match(OCCURS);
					setState(61);
					match(INT);
					setState(62);
					match(TIMES);
					}
				}

				setState(65);
				match(DOT);
				}
				}
				setState(70);
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
			setState(71);
			match(PICTURE);
			setState(72);
			match(IS);
			setState(73);
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
			setState(75);
			match(LIKE);
			setState(76);
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
			setState(78);
			match(PROCEDURE);
			setState(79);
			match(DIVISION);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(80);
				using();
				}
			}

			setState(83);
			match(DOT);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				sentence();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 75628544L) != 0) );
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
			setState(89);
			match(USING);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				use();
				}
				}
				setState(93); 
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(BY);
				setState(96);
				match(REFERENCE);
				setState(97);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(BY);
				setState(99);
				match(CONTENT);
				setState(100);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(BY);
				setState(102);
				match(VALUE);
				setState(103);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(106);
				match(IDENTIFIER);
				setState(107);
				match(DOT);
				}
			}

			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DISPLAY || _la==ADD );
			setState(115);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				display();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				add();
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
		enterRule(_localctx, 20, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DISPLAY);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				atomic();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1275068416L) != 0) );
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(127);
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
		enterRule(_localctx, 22, RULE_add);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ADD);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(136);
				match(TO);
				setState(137);
				identifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ADD);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					((AddContext)_localctx).INT = match(INT);
					((AddContext)_localctx).additions.add(((AddContext)_localctx).INT);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(144);
				match(TO);
				setState(145);
				((AddContext)_localctx).base = match(INT);
				setState(146);
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
		enterRule(_localctx, 24, RULE_withnoadvancing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WITH);
			setState(150);
			match(NO);
			setState(151);
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
		enterRule(_localctx, 26, RULE_atomic);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				identifiers();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(INT);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
		enterRule(_localctx, 28, RULE_giving);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GIVING);
			setState(159);
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
		enterRule(_localctx, 30, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IDENTIFIER);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OF) {
				{
				{
				setState(162);
				match(OF);
				setState(163);
				match(IDENTIFIER);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(169);
				match(T__0);
				setState(170);
				match(INT);
				setState(171);
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
		"\u0004\u0001\u001e\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002\f"+
		"\u0002F\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005R\b\u0005\u0001\u0005\u0001\u0005\u0004\u0005V\b\u0005\u000b\u0005"+
		"\f\u0005W\u0001\u0006\u0001\u0006\u0004\u0006\\\b\u0006\u000b\u0006\f"+
		"\u0006]\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001"+
		"\b\u0001\b\u0003\bm\b\b\u0001\b\u0004\bp\b\b\u000b\b\f\bq\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\tx\b\t\u0001\n\u0001\n\u0004\n|\b\n\u000b\n\f"+
		"\n}\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u0085"+
		"\b\u000b\u000b\u000b\f\u000b\u0086\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u008d\b\u000b\u000b\u000b\f\u000b\u008e\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u009d\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00a5\b\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ad\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0000\u00b5\u0000 \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000"+
		"\bK\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fY\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000"+
		"\u0012w\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0093"+
		"\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u009c"+
		"\u0001\u0000\u0000\u0000\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a1"+
		"\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000!#\u0003\u0004\u0002"+
		"\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001"+
		"\u0000\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0005\u0005\u0000\u0000"+
		")0\u0005\u001d\u0000\u0000*+\u0005\u001a\u0000\u0000+,\u0005\u001d\u0000"+
		"\u0000,-\u0005\u001e\u0000\u0000-/\u0005\u001d\u0000\u0000.*\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000034\u0005\u0016\u0000\u000045\u0005\u0005\u0000\u00005D\u0005\u001d"+
		"\u0000\u000067\u0005\u001b\u0000\u00007:\u0005\u001a\u0000\u00008;\u0003"+
		"\u0006\u0003\u00009;\u0003\b\u0004\u0000:8\u0001\u0000\u0000\u0000:9\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;?\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0006\u0000\u0000=>\u0005\u001b\u0000\u0000>@\u0005\u0007\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AC\u0005\u001d\u0000\u0000B6\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\u0005\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\b\u0000"+
		"\u0000HI\u0005\t\u0000\u0000IJ\u0005\u0003\u0000\u0000J\u0007\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0003\u001e\u000f\u0000M\t\u0001"+
		"\u0000\u0000\u0000NO\u0005\n\u0000\u0000OQ\u0005\u0005\u0000\u0000PR\u0003"+
		"\f\u0006\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SU\u0005\u001d\u0000\u0000TV\u0003\u0010\b\u0000UT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u000b\u0001\u0000\u0000\u0000Y[\u0005\u000b"+
		"\u0000\u0000Z\\\u0003\u000e\u0007\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\r\u0001\u0000\u0000\u0000_`\u0005\f\u0000\u0000`a\u0005\r\u0000\u0000"+
		"ai\u0003\u001e\u000f\u0000bc\u0005\f\u0000\u0000cd\u0005\u000e\u0000\u0000"+
		"di\u0003\u001a\r\u0000ef\u0005\f\u0000\u0000fg\u0005\u000f\u0000\u0000"+
		"gi\u0003\u001a\r\u0000h_\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000"+
		"he\u0001\u0000\u0000\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005\u001a"+
		"\u0000\u0000km\u0005\u001d\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0003\u0012\t\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u001d\u0000"+
		"\u0000t\u0011\u0001\u0000\u0000\u0000ux\u0003\u0014\n\u0000vx\u0003\u0016"+
		"\u000b\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0013"+
		"\u0001\u0000\u0000\u0000y{\u0005\u0011\u0000\u0000z|\u0003\u001a\r\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0003\u0018\f\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\u0017\u0000\u0000\u0083\u0085\u0005\u001b\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u0094"+
		"\u0003\u001e\u000f\u0000\u008a\u008c\u0005\u0017\u0000\u0000\u008b\u008d"+
		"\u0005\u001b\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0018\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0094"+
		"\u0003\u001c\u000e\u0000\u0093\u0082\u0001\u0000\u0000\u0000\u0093\u008a"+
		"\u0001\u0000\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0013\u0000\u0000\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u0098"+
		"\u0005\u0015\u0000\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009d"+
		"\u0003\u001e\u000f\u0000\u009a\u009d\u0005\u001b\u0000\u0000\u009b\u009d"+
		"\u0005\u001e\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u001b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0019\u0000\u0000\u009f\u00a0"+
		"\u0003\u001e\u000f\u0000\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a6"+
		"\u0005\u001a\u0000\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a5"+
		"\u0005\u001a\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u00ab"+
		"\u0005\u001b\u0000\u0000\u00ab\u00ad\u0005\u0002\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u001f"+
		"\u0001\u0000\u0000\u0000\u0014\"0:?DQW]hlqw}\u0080\u0086\u008e\u0093\u009c"+
		"\u00a6\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}