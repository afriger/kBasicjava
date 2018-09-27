// Generated from C:/dev/__JavaProjects/kbas/src/main\kbas.g4 by ANTLR 4.7
package com.sasa;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kbasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, PERCENT=2, RETURN=3, PRINT=4, GOTO=5, GOSUB=6, IF=7, NEXT=8, 
		THEN=9, REM=10, CHR=11, MID=12, LEFT=13, RIGHT=14, STR=15, LPAREN=16, 
		RPAREN=17, PLUS=18, MINUS=19, TIMES=20, DIV=21, CLEAR=22, NEQ=23, GTE=24, 
		LTE=25, GT=26, LT=27, EQ=28, COMMA=29, LIST=30, RUN=31, END=32, LET=33, 
		FOR=34, TO=35, STEP=36, INPUT=37, SEMICOLON=38, DIM=39, SQR=40, COLON=41, 
		TEXT=42, HGR=43, HGR2=44, LEN=45, CALL=46, ASC=47, HPLOT=48, VPLOT=49, 
		PRNUMBER=50, INNUMBER=51, VTAB=52, HTAB=53, HOME=54, ON=55, PDL=56, PLOT=57, 
		PEEK=58, POKE=59, INTF=60, STOP=61, HIMEM=62, LOMEM=63, FLASH=64, INVERSE=65, 
		NORMAL=66, ONERR=67, SPC=68, FRE=69, POS=70, USR=71, TRACE=72, NOTRACE=73, 
		AND=74, OR=75, DATA=76, WAIT=77, READ=78, XDRAW=79, DRAW=80, AT=81, DEF=82, 
		FN=83, VAL=84, TAB=85, SPEED=86, ROT=87, SCALE=88, COLOR=89, HCOLOR=90, 
		HLIN=91, VLIN=92, SCRN=93, POP=94, SHLOAD=95, SIN=96, COS=97, TAN=98, 
		ATN=99, RND=100, SGN=101, EXP=102, LOG=103, ABS=104, STORE=105, RECALL=106, 
		GET=107, EXPONENT=108, AMPERSAND=109, GR=110, NOT=111, RESTORE=112, SAVE=113, 
		LOAD=114, QUESTION=115, INCLUDE=116, CLS=117, STATUS=118, COMMENT=119, 
		STRINGLITERAL=120, LETTERS=121, NUMBER=122, FLOAT=123, WS=124;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_amperoper = 2, RULE_linenumber = 3, 
		RULE_amprstmt = 4, RULE_statement = 5, RULE_vardecl = 6, RULE_printstmt1 = 7, 
		RULE_printlist = 8, RULE_getstmt = 9, RULE_letstmt = 10, RULE_variableassignment = 11, 
		RULE_ifstmt = 12, RULE_forstmt1 = 13, RULE_forstmt2 = 14, RULE_nextstmt = 15, 
		RULE_inputstmt = 16, RULE_readstmt = 17, RULE_dimstmt = 18, RULE_gotostmt = 19, 
		RULE_gosubstmt = 20, RULE_pokestmt = 21, RULE_callstmt = 22, RULE_hplotstmt = 23, 
		RULE_vplotstmt = 24, RULE_plotstmt = 25, RULE_ongotostmt = 26, RULE_ongosubstmt = 27, 
		RULE_vtabstmnt = 28, RULE_htabstmnt = 29, RULE_himemstmt = 30, RULE_lomemstmt = 31, 
		RULE_datastmt = 32, RULE_datum = 33, RULE_waitstmt = 34, RULE_xdrawstmt = 35, 
		RULE_drawstmt = 36, RULE_defstmt = 37, RULE_tabstmt = 38, RULE_speedstmt = 39, 
		RULE_rotstmt = 40, RULE_scalestmt = 41, RULE_colorstmt = 42, RULE_hcolorstmt = 43, 
		RULE_hlinstmt = 44, RULE_vlinstmt = 45, RULE_onerrstmt = 46, RULE_prstmt = 47, 
		RULE_instmt = 48, RULE_storestmt = 49, RULE_recallstmt = 50, RULE_liststmt = 51, 
		RULE_popstmt = 52, RULE_amptstmt = 53, RULE_includestmt = 54, RULE_endstmt = 55, 
		RULE_returnstmt = 56, RULE_restorestmt = 57, RULE_number = 58, RULE_stringer = 59, 
		RULE_func = 60, RULE_expression = 61, RULE_var = 62, RULE_varname = 63, 
		RULE_varsuffix = 64, RULE_varlist = 65, RULE_exprlist = 66, RULE_sqrfunc = 67, 
		RULE_chrfunc = 68, RULE_lenfunc = 69, RULE_ascfunc = 70, RULE_midfunc = 71, 
		RULE_pdlfunc = 72, RULE_peekfunc = 73, RULE_intfunc = 74, RULE_spcfunc = 75, 
		RULE_frefunc = 76, RULE_posfunc = 77, RULE_usrfunc = 78, RULE_leftfunc = 79, 
		RULE_rightfunc = 80, RULE_strfunc = 81, RULE_fnfunc = 82, RULE_valfunc = 83, 
		RULE_scrnfunc = 84, RULE_sinfunc = 85, RULE_cosfunc = 86, RULE_tanfunc = 87, 
		RULE_atnfunc = 88, RULE_rndfunc = 89, RULE_sgnfunc = 90, RULE_expfunc = 91, 
		RULE_logfunc = 92, RULE_absfunc = 93, RULE_tabfunc = 94;
	public static final String[] ruleNames = {
		"prog", "line", "amperoper", "linenumber", "amprstmt", "statement", "vardecl", 
		"printstmt1", "printlist", "getstmt", "letstmt", "variableassignment", 
		"ifstmt", "forstmt1", "forstmt2", "nextstmt", "inputstmt", "readstmt", 
		"dimstmt", "gotostmt", "gosubstmt", "pokestmt", "callstmt", "hplotstmt", 
		"vplotstmt", "plotstmt", "ongotostmt", "ongosubstmt", "vtabstmnt", "htabstmnt", 
		"himemstmt", "lomemstmt", "datastmt", "datum", "waitstmt", "xdrawstmt", 
		"drawstmt", "defstmt", "tabstmt", "speedstmt", "rotstmt", "scalestmt", 
		"colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", "onerrstmt", "prstmt", 
		"instmt", "storestmt", "recallstmt", "liststmt", "popstmt", "amptstmt", 
		"includestmt", "endstmt", "returnstmt", "restorestmt", "number", "stringer", 
		"func", "expression", "var", "varname", "varsuffix", "varlist", "exprlist", 
		"sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", "pdlfunc", "peekfunc", 
		"intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", "leftfunc", "rightfunc", 
		"strfunc", "fnfunc", "valfunc", "scrnfunc", "sinfunc", "cosfunc", "tanfunc", 
		"atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", "absfunc", "tabfunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'%'", null, null, null, null, null, null, null, null, "'CHR$'", 
		"'MID$'", "'LEFT$'", "'RIGHT$'", "'STR$'", "'('", "')'", "'+'", "'-'", 
		"'*'", "'/'", null, "'<>'", "'>='", "'<='", "'>'", "'<'", "'='", "','", 
		null, null, null, null, null, null, null, null, "';'", null, null, "':'", 
		null, null, null, null, null, null, null, null, "'PR#'", "'IN#'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'^'", "'&'", null, null, null, 
		null, null, "'?'", null, null, "'S'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOLLAR", "PERCENT", "RETURN", "PRINT", "GOTO", "GOSUB", "IF", "NEXT", 
		"THEN", "REM", "CHR", "MID", "LEFT", "RIGHT", "STR", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "TIMES", "DIV", "CLEAR", "NEQ", "GTE", "LTE", "GT", "LT", 
		"EQ", "COMMA", "LIST", "RUN", "END", "LET", "FOR", "TO", "STEP", "INPUT", 
		"SEMICOLON", "DIM", "SQR", "COLON", "TEXT", "HGR", "HGR2", "LEN", "CALL", 
		"ASC", "HPLOT", "VPLOT", "PRNUMBER", "INNUMBER", "VTAB", "HTAB", "HOME", 
		"ON", "PDL", "PLOT", "PEEK", "POKE", "INTF", "STOP", "HIMEM", "LOMEM", 
		"FLASH", "INVERSE", "NORMAL", "ONERR", "SPC", "FRE", "POS", "USR", "TRACE", 
		"NOTRACE", "AND", "OR", "DATA", "WAIT", "READ", "XDRAW", "DRAW", "AT", 
		"DEF", "FN", "VAL", "TAB", "SPEED", "ROT", "SCALE", "COLOR", "HCOLOR", 
		"HLIN", "VLIN", "SCRN", "POP", "SHLOAD", "SIN", "COS", "TAN", "ATN", "RND", 
		"SGN", "EXP", "LOG", "ABS", "STORE", "RECALL", "GET", "EXPONENT", "AMPERSAND", 
		"GR", "NOT", "RESTORE", "SAVE", "LOAD", "QUESTION", "INCLUDE", "CLS", 
		"STATUS", "COMMENT", "STRINGLITERAL", "LETTERS", "NUMBER", "FLOAT", "WS"
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
	public String getGrammarFileName() { return "kbas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kbasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(kbasParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				line();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << GOTO) | (1L << GOSUB) | (1L << IF) | (1L << NEXT) | (1L << REM) | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << LET) | (1L << FOR) | (1L << INPUT) | (1L << DIM) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << CALL) | (1L << HPLOT) | (1L << VPLOT) | (1L << PRNUMBER) | (1L << INNUMBER) | (1L << VTAB) | (1L << HTAB) | (1L << HOME) | (1L << ON) | (1L << PLOT) | (1L << POKE) | (1L << STOP) | (1L << HIMEM) | (1L << LOMEM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FLASH - 64)) | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (ONERR - 64)) | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (DATA - 64)) | (1L << (WAIT - 64)) | (1L << (READ - 64)) | (1L << (XDRAW - 64)) | (1L << (DRAW - 64)) | (1L << (DEF - 64)) | (1L << (TAB - 64)) | (1L << (SPEED - 64)) | (1L << (ROT - 64)) | (1L << (SCALE - 64)) | (1L << (COLOR - 64)) | (1L << (HCOLOR - 64)) | (1L << (HLIN - 64)) | (1L << (VLIN - 64)) | (1L << (POP - 64)) | (1L << (SHLOAD - 64)) | (1L << (STORE - 64)) | (1L << (RECALL - 64)) | (1L << (GET - 64)) | (1L << (AMPERSAND - 64)) | (1L << (GR - 64)) | (1L << (RESTORE - 64)) | (1L << (SAVE - 64)) | (1L << (LOAD - 64)) | (1L << (QUESTION - 64)) | (1L << (INCLUDE - 64)) | (1L << (CLS - 64)) | (1L << (STATUS - 64)) | (1L << (COMMENT - 64)) | (1L << (LETTERS - 64)) | (1L << (NUMBER - 64)))) != 0) );
			setState(195);
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

	public static class LineContext extends ParserRuleContext {
		public LinenumberContext linenumber() {
			return getRuleContext(LinenumberContext.class,0);
		}
		public TerminalNode STATUS() { return getToken(kbasParser.STATUS, 0); }
		public TerminalNode COMMENT() { return getToken(kbasParser.COMMENT, 0); }
		public TerminalNode REM() { return getToken(kbasParser.REM, 0); }
		public List<AmprstmtContext> amprstmt() {
			return getRuleContexts(AmprstmtContext.class);
		}
		public AmprstmtContext amprstmt(int i) {
			return getRuleContext(AmprstmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(197);
				linenumber();
				}
				break;
			case STATUS:
				{
				setState(198);
				match(STATUS);
				}
				break;
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case IF:
			case NEXT:
			case REM:
			case CLEAR:
			case LIST:
			case RUN:
			case END:
			case LET:
			case FOR:
			case INPUT:
			case DIM:
			case TEXT:
			case HGR:
			case HGR2:
			case CALL:
			case HPLOT:
			case VPLOT:
			case PRNUMBER:
			case INNUMBER:
			case VTAB:
			case HTAB:
			case HOME:
			case ON:
			case PLOT:
			case POKE:
			case STOP:
			case HIMEM:
			case LOMEM:
			case FLASH:
			case INVERSE:
			case NORMAL:
			case ONERR:
			case TRACE:
			case NOTRACE:
			case DATA:
			case WAIT:
			case READ:
			case XDRAW:
			case DRAW:
			case DEF:
			case TAB:
			case SPEED:
			case ROT:
			case SCALE:
			case COLOR:
			case HCOLOR:
			case HLIN:
			case VLIN:
			case POP:
			case SHLOAD:
			case STORE:
			case RECALL:
			case GET:
			case AMPERSAND:
			case GR:
			case RESTORE:
			case SAVE:
			case LOAD:
			case QUESTION:
			case INCLUDE:
			case CLS:
			case COMMENT:
			case LETTERS:
				break;
			default:
				break;
			}
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(201);
				amprstmt();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(203);
						amprstmt();
						}
						break;
					}
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(211);
				_la = _input.LA(1);
				if ( !(_la==REM || _la==COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class AmperoperContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(kbasParser.AMPERSAND, 0); }
		public AmperoperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amperoper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAmperoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAmperoper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAmperoper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmperoperContext amperoper() throws RecognitionException {
		AmperoperContext _localctx = new AmperoperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_amperoper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(AMPERSAND);
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

	public static class LinenumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(kbasParser.NUMBER, 0); }
		public LinenumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linenumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLinenumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLinenumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLinenumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinenumberContext linenumber() throws RecognitionException {
		LinenumberContext _localctx = new LinenumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linenumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NUMBER);
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

	public static class AmprstmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AmperoperContext amperoper() {
			return getRuleContext(AmperoperContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(kbasParser.COMMENT, 0); }
		public TerminalNode REM() { return getToken(kbasParser.REM, 0); }
		public AmprstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amprstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAmprstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAmprstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAmprstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmprstmtContext amprstmt() throws RecognitionException {
		AmprstmtContext _localctx = new AmprstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_amprstmt);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case IF:
			case NEXT:
			case CLEAR:
			case LIST:
			case RUN:
			case END:
			case LET:
			case FOR:
			case INPUT:
			case DIM:
			case TEXT:
			case HGR:
			case HGR2:
			case CALL:
			case HPLOT:
			case VPLOT:
			case PRNUMBER:
			case INNUMBER:
			case VTAB:
			case HTAB:
			case HOME:
			case ON:
			case PLOT:
			case POKE:
			case STOP:
			case HIMEM:
			case LOMEM:
			case FLASH:
			case INVERSE:
			case NORMAL:
			case ONERR:
			case TRACE:
			case NOTRACE:
			case DATA:
			case WAIT:
			case READ:
			case XDRAW:
			case DRAW:
			case DEF:
			case TAB:
			case SPEED:
			case ROT:
			case SCALE:
			case COLOR:
			case HCOLOR:
			case HLIN:
			case VLIN:
			case POP:
			case SHLOAD:
			case STORE:
			case RECALL:
			case GET:
			case AMPERSAND:
			case GR:
			case RESTORE:
			case SAVE:
			case LOAD:
			case QUESTION:
			case INCLUDE:
			case CLS:
			case LETTERS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(218);
					amperoper();
					}
					break;
				}
				setState(221);
				statement();
				}
				}
				break;
			case REM:
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==REM || _la==COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode CLS() { return getToken(kbasParser.CLS, 0); }
		public TerminalNode LOAD() { return getToken(kbasParser.LOAD, 0); }
		public TerminalNode SAVE() { return getToken(kbasParser.SAVE, 0); }
		public TerminalNode TRACE() { return getToken(kbasParser.TRACE, 0); }
		public TerminalNode NOTRACE() { return getToken(kbasParser.NOTRACE, 0); }
		public TerminalNode FLASH() { return getToken(kbasParser.FLASH, 0); }
		public TerminalNode INVERSE() { return getToken(kbasParser.INVERSE, 0); }
		public TerminalNode GR() { return getToken(kbasParser.GR, 0); }
		public TerminalNode NORMAL() { return getToken(kbasParser.NORMAL, 0); }
		public TerminalNode SHLOAD() { return getToken(kbasParser.SHLOAD, 0); }
		public TerminalNode CLEAR() { return getToken(kbasParser.CLEAR, 0); }
		public TerminalNode RUN() { return getToken(kbasParser.RUN, 0); }
		public TerminalNode STOP() { return getToken(kbasParser.STOP, 0); }
		public TerminalNode TEXT() { return getToken(kbasParser.TEXT, 0); }
		public TerminalNode HOME() { return getToken(kbasParser.HOME, 0); }
		public TerminalNode HGR() { return getToken(kbasParser.HGR, 0); }
		public TerminalNode HGR2() { return getToken(kbasParser.HGR2, 0); }
		public EndstmtContext endstmt() {
			return getRuleContext(EndstmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public RestorestmtContext restorestmt() {
			return getRuleContext(RestorestmtContext.class,0);
		}
		public AmptstmtContext amptstmt() {
			return getRuleContext(AmptstmtContext.class,0);
		}
		public PopstmtContext popstmt() {
			return getRuleContext(PopstmtContext.class,0);
		}
		public ListstmtContext liststmt() {
			return getRuleContext(ListstmtContext.class,0);
		}
		public StorestmtContext storestmt() {
			return getRuleContext(StorestmtContext.class,0);
		}
		public GetstmtContext getstmt() {
			return getRuleContext(GetstmtContext.class,0);
		}
		public RecallstmtContext recallstmt() {
			return getRuleContext(RecallstmtContext.class,0);
		}
		public NextstmtContext nextstmt() {
			return getRuleContext(NextstmtContext.class,0);
		}
		public InstmtContext instmt() {
			return getRuleContext(InstmtContext.class,0);
		}
		public PrstmtContext prstmt() {
			return getRuleContext(PrstmtContext.class,0);
		}
		public OnerrstmtContext onerrstmt() {
			return getRuleContext(OnerrstmtContext.class,0);
		}
		public HlinstmtContext hlinstmt() {
			return getRuleContext(HlinstmtContext.class,0);
		}
		public VlinstmtContext vlinstmt() {
			return getRuleContext(VlinstmtContext.class,0);
		}
		public ColorstmtContext colorstmt() {
			return getRuleContext(ColorstmtContext.class,0);
		}
		public SpeedstmtContext speedstmt() {
			return getRuleContext(SpeedstmtContext.class,0);
		}
		public ScalestmtContext scalestmt() {
			return getRuleContext(ScalestmtContext.class,0);
		}
		public RotstmtContext rotstmt() {
			return getRuleContext(RotstmtContext.class,0);
		}
		public HcolorstmtContext hcolorstmt() {
			return getRuleContext(HcolorstmtContext.class,0);
		}
		public HimemstmtContext himemstmt() {
			return getRuleContext(HimemstmtContext.class,0);
		}
		public LomemstmtContext lomemstmt() {
			return getRuleContext(LomemstmtContext.class,0);
		}
		public Printstmt1Context printstmt1() {
			return getRuleContext(Printstmt1Context.class,0);
		}
		public PokestmtContext pokestmt() {
			return getRuleContext(PokestmtContext.class,0);
		}
		public PlotstmtContext plotstmt() {
			return getRuleContext(PlotstmtContext.class,0);
		}
		public OngotostmtContext ongotostmt() {
			return getRuleContext(OngotostmtContext.class,0);
		}
		public OngosubstmtContext ongosubstmt() {
			return getRuleContext(OngosubstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public Forstmt1Context forstmt1() {
			return getRuleContext(Forstmt1Context.class,0);
		}
		public Forstmt2Context forstmt2() {
			return getRuleContext(Forstmt2Context.class,0);
		}
		public InputstmtContext inputstmt() {
			return getRuleContext(InputstmtContext.class,0);
		}
		public TabstmtContext tabstmt() {
			return getRuleContext(TabstmtContext.class,0);
		}
		public DimstmtContext dimstmt() {
			return getRuleContext(DimstmtContext.class,0);
		}
		public GotostmtContext gotostmt() {
			return getRuleContext(GotostmtContext.class,0);
		}
		public GosubstmtContext gosubstmt() {
			return getRuleContext(GosubstmtContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public ReadstmtContext readstmt() {
			return getRuleContext(ReadstmtContext.class,0);
		}
		public HplotstmtContext hplotstmt() {
			return getRuleContext(HplotstmtContext.class,0);
		}
		public VplotstmtContext vplotstmt() {
			return getRuleContext(VplotstmtContext.class,0);
		}
		public VtabstmntContext vtabstmnt() {
			return getRuleContext(VtabstmntContext.class,0);
		}
		public HtabstmntContext htabstmnt() {
			return getRuleContext(HtabstmntContext.class,0);
		}
		public WaitstmtContext waitstmt() {
			return getRuleContext(WaitstmtContext.class,0);
		}
		public DatastmtContext datastmt() {
			return getRuleContext(DatastmtContext.class,0);
		}
		public XdrawstmtContext xdrawstmt() {
			return getRuleContext(XdrawstmtContext.class,0);
		}
		public DrawstmtContext drawstmt() {
			return getRuleContext(DrawstmtContext.class,0);
		}
		public DefstmtContext defstmt() {
			return getRuleContext(DefstmtContext.class,0);
		}
		public LetstmtContext letstmt() {
			return getRuleContext(LetstmtContext.class,0);
		}
		public IncludestmtContext includestmt() {
			return getRuleContext(IncludestmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLEAR) | (1L << RUN) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << HOME) | (1L << STOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FLASH - 64)) | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (SHLOAD - 64)) | (1L << (GR - 64)) | (1L << (SAVE - 64)) | (1L << (LOAD - 64)) | (1L << (CLS - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				endstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				restorestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				amptstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				popstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				liststmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				storestmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				getstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(234);
				recallstmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(235);
				nextstmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(236);
				instmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(237);
				prstmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(238);
				onerrstmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(239);
				hlinstmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(240);
				vlinstmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(241);
				colorstmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(242);
				speedstmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(243);
				scalestmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(244);
				rotstmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(245);
				hcolorstmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(246);
				himemstmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(247);
				lomemstmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(248);
				printstmt1();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(249);
				pokestmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(250);
				plotstmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(251);
				ongotostmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(252);
				ongosubstmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(253);
				ifstmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(254);
				forstmt1();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(255);
				forstmt2();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(256);
				inputstmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(257);
				tabstmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(258);
				dimstmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(259);
				gotostmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(260);
				gosubstmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(261);
				callstmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(262);
				readstmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(263);
				hplotstmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(264);
				vplotstmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(265);
				vtabstmnt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(266);
				htabstmnt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(267);
				waitstmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(268);
				datastmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(269);
				xdrawstmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(270);
				drawstmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(271);
				defstmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(272);
				letstmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(273);
				includestmt();
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

	public static class VardeclContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(kbasParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(kbasParser.LPAREN, i);
		}
		public List<ExprlistContext> exprlist() {
			return getRuleContexts(ExprlistContext.class);
		}
		public ExprlistContext exprlist(int i) {
			return getRuleContext(ExprlistContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(kbasParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(kbasParser.RPAREN, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			var();
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(LPAREN);
					setState(278);
					exprlist();
					setState(279);
					match(RPAREN);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Printstmt1Context extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(kbasParser.PRINT, 0); }
		public TerminalNode QUESTION() { return getToken(kbasParser.QUESTION, 0); }
		public PrintlistContext printlist() {
			return getRuleContext(PrintlistContext.class,0);
		}
		public Printstmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPrintstmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPrintstmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPrintstmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printstmt1Context printstmt1() throws RecognitionException {
		Printstmt1Context _localctx = new Printstmt1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_printstmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==QUESTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(287);
				printlist();
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

	public static class PrintlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(kbasParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(kbasParser.SEMICOLON, i);
		}
		public PrintlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPrintlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPrintlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPrintlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlistContext printlist() throws RecognitionException {
		PrintlistContext _localctx = new PrintlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expression(0);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(292);
						expression(0);
						}
						break;
					}
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class GetstmtContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(kbasParser.GET, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public GetstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterGetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitGetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitGetstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetstmtContext getstmt() throws RecognitionException {
		GetstmtContext _localctx = new GetstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_getstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(GET);
			setState(301);
			exprlist();
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

	public static class LetstmtContext extends ParserRuleContext {
		public VariableassignmentContext variableassignment() {
			return getRuleContext(VariableassignmentContext.class,0);
		}
		public TerminalNode LET() { return getToken(kbasParser.LET, 0); }
		public LetstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLetstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetstmtContext letstmt() throws RecognitionException {
		LetstmtContext _localctx = new LetstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(303);
				match(LET);
				}
			}

			setState(306);
			variableassignment();
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

	public static class VariableassignmentContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public VariableassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVariableassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVariableassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableassignmentContext variableassignment() throws RecognitionException {
		VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			vardecl();
			setState(309);
			match(EQ);
			setState(310);
			exprlist();
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(kbasParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LinenumberContext linenumber() {
			return getRuleContext(LinenumberContext.class,0);
		}
		public TerminalNode THEN() { return getToken(kbasParser.THEN, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IF);
			setState(313);
			expression(0);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(314);
				match(THEN);
				}
			}

			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case IF:
			case NEXT:
			case CLEAR:
			case LIST:
			case RUN:
			case END:
			case LET:
			case FOR:
			case INPUT:
			case DIM:
			case TEXT:
			case HGR:
			case HGR2:
			case CALL:
			case HPLOT:
			case VPLOT:
			case PRNUMBER:
			case INNUMBER:
			case VTAB:
			case HTAB:
			case HOME:
			case ON:
			case PLOT:
			case POKE:
			case STOP:
			case HIMEM:
			case LOMEM:
			case FLASH:
			case INVERSE:
			case NORMAL:
			case ONERR:
			case TRACE:
			case NOTRACE:
			case DATA:
			case WAIT:
			case READ:
			case XDRAW:
			case DRAW:
			case DEF:
			case TAB:
			case SPEED:
			case ROT:
			case SCALE:
			case COLOR:
			case HCOLOR:
			case HLIN:
			case VLIN:
			case POP:
			case SHLOAD:
			case STORE:
			case RECALL:
			case GET:
			case AMPERSAND:
			case GR:
			case RESTORE:
			case SAVE:
			case LOAD:
			case QUESTION:
			case INCLUDE:
			case CLS:
			case LETTERS:
				{
				setState(317);
				statement();
				}
				break;
			case NUMBER:
				{
				setState(318);
				linenumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Forstmt1Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(kbasParser.FOR, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(kbasParser.TO, 0); }
		public TerminalNode STEP() { return getToken(kbasParser.STEP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(kbasParser.NEXT, 0); }
		public Forstmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterForstmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitForstmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitForstmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forstmt1Context forstmt1() throws RecognitionException {
		Forstmt1Context _localctx = new Forstmt1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_forstmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(FOR);
			setState(322);
			vardecl();
			setState(323);
			match(EQ);
			setState(324);
			expression(0);
			setState(325);
			match(TO);
			setState(326);
			expression(0);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(327);
				match(STEP);
				setState(328);
				expression(0);
				}
			}

			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(331);
				statement();
				setState(332);
				match(NEXT);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(333);
					vardecl();
					}
					break;
				}
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

	public static class Forstmt2Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(kbasParser.FOR, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(kbasParser.TO, 0); }
		public TerminalNode STEP() { return getToken(kbasParser.STEP, 0); }
		public Forstmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterForstmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitForstmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitForstmt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forstmt2Context forstmt2() throws RecognitionException {
		Forstmt2Context _localctx = new Forstmt2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstmt2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOR);
			setState(339);
			vardecl();
			setState(340);
			match(EQ);
			setState(341);
			expression(0);
			setState(342);
			match(TO);
			setState(343);
			expression(0);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(344);
				match(STEP);
				setState(345);
				expression(0);
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

	public static class NextstmtContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(kbasParser.NEXT, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public NextstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterNextstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitNextstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitNextstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextstmtContext nextstmt() throws RecognitionException {
		NextstmtContext _localctx = new NextstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nextstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(NEXT);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(349);
				vardecl();
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(350);
						match(COMMA);
						setState(351);
						vardecl();
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
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

	public static class InputstmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(kbasParser.INPUT, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public StringerContext stringer() {
			return getRuleContext(StringerContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(kbasParser.SEMICOLON, 0); }
		public InputstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterInputstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitInputstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitInputstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputstmtContext inputstmt() throws RecognitionException {
		InputstmtContext _localctx = new InputstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inputstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(INPUT);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL) {
				{
				setState(360);
				stringer();
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(365);
			varlist();
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

	public static class ReadstmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(kbasParser.READ, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ReadstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterReadstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitReadstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitReadstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstmtContext readstmt() throws RecognitionException {
		ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(READ);
			setState(368);
			varlist();
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

	public static class DimstmtContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(kbasParser.DIM, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DimstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterDimstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitDimstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitDimstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimstmtContext dimstmt() throws RecognitionException {
		DimstmtContext _localctx = new DimstmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(DIM);
			setState(371);
			varlist();
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

	public static class GotostmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(kbasParser.GOTO, 0); }
		public LinenumberContext linenumber() {
			return getRuleContext(LinenumberContext.class,0);
		}
		public GotostmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotostmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterGotostmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitGotostmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitGotostmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotostmtContext gotostmt() throws RecognitionException {
		GotostmtContext _localctx = new GotostmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gotostmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(GOTO);
			setState(374);
			linenumber();
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

	public static class GosubstmtContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(kbasParser.GOSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GosubstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gosubstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterGosubstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitGosubstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitGosubstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GosubstmtContext gosubstmt() throws RecognitionException {
		GosubstmtContext _localctx = new GosubstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gosubstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(GOSUB);
			setState(377);
			expression(0);
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

	public static class PokestmtContext extends ParserRuleContext {
		public TerminalNode POKE() { return getToken(kbasParser.POKE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public PokestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPokestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPokestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPokestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PokestmtContext pokestmt() throws RecognitionException {
		PokestmtContext _localctx = new PokestmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pokestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(POKE);
			setState(380);
			expression(0);
			setState(381);
			match(COMMA);
			setState(382);
			expression(0);
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

	public static class CallstmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(kbasParser.CALL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitCallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(CALL);
			setState(385);
			exprlist();
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

	public static class HplotstmtContext extends ParserRuleContext {
		public TerminalNode HPLOT() { return getToken(kbasParser.HPLOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public List<TerminalNode> TO() { return getTokens(kbasParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(kbasParser.TO, i);
		}
		public HplotstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hplotstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterHplotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitHplotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitHplotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HplotstmtContext hplotstmt() throws RecognitionException {
		HplotstmtContext _localctx = new HplotstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(HPLOT);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(388);
				expression(0);
				setState(389);
				match(COMMA);
				setState(390);
				expression(0);
				}
				break;
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(394);
				match(TO);
				setState(395);
				expression(0);
				setState(396);
				match(COMMA);
				setState(397);
				expression(0);
				}
				}
				setState(403);
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

	public static class VplotstmtContext extends ParserRuleContext {
		public TerminalNode VPLOT() { return getToken(kbasParser.VPLOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public List<TerminalNode> TO() { return getTokens(kbasParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(kbasParser.TO, i);
		}
		public VplotstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vplotstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVplotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVplotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVplotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VplotstmtContext vplotstmt() throws RecognitionException {
		VplotstmtContext _localctx = new VplotstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(VPLOT);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(405);
				expression(0);
				setState(406);
				match(COMMA);
				setState(407);
				expression(0);
				}
				break;
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(411);
				match(TO);
				setState(412);
				expression(0);
				setState(413);
				match(COMMA);
				setState(414);
				expression(0);
				}
				}
				setState(420);
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

	public static class PlotstmtContext extends ParserRuleContext {
		public TerminalNode PLOT() { return getToken(kbasParser.PLOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public PlotstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPlotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPlotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPlotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlotstmtContext plotstmt() throws RecognitionException {
		PlotstmtContext _localctx = new PlotstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_plotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(PLOT);
			setState(422);
			expression(0);
			setState(423);
			match(COMMA);
			setState(424);
			expression(0);
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

	public static class OngotostmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(kbasParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(kbasParser.GOTO, 0); }
		public List<LinenumberContext> linenumber() {
			return getRuleContexts(LinenumberContext.class);
		}
		public LinenumberContext linenumber(int i) {
			return getRuleContext(LinenumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public OngotostmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ongotostmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterOngotostmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitOngotostmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitOngotostmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OngotostmtContext ongotostmt() throws RecognitionException {
		OngotostmtContext _localctx = new OngotostmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ongotostmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ON);
			setState(427);
			expression(0);
			setState(428);
			match(GOTO);
			setState(429);
			linenumber();
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					linenumber();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class OngosubstmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(kbasParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GOSUB() { return getToken(kbasParser.GOSUB, 0); }
		public List<LinenumberContext> linenumber() {
			return getRuleContexts(LinenumberContext.class);
		}
		public LinenumberContext linenumber(int i) {
			return getRuleContext(LinenumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public OngosubstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ongosubstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterOngosubstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitOngosubstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitOngosubstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OngosubstmtContext ongosubstmt() throws RecognitionException {
		OngosubstmtContext _localctx = new OngosubstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ongosubstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ON);
			setState(438);
			expression(0);
			setState(439);
			match(GOSUB);
			setState(440);
			linenumber();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(COMMA);
					setState(442);
					linenumber();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class VtabstmntContext extends ParserRuleContext {
		public TerminalNode VTAB() { return getToken(kbasParser.VTAB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VtabstmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtabstmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVtabstmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVtabstmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVtabstmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtabstmntContext vtabstmnt() throws RecognitionException {
		VtabstmntContext _localctx = new VtabstmntContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vtabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(VTAB);
			setState(449);
			expression(0);
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

	public static class HtabstmntContext extends ParserRuleContext {
		public TerminalNode HTAB() { return getToken(kbasParser.HTAB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HtabstmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htabstmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterHtabstmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitHtabstmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitHtabstmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtabstmntContext htabstmnt() throws RecognitionException {
		HtabstmntContext _localctx = new HtabstmntContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(HTAB);
			setState(452);
			expression(0);
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

	public static class HimemstmtContext extends ParserRuleContext {
		public TerminalNode HIMEM() { return getToken(kbasParser.HIMEM, 0); }
		public TerminalNode COLON() { return getToken(kbasParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HimemstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_himemstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterHimemstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitHimemstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitHimemstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HimemstmtContext himemstmt() throws RecognitionException {
		HimemstmtContext _localctx = new HimemstmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_himemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(HIMEM);
			setState(455);
			match(COLON);
			setState(456);
			expression(0);
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

	public static class LomemstmtContext extends ParserRuleContext {
		public TerminalNode LOMEM() { return getToken(kbasParser.LOMEM, 0); }
		public TerminalNode COLON() { return getToken(kbasParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LomemstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lomemstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLomemstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLomemstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLomemstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LomemstmtContext lomemstmt() throws RecognitionException {
		LomemstmtContext _localctx = new LomemstmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lomemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LOMEM);
			setState(459);
			match(COLON);
			setState(460);
			expression(0);
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

	public static class DatastmtContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(kbasParser.DATA, 0); }
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public DatastmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datastmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterDatastmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitDatastmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitDatastmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatastmtContext datastmt() throws RecognitionException {
		DatastmtContext _localctx = new DatastmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_datastmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(DATA);
			setState(463);
			datum();
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					match(COMMA);
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(465);
						datum();
						}
						break;
					}
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class DatumContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringerContext stringer() {
			return getRuleContext(StringerContext.class,0);
		}
		public DatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterDatum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitDatum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatumContext datum() throws RecognitionException {
		DatumContext _localctx = new DatumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_datum);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				number();
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				stringer();
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

	public static class WaitstmtContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(kbasParser.WAIT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public WaitstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterWaitstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitWaitstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitWaitstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitstmtContext waitstmt() throws RecognitionException {
		WaitstmtContext _localctx = new WaitstmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_waitstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(WAIT);
			setState(478);
			expression(0);
			setState(479);
			match(COMMA);
			setState(480);
			expression(0);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(481);
				match(COMMA);
				setState(482);
				expression(0);
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

	public static class XdrawstmtContext extends ParserRuleContext {
		public TerminalNode XDRAW() { return getToken(kbasParser.XDRAW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AT() { return getToken(kbasParser.AT, 0); }
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public XdrawstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdrawstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterXdrawstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitXdrawstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitXdrawstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdrawstmtContext xdrawstmt() throws RecognitionException {
		XdrawstmtContext _localctx = new XdrawstmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_xdrawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(XDRAW);
			setState(486);
			expression(0);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(487);
				match(AT);
				setState(488);
				expression(0);
				setState(489);
				match(COMMA);
				setState(490);
				expression(0);
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

	public static class DrawstmtContext extends ParserRuleContext {
		public TerminalNode DRAW() { return getToken(kbasParser.DRAW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AT() { return getToken(kbasParser.AT, 0); }
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public DrawstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterDrawstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitDrawstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitDrawstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawstmtContext drawstmt() throws RecognitionException {
		DrawstmtContext _localctx = new DrawstmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_drawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(DRAW);
			setState(495);
			expression(0);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(496);
				match(AT);
				setState(497);
				expression(0);
				setState(498);
				match(COMMA);
				setState(499);
				expression(0);
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

	public static class DefstmtContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(kbasParser.DEF, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FN() { return getToken(kbasParser.FN, 0); }
		public DefstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterDefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitDefstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitDefstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefstmtContext defstmt() throws RecognitionException {
		DefstmtContext _localctx = new DefstmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_defstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(DEF);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FN) {
				{
				setState(504);
				match(FN);
				}
			}

			setState(507);
			var();
			setState(508);
			match(LPAREN);
			setState(509);
			var();
			setState(510);
			match(RPAREN);
			setState(511);
			match(EQ);
			setState(512);
			expression(0);
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

	public static class TabstmtContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(kbasParser.TAB, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public TabstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterTabstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitTabstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitTabstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabstmtContext tabstmt() throws RecognitionException {
		TabstmtContext _localctx = new TabstmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tabstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(TAB);
			setState(515);
			match(LPAREN);
			setState(516);
			expression(0);
			setState(517);
			match(RPAREN);
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

	public static class SpeedstmtContext extends ParserRuleContext {
		public TerminalNode SPEED() { return getToken(kbasParser.SPEED, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpeedstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speedstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSpeedstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSpeedstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSpeedstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedstmtContext speedstmt() throws RecognitionException {
		SpeedstmtContext _localctx = new SpeedstmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_speedstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(SPEED);
			setState(520);
			match(EQ);
			setState(521);
			expression(0);
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

	public static class RotstmtContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(kbasParser.ROT, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RotstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotstmtContext rotstmt() throws RecognitionException {
		RotstmtContext _localctx = new RotstmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ROT);
			setState(524);
			match(EQ);
			setState(525);
			expression(0);
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

	public static class ScalestmtContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(kbasParser.SCALE, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScalestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterScalestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitScalestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitScalestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalestmtContext scalestmt() throws RecognitionException {
		ScalestmtContext _localctx = new ScalestmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_scalestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(SCALE);
			setState(528);
			match(EQ);
			setState(529);
			expression(0);
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

	public static class ColorstmtContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(kbasParser.COLOR, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColorstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterColorstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitColorstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitColorstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorstmtContext colorstmt() throws RecognitionException {
		ColorstmtContext _localctx = new ColorstmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_colorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(COLOR);
			setState(532);
			match(EQ);
			setState(533);
			expression(0);
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

	public static class HcolorstmtContext extends ParserRuleContext {
		public TerminalNode HCOLOR() { return getToken(kbasParser.HCOLOR, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HcolorstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hcolorstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterHcolorstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitHcolorstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitHcolorstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HcolorstmtContext hcolorstmt() throws RecognitionException {
		HcolorstmtContext _localctx = new HcolorstmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hcolorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(HCOLOR);
			setState(536);
			match(EQ);
			setState(537);
			expression(0);
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

	public static class HlinstmtContext extends ParserRuleContext {
		public TerminalNode HLIN() { return getToken(kbasParser.HLIN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode AT() { return getToken(kbasParser.AT, 0); }
		public HlinstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hlinstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterHlinstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitHlinstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitHlinstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HlinstmtContext hlinstmt() throws RecognitionException {
		HlinstmtContext _localctx = new HlinstmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_hlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(HLIN);
			setState(540);
			expression(0);
			setState(541);
			match(COMMA);
			setState(542);
			expression(0);
			setState(543);
			match(AT);
			setState(544);
			expression(0);
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

	public static class VlinstmtContext extends ParserRuleContext {
		public TerminalNode VLIN() { return getToken(kbasParser.VLIN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode AT() { return getToken(kbasParser.AT, 0); }
		public VlinstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlinstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVlinstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVlinstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVlinstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VlinstmtContext vlinstmt() throws RecognitionException {
		VlinstmtContext _localctx = new VlinstmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_vlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(VLIN);
			setState(547);
			expression(0);
			setState(548);
			match(COMMA);
			setState(549);
			expression(0);
			setState(550);
			match(AT);
			setState(551);
			expression(0);
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

	public static class OnerrstmtContext extends ParserRuleContext {
		public TerminalNode ONERR() { return getToken(kbasParser.ONERR, 0); }
		public TerminalNode GOTO() { return getToken(kbasParser.GOTO, 0); }
		public LinenumberContext linenumber() {
			return getRuleContext(LinenumberContext.class,0);
		}
		public OnerrstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onerrstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterOnerrstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitOnerrstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitOnerrstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnerrstmtContext onerrstmt() throws RecognitionException {
		OnerrstmtContext _localctx = new OnerrstmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_onerrstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(ONERR);
			setState(554);
			match(GOTO);
			setState(555);
			linenumber();
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

	public static class PrstmtContext extends ParserRuleContext {
		public TerminalNode PRNUMBER() { return getToken(kbasParser.PRNUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(kbasParser.NUMBER, 0); }
		public PrstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPrstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPrstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPrstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrstmtContext prstmt() throws RecognitionException {
		PrstmtContext _localctx = new PrstmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_prstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(PRNUMBER);
			setState(558);
			match(NUMBER);
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

	public static class InstmtContext extends ParserRuleContext {
		public TerminalNode INNUMBER() { return getToken(kbasParser.INNUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(kbasParser.NUMBER, 0); }
		public InstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterInstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitInstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitInstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstmtContext instmt() throws RecognitionException {
		InstmtContext _localctx = new InstmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_instmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(INNUMBER);
			setState(561);
			match(NUMBER);
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

	public static class StorestmtContext extends ParserRuleContext {
		public TerminalNode STORE() { return getToken(kbasParser.STORE, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public StorestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterStorestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitStorestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitStorestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorestmtContext storestmt() throws RecognitionException {
		StorestmtContext _localctx = new StorestmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_storestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(STORE);
			setState(564);
			vardecl();
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

	public static class RecallstmtContext extends ParserRuleContext {
		public TerminalNode RECALL() { return getToken(kbasParser.RECALL, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public RecallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recallstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRecallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRecallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRecallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecallstmtContext recallstmt() throws RecognitionException {
		RecallstmtContext _localctx = new RecallstmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recallstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(RECALL);
			setState(567);
			vardecl();
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

	public static class ListstmtContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(kbasParser.LIST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liststmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterListstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitListstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitListstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListstmtContext liststmt() throws RecognitionException {
		ListstmtContext _localctx = new ListstmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_liststmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LIST);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(570);
				expression(0);
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

	public static class PopstmtContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(kbasParser.POP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public PopstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPopstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPopstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPopstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopstmtContext popstmt() throws RecognitionException {
		PopstmtContext _localctx = new PopstmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_popstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(POP);
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(574);
				expression(0);
				setState(575);
				match(COMMA);
				setState(576);
				expression(0);
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

	public static class AmptstmtContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(kbasParser.AMPERSAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AmptstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amptstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAmptstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAmptstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAmptstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmptstmtContext amptstmt() throws RecognitionException {
		AmptstmtContext _localctx = new AmptstmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_amptstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(AMPERSAND);
			setState(581);
			expression(0);
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

	public static class IncludestmtContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(kbasParser.INCLUDE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncludestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterIncludestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitIncludestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitIncludestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludestmtContext includestmt() throws RecognitionException {
		IncludestmtContext _localctx = new IncludestmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_includestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(INCLUDE);
			setState(584);
			expression(0);
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

	public static class EndstmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(kbasParser.END, 0); }
		public EndstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterEndstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitEndstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitEndstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndstmtContext endstmt() throws RecognitionException {
		EndstmtContext _localctx = new EndstmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_endstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(kbasParser.RETURN, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(RETURN);
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

	public static class RestorestmtContext extends ParserRuleContext {
		public TerminalNode RESTORE() { return getToken(kbasParser.RESTORE, 0); }
		public RestorestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restorestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRestorestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRestorestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRestorestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestorestmtContext restorestmt() throws RecognitionException {
		RestorestmtContext _localctx = new RestorestmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_restorestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(RESTORE);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(kbasParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(kbasParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(592);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(595);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class StringerContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(kbasParser.STRINGLITERAL, 0); }
		public StringerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterStringer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitStringer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitStringer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringerContext stringer() throws RecognitionException {
		StringerContext _localctx = new StringerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_stringer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(STRINGLITERAL);
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

	public static class FuncContext extends ParserRuleContext {
		public StringerContext stringer() {
			return getRuleContext(StringerContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TabfuncContext tabfunc() {
			return getRuleContext(TabfuncContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ChrfuncContext chrfunc() {
			return getRuleContext(ChrfuncContext.class,0);
		}
		public SqrfuncContext sqrfunc() {
			return getRuleContext(SqrfuncContext.class,0);
		}
		public LenfuncContext lenfunc() {
			return getRuleContext(LenfuncContext.class,0);
		}
		public StrfuncContext strfunc() {
			return getRuleContext(StrfuncContext.class,0);
		}
		public AscfuncContext ascfunc() {
			return getRuleContext(AscfuncContext.class,0);
		}
		public ScrnfuncContext scrnfunc() {
			return getRuleContext(ScrnfuncContext.class,0);
		}
		public MidfuncContext midfunc() {
			return getRuleContext(MidfuncContext.class,0);
		}
		public PdlfuncContext pdlfunc() {
			return getRuleContext(PdlfuncContext.class,0);
		}
		public PeekfuncContext peekfunc() {
			return getRuleContext(PeekfuncContext.class,0);
		}
		public IntfuncContext intfunc() {
			return getRuleContext(IntfuncContext.class,0);
		}
		public SpcfuncContext spcfunc() {
			return getRuleContext(SpcfuncContext.class,0);
		}
		public FrefuncContext frefunc() {
			return getRuleContext(FrefuncContext.class,0);
		}
		public PosfuncContext posfunc() {
			return getRuleContext(PosfuncContext.class,0);
		}
		public UsrfuncContext usrfunc() {
			return getRuleContext(UsrfuncContext.class,0);
		}
		public LeftfuncContext leftfunc() {
			return getRuleContext(LeftfuncContext.class,0);
		}
		public ValfuncContext valfunc() {
			return getRuleContext(ValfuncContext.class,0);
		}
		public RightfuncContext rightfunc() {
			return getRuleContext(RightfuncContext.class,0);
		}
		public FnfuncContext fnfunc() {
			return getRuleContext(FnfuncContext.class,0);
		}
		public SinfuncContext sinfunc() {
			return getRuleContext(SinfuncContext.class,0);
		}
		public CosfuncContext cosfunc() {
			return getRuleContext(CosfuncContext.class,0);
		}
		public TanfuncContext tanfunc() {
			return getRuleContext(TanfuncContext.class,0);
		}
		public AtnfuncContext atnfunc() {
			return getRuleContext(AtnfuncContext.class,0);
		}
		public RndfuncContext rndfunc() {
			return getRuleContext(RndfuncContext.class,0);
		}
		public SgnfuncContext sgnfunc() {
			return getRuleContext(SgnfuncContext.class,0);
		}
		public ExpfuncContext expfunc() {
			return getRuleContext(ExpfuncContext.class,0);
		}
		public LogfuncContext logfunc() {
			return getRuleContext(LogfuncContext.class,0);
		}
		public AbsfuncContext absfunc() {
			return getRuleContext(AbsfuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_func);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				stringer();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				number();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				tabfunc();
				}
				break;
			case LETTERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				vardecl();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				chrfunc();
				}
				break;
			case SQR:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				sqrfunc();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				lenfunc();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				strfunc();
				}
				break;
			case ASC:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				ascfunc();
				}
				break;
			case SCRN:
				enterOuterAlt(_localctx, 10);
				{
				setState(608);
				scrnfunc();
				}
				break;
			case MID:
				enterOuterAlt(_localctx, 11);
				{
				setState(609);
				midfunc();
				}
				break;
			case PDL:
				enterOuterAlt(_localctx, 12);
				{
				setState(610);
				pdlfunc();
				}
				break;
			case PEEK:
				enterOuterAlt(_localctx, 13);
				{
				setState(611);
				peekfunc();
				}
				break;
			case INTF:
				enterOuterAlt(_localctx, 14);
				{
				setState(612);
				intfunc();
				}
				break;
			case SPC:
				enterOuterAlt(_localctx, 15);
				{
				setState(613);
				spcfunc();
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 16);
				{
				setState(614);
				frefunc();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(615);
				posfunc();
				}
				break;
			case USR:
				enterOuterAlt(_localctx, 18);
				{
				setState(616);
				usrfunc();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 19);
				{
				setState(617);
				leftfunc();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 20);
				{
				setState(618);
				valfunc();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 21);
				{
				setState(619);
				rightfunc();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 22);
				{
				setState(620);
				fnfunc();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 23);
				{
				setState(621);
				sinfunc();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 24);
				{
				setState(622);
				cosfunc();
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 25);
				{
				setState(623);
				tanfunc();
				}
				break;
			case ATN:
				enterOuterAlt(_localctx, 26);
				{
				setState(624);
				atnfunc();
				}
				break;
			case RND:
				enterOuterAlt(_localctx, 27);
				{
				setState(625);
				rndfunc();
				}
				break;
			case SGN:
				enterOuterAlt(_localctx, 28);
				{
				setState(626);
				sgnfunc();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 29);
				{
				setState(627);
				expfunc();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 30);
				{
				setState(628);
				logfunc();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 31);
				{
				setState(629);
				absfunc();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SignExpContext extends ExpressionContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NOT() { return getToken(kbasParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(kbasParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(kbasParser.MINUS, 0); }
		public SignExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(kbasParser.EXPONENT, 0); }
		public ExponentExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterExponentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitExponentExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitExponentExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(kbasParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(kbasParser.DIV, 0); }
		public MulExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(kbasParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(kbasParser.MINUS, 0); }
		public AddExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(kbasParser.GTE, 0); }
		public TerminalNode GT() { return getToken(kbasParser.GT, 0); }
		public TerminalNode LTE() { return getToken(kbasParser.LTE, 0); }
		public TerminalNode LT() { return getToken(kbasParser.LT, 0); }
		public TerminalNode EQ() { return getToken(kbasParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(kbasParser.NEQ, 0); }
		public RelExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExpressionContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(633);
				func();
				}
				break;
			case 2:
				{
				_localctx = new SignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(634);
					match(NOT);
					}
				}

				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(637);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(640);
				func();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(641);
				match(LPAREN);
				setState(642);
				expression(0);
				setState(643);
				match(RPAREN);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(659);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(648);
						match(EXPONENT);
						setState(649);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new MulExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(650);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(651);
						((MulExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
							((MulExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(652);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AddExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(654);
						((AddExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(655);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new RelExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(656);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(657);
						((RelExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
							((RelExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(658);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarsuffixContext varsuffix() {
			return getRuleContext(VarsuffixContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			varname();
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(665);
				varsuffix();
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

	public static class VarnameContext extends ParserRuleContext {
		public List<TerminalNode> LETTERS() { return getTokens(kbasParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(kbasParser.LETTERS, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(kbasParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(kbasParser.NUMBER, i);
		}
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_varname);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(LETTERS);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(669);
					_la = _input.LA(1);
					if ( !(_la==LETTERS || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class VarsuffixContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(kbasParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(kbasParser.PERCENT, 0); }
		public VarsuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVarsuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVarsuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVarsuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsuffixContext varsuffix() throws RecognitionException {
		VarsuffixContext _localctx = new VarsuffixContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_varsuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if ( !(_la==DOLLAR || _la==PERCENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_varlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			vardecl();
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(678);
					match(COMMA);
					setState(679);
					vardecl();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			expression(0);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686);
					match(COMMA);
					setState(687);
					expression(0);
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class SqrfuncContext extends ParserRuleContext {
		public TerminalNode SQR() { return getToken(kbasParser.SQR, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public SqrfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSqrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSqrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSqrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrfuncContext sqrfunc() throws RecognitionException {
		SqrfuncContext _localctx = new SqrfuncContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sqrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(SQR);
			setState(694);
			match(LPAREN);
			setState(695);
			expression(0);
			setState(696);
			match(RPAREN);
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

	public static class ChrfuncContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(kbasParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public ChrfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chrfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterChrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitChrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitChrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChrfuncContext chrfunc() throws RecognitionException {
		ChrfuncContext _localctx = new ChrfuncContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_chrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(CHR);
			setState(699);
			match(LPAREN);
			setState(700);
			expression(0);
			setState(701);
			match(RPAREN);
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

	public static class LenfuncContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(kbasParser.LEN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public LenfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLenfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLenfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLenfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenfuncContext lenfunc() throws RecognitionException {
		LenfuncContext _localctx = new LenfuncContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lenfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(LEN);
			setState(704);
			match(LPAREN);
			setState(705);
			expression(0);
			setState(706);
			match(RPAREN);
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

	public static class AscfuncContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(kbasParser.ASC, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public AscfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAscfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAscfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAscfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscfuncContext ascfunc() throws RecognitionException {
		AscfuncContext _localctx = new AscfuncContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ascfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(ASC);
			setState(709);
			match(LPAREN);
			setState(710);
			expression(0);
			setState(711);
			match(RPAREN);
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

	public static class MidfuncContext extends ParserRuleContext {
		public TerminalNode MID() { return getToken(kbasParser.MID, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kbasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kbasParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public MidfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterMidfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitMidfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitMidfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidfuncContext midfunc() throws RecognitionException {
		MidfuncContext _localctx = new MidfuncContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_midfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(MID);
			setState(714);
			match(LPAREN);
			setState(715);
			expression(0);
			setState(716);
			match(COMMA);
			setState(717);
			expression(0);
			setState(718);
			match(COMMA);
			setState(719);
			expression(0);
			setState(720);
			match(RPAREN);
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

	public static class PdlfuncContext extends ParserRuleContext {
		public TerminalNode PDL() { return getToken(kbasParser.PDL, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public PdlfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdlfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPdlfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPdlfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPdlfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdlfuncContext pdlfunc() throws RecognitionException {
		PdlfuncContext _localctx = new PdlfuncContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_pdlfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(PDL);
			setState(723);
			match(LPAREN);
			setState(724);
			expression(0);
			setState(725);
			match(RPAREN);
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

	public static class PeekfuncContext extends ParserRuleContext {
		public TerminalNode PEEK() { return getToken(kbasParser.PEEK, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public PeekfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peekfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPeekfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPeekfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPeekfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeekfuncContext peekfunc() throws RecognitionException {
		PeekfuncContext _localctx = new PeekfuncContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_peekfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(PEEK);
			setState(728);
			match(LPAREN);
			setState(729);
			expression(0);
			setState(730);
			match(RPAREN);
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

	public static class IntfuncContext extends ParserRuleContext {
		public TerminalNode INTF() { return getToken(kbasParser.INTF, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public IntfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterIntfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitIntfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitIntfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntfuncContext intfunc() throws RecognitionException {
		IntfuncContext _localctx = new IntfuncContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_intfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(INTF);
			setState(733);
			match(LPAREN);
			setState(734);
			expression(0);
			setState(735);
			match(RPAREN);
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

	public static class SpcfuncContext extends ParserRuleContext {
		public TerminalNode SPC() { return getToken(kbasParser.SPC, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public SpcfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spcfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSpcfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSpcfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSpcfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpcfuncContext spcfunc() throws RecognitionException {
		SpcfuncContext _localctx = new SpcfuncContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_spcfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(SPC);
			setState(738);
			match(LPAREN);
			setState(739);
			expression(0);
			setState(740);
			match(RPAREN);
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

	public static class FrefuncContext extends ParserRuleContext {
		public TerminalNode FRE() { return getToken(kbasParser.FRE, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public FrefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frefunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterFrefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitFrefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitFrefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrefuncContext frefunc() throws RecognitionException {
		FrefuncContext _localctx = new FrefuncContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_frefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(FRE);
			setState(743);
			match(LPAREN);
			setState(744);
			expression(0);
			setState(745);
			match(RPAREN);
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

	public static class PosfuncContext extends ParserRuleContext {
		public TerminalNode POS() { return getToken(kbasParser.POS, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public PosfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterPosfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitPosfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitPosfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosfuncContext posfunc() throws RecognitionException {
		PosfuncContext _localctx = new PosfuncContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_posfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(POS);
			setState(748);
			match(LPAREN);
			setState(749);
			expression(0);
			setState(750);
			match(RPAREN);
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

	public static class UsrfuncContext extends ParserRuleContext {
		public TerminalNode USR() { return getToken(kbasParser.USR, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public UsrfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usrfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterUsrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitUsrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitUsrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsrfuncContext usrfunc() throws RecognitionException {
		UsrfuncContext _localctx = new UsrfuncContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_usrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(USR);
			setState(753);
			match(LPAREN);
			setState(754);
			expression(0);
			setState(755);
			match(RPAREN);
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

	public static class LeftfuncContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(kbasParser.LEFT, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public LeftfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLeftfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLeftfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLeftfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftfuncContext leftfunc() throws RecognitionException {
		LeftfuncContext _localctx = new LeftfuncContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_leftfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LEFT);
			setState(758);
			match(LPAREN);
			setState(759);
			expression(0);
			setState(760);
			match(COMMA);
			setState(761);
			expression(0);
			setState(762);
			match(RPAREN);
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

	public static class RightfuncContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(kbasParser.RIGHT, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public RightfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRightfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRightfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRightfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightfuncContext rightfunc() throws RecognitionException {
		RightfuncContext _localctx = new RightfuncContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rightfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(RIGHT);
			setState(765);
			match(LPAREN);
			setState(766);
			expression(0);
			setState(767);
			match(COMMA);
			setState(768);
			expression(0);
			setState(769);
			match(RPAREN);
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

	public static class StrfuncContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(kbasParser.STR, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public StrfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterStrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitStrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitStrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrfuncContext strfunc() throws RecognitionException {
		StrfuncContext _localctx = new StrfuncContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_strfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(STR);
			setState(772);
			match(LPAREN);
			setState(773);
			expression(0);
			setState(774);
			match(RPAREN);
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

	public static class FnfuncContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(kbasParser.FN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public FnfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterFnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitFnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitFnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnfuncContext fnfunc() throws RecognitionException {
		FnfuncContext _localctx = new FnfuncContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_fnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(FN);
			setState(777);
			var();
			setState(778);
			match(LPAREN);
			setState(779);
			expression(0);
			setState(780);
			match(RPAREN);
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

	public static class ValfuncContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(kbasParser.VAL, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public ValfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterValfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitValfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitValfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValfuncContext valfunc() throws RecognitionException {
		ValfuncContext _localctx = new ValfuncContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_valfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(VAL);
			setState(783);
			match(LPAREN);
			setState(784);
			expression(0);
			setState(785);
			match(RPAREN);
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

	public static class ScrnfuncContext extends ParserRuleContext {
		public TerminalNode SCRN() { return getToken(kbasParser.SCRN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(kbasParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public ScrnfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrnfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterScrnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitScrnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitScrnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrnfuncContext scrnfunc() throws RecognitionException {
		ScrnfuncContext _localctx = new ScrnfuncContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_scrnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(SCRN);
			setState(788);
			match(LPAREN);
			setState(789);
			expression(0);
			setState(790);
			match(COMMA);
			setState(791);
			expression(0);
			setState(792);
			match(RPAREN);
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

	public static class SinfuncContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(kbasParser.SIN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public SinfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSinfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSinfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSinfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinfuncContext sinfunc() throws RecognitionException {
		SinfuncContext _localctx = new SinfuncContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_sinfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(SIN);
			setState(795);
			match(LPAREN);
			setState(796);
			expression(0);
			setState(797);
			match(RPAREN);
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

	public static class CosfuncContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(kbasParser.COS, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public CosfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cosfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterCosfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitCosfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitCosfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosfuncContext cosfunc() throws RecognitionException {
		CosfuncContext _localctx = new CosfuncContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cosfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(COS);
			setState(800);
			match(LPAREN);
			setState(801);
			expression(0);
			setState(802);
			match(RPAREN);
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

	public static class TanfuncContext extends ParserRuleContext {
		public TerminalNode TAN() { return getToken(kbasParser.TAN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public TanfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tanfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterTanfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitTanfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitTanfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TanfuncContext tanfunc() throws RecognitionException {
		TanfuncContext _localctx = new TanfuncContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tanfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(TAN);
			setState(805);
			match(LPAREN);
			setState(806);
			expression(0);
			setState(807);
			match(RPAREN);
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

	public static class AtnfuncContext extends ParserRuleContext {
		public TerminalNode ATN() { return getToken(kbasParser.ATN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public AtnfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atnfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAtnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAtnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAtnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtnfuncContext atnfunc() throws RecognitionException {
		AtnfuncContext _localctx = new AtnfuncContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_atnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(ATN);
			setState(810);
			match(LPAREN);
			setState(811);
			expression(0);
			setState(812);
			match(RPAREN);
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

	public static class RndfuncContext extends ParserRuleContext {
		public TerminalNode RND() { return getToken(kbasParser.RND, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public RndfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rndfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterRndfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitRndfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitRndfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RndfuncContext rndfunc() throws RecognitionException {
		RndfuncContext _localctx = new RndfuncContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_rndfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(RND);
			setState(815);
			match(LPAREN);
			setState(816);
			expression(0);
			setState(817);
			match(RPAREN);
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

	public static class SgnfuncContext extends ParserRuleContext {
		public TerminalNode SGN() { return getToken(kbasParser.SGN, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public SgnfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sgnfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterSgnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitSgnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitSgnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SgnfuncContext sgnfunc() throws RecognitionException {
		SgnfuncContext _localctx = new SgnfuncContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sgnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(SGN);
			setState(820);
			match(LPAREN);
			setState(821);
			expression(0);
			setState(822);
			match(RPAREN);
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

	public static class ExpfuncContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(kbasParser.EXP, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public ExpfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterExpfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitExpfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitExpfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpfuncContext expfunc() throws RecognitionException {
		ExpfuncContext _localctx = new ExpfuncContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(EXP);
			setState(825);
			match(LPAREN);
			setState(826);
			expression(0);
			setState(827);
			match(RPAREN);
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

	public static class LogfuncContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(kbasParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public LogfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterLogfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitLogfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitLogfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogfuncContext logfunc() throws RecognitionException {
		LogfuncContext _localctx = new LogfuncContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_logfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LOG);
			setState(830);
			match(LPAREN);
			setState(831);
			expression(0);
			setState(832);
			match(RPAREN);
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

	public static class AbsfuncContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(kbasParser.ABS, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public AbsfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterAbsfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitAbsfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitAbsfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsfuncContext absfunc() throws RecognitionException {
		AbsfuncContext _localctx = new AbsfuncContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_absfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(ABS);
			setState(835);
			match(LPAREN);
			setState(836);
			expression(0);
			setState(837);
			match(RPAREN);
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

	public static class TabfuncContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(kbasParser.TAB, 0); }
		public TerminalNode LPAREN() { return getToken(kbasParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(kbasParser.RPAREN, 0); }
		public TabfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).enterTabfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener ) ((kbasListener)listener).exitTabfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor ) return ((kbasVisitor<? extends T>)visitor).visitTabfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabfuncContext tabfunc() throws RecognitionException {
		TabfuncContext _localctx = new TabfuncContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tabfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(TAB);
			setState(840);
			match(LPAREN);
			setState(841);
			expression(0);
			setState(842);
			match(RPAREN);
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
		case 61:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3~\u034f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\6\2\u00c2\n\2\r\2\16\2\u00c3\3\2\3\2\3\3\3\3\5\3\u00ca\n\3\3"+
		"\3\3\3\3\3\5\3\u00cf\n\3\7\3\u00d1\n\3\f\3\16\3\u00d4\13\3\3\3\5\3\u00d7"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u00de\n\6\3\6\3\6\5\6\u00e2\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0115\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u011c\n\b\f\b\16\b\u011f\13\b\3\t\3\t\5\t\u0123\n\t\3\n"+
		"\3\n\3\n\5\n\u0128\n\n\7\n\u012a\n\n\f\n\16\n\u012d\13\n\3\13\3\13\3\13"+
		"\3\f\5\f\u0133\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u013e\n"+
		"\16\3\16\3\16\5\16\u0142\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u014c\n\17\3\17\3\17\3\17\5\17\u0151\n\17\5\17\u0153\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015d\n\20\3\21\3\21\3\21\3\21"+
		"\7\21\u0163\n\21\f\21\16\21\u0166\13\21\5\21\u0168\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u016e\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u018b\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u0192\n"+
		"\31\f\31\16\31\u0195\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u019c\n\32\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u01a3\n\32\f\32\16\32\u01a6\13\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01b3\n\34\f\34"+
		"\16\34\u01b6\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01be\n\35\f\35"+
		"\16\35\u01c1\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\5\"\u01d5\n\"\7\"\u01d7\n\"\f\"\16\"\u01da\13\"\3"+
		"#\3#\5#\u01de\n#\3$\3$\3$\3$\3$\3$\5$\u01e6\n$\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u01ef\n%\3&\3&\3&\3&\3&\3&\3&\5&\u01f8\n&\3\'\3\'\5\'\u01fc\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\65\3\65\5\65\u023e\n\65\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0245\n\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\5<\u0254\n<\3"+
		"<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0279\n>\3?\3?\3?\5?\u027e\n?\3"+
		"?\5?\u0281\n?\3?\3?\3?\3?\3?\5?\u0288\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\7?\u0296\n?\f?\16?\u0299\13?\3@\3@\5@\u029d\n@\3A\3A\7A\u02a1"+
		"\nA\fA\16A\u02a4\13A\3B\3B\3C\3C\3C\7C\u02ab\nC\fC\16C\u02ae\13C\3D\3"+
		"D\3D\7D\u02b3\nD\fD\16D\u02b6\13D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K"+
		"\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O"+
		"\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S"+
		"\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W"+
		"\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\"+
		"\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3"+
		"`\3`\3`\3`\2\3|a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\2\f\4\2\f\fyy\r\2\30\30!!,.88??BDJKaappstww\4\2\6\6"+
		"uu\4\2\37\37((\3\2\24\25\3\2|}\3\2\26\27\3\2\31\36\3\2{|\3\2\3\4\2\u036f"+
		"\2\u00c1\3\2\2\2\4\u00c9\3\2\2\2\6\u00d8\3\2\2\2\b\u00da\3\2\2\2\n\u00e1"+
		"\3\2\2\2\f\u0114\3\2\2\2\16\u0116\3\2\2\2\20\u0120\3\2\2\2\22\u0124\3"+
		"\2\2\2\24\u012e\3\2\2\2\26\u0132\3\2\2\2\30\u0136\3\2\2\2\32\u013a\3\2"+
		"\2\2\34\u0143\3\2\2\2\36\u0154\3\2\2\2 \u015e\3\2\2\2\"\u0169\3\2\2\2"+
		"$\u0171\3\2\2\2&\u0174\3\2\2\2(\u0177\3\2\2\2*\u017a\3\2\2\2,\u017d\3"+
		"\2\2\2.\u0182\3\2\2\2\60\u0185\3\2\2\2\62\u0196\3\2\2\2\64\u01a7\3\2\2"+
		"\2\66\u01ac\3\2\2\28\u01b7\3\2\2\2:\u01c2\3\2\2\2<\u01c5\3\2\2\2>\u01c8"+
		"\3\2\2\2@\u01cc\3\2\2\2B\u01d0\3\2\2\2D\u01dd\3\2\2\2F\u01df\3\2\2\2H"+
		"\u01e7\3\2\2\2J\u01f0\3\2\2\2L\u01f9\3\2\2\2N\u0204\3\2\2\2P\u0209\3\2"+
		"\2\2R\u020d\3\2\2\2T\u0211\3\2\2\2V\u0215\3\2\2\2X\u0219\3\2\2\2Z\u021d"+
		"\3\2\2\2\\\u0224\3\2\2\2^\u022b\3\2\2\2`\u022f\3\2\2\2b\u0232\3\2\2\2"+
		"d\u0235\3\2\2\2f\u0238\3\2\2\2h\u023b\3\2\2\2j\u023f\3\2\2\2l\u0246\3"+
		"\2\2\2n\u0249\3\2\2\2p\u024c\3\2\2\2r\u024e\3\2\2\2t\u0250\3\2\2\2v\u0253"+
		"\3\2\2\2x\u0257\3\2\2\2z\u0278\3\2\2\2|\u0287\3\2\2\2~\u029a\3\2\2\2\u0080"+
		"\u029e\3\2\2\2\u0082\u02a5\3\2\2\2\u0084\u02a7\3\2\2\2\u0086\u02af\3\2"+
		"\2\2\u0088\u02b7\3\2\2\2\u008a\u02bc\3\2\2\2\u008c\u02c1\3\2\2\2\u008e"+
		"\u02c6\3\2\2\2\u0090\u02cb\3\2\2\2\u0092\u02d4\3\2\2\2\u0094\u02d9\3\2"+
		"\2\2\u0096\u02de\3\2\2\2\u0098\u02e3\3\2\2\2\u009a\u02e8\3\2\2\2\u009c"+
		"\u02ed\3\2\2\2\u009e\u02f2\3\2\2\2\u00a0\u02f7\3\2\2\2\u00a2\u02fe\3\2"+
		"\2\2\u00a4\u0305\3\2\2\2\u00a6\u030a\3\2\2\2\u00a8\u0310\3\2\2\2\u00aa"+
		"\u0315\3\2\2\2\u00ac\u031c\3\2\2\2\u00ae\u0321\3\2\2\2\u00b0\u0326\3\2"+
		"\2\2\u00b2\u032b\3\2\2\2\u00b4\u0330\3\2\2\2\u00b6\u0335\3\2\2\2\u00b8"+
		"\u033a\3\2\2\2\u00ba\u033f\3\2\2\2\u00bc\u0344\3\2\2\2\u00be\u0349\3\2"+
		"\2\2\u00c0\u00c2\5\4\3\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\2"+
		"\2\3\u00c6\3\3\2\2\2\u00c7\u00ca\5\b\5\2\u00c8\u00ca\7x\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d6\3\2\2\2\u00cb"+
		"\u00d2\5\n\6\2\u00cc\u00ce\7\37\2\2\u00cd\u00cf\5\n\6\2\u00ce\u00cd\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\t\2\2\2\u00d6\u00cb\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\5\3\2\2\2\u00d8\u00d9\7o\2\2\u00d9\7\3\2\2\2\u00da"+
		"\u00db\7|\2\2\u00db\t\3\2\2\2\u00dc\u00de\5\6\4\2\u00dd\u00dc\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\5\f\7\2\u00e0\u00e2"+
		"\t\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\13\3\2\2\2\u00e3"+
		"\u0115\t\3\2\2\u00e4\u0115\5p9\2\u00e5\u0115\5r:\2\u00e6\u0115\5t;\2\u00e7"+
		"\u0115\5l\67\2\u00e8\u0115\5j\66\2\u00e9\u0115\5h\65\2\u00ea\u0115\5d"+
		"\63\2\u00eb\u0115\5\24\13\2\u00ec\u0115\5f\64\2\u00ed\u0115\5 \21\2\u00ee"+
		"\u0115\5b\62\2\u00ef\u0115\5`\61\2\u00f0\u0115\5^\60\2\u00f1\u0115\5Z"+
		".\2\u00f2\u0115\5\\/\2\u00f3\u0115\5V,\2\u00f4\u0115\5P)\2\u00f5\u0115"+
		"\5T+\2\u00f6\u0115\5R*\2\u00f7\u0115\5X-\2\u00f8\u0115\5> \2\u00f9\u0115"+
		"\5@!\2\u00fa\u0115\5\20\t\2\u00fb\u0115\5,\27\2\u00fc\u0115\5\64\33\2"+
		"\u00fd\u0115\5\66\34\2\u00fe\u0115\58\35\2\u00ff\u0115\5\32\16\2\u0100"+
		"\u0115\5\34\17\2\u0101\u0115\5\36\20\2\u0102\u0115\5\"\22\2\u0103\u0115"+
		"\5N(\2\u0104\u0115\5&\24\2\u0105\u0115\5(\25\2\u0106\u0115\5*\26\2\u0107"+
		"\u0115\5.\30\2\u0108\u0115\5$\23\2\u0109\u0115\5\60\31\2\u010a\u0115\5"+
		"\62\32\2\u010b\u0115\5:\36\2\u010c\u0115\5<\37\2\u010d\u0115\5F$\2\u010e"+
		"\u0115\5B\"\2\u010f\u0115\5H%\2\u0110\u0115\5J&\2\u0111\u0115\5L\'\2\u0112"+
		"\u0115\5\26\f\2\u0113\u0115\5n8\2\u0114\u00e3\3\2\2\2\u0114\u00e4\3\2"+
		"\2\2\u0114\u00e5\3\2\2\2\u0114\u00e6\3\2\2\2\u0114\u00e7\3\2\2\2\u0114"+
		"\u00e8\3\2\2\2\u0114\u00e9\3\2\2\2\u0114\u00ea\3\2\2\2\u0114\u00eb\3\2"+
		"\2\2\u0114\u00ec\3\2\2\2\u0114\u00ed\3\2\2\2\u0114\u00ee\3\2\2\2\u0114"+
		"\u00ef\3\2\2\2\u0114\u00f0\3\2\2\2\u0114\u00f1\3\2\2\2\u0114\u00f2\3\2"+
		"\2\2\u0114\u00f3\3\2\2\2\u0114\u00f4\3\2\2\2\u0114\u00f5\3\2\2\2\u0114"+
		"\u00f6\3\2\2\2\u0114\u00f7\3\2\2\2\u0114\u00f8\3\2\2\2\u0114\u00f9\3\2"+
		"\2\2\u0114\u00fa\3\2\2\2\u0114\u00fb\3\2\2\2\u0114\u00fc\3\2\2\2\u0114"+
		"\u00fd\3\2\2\2\u0114\u00fe\3\2\2\2\u0114\u00ff\3\2\2\2\u0114\u0100\3\2"+
		"\2\2\u0114\u0101\3\2\2\2\u0114\u0102\3\2\2\2\u0114\u0103\3\2\2\2\u0114"+
		"\u0104\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u0106\3\2\2\2\u0114\u0107\3\2"+
		"\2\2\u0114\u0108\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u010a\3\2\2\2\u0114"+
		"\u010b\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u010d\3\2\2\2\u0114\u010e\3\2"+
		"\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\r\3\2\2\2\u0116\u011d\5~@\2\u0117"+
		"\u0118\7\22\2\2\u0118\u0119\5\u0086D\2\u0119\u011a\7\23\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\17\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\t\4\2"+
		"\2\u0121\u0123\5\22\n\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\21\3\2\2\2\u0124\u012b\5|?\2\u0125\u0127\t\5\2\2\u0126\u0128\5|?\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\23\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7m\2\2\u012f\u0130\5\u0086"+
		"D\2\u0130\25\3\2\2\2\u0131\u0133\7#\2\2\u0132\u0131\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5\30\r\2\u0135\27\3\2\2\2\u0136"+
		"\u0137\5\16\b\2\u0137\u0138\7\36\2\2\u0138\u0139\5\u0086D\2\u0139\31\3"+
		"\2\2\2\u013a\u013b\7\t\2\2\u013b\u013d\5|?\2\u013c\u013e\7\13\2\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0142\5\f"+
		"\7\2\u0140\u0142\5\b\5\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\33\3\2\2\2\u0143\u0144\7$\2\2\u0144\u0145\5\16\b\2\u0145\u0146\7\36\2"+
		"\2\u0146\u0147\5|?\2\u0147\u0148\7%\2\2\u0148\u014b\5|?\2\u0149\u014a"+
		"\7&\2\2\u014a\u014c\5|?\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u0152\3\2\2\2\u014d\u014e\5\f\7\2\u014e\u0150\7\n\2\2\u014f\u0151\5\16"+
		"\b\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014d\3\2\2\2\u0152\u0153\3\2\2\2\u0153\35\3\2\2\2\u0154\u0155\7$\2\2"+
		"\u0155\u0156\5\16\b\2\u0156\u0157\7\36\2\2\u0157\u0158\5|?\2\u0158\u0159"+
		"\7%\2\2\u0159\u015c\5|?\2\u015a\u015b\7&\2\2\u015b\u015d\5|?\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\37\3\2\2\2\u015e\u0167\7\n\2\2\u015f"+
		"\u0164\5\16\b\2\u0160\u0161\7\37\2\2\u0161\u0163\5\16\b\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168!\3\2\2\2\u0169\u016d\7\'\2\2\u016a\u016b\5x=\2\u016b\u016c"+
		"\t\5\2\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\5\u0084C\2\u0170#\3\2\2\2\u0171\u0172\7P\2"+
		"\2\u0172\u0173\5\u0084C\2\u0173%\3\2\2\2\u0174\u0175\7)\2\2\u0175\u0176"+
		"\5\u0084C\2\u0176\'\3\2\2\2\u0177\u0178\7\7\2\2\u0178\u0179\5\b\5\2\u0179"+
		")\3\2\2\2\u017a\u017b\7\b\2\2\u017b\u017c\5|?\2\u017c+\3\2\2\2\u017d\u017e"+
		"\7=\2\2\u017e\u017f\5|?\2\u017f\u0180\7\37\2\2\u0180\u0181\5|?\2\u0181"+
		"-\3\2\2\2\u0182\u0183\7\60\2\2\u0183\u0184\5\u0086D\2\u0184/\3\2\2\2\u0185"+
		"\u018a\7\62\2\2\u0186\u0187\5|?\2\u0187\u0188\7\37\2\2\u0188\u0189\5|"+
		"?\2\u0189\u018b\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0193\3\2\2\2\u018c\u018d\7%\2\2\u018d\u018e\5|?\2\u018e\u018f\7\37\2"+
		"\2\u018f\u0190\5|?\2\u0190\u0192\3\2\2\2\u0191\u018c\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\61\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u019b\7\63\2\2\u0197\u0198\5|?\2\u0198\u0199\7\37"+
		"\2\2\u0199\u019a\5|?\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u01a4\3\2\2\2\u019d\u019e\7%\2\2\u019e\u019f\5|?\2\u019f"+
		"\u01a0\7\37\2\2\u01a0\u01a1\5|?\2\u01a1\u01a3\3\2\2\2\u01a2\u019d\3\2"+
		"\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\63\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7;\2\2\u01a8\u01a9\5|?\2\u01a9"+
		"\u01aa\7\37\2\2\u01aa\u01ab\5|?\2\u01ab\65\3\2\2\2\u01ac\u01ad\79\2\2"+
		"\u01ad\u01ae\5|?\2\u01ae\u01af\7\7\2\2\u01af\u01b4\5\b\5\2\u01b0\u01b1"+
		"\7\37\2\2\u01b1\u01b3\5\b\5\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2"+
		"\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\67\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01b8\79\2\2\u01b8\u01b9\5|?\2\u01b9\u01ba\7\b\2\2\u01ba"+
		"\u01bf\5\b\5\2\u01bb\u01bc\7\37\2\2\u01bc\u01be\5\b\5\2\u01bd\u01bb\3"+
		"\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"9\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\66\2\2\u01c3\u01c4\5|?\2\u01c4"+
		";\3\2\2\2\u01c5\u01c6\7\67\2\2\u01c6\u01c7\5|?\2\u01c7=\3\2\2\2\u01c8"+
		"\u01c9\7@\2\2\u01c9\u01ca\7+\2\2\u01ca\u01cb\5|?\2\u01cb?\3\2\2\2\u01cc"+
		"\u01cd\7A\2\2\u01cd\u01ce\7+\2\2\u01ce\u01cf\5|?\2\u01cfA\3\2\2\2\u01d0"+
		"\u01d1\7N\2\2\u01d1\u01d8\5D#\2\u01d2\u01d4\7\37\2\2\u01d3\u01d5\5D#\2"+
		"\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d2"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"C\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01de\5v<\2\u01dc\u01de\5x=\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deE\3\2\2\2\u01df\u01e0\7O\2\2\u01e0"+
		"\u01e1\5|?\2\u01e1\u01e2\7\37\2\2\u01e2\u01e5\5|?\2\u01e3\u01e4\7\37\2"+
		"\2\u01e4\u01e6\5|?\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6G\3"+
		"\2\2\2\u01e7\u01e8\7Q\2\2\u01e8\u01ee\5|?\2\u01e9\u01ea\7S\2\2\u01ea\u01eb"+
		"\5|?\2\u01eb\u01ec\7\37\2\2\u01ec\u01ed\5|?\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01e9\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efI\3\2\2\2\u01f0\u01f1\7R\2\2\u01f1"+
		"\u01f7\5|?\2\u01f2\u01f3\7S\2\2\u01f3\u01f4\5|?\2\u01f4\u01f5\7\37\2\2"+
		"\u01f5\u01f6\5|?\2\u01f6\u01f8\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8K\3\2\2\2\u01f9\u01fb\7T\2\2\u01fa\u01fc\7U\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5~@\2\u01fe"+
		"\u01ff\7\22\2\2\u01ff\u0200\5~@\2\u0200\u0201\7\23\2\2\u0201\u0202\7\36"+
		"\2\2\u0202\u0203\5|?\2\u0203M\3\2\2\2\u0204\u0205\7W\2\2\u0205\u0206\7"+
		"\22\2\2\u0206\u0207\5|?\2\u0207\u0208\7\23\2\2\u0208O\3\2\2\2\u0209\u020a"+
		"\7X\2\2\u020a\u020b\7\36\2\2\u020b\u020c\5|?\2\u020cQ\3\2\2\2\u020d\u020e"+
		"\7Y\2\2\u020e\u020f\7\36\2\2\u020f\u0210\5|?\2\u0210S\3\2\2\2\u0211\u0212"+
		"\7Z\2\2\u0212\u0213\7\36\2\2\u0213\u0214\5|?\2\u0214U\3\2\2\2\u0215\u0216"+
		"\7[\2\2\u0216\u0217\7\36\2\2\u0217\u0218\5|?\2\u0218W\3\2\2\2\u0219\u021a"+
		"\7\\\2\2\u021a\u021b\7\36\2\2\u021b\u021c\5|?\2\u021cY\3\2\2\2\u021d\u021e"+
		"\7]\2\2\u021e\u021f\5|?\2\u021f\u0220\7\37\2\2\u0220\u0221\5|?\2\u0221"+
		"\u0222\7S\2\2\u0222\u0223\5|?\2\u0223[\3\2\2\2\u0224\u0225\7^\2\2\u0225"+
		"\u0226\5|?\2\u0226\u0227\7\37\2\2\u0227\u0228\5|?\2\u0228\u0229\7S\2\2"+
		"\u0229\u022a\5|?\2\u022a]\3\2\2\2\u022b\u022c\7E\2\2\u022c\u022d\7\7\2"+
		"\2\u022d\u022e\5\b\5\2\u022e_\3\2\2\2\u022f\u0230\7\64\2\2\u0230\u0231"+
		"\7|\2\2\u0231a\3\2\2\2\u0232\u0233\7\65\2\2\u0233\u0234\7|\2\2\u0234c"+
		"\3\2\2\2\u0235\u0236\7k\2\2\u0236\u0237\5\16\b\2\u0237e\3\2\2\2\u0238"+
		"\u0239\7l\2\2\u0239\u023a\5\16\b\2\u023ag\3\2\2\2\u023b\u023d\7 \2\2\u023c"+
		"\u023e\5|?\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023ei\3\2\2\2\u023f"+
		"\u0244\7`\2\2\u0240\u0241\5|?\2\u0241\u0242\7\37\2\2\u0242\u0243\5|?\2"+
		"\u0243\u0245\3\2\2\2\u0244\u0240\3\2\2\2\u0244\u0245\3\2\2\2\u0245k\3"+
		"\2\2\2\u0246\u0247\7o\2\2\u0247\u0248\5|?\2\u0248m\3\2\2\2\u0249\u024a"+
		"\7v\2\2\u024a\u024b\5|?\2\u024bo\3\2\2\2\u024c\u024d\7\"\2\2\u024dq\3"+
		"\2\2\2\u024e\u024f\7\5\2\2\u024fs\3\2\2\2\u0250\u0251\7r\2\2\u0251u\3"+
		"\2\2\2\u0252\u0254\t\6\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\t\7\2\2\u0256w\3\2\2\2\u0257\u0258\7z\2\2\u0258"+
		"y\3\2\2\2\u0259\u0279\5x=\2\u025a\u0279\5v<\2\u025b\u0279\5\u00be`\2\u025c"+
		"\u0279\5\16\b\2\u025d\u0279\5\u008aF\2\u025e\u0279\5\u0088E\2\u025f\u0279"+
		"\5\u008cG\2\u0260\u0279\5\u00a4S\2\u0261\u0279\5\u008eH\2\u0262\u0279"+
		"\5\u00aaV\2\u0263\u0279\5\u0090I\2\u0264\u0279\5\u0092J\2\u0265\u0279"+
		"\5\u0094K\2\u0266\u0279\5\u0096L\2\u0267\u0279\5\u0098M\2\u0268\u0279"+
		"\5\u009aN\2\u0269\u0279\5\u009cO\2\u026a\u0279\5\u009eP\2\u026b\u0279"+
		"\5\u00a0Q\2\u026c\u0279\5\u00a8U\2\u026d\u0279\5\u00a2R\2\u026e\u0279"+
		"\5\u00a6T\2\u026f\u0279\5\u00acW\2\u0270\u0279\5\u00aeX\2\u0271\u0279"+
		"\5\u00b0Y\2\u0272\u0279\5\u00b2Z\2\u0273\u0279\5\u00b4[\2\u0274\u0279"+
		"\5\u00b6\\\2\u0275\u0279\5\u00b8]\2\u0276\u0279\5\u00ba^\2\u0277\u0279"+
		"\5\u00bc_\2\u0278\u0259\3\2\2\2\u0278\u025a\3\2\2\2\u0278\u025b\3\2\2"+
		"\2\u0278\u025c\3\2\2\2\u0278\u025d\3\2\2\2\u0278\u025e\3\2\2\2\u0278\u025f"+
		"\3\2\2\2\u0278\u0260\3\2\2\2\u0278\u0261\3\2\2\2\u0278\u0262\3\2\2\2\u0278"+
		"\u0263\3\2\2\2\u0278\u0264\3\2\2\2\u0278\u0265\3\2\2\2\u0278\u0266\3\2"+
		"\2\2\u0278\u0267\3\2\2\2\u0278\u0268\3\2\2\2\u0278\u0269\3\2\2\2\u0278"+
		"\u026a\3\2\2\2\u0278\u026b\3\2\2\2\u0278\u026c\3\2\2\2\u0278\u026d\3\2"+
		"\2\2\u0278\u026e\3\2\2\2\u0278\u026f\3\2\2\2\u0278\u0270\3\2\2\2\u0278"+
		"\u0271\3\2\2\2\u0278\u0272\3\2\2\2\u0278\u0273\3\2\2\2\u0278\u0274\3\2"+
		"\2\2\u0278\u0275\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279"+
		"{\3\2\2\2\u027a\u027b\b?\1\2\u027b\u0288\5z>\2\u027c\u027e\7q\2\2\u027d"+
		"\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0281\t\6"+
		"\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0288\5z>\2\u0283\u0284\7\22\2\2\u0284\u0285\5|?\2\u0285\u0286\7\23\2"+
		"\2\u0286\u0288\3\2\2\2\u0287\u027a\3\2\2\2\u0287\u027d\3\2\2\2\u0287\u0283"+
		"\3\2\2\2\u0288\u0297\3\2\2\2\u0289\u028a\f\7\2\2\u028a\u028b\7n\2\2\u028b"+
		"\u0296\5|?\7\u028c\u028d\f\6\2\2\u028d\u028e\t\b\2\2\u028e\u0296\5|?\7"+
		"\u028f\u0290\f\5\2\2\u0290\u0291\t\6\2\2\u0291\u0296\5|?\6\u0292\u0293"+
		"\f\4\2\2\u0293\u0294\t\t\2\2\u0294\u0296\5|?\5\u0295\u0289\3\2\2\2\u0295"+
		"\u028c\3\2\2\2\u0295\u028f\3\2\2\2\u0295\u0292\3\2\2\2\u0296\u0299\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298}\3\2\2\2\u0299\u0297"+
		"\3\2\2\2\u029a\u029c\5\u0080A\2\u029b\u029d\5\u0082B\2\u029c\u029b\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\177\3\2\2\2\u029e\u02a2\7{\2\2\u029f\u02a1"+
		"\t\n\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u0081\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\t\13"+
		"\2\2\u02a6\u0083\3\2\2\2\u02a7\u02ac\5\16\b\2\u02a8\u02a9\7\37\2\2\u02a9"+
		"\u02ab\5\16\b\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u0085\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af"+
		"\u02b4\5|?\2\u02b0\u02b1\7\37\2\2\u02b1\u02b3\5|?\2\u02b2\u02b0\3\2\2"+
		"\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u0087"+
		"\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7*\2\2\u02b8\u02b9\7\22\2\2\u02b9"+
		"\u02ba\5|?\2\u02ba\u02bb\7\23\2\2\u02bb\u0089\3\2\2\2\u02bc\u02bd\7\r"+
		"\2\2\u02bd\u02be\7\22\2\2\u02be\u02bf\5|?\2\u02bf\u02c0\7\23\2\2\u02c0"+
		"\u008b\3\2\2\2\u02c1\u02c2\7/\2\2\u02c2\u02c3\7\22\2\2\u02c3\u02c4\5|"+
		"?\2\u02c4\u02c5\7\23\2\2\u02c5\u008d\3\2\2\2\u02c6\u02c7\7\61\2\2\u02c7"+
		"\u02c8\7\22\2\2\u02c8\u02c9\5|?\2\u02c9\u02ca\7\23\2\2\u02ca\u008f\3\2"+
		"\2\2\u02cb\u02cc\7\16\2\2\u02cc\u02cd\7\22\2\2\u02cd\u02ce\5|?\2\u02ce"+
		"\u02cf\7\37\2\2\u02cf\u02d0\5|?\2\u02d0\u02d1\7\37\2\2\u02d1\u02d2\5|"+
		"?\2\u02d2\u02d3\7\23\2\2\u02d3\u0091\3\2\2\2\u02d4\u02d5\7:\2\2\u02d5"+
		"\u02d6\7\22\2\2\u02d6\u02d7\5|?\2\u02d7\u02d8\7\23\2\2\u02d8\u0093\3\2"+
		"\2\2\u02d9\u02da\7<\2\2\u02da\u02db\7\22\2\2\u02db\u02dc\5|?\2\u02dc\u02dd"+
		"\7\23\2\2\u02dd\u0095\3\2\2\2\u02de\u02df\7>\2\2\u02df\u02e0\7\22\2\2"+
		"\u02e0\u02e1\5|?\2\u02e1\u02e2\7\23\2\2\u02e2\u0097\3\2\2\2\u02e3\u02e4"+
		"\7F\2\2\u02e4\u02e5\7\22\2\2\u02e5\u02e6\5|?\2\u02e6\u02e7\7\23\2\2\u02e7"+
		"\u0099\3\2\2\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\7\22\2\2\u02ea\u02eb\5|"+
		"?\2\u02eb\u02ec\7\23\2\2\u02ec\u009b\3\2\2\2\u02ed\u02ee\7H\2\2\u02ee"+
		"\u02ef\7\22\2\2\u02ef\u02f0\5|?\2\u02f0\u02f1\7\23\2\2\u02f1\u009d\3\2"+
		"\2\2\u02f2\u02f3\7I\2\2\u02f3\u02f4\7\22\2\2\u02f4\u02f5\5|?\2\u02f5\u02f6"+
		"\7\23\2\2\u02f6\u009f\3\2\2\2\u02f7\u02f8\7\17\2\2\u02f8\u02f9\7\22\2"+
		"\2\u02f9\u02fa\5|?\2\u02fa\u02fb\7\37\2\2\u02fb\u02fc\5|?\2\u02fc\u02fd"+
		"\7\23\2\2\u02fd\u00a1\3\2\2\2\u02fe\u02ff\7\20\2\2\u02ff\u0300\7\22\2"+
		"\2\u0300\u0301\5|?\2\u0301\u0302\7\37\2\2\u0302\u0303\5|?\2\u0303\u0304"+
		"\7\23\2\2\u0304\u00a3\3\2\2\2\u0305\u0306\7\21\2\2\u0306\u0307\7\22\2"+
		"\2\u0307\u0308\5|?\2\u0308\u0309\7\23\2\2\u0309\u00a5\3\2\2\2\u030a\u030b"+
		"\7U\2\2\u030b\u030c\5~@\2\u030c\u030d\7\22\2\2\u030d\u030e\5|?\2\u030e"+
		"\u030f\7\23\2\2\u030f\u00a7\3\2\2\2\u0310\u0311\7V\2\2\u0311\u0312\7\22"+
		"\2\2\u0312\u0313\5|?\2\u0313\u0314\7\23\2\2\u0314\u00a9\3\2\2\2\u0315"+
		"\u0316\7_\2\2\u0316\u0317\7\22\2\2\u0317\u0318\5|?\2\u0318\u0319\7\37"+
		"\2\2\u0319\u031a\5|?\2\u031a\u031b\7\23\2\2\u031b\u00ab\3\2\2\2\u031c"+
		"\u031d\7b\2\2\u031d\u031e\7\22\2\2\u031e\u031f\5|?\2\u031f\u0320\7\23"+
		"\2\2\u0320\u00ad\3\2\2\2\u0321\u0322\7c\2\2\u0322\u0323\7\22\2\2\u0323"+
		"\u0324\5|?\2\u0324\u0325\7\23\2\2\u0325\u00af\3\2\2\2\u0326\u0327\7d\2"+
		"\2\u0327\u0328\7\22\2\2\u0328\u0329\5|?\2\u0329\u032a\7\23\2\2\u032a\u00b1"+
		"\3\2\2\2\u032b\u032c\7e\2\2\u032c\u032d\7\22\2\2\u032d\u032e\5|?\2\u032e"+
		"\u032f\7\23\2\2\u032f\u00b3\3\2\2\2\u0330\u0331\7f\2\2\u0331\u0332\7\22"+
		"\2\2\u0332\u0333\5|?\2\u0333\u0334\7\23\2\2\u0334\u00b5\3\2\2\2\u0335"+
		"\u0336\7g\2\2\u0336\u0337\7\22\2\2\u0337\u0338\5|?\2\u0338\u0339\7\23"+
		"\2\2\u0339\u00b7\3\2\2\2\u033a\u033b\7h\2\2\u033b\u033c\7\22\2\2\u033c"+
		"\u033d\5|?\2\u033d\u033e\7\23\2\2\u033e\u00b9\3\2\2\2\u033f\u0340\7i\2"+
		"\2\u0340\u0341\7\22\2\2\u0341\u0342\5|?\2\u0342\u0343\7\23\2\2\u0343\u00bb"+
		"\3\2\2\2\u0344\u0345\7j\2\2\u0345\u0346\7\22\2\2\u0346\u0347\5|?\2\u0347"+
		"\u0348\7\23\2\2\u0348\u00bd\3\2\2\2\u0349\u034a\7W\2\2\u034a\u034b\7\22"+
		"\2\2\u034b\u034c\5|?\2\u034c\u034d\7\23\2\2\u034d\u00bf\3\2\2\2\62\u00c3"+
		"\u00c9\u00ce\u00d2\u00d6\u00dd\u00e1\u0114\u011d\u0122\u0127\u012b\u0132"+
		"\u013d\u0141\u014b\u0150\u0152\u015c\u0164\u0167\u016d\u018a\u0193\u019b"+
		"\u01a4\u01b4\u01bf\u01d4\u01d8\u01dd\u01e5\u01ee\u01f7\u01fb\u023d\u0244"+
		"\u0253\u0278\u027d\u0280\u0287\u0295\u0297\u029c\u02a2\u02ac\u02b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}