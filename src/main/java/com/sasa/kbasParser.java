// Generated from C:/dev/__JavaProjects/blinnafig/src/main\kbas.g4 by ANTLR 4.7
package com.sasa;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kbasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, PERCENT=2, RETURN=3, PRINT=4, GOTO=5, GOSUB=6, GPS=7, PS=8, 
		RPS=9, IF=10, NEXT=11, THEN=12, REM=13, CHR=14, MID=15, LEFT=16, RIGHT=17, 
		STR=18, LPAREN=19, RPAREN=20, PLUS=21, MINUS=22, TIMES=23, DIV=24, CLEAR=25, 
		NEQ=26, GTE=27, LTE=28, GT=29, LT=30, EQ=31, COMMA=32, LIST=33, RUN=34, 
		END=35, LET=36, FOR=37, TO=38, STEP=39, INPUT=40, SEMICOLON=41, DIM=42, 
		SQR=43, COLON=44, TEXT=45, HGR=46, HGR2=47, LEN=48, CALL=49, ASC=50, HPLOT=51, 
		VPLOT=52, PRNUMBER=53, INNUMBER=54, VTAB=55, HTAB=56, HOME=57, ON=58, 
		PDL=59, PLOT=60, PEEK=61, POKE=62, INTF=63, STOP=64, HIMEM=65, LOMEM=66, 
		FLASH=67, INVERSE=68, NORMAL=69, ONERR=70, SPC=71, FRE=72, POS=73, USR=74, 
		TRACE=75, NOTRACE=76, AND=77, OR=78, DATA=79, WAIT=80, READ=81, XDRAW=82, 
		DRAW=83, AT=84, DEF=85, FN=86, VAL=87, TAB=88, SPEED=89, ROT=90, SCALE=91, 
		COLOR=92, HCOLOR=93, HLIN=94, VLIN=95, SCRN=96, POP=97, SHLOAD=98, SIN=99, 
		COS=100, TAN=101, ATN=102, RND=103, SGN=104, EXP=105, LOG=106, ABS=107, 
		STORE=108, RECALL=109, GET=110, EXPONENT=111, AMPERSAND=112, GR=113, NOT=114, 
		RESTORE=115, SAVE=116, LOAD=117, QUESTION=118, INCLUDE=119, CLS=120, STATUS=121, 
		COMMENT=122, STRINGLITERAL=123, LETTERS=124, NUMBER=125, FLOAT=126, WS=127;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_amperoper = 2, RULE_linenumber = 3, 
		RULE_amprstmt = 4, RULE_statement = 5, RULE_vardecl = 6, RULE_printstmt1 = 7, 
		RULE_printlist = 8, RULE_getstmt = 9, RULE_letstmt = 10, RULE_variableassignment = 11, 
		RULE_ifstmt = 12, RULE_forstmt1 = 13, RULE_forstmt2 = 14, RULE_nextstmt = 15, 
		RULE_inputstmt = 16, RULE_readstmt = 17, RULE_dimstmt = 18, RULE_gotostmt = 19, 
		RULE_gosubstmt = 20, RULE_gpsstmt = 21, RULE_returnsubstmt = 22, RULE_psstmt = 23, 
		RULE_pokestmt = 24, RULE_callstmt = 25, RULE_hplotstmt = 26, RULE_vplotstmt = 27, 
		RULE_plotstmt = 28, RULE_vtabstmnt = 29, RULE_htabstmnt = 30, RULE_himemstmt = 31, 
		RULE_lomemstmt = 32, RULE_datastmt = 33, RULE_datum = 34, RULE_waitstmt = 35, 
		RULE_xdrawstmt = 36, RULE_drawstmt = 37, RULE_defstmt = 38, RULE_tabstmt = 39, 
		RULE_speedstmt = 40, RULE_rotstmt = 41, RULE_scalestmt = 42, RULE_colorstmt = 43, 
		RULE_hcolorstmt = 44, RULE_hlinstmt = 45, RULE_vlinstmt = 46, RULE_onerrstmt = 47, 
		RULE_prstmt = 48, RULE_instmt = 49, RULE_storestmt = 50, RULE_recallstmt = 51, 
		RULE_liststmt = 52, RULE_popstmt = 53, RULE_amptstmt = 54, RULE_includestmt = 55, 
		RULE_endstmt = 56, RULE_returnstmt = 57, RULE_restorestmt = 58, RULE_number = 59, 
		RULE_stringer = 60, RULE_func = 61, RULE_expression = 62, RULE_var = 63, 
		RULE_varname = 64, RULE_varsuffix = 65, RULE_varlist = 66, RULE_exprlist = 67, 
		RULE_sqrfunc = 68, RULE_chrfunc = 69, RULE_lenfunc = 70, RULE_ascfunc = 71, 
		RULE_midfunc = 72, RULE_pdlfunc = 73, RULE_peekfunc = 74, RULE_intfunc = 75, 
		RULE_spcfunc = 76, RULE_frefunc = 77, RULE_posfunc = 78, RULE_usrfunc = 79, 
		RULE_leftfunc = 80, RULE_rightfunc = 81, RULE_strfunc = 82, RULE_fnfunc = 83, 
		RULE_valfunc = 84, RULE_scrnfunc = 85, RULE_sinfunc = 86, RULE_cosfunc = 87, 
		RULE_tanfunc = 88, RULE_atnfunc = 89, RULE_rndfunc = 90, RULE_sgnfunc = 91, 
		RULE_expfunc = 92, RULE_logfunc = 93, RULE_absfunc = 94, RULE_tabfunc = 95;
	public static final String[] ruleNames = {
		"prog", "line", "amperoper", "linenumber", "amprstmt", "statement", "vardecl", 
		"printstmt1", "printlist", "getstmt", "letstmt", "variableassignment", 
		"ifstmt", "forstmt1", "forstmt2", "nextstmt", "inputstmt", "readstmt", 
		"dimstmt", "gotostmt", "gosubstmt", "gpsstmt", "returnsubstmt", "psstmt", 
		"pokestmt", "callstmt", "hplotstmt", "vplotstmt", "plotstmt", "vtabstmnt", 
		"htabstmnt", "himemstmt", "lomemstmt", "datastmt", "datum", "waitstmt", 
		"xdrawstmt", "drawstmt", "defstmt", "tabstmt", "speedstmt", "rotstmt", 
		"scalestmt", "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", "onerrstmt", 
		"prstmt", "instmt", "storestmt", "recallstmt", "liststmt", "popstmt", 
		"amptstmt", "includestmt", "endstmt", "returnstmt", "restorestmt", "number", 
		"stringer", "func", "expression", "var", "varname", "varsuffix", "varlist", 
		"exprlist", "sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", "pdlfunc", 
		"peekfunc", "intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", "leftfunc", 
		"rightfunc", "strfunc", "fnfunc", "valfunc", "scrnfunc", "sinfunc", "cosfunc", 
		"tanfunc", "atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", "absfunc", 
		"tabfunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'%'", null, null, null, null, null, null, null, null, null, 
		null, null, "'CHR$'", "'MID$'", "'LEFT$'", "'RIGHT$'", "'STR$'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", null, "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'='", "','", null, null, null, null, null, null, null, null, "';'", 
		null, null, "':'", null, null, null, null, null, null, null, null, "'PR#'", 
		"'IN#'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'^'", "'&'", null, 
		null, null, null, null, "'?'", null, null, "'S'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOLLAR", "PERCENT", "RETURN", "PRINT", "GOTO", "GOSUB", "GPS", 
		"PS", "RPS", "IF", "NEXT", "THEN", "REM", "CHR", "MID", "LEFT", "RIGHT", 
		"STR", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "CLEAR", "NEQ", 
		"GTE", "LTE", "GT", "LT", "EQ", "COMMA", "LIST", "RUN", "END", "LET", 
		"FOR", "TO", "STEP", "INPUT", "SEMICOLON", "DIM", "SQR", "COLON", "TEXT", 
		"HGR", "HGR2", "LEN", "CALL", "ASC", "HPLOT", "VPLOT", "PRNUMBER", "INNUMBER", 
		"VTAB", "HTAB", "HOME", "ON", "PDL", "PLOT", "PEEK", "POKE", "INTF", "STOP", 
		"HIMEM", "LOMEM", "FLASH", "INVERSE", "NORMAL", "ONERR", "SPC", "FRE", 
		"POS", "USR", "TRACE", "NOTRACE", "AND", "OR", "DATA", "WAIT", "READ", 
		"XDRAW", "DRAW", "AT", "DEF", "FN", "VAL", "TAB", "SPEED", "ROT", "SCALE", 
		"COLOR", "HCOLOR", "HLIN", "VLIN", "SCRN", "POP", "SHLOAD", "SIN", "COS", 
		"TAN", "ATN", "RND", "SGN", "EXP", "LOG", "ABS", "STORE", "RECALL", "GET", 
		"EXPONENT", "AMPERSAND", "GR", "NOT", "RESTORE", "SAVE", "LOAD", "QUESTION", 
		"INCLUDE", "CLS", "STATUS", "COMMENT", "STRINGLITERAL", "LETTERS", "NUMBER", 
		"FLOAT", "WS"
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitProg(this);
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
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				line();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << GOTO) | (1L << GOSUB) | (1L << GPS) | (1L << PS) | (1L << RPS) | (1L << IF) | (1L << NEXT) | (1L << REM) | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << LET) | (1L << FOR) | (1L << INPUT) | (1L << DIM) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << CALL) | (1L << HPLOT) | (1L << VPLOT) | (1L << PRNUMBER) | (1L << INNUMBER) | (1L << VTAB) | (1L << HTAB) | (1L << HOME) | (1L << PLOT) | (1L << POKE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STOP - 64)) | (1L << (HIMEM - 64)) | (1L << (LOMEM - 64)) | (1L << (FLASH - 64)) | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (ONERR - 64)) | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (DATA - 64)) | (1L << (WAIT - 64)) | (1L << (READ - 64)) | (1L << (XDRAW - 64)) | (1L << (DRAW - 64)) | (1L << (DEF - 64)) | (1L << (TAB - 64)) | (1L << (SPEED - 64)) | (1L << (ROT - 64)) | (1L << (SCALE - 64)) | (1L << (COLOR - 64)) | (1L << (HCOLOR - 64)) | (1L << (HLIN - 64)) | (1L << (VLIN - 64)) | (1L << (POP - 64)) | (1L << (SHLOAD - 64)) | (1L << (STORE - 64)) | (1L << (RECALL - 64)) | (1L << (GET - 64)) | (1L << (AMPERSAND - 64)) | (1L << (GR - 64)) | (1L << (RESTORE - 64)) | (1L << (SAVE - 64)) | (1L << (LOAD - 64)) | (1L << (QUESTION - 64)) | (1L << (INCLUDE - 64)) | (1L << (CLS - 64)) | (1L << (STATUS - 64)) | (1L << (COMMENT - 64)) | (1L << (LETTERS - 64)) | (1L << (NUMBER - 64)))) != 0) );
			setState(197);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLine(this);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(199);
				linenumber();
				}
				break;
			case STATUS:
				{
				setState(200);
				match(STATUS);
				}
				break;
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case GPS:
			case PS:
			case RPS:
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(203);
				amprstmt();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(204);
					match(COMMA);
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(205);
						amprstmt();
						}
						break;
					}
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(213);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAmperoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAmperoper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAmperoper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmperoperContext amperoper() throws RecognitionException {
		AmperoperContext _localctx = new AmperoperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_amperoper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLinenumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLinenumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLinenumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinenumberContext linenumber() throws RecognitionException {
		LinenumberContext _localctx = new LinenumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linenumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAmprstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAmprstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAmprstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmprstmtContext amprstmt() throws RecognitionException {
		AmprstmtContext _localctx = new AmprstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_amprstmt);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case GPS:
			case PS:
			case RPS:
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
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(220);
					amperoper();
					}
					break;
				}
				setState(223);
				statement();
				}
				}
				break;
			case REM:
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
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
		public GpsstmtContext gpsstmt() {
			return getRuleContext(GpsstmtContext.class,0);
		}
		public PsstmtContext psstmt() {
			return getRuleContext(PsstmtContext.class,0);
		}
		public ReturnsubstmtContext returnsubstmt() {
			return getRuleContext(ReturnsubstmtContext.class,0);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLEAR) | (1L << RUN) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << HOME))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STOP - 64)) | (1L << (FLASH - 64)) | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (SHLOAD - 64)) | (1L << (GR - 64)) | (1L << (SAVE - 64)) | (1L << (LOAD - 64)) | (1L << (CLS - 64)))) != 0)) ) {
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
				setState(228);
				endstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				restorestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				amptstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				popstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				liststmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				storestmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				getstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(236);
				recallstmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(237);
				nextstmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(238);
				instmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(239);
				prstmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(240);
				onerrstmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(241);
				hlinstmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(242);
				vlinstmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(243);
				colorstmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(244);
				speedstmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(245);
				scalestmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(246);
				rotstmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(247);
				hcolorstmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(248);
				himemstmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(249);
				lomemstmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(250);
				printstmt1();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(251);
				pokestmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(252);
				plotstmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(253);
				ifstmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(254);
				forstmt1();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(255);
				forstmt2();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(256);
				inputstmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(257);
				tabstmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(258);
				dimstmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(259);
				gotostmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(260);
				gosubstmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(261);
				gpsstmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(262);
				psstmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(263);
				returnsubstmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(264);
				callstmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(265);
				readstmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(266);
				hplotstmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(267);
				vplotstmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(268);
				vtabstmnt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(269);
				htabstmnt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(270);
				waitstmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(271);
				datastmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(272);
				xdrawstmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(273);
				drawstmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(274);
				defstmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(275);
				letstmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(276);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVardecl(this);
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
			setState(279);
			var();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(LPAREN);
					setState(281);
					exprlist();
					setState(282);
					match(RPAREN);
					}
					} 
				}
				setState(288);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPrintstmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPrintstmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPrintstmt1(this);
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
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==QUESTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(290);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPrintlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPrintlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPrintlist(this);
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
			setState(293);
			expression(0);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(295);
						expression(0);
						}
						break;
					}
					}
					} 
				}
				setState(302);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterGetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitGetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitGetstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetstmtContext getstmt() throws RecognitionException {
		GetstmtContext _localctx = new GetstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_getstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(GET);
			setState(304);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLetstmt(this);
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
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(306);
				match(LET);
				}
			}

			setState(309);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVariableassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVariableassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableassignmentContext variableassignment() throws RecognitionException {
		VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			vardecl();
			setState(312);
			match(EQ);
			setState(313);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitIfstmt(this);
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
			setState(315);
			match(IF);
			setState(316);
			expression(0);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(317);
				match(THEN);
				}
			}

			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case PRINT:
			case GOTO:
			case GOSUB:
			case GPS:
			case PS:
			case RPS:
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
				setState(320);
				statement();
				}
				break;
			case NUMBER:
				{
				setState(321);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterForstmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitForstmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitForstmt1(this);
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
			setState(324);
			match(FOR);
			setState(325);
			vardecl();
			setState(326);
			match(EQ);
			setState(327);
			expression(0);
			setState(328);
			match(TO);
			setState(329);
			expression(0);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(330);
				match(STEP);
				setState(331);
				expression(0);
				}
			}

			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(334);
				statement();
				setState(335);
				match(NEXT);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(336);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterForstmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitForstmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitForstmt2(this);
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
			setState(341);
			match(FOR);
			setState(342);
			vardecl();
			setState(343);
			match(EQ);
			setState(344);
			expression(0);
			setState(345);
			match(TO);
			setState(346);
			expression(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(347);
				match(STEP);
				setState(348);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterNextstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitNextstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitNextstmt(this);
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
			setState(351);
			match(NEXT);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(352);
				vardecl();
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(353);
						match(COMMA);
						setState(354);
						vardecl();
						}
						} 
					}
					setState(359);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterInputstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitInputstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitInputstmt(this);
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
			setState(362);
			match(INPUT);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL) {
				{
				setState(363);
				stringer();
				setState(364);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterReadstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitReadstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitReadstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstmtContext readstmt() throws RecognitionException {
		ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(READ);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterDimstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitDimstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitDimstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimstmtContext dimstmt() throws RecognitionException {
		DimstmtContext _localctx = new DimstmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(DIM);
			setState(374);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterGotostmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitGotostmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitGotostmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotostmtContext gotostmt() throws RecognitionException {
		GotostmtContext _localctx = new GotostmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gotostmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(GOTO);
			setState(377);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterGosubstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitGosubstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitGosubstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GosubstmtContext gosubstmt() throws RecognitionException {
		GosubstmtContext _localctx = new GosubstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gosubstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(GOSUB);
			setState(380);
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

	public static class GpsstmtContext extends ParserRuleContext {
		public TerminalNode GPS() { return getToken(kbasParser.GPS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GpsstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gpsstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterGpsstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitGpsstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitGpsstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GpsstmtContext gpsstmt() throws RecognitionException {
		GpsstmtContext _localctx = new GpsstmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_gpsstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(GPS);
			setState(383);
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

	public static class ReturnsubstmtContext extends ParserRuleContext {
		public TerminalNode RPS() { return getToken(kbasParser.RPS, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ReturnsubstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsubstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterReturnsubstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitReturnsubstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitReturnsubstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnsubstmtContext returnsubstmt() throws RecognitionException {
		ReturnsubstmtContext _localctx = new ReturnsubstmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnsubstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(RPS);
			setState(386);
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

	public static class PsstmtContext extends ParserRuleContext {
		public TerminalNode PS() { return getToken(kbasParser.PS, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public PsstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPsstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPsstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPsstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PsstmtContext psstmt() throws RecognitionException {
		PsstmtContext _localctx = new PsstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_psstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(PS);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(389);
				vardecl();
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(390);
						match(COMMA);
						setState(391);
						vardecl();
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPokestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPokestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPokestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PokestmtContext pokestmt() throws RecognitionException {
		PokestmtContext _localctx = new PokestmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pokestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(POKE);
			setState(400);
			expression(0);
			setState(401);
			match(COMMA);
			setState(402);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitCallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(CALL);
			setState(405);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterHplotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitHplotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitHplotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HplotstmtContext hplotstmt() throws RecognitionException {
		HplotstmtContext _localctx = new HplotstmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_hplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(HPLOT);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(408);
				expression(0);
				setState(409);
				match(COMMA);
				setState(410);
				expression(0);
				}
				break;
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(414);
				match(TO);
				setState(415);
				expression(0);
				setState(416);
				match(COMMA);
				setState(417);
				expression(0);
				}
				}
				setState(423);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVplotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVplotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVplotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VplotstmtContext vplotstmt() throws RecognitionException {
		VplotstmtContext _localctx = new VplotstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_vplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(VPLOT);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(425);
				expression(0);
				setState(426);
				match(COMMA);
				setState(427);
				expression(0);
				}
				break;
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(431);
				match(TO);
				setState(432);
				expression(0);
				setState(433);
				match(COMMA);
				setState(434);
				expression(0);
				}
				}
				setState(440);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPlotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPlotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPlotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlotstmtContext plotstmt() throws RecognitionException {
		PlotstmtContext _localctx = new PlotstmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_plotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(PLOT);
			setState(442);
			expression(0);
			setState(443);
			match(COMMA);
			setState(444);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVtabstmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVtabstmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVtabstmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtabstmntContext vtabstmnt() throws RecognitionException {
		VtabstmntContext _localctx = new VtabstmntContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_vtabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(VTAB);
			setState(447);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterHtabstmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitHtabstmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitHtabstmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtabstmntContext htabstmnt() throws RecognitionException {
		HtabstmntContext _localctx = new HtabstmntContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_htabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(HTAB);
			setState(450);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterHimemstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitHimemstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitHimemstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HimemstmtContext himemstmt() throws RecognitionException {
		HimemstmtContext _localctx = new HimemstmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_himemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(HIMEM);
			setState(453);
			match(COLON);
			setState(454);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLomemstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLomemstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLomemstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LomemstmtContext lomemstmt() throws RecognitionException {
		LomemstmtContext _localctx = new LomemstmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lomemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(LOMEM);
			setState(457);
			match(COLON);
			setState(458);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterDatastmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitDatastmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitDatastmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatastmtContext datastmt() throws RecognitionException {
		DatastmtContext _localctx = new DatastmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_datastmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(DATA);
			setState(461);
			datum();
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(COMMA);
					setState(464);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(463);
						datum();
						}
						break;
					}
					}
					} 
				}
				setState(470);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterDatum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitDatum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatumContext datum() throws RecognitionException {
		DatumContext _localctx = new DatumContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_datum);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				number();
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterWaitstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitWaitstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitWaitstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitstmtContext waitstmt() throws RecognitionException {
		WaitstmtContext _localctx = new WaitstmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_waitstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(WAIT);
			setState(476);
			expression(0);
			setState(477);
			match(COMMA);
			setState(478);
			expression(0);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(479);
				match(COMMA);
				setState(480);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterXdrawstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitXdrawstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitXdrawstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdrawstmtContext xdrawstmt() throws RecognitionException {
		XdrawstmtContext _localctx = new XdrawstmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_xdrawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(XDRAW);
			setState(484);
			expression(0);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(485);
				match(AT);
				setState(486);
				expression(0);
				setState(487);
				match(COMMA);
				setState(488);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterDrawstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitDrawstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitDrawstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawstmtContext drawstmt() throws RecognitionException {
		DrawstmtContext _localctx = new DrawstmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_drawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(DRAW);
			setState(493);
			expression(0);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(494);
				match(AT);
				setState(495);
				expression(0);
				setState(496);
				match(COMMA);
				setState(497);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterDefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitDefstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitDefstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefstmtContext defstmt() throws RecognitionException {
		DefstmtContext _localctx = new DefstmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_defstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(DEF);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FN) {
				{
				setState(502);
				match(FN);
				}
			}

			setState(505);
			var();
			setState(506);
			match(LPAREN);
			setState(507);
			var();
			setState(508);
			match(RPAREN);
			setState(509);
			match(EQ);
			setState(510);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterTabstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitTabstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitTabstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabstmtContext tabstmt() throws RecognitionException {
		TabstmtContext _localctx = new TabstmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tabstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(TAB);
			setState(513);
			match(LPAREN);
			setState(514);
			expression(0);
			setState(515);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSpeedstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSpeedstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSpeedstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedstmtContext speedstmt() throws RecognitionException {
		SpeedstmtContext _localctx = new SpeedstmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_speedstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(SPEED);
			setState(518);
			match(EQ);
			setState(519);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRotstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRotstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRotstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotstmtContext rotstmt() throws RecognitionException {
		RotstmtContext _localctx = new RotstmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ROT);
			setState(522);
			match(EQ);
			setState(523);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterScalestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitScalestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitScalestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalestmtContext scalestmt() throws RecognitionException {
		ScalestmtContext _localctx = new ScalestmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_scalestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(SCALE);
			setState(526);
			match(EQ);
			setState(527);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterColorstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitColorstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitColorstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorstmtContext colorstmt() throws RecognitionException {
		ColorstmtContext _localctx = new ColorstmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_colorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(COLOR);
			setState(530);
			match(EQ);
			setState(531);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterHcolorstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitHcolorstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitHcolorstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HcolorstmtContext hcolorstmt() throws RecognitionException {
		HcolorstmtContext _localctx = new HcolorstmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_hcolorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(HCOLOR);
			setState(534);
			match(EQ);
			setState(535);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterHlinstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitHlinstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitHlinstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HlinstmtContext hlinstmt() throws RecognitionException {
		HlinstmtContext _localctx = new HlinstmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_hlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(HLIN);
			setState(538);
			expression(0);
			setState(539);
			match(COMMA);
			setState(540);
			expression(0);
			setState(541);
			match(AT);
			setState(542);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVlinstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVlinstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVlinstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VlinstmtContext vlinstmt() throws RecognitionException {
		VlinstmtContext _localctx = new VlinstmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(VLIN);
			setState(545);
			expression(0);
			setState(546);
			match(COMMA);
			setState(547);
			expression(0);
			setState(548);
			match(AT);
			setState(549);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterOnerrstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitOnerrstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitOnerrstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnerrstmtContext onerrstmt() throws RecognitionException {
		OnerrstmtContext _localctx = new OnerrstmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_onerrstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(ONERR);
			setState(552);
			match(GOTO);
			setState(553);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPrstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPrstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPrstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrstmtContext prstmt() throws RecognitionException {
		PrstmtContext _localctx = new PrstmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_prstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(PRNUMBER);
			setState(556);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterInstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitInstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitInstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstmtContext instmt() throws RecognitionException {
		InstmtContext _localctx = new InstmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_instmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(INNUMBER);
			setState(559);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterStorestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitStorestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitStorestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorestmtContext storestmt() throws RecognitionException {
		StorestmtContext _localctx = new StorestmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_storestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(STORE);
			setState(562);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRecallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRecallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRecallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecallstmtContext recallstmt() throws RecognitionException {
		RecallstmtContext _localctx = new RecallstmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_recallstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(RECALL);
			setState(565);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterListstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitListstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitListstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListstmtContext liststmt() throws RecognitionException {
		ListstmtContext _localctx = new ListstmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_liststmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(LIST);
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(568);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPopstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPopstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPopstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopstmtContext popstmt() throws RecognitionException {
		PopstmtContext _localctx = new PopstmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_popstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(POP);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(572);
				expression(0);
				setState(573);
				match(COMMA);
				setState(574);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAmptstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAmptstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAmptstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmptstmtContext amptstmt() throws RecognitionException {
		AmptstmtContext _localctx = new AmptstmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_amptstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(AMPERSAND);
			setState(579);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterIncludestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitIncludestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitIncludestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludestmtContext includestmt() throws RecognitionException {
		IncludestmtContext _localctx = new IncludestmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_includestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(INCLUDE);
			setState(582);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterEndstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitEndstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitEndstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndstmtContext endstmt() throws RecognitionException {
		EndstmtContext _localctx = new EndstmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_endstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRestorestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRestorestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRestorestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestorestmtContext restorestmt() throws RecognitionException {
		RestorestmtContext _localctx = new RestorestmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_restorestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(590);
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

			setState(593);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterStringer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitStringer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitStringer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringerContext stringer() throws RecognitionException {
		StringerContext _localctx = new StringerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_stringer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_func);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				stringer();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				number();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				tabfunc();
				}
				break;
			case LETTERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				vardecl();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(601);
				chrfunc();
				}
				break;
			case SQR:
				enterOuterAlt(_localctx, 6);
				{
				setState(602);
				sqrfunc();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(603);
				lenfunc();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 8);
				{
				setState(604);
				strfunc();
				}
				break;
			case ASC:
				enterOuterAlt(_localctx, 9);
				{
				setState(605);
				ascfunc();
				}
				break;
			case SCRN:
				enterOuterAlt(_localctx, 10);
				{
				setState(606);
				scrnfunc();
				}
				break;
			case MID:
				enterOuterAlt(_localctx, 11);
				{
				setState(607);
				midfunc();
				}
				break;
			case PDL:
				enterOuterAlt(_localctx, 12);
				{
				setState(608);
				pdlfunc();
				}
				break;
			case PEEK:
				enterOuterAlt(_localctx, 13);
				{
				setState(609);
				peekfunc();
				}
				break;
			case INTF:
				enterOuterAlt(_localctx, 14);
				{
				setState(610);
				intfunc();
				}
				break;
			case SPC:
				enterOuterAlt(_localctx, 15);
				{
				setState(611);
				spcfunc();
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 16);
				{
				setState(612);
				frefunc();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(613);
				posfunc();
				}
				break;
			case USR:
				enterOuterAlt(_localctx, 18);
				{
				setState(614);
				usrfunc();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 19);
				{
				setState(615);
				leftfunc();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 20);
				{
				setState(616);
				valfunc();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 21);
				{
				setState(617);
				rightfunc();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 22);
				{
				setState(618);
				fnfunc();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 23);
				{
				setState(619);
				sinfunc();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 24);
				{
				setState(620);
				cosfunc();
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 25);
				{
				setState(621);
				tanfunc();
				}
				break;
			case ATN:
				enterOuterAlt(_localctx, 26);
				{
				setState(622);
				atnfunc();
				}
				break;
			case RND:
				enterOuterAlt(_localctx, 27);
				{
				setState(623);
				rndfunc();
				}
				break;
			case SGN:
				enterOuterAlt(_localctx, 28);
				{
				setState(624);
				sgnfunc();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 29);
				{
				setState(625);
				expfunc();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 30);
				{
				setState(626);
				logfunc();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 31);
				{
				setState(627);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSignExp(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterExponentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitExponentExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitExponentExp(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitMulExp(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAddExp(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRelExp(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitParenExpr(this);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitFuncExpr(this);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(631);
				func();
				}
				break;
			case 2:
				{
				_localctx = new SignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(632);
					match(NOT);
					}
				}

				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(635);
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
				setState(638);
				func();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(639);
				match(LPAREN);
				setState(640);
				expression(0);
				setState(641);
				match(RPAREN);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(657);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(645);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(646);
						match(EXPONENT);
						setState(647);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new MulExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(649);
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
						setState(650);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AddExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(652);
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
						setState(653);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new RelExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(654);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(655);
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
						setState(656);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(661);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			varname();
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(663);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_varname);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(LETTERS);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
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
				setState(672);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVarsuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVarsuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVarsuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsuffixContext varsuffix() throws RecognitionException {
		VarsuffixContext _localctx = new VarsuffixContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_varsuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_varlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			vardecl();
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					match(COMMA);
					setState(677);
					vardecl();
					}
					} 
				}
				setState(682);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			expression(0);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(684);
					match(COMMA);
					setState(685);
					expression(0);
					}
					} 
				}
				setState(690);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSqrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSqrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSqrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrfuncContext sqrfunc() throws RecognitionException {
		SqrfuncContext _localctx = new SqrfuncContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sqrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(SQR);
			setState(692);
			match(LPAREN);
			setState(693);
			expression(0);
			setState(694);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterChrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitChrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitChrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChrfuncContext chrfunc() throws RecognitionException {
		ChrfuncContext _localctx = new ChrfuncContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_chrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(CHR);
			setState(697);
			match(LPAREN);
			setState(698);
			expression(0);
			setState(699);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLenfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLenfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLenfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenfuncContext lenfunc() throws RecognitionException {
		LenfuncContext _localctx = new LenfuncContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lenfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LEN);
			setState(702);
			match(LPAREN);
			setState(703);
			expression(0);
			setState(704);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAscfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAscfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAscfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscfuncContext ascfunc() throws RecognitionException {
		AscfuncContext _localctx = new AscfuncContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ascfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(ASC);
			setState(707);
			match(LPAREN);
			setState(708);
			expression(0);
			setState(709);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterMidfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitMidfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitMidfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidfuncContext midfunc() throws RecognitionException {
		MidfuncContext _localctx = new MidfuncContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_midfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(MID);
			setState(712);
			match(LPAREN);
			setState(713);
			expression(0);
			setState(714);
			match(COMMA);
			setState(715);
			expression(0);
			setState(716);
			match(COMMA);
			setState(717);
			expression(0);
			setState(718);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPdlfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPdlfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPdlfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdlfuncContext pdlfunc() throws RecognitionException {
		PdlfuncContext _localctx = new PdlfuncContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_pdlfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(PDL);
			setState(721);
			match(LPAREN);
			setState(722);
			expression(0);
			setState(723);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPeekfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPeekfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPeekfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeekfuncContext peekfunc() throws RecognitionException {
		PeekfuncContext _localctx = new PeekfuncContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_peekfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(PEEK);
			setState(726);
			match(LPAREN);
			setState(727);
			expression(0);
			setState(728);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterIntfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitIntfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitIntfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntfuncContext intfunc() throws RecognitionException {
		IntfuncContext _localctx = new IntfuncContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_intfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(INTF);
			setState(731);
			match(LPAREN);
			setState(732);
			expression(0);
			setState(733);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSpcfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSpcfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSpcfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpcfuncContext spcfunc() throws RecognitionException {
		SpcfuncContext _localctx = new SpcfuncContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_spcfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(SPC);
			setState(736);
			match(LPAREN);
			setState(737);
			expression(0);
			setState(738);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterFrefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitFrefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitFrefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrefuncContext frefunc() throws RecognitionException {
		FrefuncContext _localctx = new FrefuncContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_frefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(FRE);
			setState(741);
			match(LPAREN);
			setState(742);
			expression(0);
			setState(743);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterPosfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitPosfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitPosfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosfuncContext posfunc() throws RecognitionException {
		PosfuncContext _localctx = new PosfuncContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_posfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(POS);
			setState(746);
			match(LPAREN);
			setState(747);
			expression(0);
			setState(748);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterUsrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitUsrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitUsrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsrfuncContext usrfunc() throws RecognitionException {
		UsrfuncContext _localctx = new UsrfuncContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_usrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(USR);
			setState(751);
			match(LPAREN);
			setState(752);
			expression(0);
			setState(753);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLeftfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLeftfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLeftfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftfuncContext leftfunc() throws RecognitionException {
		LeftfuncContext _localctx = new LeftfuncContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_leftfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LEFT);
			setState(756);
			match(LPAREN);
			setState(757);
			expression(0);
			setState(758);
			match(COMMA);
			setState(759);
			expression(0);
			setState(760);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRightfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRightfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRightfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightfuncContext rightfunc() throws RecognitionException {
		RightfuncContext _localctx = new RightfuncContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rightfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(RIGHT);
			setState(763);
			match(LPAREN);
			setState(764);
			expression(0);
			setState(765);
			match(COMMA);
			setState(766);
			expression(0);
			setState(767);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterStrfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitStrfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitStrfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrfuncContext strfunc() throws RecognitionException {
		StrfuncContext _localctx = new StrfuncContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_strfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(STR);
			setState(770);
			match(LPAREN);
			setState(771);
			expression(0);
			setState(772);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterFnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitFnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitFnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnfuncContext fnfunc() throws RecognitionException {
		FnfuncContext _localctx = new FnfuncContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_fnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(FN);
			setState(775);
			var();
			setState(776);
			match(LPAREN);
			setState(777);
			expression(0);
			setState(778);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterValfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitValfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitValfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValfuncContext valfunc() throws RecognitionException {
		ValfuncContext _localctx = new ValfuncContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_valfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(VAL);
			setState(781);
			match(LPAREN);
			setState(782);
			expression(0);
			setState(783);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterScrnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitScrnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitScrnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrnfuncContext scrnfunc() throws RecognitionException {
		ScrnfuncContext _localctx = new ScrnfuncContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_scrnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(SCRN);
			setState(786);
			match(LPAREN);
			setState(787);
			expression(0);
			setState(788);
			match(COMMA);
			setState(789);
			expression(0);
			setState(790);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSinfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSinfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSinfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinfuncContext sinfunc() throws RecognitionException {
		SinfuncContext _localctx = new SinfuncContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_sinfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(SIN);
			setState(793);
			match(LPAREN);
			setState(794);
			expression(0);
			setState(795);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterCosfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitCosfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitCosfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosfuncContext cosfunc() throws RecognitionException {
		CosfuncContext _localctx = new CosfuncContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cosfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(COS);
			setState(798);
			match(LPAREN);
			setState(799);
			expression(0);
			setState(800);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterTanfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitTanfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitTanfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TanfuncContext tanfunc() throws RecognitionException {
		TanfuncContext _localctx = new TanfuncContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tanfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(TAN);
			setState(803);
			match(LPAREN);
			setState(804);
			expression(0);
			setState(805);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAtnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAtnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAtnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtnfuncContext atnfunc() throws RecognitionException {
		AtnfuncContext _localctx = new AtnfuncContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_atnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(ATN);
			setState(808);
			match(LPAREN);
			setState(809);
			expression(0);
			setState(810);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterRndfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitRndfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitRndfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RndfuncContext rndfunc() throws RecognitionException {
		RndfuncContext _localctx = new RndfuncContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_rndfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(RND);
			setState(813);
			match(LPAREN);
			setState(814);
			expression(0);
			setState(815);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterSgnfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitSgnfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitSgnfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SgnfuncContext sgnfunc() throws RecognitionException {
		SgnfuncContext _localctx = new SgnfuncContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sgnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(SGN);
			setState(818);
			match(LPAREN);
			setState(819);
			expression(0);
			setState(820);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterExpfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitExpfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitExpfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpfuncContext expfunc() throws RecognitionException {
		ExpfuncContext _localctx = new ExpfuncContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(EXP);
			setState(823);
			match(LPAREN);
			setState(824);
			expression(0);
			setState(825);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterLogfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitLogfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitLogfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogfuncContext logfunc() throws RecognitionException {
		LogfuncContext _localctx = new LogfuncContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_logfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(LOG);
			setState(828);
			match(LPAREN);
			setState(829);
			expression(0);
			setState(830);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterAbsfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitAbsfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitAbsfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsfuncContext absfunc() throws RecognitionException {
		AbsfuncContext _localctx = new AbsfuncContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_absfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(ABS);
			setState(833);
			match(LPAREN);
			setState(834);
			expression(0);
			setState(835);
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
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterTabfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitTabfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitTabfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabfuncContext tabfunc() throws RecognitionException {
		TabfuncContext _localctx = new TabfuncContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tabfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(TAB);
			setState(838);
			match(LPAREN);
			setState(839);
			expression(0);
			setState(840);
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
		case 62:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0081\u034d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\6\2\u00c4\n\2\r\2\16\2\u00c5\3\2\3\2\3\3\3\3\5\3\u00cc"+
		"\n\3\3\3\3\3\3\3\5\3\u00d1\n\3\7\3\u00d3\n\3\f\3\16\3\u00d6\13\3\3\3\5"+
		"\3\u00d9\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u00e0\n\6\3\6\3\6\5\6\u00e4\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0118\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b\u011f\n\b\f\b\16\b\u0122\13\b\3\t\3\t\5\t\u0126"+
		"\n\t\3\n\3\n\3\n\5\n\u012b\n\n\7\n\u012d\n\n\f\n\16\n\u0130\13\n\3\13"+
		"\3\13\3\13\3\f\5\f\u0136\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5"+
		"\16\u0141\n\16\3\16\3\16\5\16\u0145\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u014f\n\17\3\17\3\17\3\17\5\17\u0154\n\17\5\17\u0156\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0160\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u0166\n\21\f\21\16\21\u0169\13\21\5\21\u016b\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u0171\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u018b\n\31\f\31\16\31\u018e\13\31\5\31\u0190\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u019f"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u01a6\n\34\f\34\16\34\u01a9\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u01b0\n\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u01b7\n\35\f\35\16\35\u01ba\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01d3\n#\7#"+
		"\u01d5\n#\f#\16#\u01d8\13#\3$\3$\5$\u01dc\n$\3%\3%\3%\3%\3%\3%\5%\u01e4"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\5&\u01ed\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f6"+
		"\n\'\3(\3(\5(\u01fa\n(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\5\66\u023c\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0243\n\67\38\38\38\39\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\5=\u0252\n=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0277\n"+
		"?\3@\3@\3@\5@\u027c\n@\3@\5@\u027f\n@\3@\3@\3@\3@\3@\5@\u0286\n@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0294\n@\f@\16@\u0297\13@\3A\3A\5A"+
		"\u029b\nA\3B\3B\7B\u029f\nB\fB\16B\u02a2\13B\3C\3C\3D\3D\3D\7D\u02a9\n"+
		"D\fD\16D\u02ac\13D\3E\3E\3E\7E\u02b1\nE\fE\16E\u02b4\13E\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3"+
		"S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3"+
		"W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3"+
		"[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_"+
		"\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\2\3~b\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\2\f\4\2\17\17||\r\2\33"+
		"\33$$/\61;;BBEGMNddssvwzz\4\2\6\6xx\4\2\"\"++\3\2\27\30\3\2\177\u0080"+
		"\3\2\31\32\3\2\34!\3\2~\177\3\2\3\4\2\u036d\2\u00c3\3\2\2\2\4\u00cb\3"+
		"\2\2\2\6\u00da\3\2\2\2\b\u00dc\3\2\2\2\n\u00e3\3\2\2\2\f\u0117\3\2\2\2"+
		"\16\u0119\3\2\2\2\20\u0123\3\2\2\2\22\u0127\3\2\2\2\24\u0131\3\2\2\2\26"+
		"\u0135\3\2\2\2\30\u0139\3\2\2\2\32\u013d\3\2\2\2\34\u0146\3\2\2\2\36\u0157"+
		"\3\2\2\2 \u0161\3\2\2\2\"\u016c\3\2\2\2$\u0174\3\2\2\2&\u0177\3\2\2\2"+
		"(\u017a\3\2\2\2*\u017d\3\2\2\2,\u0180\3\2\2\2.\u0183\3\2\2\2\60\u0186"+
		"\3\2\2\2\62\u0191\3\2\2\2\64\u0196\3\2\2\2\66\u0199\3\2\2\28\u01aa\3\2"+
		"\2\2:\u01bb\3\2\2\2<\u01c0\3\2\2\2>\u01c3\3\2\2\2@\u01c6\3\2\2\2B\u01ca"+
		"\3\2\2\2D\u01ce\3\2\2\2F\u01db\3\2\2\2H\u01dd\3\2\2\2J\u01e5\3\2\2\2L"+
		"\u01ee\3\2\2\2N\u01f7\3\2\2\2P\u0202\3\2\2\2R\u0207\3\2\2\2T\u020b\3\2"+
		"\2\2V\u020f\3\2\2\2X\u0213\3\2\2\2Z\u0217\3\2\2\2\\\u021b\3\2\2\2^\u0222"+
		"\3\2\2\2`\u0229\3\2\2\2b\u022d\3\2\2\2d\u0230\3\2\2\2f\u0233\3\2\2\2h"+
		"\u0236\3\2\2\2j\u0239\3\2\2\2l\u023d\3\2\2\2n\u0244\3\2\2\2p\u0247\3\2"+
		"\2\2r\u024a\3\2\2\2t\u024c\3\2\2\2v\u024e\3\2\2\2x\u0251\3\2\2\2z\u0255"+
		"\3\2\2\2|\u0276\3\2\2\2~\u0285\3\2\2\2\u0080\u0298\3\2\2\2\u0082\u029c"+
		"\3\2\2\2\u0084\u02a3\3\2\2\2\u0086\u02a5\3\2\2\2\u0088\u02ad\3\2\2\2\u008a"+
		"\u02b5\3\2\2\2\u008c\u02ba\3\2\2\2\u008e\u02bf\3\2\2\2\u0090\u02c4\3\2"+
		"\2\2\u0092\u02c9\3\2\2\2\u0094\u02d2\3\2\2\2\u0096\u02d7\3\2\2\2\u0098"+
		"\u02dc\3\2\2\2\u009a\u02e1\3\2\2\2\u009c\u02e6\3\2\2\2\u009e\u02eb\3\2"+
		"\2\2\u00a0\u02f0\3\2\2\2\u00a2\u02f5\3\2\2\2\u00a4\u02fc\3\2\2\2\u00a6"+
		"\u0303\3\2\2\2\u00a8\u0308\3\2\2\2\u00aa\u030e\3\2\2\2\u00ac\u0313\3\2"+
		"\2\2\u00ae\u031a\3\2\2\2\u00b0\u031f\3\2\2\2\u00b2\u0324\3\2\2\2\u00b4"+
		"\u0329\3\2\2\2\u00b6\u032e\3\2\2\2\u00b8\u0333\3\2\2\2\u00ba\u0338\3\2"+
		"\2\2\u00bc\u033d\3\2\2\2\u00be\u0342\3\2\2\2\u00c0\u0347\3\2\2\2\u00c2"+
		"\u00c4\5\4\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\2\2\3\u00c8"+
		"\3\3\2\2\2\u00c9\u00cc\5\b\5\2\u00ca\u00cc\7{\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d8\3\2\2\2\u00cd\u00d4"+
		"\5\n\6\2\u00ce\u00d0\7\"\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\t\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\5\3\2\2\2\u00da\u00db\7r\2\2\u00db\7\3\2\2\2\u00dc\u00dd\7"+
		"\177\2\2\u00dd\t\3\2\2\2\u00de\u00e0\5\6\4\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\5\f\7\2\u00e2\u00e4\t\2"+
		"\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\13\3\2\2\2\u00e5\u0118"+
		"\t\3\2\2\u00e6\u0118\5r:\2\u00e7\u0118\5t;\2\u00e8\u0118\5v<\2\u00e9\u0118"+
		"\5n8\2\u00ea\u0118\5l\67\2\u00eb\u0118\5j\66\2\u00ec\u0118\5f\64\2\u00ed"+
		"\u0118\5\24\13\2\u00ee\u0118\5h\65\2\u00ef\u0118\5 \21\2\u00f0\u0118\5"+
		"d\63\2\u00f1\u0118\5b\62\2\u00f2\u0118\5`\61\2\u00f3\u0118\5\\/\2\u00f4"+
		"\u0118\5^\60\2\u00f5\u0118\5X-\2\u00f6\u0118\5R*\2\u00f7\u0118\5V,\2\u00f8"+
		"\u0118\5T+\2\u00f9\u0118\5Z.\2\u00fa\u0118\5@!\2\u00fb\u0118\5B\"\2\u00fc"+
		"\u0118\5\20\t\2\u00fd\u0118\5\62\32\2\u00fe\u0118\5:\36\2\u00ff\u0118"+
		"\5\32\16\2\u0100\u0118\5\34\17\2\u0101\u0118\5\36\20\2\u0102\u0118\5\""+
		"\22\2\u0103\u0118\5P)\2\u0104\u0118\5&\24\2\u0105\u0118\5(\25\2\u0106"+
		"\u0118\5*\26\2\u0107\u0118\5,\27\2\u0108\u0118\5\60\31\2\u0109\u0118\5"+
		".\30\2\u010a\u0118\5\64\33\2\u010b\u0118\5$\23\2\u010c\u0118\5\66\34\2"+
		"\u010d\u0118\58\35\2\u010e\u0118\5<\37\2\u010f\u0118\5> \2\u0110\u0118"+
		"\5H%\2\u0111\u0118\5D#\2\u0112\u0118\5J&\2\u0113\u0118\5L\'\2\u0114\u0118"+
		"\5N(\2\u0115\u0118\5\26\f\2\u0116\u0118\5p9\2\u0117\u00e5\3\2\2\2\u0117"+
		"\u00e6\3\2\2\2\u0117\u00e7\3\2\2\2\u0117\u00e8\3\2\2\2\u0117\u00e9\3\2"+
		"\2\2\u0117\u00ea\3\2\2\2\u0117\u00eb\3\2\2\2\u0117\u00ec\3\2\2\2\u0117"+
		"\u00ed\3\2\2\2\u0117\u00ee\3\2\2\2\u0117\u00ef\3\2\2\2\u0117\u00f0\3\2"+
		"\2\2\u0117\u00f1\3\2\2\2\u0117\u00f2\3\2\2\2\u0117\u00f3\3\2\2\2\u0117"+
		"\u00f4\3\2\2\2\u0117\u00f5\3\2\2\2\u0117\u00f6\3\2\2\2\u0117\u00f7\3\2"+
		"\2\2\u0117\u00f8\3\2\2\2\u0117\u00f9\3\2\2\2\u0117\u00fa\3\2\2\2\u0117"+
		"\u00fb\3\2\2\2\u0117\u00fc\3\2\2\2\u0117\u00fd\3\2\2\2\u0117\u00fe\3\2"+
		"\2\2\u0117\u00ff\3\2\2\2\u0117\u0100\3\2\2\2\u0117\u0101\3\2\2\2\u0117"+
		"\u0102\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0104\3\2\2\2\u0117\u0105\3\2"+
		"\2\2\u0117\u0106\3\2\2\2\u0117\u0107\3\2\2\2\u0117\u0108\3\2\2\2\u0117"+
		"\u0109\3\2\2\2\u0117\u010a\3\2\2\2\u0117\u010b\3\2\2\2\u0117\u010c\3\2"+
		"\2\2\u0117\u010d\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u010f\3\2\2\2\u0117"+
		"\u0110\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2"+
		"\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\r\3\2\2\2\u0119\u0120\5\u0080A\2\u011a\u011b\7\25\2\2\u011b\u011c\5\u0088"+
		"E\2\u011c\u011d\7\26\2\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\17\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0125\t\4\2\2\u0124\u0126\5\22\n\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\21\3\2\2\2\u0127\u012e\5~@\2"+
		"\u0128\u012a\t\5\2\2\u0129\u012b\5~@\2\u012a\u0129\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\23\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0131\u0132\7p\2\2\u0132\u0133\5\u0088E\2\u0133\25\3\2\2\2\u0134\u0136"+
		"\7&\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\5\30\r\2\u0138\27\3\2\2\2\u0139\u013a\5\16\b\2\u013a\u013b\7!\2"+
		"\2\u013b\u013c\5\u0088E\2\u013c\31\3\2\2\2\u013d\u013e\7\f\2\2\u013e\u0140"+
		"\5~@\2\u013f\u0141\7\16\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0145\5\f\7\2\u0143\u0145\5\b\5\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0143\3\2\2\2\u0145\33\3\2\2\2\u0146\u0147\7\'\2\2\u0147\u0148"+
		"\5\16\b\2\u0148\u0149\7!\2\2\u0149\u014a\5~@\2\u014a\u014b\7(\2\2\u014b"+
		"\u014e\5~@\2\u014c\u014d\7)\2\2\u014d\u014f\5~@\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0155\3\2\2\2\u0150\u0151\5\f\7\2\u0151\u0153"+
		"\7\r\2\2\u0152\u0154\5\16\b\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0156\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0156\3\2\2\2\u0156\35"+
		"\3\2\2\2\u0157\u0158\7\'\2\2\u0158\u0159\5\16\b\2\u0159\u015a\7!\2\2\u015a"+
		"\u015b\5~@\2\u015b\u015c\7(\2\2\u015c\u015f\5~@\2\u015d\u015e\7)\2\2\u015e"+
		"\u0160\5~@\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\37\3\2\2\2"+
		"\u0161\u016a\7\r\2\2\u0162\u0167\5\16\b\2\u0163\u0164\7\"\2\2\u0164\u0166"+
		"\5\16\b\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0162"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b!\3\2\2\2\u016c\u0170\7*\2\2\u016d\u016e"+
		"\5z>\2\u016e\u016f\t\5\2\2\u016f\u0171\3\2\2\2\u0170\u016d\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\u0086D\2\u0173#\3\2\2"+
		"\2\u0174\u0175\7S\2\2\u0175\u0176\5\u0086D\2\u0176%\3\2\2\2\u0177\u0178"+
		"\7,\2\2\u0178\u0179\5\u0086D\2\u0179\'\3\2\2\2\u017a\u017b\7\7\2\2\u017b"+
		"\u017c\5\b\5\2\u017c)\3\2\2\2\u017d\u017e\7\b\2\2\u017e\u017f\5~@\2\u017f"+
		"+\3\2\2\2\u0180\u0181\7\t\2\2\u0181\u0182\5~@\2\u0182-\3\2\2\2\u0183\u0184"+
		"\7\13\2\2\u0184\u0185\5\16\b\2\u0185/\3\2\2\2\u0186\u018f\7\n\2\2\u0187"+
		"\u018c\5\16\b\2\u0188\u0189\7\"\2\2\u0189\u018b\5\16\b\2\u018a\u0188\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\61\3\2\2\2\u0191\u0192\7@\2\2\u0192\u0193\5~@\2\u0193\u0194"+
		"\7\"\2\2\u0194\u0195\5~@\2\u0195\63\3\2\2\2\u0196\u0197\7\63\2\2\u0197"+
		"\u0198\5\u0088E\2\u0198\65\3\2\2\2\u0199\u019e\7\65\2\2\u019a\u019b\5"+
		"~@\2\u019b\u019c\7\"\2\2\u019c\u019d\5~@\2\u019d\u019f\3\2\2\2\u019e\u019a"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a7\3\2\2\2\u01a0\u01a1\7(\2\2\u01a1"+
		"\u01a2\5~@\2\u01a2\u01a3\7\"\2\2\u01a3\u01a4\5~@\2\u01a4\u01a6\3\2\2\2"+
		"\u01a5\u01a0\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\67\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01af\7\66\2\2\u01ab"+
		"\u01ac\5~@\2\u01ac\u01ad\7\"\2\2\u01ad\u01ae\5~@\2\u01ae\u01b0\3\2\2\2"+
		"\u01af\u01ab\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b8\3\2\2\2\u01b1\u01b2"+
		"\7(\2\2\u01b2\u01b3\5~@\2\u01b3\u01b4\7\"\2\2\u01b4\u01b5\5~@\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b99\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc"+
		"\7>\2\2\u01bc\u01bd\5~@\2\u01bd\u01be\7\"\2\2\u01be\u01bf\5~@\2\u01bf"+
		";\3\2\2\2\u01c0\u01c1\79\2\2\u01c1\u01c2\5~@\2\u01c2=\3\2\2\2\u01c3\u01c4"+
		"\7:\2\2\u01c4\u01c5\5~@\2\u01c5?\3\2\2\2\u01c6\u01c7\7C\2\2\u01c7\u01c8"+
		"\7.\2\2\u01c8\u01c9\5~@\2\u01c9A\3\2\2\2\u01ca\u01cb\7D\2\2\u01cb\u01cc"+
		"\7.\2\2\u01cc\u01cd\5~@\2\u01cdC\3\2\2\2\u01ce\u01cf\7Q\2\2\u01cf\u01d6"+
		"\5F$\2\u01d0\u01d2\7\"\2\2\u01d1\u01d3\5F$\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5\u01d8\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7E\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d9\u01dc\5x=\2\u01da\u01dc\5z>\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01da\3\2\2\2\u01dcG\3\2\2\2\u01dd\u01de\7R\2\2\u01de\u01df\5~@\2\u01df"+
		"\u01e0\7\"\2\2\u01e0\u01e3\5~@\2\u01e1\u01e2\7\"\2\2\u01e2\u01e4\5~@\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4I\3\2\2\2\u01e5\u01e6\7"+
		"T\2\2\u01e6\u01ec\5~@\2\u01e7\u01e8\7V\2\2\u01e8\u01e9\5~@\2\u01e9\u01ea"+
		"\7\"\2\2\u01ea\u01eb\5~@\2\u01eb\u01ed\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01edK\3\2\2\2\u01ee\u01ef\7U\2\2\u01ef\u01f5\5~@\2\u01f0"+
		"\u01f1\7V\2\2\u01f1\u01f2\5~@\2\u01f2\u01f3\7\"\2\2\u01f3\u01f4\5~@\2"+
		"\u01f4\u01f6\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6M\3"+
		"\2\2\2\u01f7\u01f9\7W\2\2\u01f8\u01fa\7X\2\2\u01f9\u01f8\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5\u0080A\2\u01fc\u01fd"+
		"\7\25\2\2\u01fd\u01fe\5\u0080A\2\u01fe\u01ff\7\26\2\2\u01ff\u0200\7!\2"+
		"\2\u0200\u0201\5~@\2\u0201O\3\2\2\2\u0202\u0203\7Z\2\2\u0203\u0204\7\25"+
		"\2\2\u0204\u0205\5~@\2\u0205\u0206\7\26\2\2\u0206Q\3\2\2\2\u0207\u0208"+
		"\7[\2\2\u0208\u0209\7!\2\2\u0209\u020a\5~@\2\u020aS\3\2\2\2\u020b\u020c"+
		"\7\\\2\2\u020c\u020d\7!\2\2\u020d\u020e\5~@\2\u020eU\3\2\2\2\u020f\u0210"+
		"\7]\2\2\u0210\u0211\7!\2\2\u0211\u0212\5~@\2\u0212W\3\2\2\2\u0213\u0214"+
		"\7^\2\2\u0214\u0215\7!\2\2\u0215\u0216\5~@\2\u0216Y\3\2\2\2\u0217\u0218"+
		"\7_\2\2\u0218\u0219\7!\2\2\u0219\u021a\5~@\2\u021a[\3\2\2\2\u021b\u021c"+
		"\7`\2\2\u021c\u021d\5~@\2\u021d\u021e\7\"\2\2\u021e\u021f\5~@\2\u021f"+
		"\u0220\7V\2\2\u0220\u0221\5~@\2\u0221]\3\2\2\2\u0222\u0223\7a\2\2\u0223"+
		"\u0224\5~@\2\u0224\u0225\7\"\2\2\u0225\u0226\5~@\2\u0226\u0227\7V\2\2"+
		"\u0227\u0228\5~@\2\u0228_\3\2\2\2\u0229\u022a\7H\2\2\u022a\u022b\7\7\2"+
		"\2\u022b\u022c\5\b\5\2\u022ca\3\2\2\2\u022d\u022e\7\67\2\2\u022e\u022f"+
		"\7\177\2\2\u022fc\3\2\2\2\u0230\u0231\78\2\2\u0231\u0232\7\177\2\2\u0232"+
		"e\3\2\2\2\u0233\u0234\7n\2\2\u0234\u0235\5\16\b\2\u0235g\3\2\2\2\u0236"+
		"\u0237\7o\2\2\u0237\u0238\5\16\b\2\u0238i\3\2\2\2\u0239\u023b\7#\2\2\u023a"+
		"\u023c\5~@\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023ck\3\2\2\2\u023d"+
		"\u0242\7c\2\2\u023e\u023f\5~@\2\u023f\u0240\7\"\2\2\u0240\u0241\5~@\2"+
		"\u0241\u0243\3\2\2\2\u0242\u023e\3\2\2\2\u0242\u0243\3\2\2\2\u0243m\3"+
		"\2\2\2\u0244\u0245\7r\2\2\u0245\u0246\5~@\2\u0246o\3\2\2\2\u0247\u0248"+
		"\7y\2\2\u0248\u0249\5~@\2\u0249q\3\2\2\2\u024a\u024b\7%\2\2\u024bs\3\2"+
		"\2\2\u024c\u024d\7\5\2\2\u024du\3\2\2\2\u024e\u024f\7u\2\2\u024fw\3\2"+
		"\2\2\u0250\u0252\t\6\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\t\7\2\2\u0254y\3\2\2\2\u0255\u0256\7}\2\2\u0256"+
		"{\3\2\2\2\u0257\u0277\5z>\2\u0258\u0277\5x=\2\u0259\u0277\5\u00c0a\2\u025a"+
		"\u0277\5\16\b\2\u025b\u0277\5\u008cG\2\u025c\u0277\5\u008aF\2\u025d\u0277"+
		"\5\u008eH\2\u025e\u0277\5\u00a6T\2\u025f\u0277\5\u0090I\2\u0260\u0277"+
		"\5\u00acW\2\u0261\u0277\5\u0092J\2\u0262\u0277\5\u0094K\2\u0263\u0277"+
		"\5\u0096L\2\u0264\u0277\5\u0098M\2\u0265\u0277\5\u009aN\2\u0266\u0277"+
		"\5\u009cO\2\u0267\u0277\5\u009eP\2\u0268\u0277\5\u00a0Q\2\u0269\u0277"+
		"\5\u00a2R\2\u026a\u0277\5\u00aaV\2\u026b\u0277\5\u00a4S\2\u026c\u0277"+
		"\5\u00a8U\2\u026d\u0277\5\u00aeX\2\u026e\u0277\5\u00b0Y\2\u026f\u0277"+
		"\5\u00b2Z\2\u0270\u0277\5\u00b4[\2\u0271\u0277\5\u00b6\\\2\u0272\u0277"+
		"\5\u00b8]\2\u0273\u0277\5\u00ba^\2\u0274\u0277\5\u00bc_\2\u0275\u0277"+
		"\5\u00be`\2\u0276\u0257\3\2\2\2\u0276\u0258\3\2\2\2\u0276\u0259\3\2\2"+
		"\2\u0276\u025a\3\2\2\2\u0276\u025b\3\2\2\2\u0276\u025c\3\2\2\2\u0276\u025d"+
		"\3\2\2\2\u0276\u025e\3\2\2\2\u0276\u025f\3\2\2\2\u0276\u0260\3\2\2\2\u0276"+
		"\u0261\3\2\2\2\u0276\u0262\3\2\2\2\u0276\u0263\3\2\2\2\u0276\u0264\3\2"+
		"\2\2\u0276\u0265\3\2\2\2\u0276\u0266\3\2\2\2\u0276\u0267\3\2\2\2\u0276"+
		"\u0268\3\2\2\2\u0276\u0269\3\2\2\2\u0276\u026a\3\2\2\2\u0276\u026b\3\2"+
		"\2\2\u0276\u026c\3\2\2\2\u0276\u026d\3\2\2\2\u0276\u026e\3\2\2\2\u0276"+
		"\u026f\3\2\2\2\u0276\u0270\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2"+
		"\2\2\u0276\u0273\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"}\3\2\2\2\u0278\u0279\b@\1\2\u0279\u0286\5|?\2\u027a\u027c\7t\2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\t\6"+
		"\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0286\5|?\2\u0281\u0282\7\25\2\2\u0282\u0283\5~@\2\u0283\u0284\7\26\2"+
		"\2\u0284\u0286\3\2\2\2\u0285\u0278\3\2\2\2\u0285\u027b\3\2\2\2\u0285\u0281"+
		"\3\2\2\2\u0286\u0295\3\2\2\2\u0287\u0288\f\7\2\2\u0288\u0289\7q\2\2\u0289"+
		"\u0294\5~@\7\u028a\u028b\f\6\2\2\u028b\u028c\t\b\2\2\u028c\u0294\5~@\7"+
		"\u028d\u028e\f\5\2\2\u028e\u028f\t\6\2\2\u028f\u0294\5~@\6\u0290\u0291"+
		"\f\4\2\2\u0291\u0292\t\t\2\2\u0292\u0294\5~@\5\u0293\u0287\3\2\2\2\u0293"+
		"\u028a\3\2\2\2\u0293\u028d\3\2\2\2\u0293\u0290\3\2\2\2\u0294\u0297\3\2"+
		"\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\177\3\2\2\2\u0297\u0295"+
		"\3\2\2\2\u0298\u029a\5\u0082B\2\u0299\u029b\5\u0084C\2\u029a\u0299\3\2"+
		"\2\2\u029a\u029b\3\2\2\2\u029b\u0081\3\2\2\2\u029c\u02a0\7~\2\2\u029d"+
		"\u029f\t\n\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2"+
		"\2\2\u02a0\u02a1\3\2\2\2\u02a1\u0083\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02a4\t\13\2\2\u02a4\u0085\3\2\2\2\u02a5\u02aa\5\16\b\2\u02a6\u02a7\7"+
		"\"\2\2\u02a7\u02a9\5\16\b\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u0087\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02b2\5~@\2\u02ae\u02af\7\"\2\2\u02af\u02b1\5~@\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u0089\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\7-\2\2\u02b6\u02b7\7\25"+
		"\2\2\u02b7\u02b8\5~@\2\u02b8\u02b9\7\26\2\2\u02b9\u008b\3\2\2\2\u02ba"+
		"\u02bb\7\20\2\2\u02bb\u02bc\7\25\2\2\u02bc\u02bd\5~@\2\u02bd\u02be\7\26"+
		"\2\2\u02be\u008d\3\2\2\2\u02bf\u02c0\7\62\2\2\u02c0\u02c1\7\25\2\2\u02c1"+
		"\u02c2\5~@\2\u02c2\u02c3\7\26\2\2\u02c3\u008f\3\2\2\2\u02c4\u02c5\7\64"+
		"\2\2\u02c5\u02c6\7\25\2\2\u02c6\u02c7\5~@\2\u02c7\u02c8\7\26\2\2\u02c8"+
		"\u0091\3\2\2\2\u02c9\u02ca\7\21\2\2\u02ca\u02cb\7\25\2\2\u02cb\u02cc\5"+
		"~@\2\u02cc\u02cd\7\"\2\2\u02cd\u02ce\5~@\2\u02ce\u02cf\7\"\2\2\u02cf\u02d0"+
		"\5~@\2\u02d0\u02d1\7\26\2\2\u02d1\u0093\3\2\2\2\u02d2\u02d3\7=\2\2\u02d3"+
		"\u02d4\7\25\2\2\u02d4\u02d5\5~@\2\u02d5\u02d6\7\26\2\2\u02d6\u0095\3\2"+
		"\2\2\u02d7\u02d8\7?\2\2\u02d8\u02d9\7\25\2\2\u02d9\u02da\5~@\2\u02da\u02db"+
		"\7\26\2\2\u02db\u0097\3\2\2\2\u02dc\u02dd\7A\2\2\u02dd\u02de\7\25\2\2"+
		"\u02de\u02df\5~@\2\u02df\u02e0\7\26\2\2\u02e0\u0099\3\2\2\2\u02e1\u02e2"+
		"\7I\2\2\u02e2\u02e3\7\25\2\2\u02e3\u02e4\5~@\2\u02e4\u02e5\7\26\2\2\u02e5"+
		"\u009b\3\2\2\2\u02e6\u02e7\7J\2\2\u02e7\u02e8\7\25\2\2\u02e8\u02e9\5~"+
		"@\2\u02e9\u02ea\7\26\2\2\u02ea\u009d\3\2\2\2\u02eb\u02ec\7K\2\2\u02ec"+
		"\u02ed\7\25\2\2\u02ed\u02ee\5~@\2\u02ee\u02ef\7\26\2\2\u02ef\u009f\3\2"+
		"\2\2\u02f0\u02f1\7L\2\2\u02f1\u02f2\7\25\2\2\u02f2\u02f3\5~@\2\u02f3\u02f4"+
		"\7\26\2\2\u02f4\u00a1\3\2\2\2\u02f5\u02f6\7\22\2\2\u02f6\u02f7\7\25\2"+
		"\2\u02f7\u02f8\5~@\2\u02f8\u02f9\7\"\2\2\u02f9\u02fa\5~@\2\u02fa\u02fb"+
		"\7\26\2\2\u02fb\u00a3\3\2\2\2\u02fc\u02fd\7\23\2\2\u02fd\u02fe\7\25\2"+
		"\2\u02fe\u02ff\5~@\2\u02ff\u0300\7\"\2\2\u0300\u0301\5~@\2\u0301\u0302"+
		"\7\26\2\2\u0302\u00a5\3\2\2\2\u0303\u0304\7\24\2\2\u0304\u0305\7\25\2"+
		"\2\u0305\u0306\5~@\2\u0306\u0307\7\26\2\2\u0307\u00a7\3\2\2\2\u0308\u0309"+
		"\7X\2\2\u0309\u030a\5\u0080A\2\u030a\u030b\7\25\2\2\u030b\u030c\5~@\2"+
		"\u030c\u030d\7\26\2\2\u030d\u00a9\3\2\2\2\u030e\u030f\7Y\2\2\u030f\u0310"+
		"\7\25\2\2\u0310\u0311\5~@\2\u0311\u0312\7\26\2\2\u0312\u00ab\3\2\2\2\u0313"+
		"\u0314\7b\2\2\u0314\u0315\7\25\2\2\u0315\u0316\5~@\2\u0316\u0317\7\"\2"+
		"\2\u0317\u0318\5~@\2\u0318\u0319\7\26\2\2\u0319\u00ad\3\2\2\2\u031a\u031b"+
		"\7e\2\2\u031b\u031c\7\25\2\2\u031c\u031d\5~@\2\u031d\u031e\7\26\2\2\u031e"+
		"\u00af\3\2\2\2\u031f\u0320\7f\2\2\u0320\u0321\7\25\2\2\u0321\u0322\5~"+
		"@\2\u0322\u0323\7\26\2\2\u0323\u00b1\3\2\2\2\u0324\u0325\7g\2\2\u0325"+
		"\u0326\7\25\2\2\u0326\u0327\5~@\2\u0327\u0328\7\26\2\2\u0328\u00b3\3\2"+
		"\2\2\u0329\u032a\7h\2\2\u032a\u032b\7\25\2\2\u032b\u032c\5~@\2\u032c\u032d"+
		"\7\26\2\2\u032d\u00b5\3\2\2\2\u032e\u032f\7i\2\2\u032f\u0330\7\25\2\2"+
		"\u0330\u0331\5~@\2\u0331\u0332\7\26\2\2\u0332\u00b7\3\2\2\2\u0333\u0334"+
		"\7j\2\2\u0334\u0335\7\25\2\2\u0335\u0336\5~@\2\u0336\u0337\7\26\2\2\u0337"+
		"\u00b9\3\2\2\2\u0338\u0339\7k\2\2\u0339\u033a\7\25\2\2\u033a\u033b\5~"+
		"@\2\u033b\u033c\7\26\2\2\u033c\u00bb\3\2\2\2\u033d\u033e\7l\2\2\u033e"+
		"\u033f\7\25\2\2\u033f\u0340\5~@\2\u0340\u0341\7\26\2\2\u0341\u00bd\3\2"+
		"\2\2\u0342\u0343\7m\2\2\u0343\u0344\7\25\2\2\u0344\u0345\5~@\2\u0345\u0346"+
		"\7\26\2\2\u0346\u00bf\3\2\2\2\u0347\u0348\7Z\2\2\u0348\u0349\7\25\2\2"+
		"\u0349\u034a\5~@\2\u034a\u034b\7\26\2\2\u034b\u00c1\3\2\2\2\62\u00c5\u00cb"+
		"\u00d0\u00d4\u00d8\u00df\u00e3\u0117\u0120\u0125\u012a\u012e\u0135\u0140"+
		"\u0144\u014e\u0153\u0155\u015f\u0167\u016a\u0170\u018c\u018f\u019e\u01a7"+
		"\u01af\u01b8\u01d2\u01d6\u01db\u01e3\u01ec\u01f5\u01f9\u023b\u0242\u0251"+
		"\u0276\u027b\u027e\u0285\u0293\u0295\u029a\u02a0\u02aa\u02b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}