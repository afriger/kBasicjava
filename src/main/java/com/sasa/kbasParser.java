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
		NEQ=26, GTE=27, LTE=28, GT=29, LT=30, EQ=31, COMMA=32, NEWLINE=33, LIST=34, 
		RUN=35, END=36, LET=37, FOR=38, TO=39, STEP=40, INPUT=41, SEMICOLON=42, 
		DIM=43, SQR=44, COLON=45, TEXT=46, HGR=47, HGR2=48, LEN=49, CALL=50, ASC=51, 
		HPLOT=52, VPLOT=53, PRNUMBER=54, INNUMBER=55, VTAB=56, HTAB=57, HOME=58, 
		ON=59, PDL=60, PLOT=61, PEEK=62, POKE=63, INTF=64, STOP=65, HIMEM=66, 
		LOMEM=67, FLASH=68, INVERSE=69, NORMAL=70, ONERR=71, SPC=72, FRE=73, POS=74, 
		USR=75, TRACE=76, NOTRACE=77, AND=78, OR=79, DATA=80, WAIT=81, READ=82, 
		XDRAW=83, DRAW=84, AT=85, DEF=86, FN=87, VAL=88, TAB=89, SPEED=90, ROT=91, 
		SCALE=92, COLOR=93, HCOLOR=94, HLIN=95, VLIN=96, SCRN=97, POP=98, SHLOAD=99, 
		SIN=100, COS=101, TAN=102, ATN=103, RND=104, SGN=105, EXP=106, LOG=107, 
		ABS=108, STORE=109, RECALL=110, GET=111, EXPONENT=112, AMPERSAND=113, 
		GR=114, NOT=115, RESTORE=116, SAVE=117, LOAD=118, QUESTION=119, INCLUDE=120, 
		CLS=121, STATUS=122, COMMENT=123, STRINGLITERAL=124, LETTERS=125, NUMBER=126, 
		FLOAT=127, WS=128;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_amperoper = 2, RULE_linenumber = 3, 
		RULE_amprstmt = 4, RULE_block = 5, RULE_statement = 6, RULE_vardecl = 7, 
		RULE_printstmt1 = 8, RULE_printlist = 9, RULE_getstmt = 10, RULE_letstmt = 11, 
		RULE_variableassignment = 12, RULE_ifstmt = 13, RULE_forstmt11 = 14, RULE_forstmt1 = 15, 
		RULE_forstmt2 = 16, RULE_nextstmt = 17, RULE_inputstmt = 18, RULE_readstmt = 19, 
		RULE_dimstmt = 20, RULE_gotostmt = 21, RULE_gosubstmt = 22, RULE_gpsstmt = 23, 
		RULE_returnsubstmt = 24, RULE_psstmt = 25, RULE_pokestmt = 26, RULE_callstmt = 27, 
		RULE_hplotstmt = 28, RULE_vplotstmt = 29, RULE_plotstmt = 30, RULE_vtabstmnt = 31, 
		RULE_htabstmnt = 32, RULE_himemstmt = 33, RULE_lomemstmt = 34, RULE_datastmt = 35, 
		RULE_datum = 36, RULE_waitstmt = 37, RULE_xdrawstmt = 38, RULE_drawstmt = 39, 
		RULE_defstmt = 40, RULE_tabstmt = 41, RULE_speedstmt = 42, RULE_rotstmt = 43, 
		RULE_scalestmt = 44, RULE_colorstmt = 45, RULE_hcolorstmt = 46, RULE_hlinstmt = 47, 
		RULE_vlinstmt = 48, RULE_onerrstmt = 49, RULE_prstmt = 50, RULE_instmt = 51, 
		RULE_storestmt = 52, RULE_recallstmt = 53, RULE_liststmt = 54, RULE_popstmt = 55, 
		RULE_amptstmt = 56, RULE_includestmt = 57, RULE_endstmt = 58, RULE_returnstmt = 59, 
		RULE_restorestmt = 60, RULE_number = 61, RULE_stringer = 62, RULE_func = 63, 
		RULE_expression = 64, RULE_var = 65, RULE_varname = 66, RULE_varsuffix = 67, 
		RULE_varlist = 68, RULE_exprlist = 69, RULE_sqrfunc = 70, RULE_chrfunc = 71, 
		RULE_lenfunc = 72, RULE_ascfunc = 73, RULE_midfunc = 74, RULE_pdlfunc = 75, 
		RULE_peekfunc = 76, RULE_intfunc = 77, RULE_spcfunc = 78, RULE_frefunc = 79, 
		RULE_posfunc = 80, RULE_usrfunc = 81, RULE_leftfunc = 82, RULE_rightfunc = 83, 
		RULE_strfunc = 84, RULE_fnfunc = 85, RULE_valfunc = 86, RULE_scrnfunc = 87, 
		RULE_sinfunc = 88, RULE_cosfunc = 89, RULE_tanfunc = 90, RULE_atnfunc = 91, 
		RULE_rndfunc = 92, RULE_sgnfunc = 93, RULE_expfunc = 94, RULE_logfunc = 95, 
		RULE_absfunc = 96, RULE_tabfunc = 97;
	public static final String[] ruleNames = {
		"prog", "line", "amperoper", "linenumber", "amprstmt", "block", "statement", 
		"vardecl", "printstmt1", "printlist", "getstmt", "letstmt", "variableassignment", 
		"ifstmt", "forstmt11", "forstmt1", "forstmt2", "nextstmt", "inputstmt", 
		"readstmt", "dimstmt", "gotostmt", "gosubstmt", "gpsstmt", "returnsubstmt", 
		"psstmt", "pokestmt", "callstmt", "hplotstmt", "vplotstmt", "plotstmt", 
		"vtabstmnt", "htabstmnt", "himemstmt", "lomemstmt", "datastmt", "datum", 
		"waitstmt", "xdrawstmt", "drawstmt", "defstmt", "tabstmt", "speedstmt", 
		"rotstmt", "scalestmt", "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", 
		"onerrstmt", "prstmt", "instmt", "storestmt", "recallstmt", "liststmt", 
		"popstmt", "amptstmt", "includestmt", "endstmt", "returnstmt", "restorestmt", 
		"number", "stringer", "func", "expression", "var", "varname", "varsuffix", 
		"varlist", "exprlist", "sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", 
		"pdlfunc", "peekfunc", "intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", 
		"leftfunc", "rightfunc", "strfunc", "fnfunc", "valfunc", "scrnfunc", "sinfunc", 
		"cosfunc", "tanfunc", "atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", 
		"absfunc", "tabfunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'%'", null, null, null, null, null, null, null, null, null, 
		null, null, "'CHR$'", "'MID$'", "'LEFT$'", "'RIGHT$'", "'STR$'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", null, "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'='", "','", null, null, null, null, null, null, null, null, null, 
		"';'", null, null, "':'", null, null, null, null, null, null, null, null, 
		"'PR#'", "'IN#'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'^'", 
		"'&'", null, null, null, null, null, "'?'", null, null, "'S'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOLLAR", "PERCENT", "RETURN", "PRINT", "GOTO", "GOSUB", "GPS", 
		"PS", "RPS", "IF", "NEXT", "THEN", "REM", "CHR", "MID", "LEFT", "RIGHT", 
		"STR", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "CLEAR", "NEQ", 
		"GTE", "LTE", "GT", "LT", "EQ", "COMMA", "NEWLINE", "LIST", "RUN", "END", 
		"LET", "FOR", "TO", "STEP", "INPUT", "SEMICOLON", "DIM", "SQR", "COLON", 
		"TEXT", "HGR", "HGR2", "LEN", "CALL", "ASC", "HPLOT", "VPLOT", "PRNUMBER", 
		"INNUMBER", "VTAB", "HTAB", "HOME", "ON", "PDL", "PLOT", "PEEK", "POKE", 
		"INTF", "STOP", "HIMEM", "LOMEM", "FLASH", "INVERSE", "NORMAL", "ONERR", 
		"SPC", "FRE", "POS", "USR", "TRACE", "NOTRACE", "AND", "OR", "DATA", "WAIT", 
		"READ", "XDRAW", "DRAW", "AT", "DEF", "FN", "VAL", "TAB", "SPEED", "ROT", 
		"SCALE", "COLOR", "HCOLOR", "HLIN", "VLIN", "SCRN", "POP", "SHLOAD", "SIN", 
		"COS", "TAN", "ATN", "RND", "SGN", "EXP", "LOG", "ABS", "STORE", "RECALL", 
		"GET", "EXPONENT", "AMPERSAND", "GR", "NOT", "RESTORE", "SAVE", "LOAD", 
		"QUESTION", "INCLUDE", "CLS", "STATUS", "COMMENT", "STRINGLITERAL", "LETTERS", 
		"NUMBER", "FLOAT", "WS"
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
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				line();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << GOTO) | (1L << GOSUB) | (1L << GPS) | (1L << PS) | (1L << RPS) | (1L << IF) | (1L << NEXT) | (1L << REM) | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << LET) | (1L << FOR) | (1L << INPUT) | (1L << DIM) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << CALL) | (1L << HPLOT) | (1L << VPLOT) | (1L << PRNUMBER) | (1L << INNUMBER) | (1L << VTAB) | (1L << HTAB) | (1L << HOME) | (1L << PLOT) | (1L << POKE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (STOP - 65)) | (1L << (HIMEM - 65)) | (1L << (LOMEM - 65)) | (1L << (FLASH - 65)) | (1L << (INVERSE - 65)) | (1L << (NORMAL - 65)) | (1L << (ONERR - 65)) | (1L << (TRACE - 65)) | (1L << (NOTRACE - 65)) | (1L << (DATA - 65)) | (1L << (WAIT - 65)) | (1L << (READ - 65)) | (1L << (XDRAW - 65)) | (1L << (DRAW - 65)) | (1L << (DEF - 65)) | (1L << (TAB - 65)) | (1L << (SPEED - 65)) | (1L << (ROT - 65)) | (1L << (SCALE - 65)) | (1L << (COLOR - 65)) | (1L << (HCOLOR - 65)) | (1L << (HLIN - 65)) | (1L << (VLIN - 65)) | (1L << (POP - 65)) | (1L << (SHLOAD - 65)) | (1L << (STORE - 65)) | (1L << (RECALL - 65)) | (1L << (GET - 65)) | (1L << (AMPERSAND - 65)) | (1L << (GR - 65)) | (1L << (RESTORE - 65)) | (1L << (SAVE - 65)) | (1L << (LOAD - 65)) | (1L << (QUESTION - 65)) | (1L << (INCLUDE - 65)) | (1L << (CLS - 65)) | (1L << (STATUS - 65)) | (1L << (COMMENT - 65)) | (1L << (LETTERS - 65)) | (1L << (NUMBER - 65)))) != 0) );
			setState(201);
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
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(203);
				linenumber();
				}
				break;
			case STATUS:
				{
				setState(204);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(207);
				amprstmt();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(209);
						amprstmt();
						}
						break;
					}
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(217);
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
		catch (RecognitionException re) {
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
			setState(220);
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
			setState(222);
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
		public AmperoperContext amperoper() {
			return getRuleContext(AmperoperContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				amperoper();
				setState(225);
				statement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(227);
				statement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(kbasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(kbasParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					line();
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(232);
						match(NEWLINE);
						}
						}
						setState(235); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLEAR) | (1L << RUN) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << HOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (STOP - 65)) | (1L << (FLASH - 65)) | (1L << (INVERSE - 65)) | (1L << (NORMAL - 65)) | (1L << (TRACE - 65)) | (1L << (NOTRACE - 65)) | (1L << (SHLOAD - 65)) | (1L << (GR - 65)) | (1L << (SAVE - 65)) | (1L << (LOAD - 65)) | (1L << (CLS - 65)))) != 0)) ) {
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
				setState(243);
				endstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				restorestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				amptstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				popstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				liststmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				storestmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				getstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				recallstmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
				nextstmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(253);
				instmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				prstmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(255);
				onerrstmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				hlinstmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(257);
				vlinstmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(258);
				colorstmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(259);
				speedstmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(260);
				scalestmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(261);
				rotstmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(262);
				hcolorstmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(263);
				himemstmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(264);
				lomemstmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(265);
				printstmt1();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(266);
				pokestmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(267);
				plotstmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(268);
				ifstmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(269);
				forstmt1();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(270);
				forstmt2();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(271);
				inputstmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(272);
				tabstmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(273);
				dimstmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(274);
				gotostmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(275);
				gosubstmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(276);
				gpsstmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(277);
				psstmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(278);
				returnsubstmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(279);
				callstmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(280);
				readstmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(281);
				hplotstmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(282);
				vplotstmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(283);
				vtabstmnt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(284);
				htabstmnt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(285);
				waitstmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(286);
				datastmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(287);
				xdrawstmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(288);
				drawstmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(289);
				defstmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(290);
				letstmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(291);
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
		enterRule(_localctx, 14, RULE_vardecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			var();
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(LPAREN);
					setState(296);
					exprlist();
					setState(297);
					match(RPAREN);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 16, RULE_printstmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==QUESTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(305);
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
		enterRule(_localctx, 18, RULE_printlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			expression(0);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(310);
						expression(0);
						}
						break;
					}
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 20, RULE_getstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(GET);
			setState(319);
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
		enterRule(_localctx, 22, RULE_letstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(321);
				match(LET);
				}
			}

			setState(324);
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
		enterRule(_localctx, 24, RULE_variableassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			vardecl();
			setState(327);
			match(EQ);
			setState(328);
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
		enterRule(_localctx, 26, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IF);
			setState(331);
			expression(0);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(332);
				match(THEN);
				}
			}

			setState(337);
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
				setState(335);
				statement();
				}
				break;
			case NUMBER:
				{
				setState(336);
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

	public static class Forstmt11Context extends ParserRuleContext {
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(kbasParser.NEXT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(kbasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(kbasParser.NEWLINE, i);
		}
		public Forstmt11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).enterForstmt11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kbasListener) ((kbasListener)listener).exitForstmt11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kbasVisitor) return ((kbasVisitor<? extends T>)visitor).visitForstmt11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forstmt11Context forstmt11() throws RecognitionException {
		Forstmt11Context _localctx = new Forstmt11Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstmt11);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(FOR);
			setState(340);
			vardecl();
			setState(341);
			match(EQ);
			setState(342);
			expression(0);
			setState(343);
			match(TO);
			setState(344);
			expression(0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(345);
				match(STEP);
				setState(346);
				expression(0);
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349);
					match(NEWLINE);
					}
					}
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(354);
				block();
				setState(355);
				match(NEXT);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTERS) {
					{
					setState(356);
					vardecl();
					}
				}

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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(kbasParser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(kbasParser.STEP, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(kbasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(kbasParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 30, RULE_forstmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(FOR);
			setState(362);
			vardecl();
			setState(363);
			match(EQ);
			setState(364);
			expression(0);
			setState(365);
			match(TO);
			setState(366);
			expression(0);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(367);
				match(STEP);
				setState(368);
				expression(0);
				}
			}

			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(371);
				match(NEWLINE);
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(376);
			block();
			setState(377);
			match(NEXT);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(378);
				vardecl();
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
		enterRule(_localctx, 32, RULE_forstmt2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(FOR);
			setState(382);
			vardecl();
			setState(383);
			match(EQ);
			setState(384);
			expression(0);
			setState(385);
			match(TO);
			setState(386);
			expression(0);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(387);
				match(STEP);
				setState(388);
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
		enterRule(_localctx, 34, RULE_nextstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(NEXT);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(392);
				vardecl();
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						match(COMMA);
						setState(394);
						vardecl();
						}
						} 
					}
					setState(399);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 36, RULE_inputstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(INPUT);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL) {
				{
				setState(403);
				stringer();
				setState(404);
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

			setState(408);
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
		enterRule(_localctx, 38, RULE_readstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(READ);
			setState(411);
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
		enterRule(_localctx, 40, RULE_dimstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(DIM);
			setState(414);
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
		enterRule(_localctx, 42, RULE_gotostmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(GOTO);
			setState(417);
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
		enterRule(_localctx, 44, RULE_gosubstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(GOSUB);
			setState(420);
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
		enterRule(_localctx, 46, RULE_gpsstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(GPS);
			setState(423);
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
		enterRule(_localctx, 48, RULE_returnsubstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(RPS);
			setState(426);
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
		enterRule(_localctx, 50, RULE_psstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(PS);
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(429);
				vardecl();
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(COMMA);
						setState(431);
						vardecl();
						}
						} 
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 52, RULE_pokestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(POKE);
			setState(440);
			expression(0);
			setState(441);
			match(COMMA);
			setState(442);
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
		enterRule(_localctx, 54, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(CALL);
			setState(445);
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
		enterRule(_localctx, 56, RULE_hplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(HPLOT);
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(448);
				expression(0);
				setState(449);
				match(COMMA);
				setState(450);
				expression(0);
				}
				break;
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(454);
				match(TO);
				setState(455);
				expression(0);
				setState(456);
				match(COMMA);
				setState(457);
				expression(0);
				}
				}
				setState(463);
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
		enterRule(_localctx, 58, RULE_vplotstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(VPLOT);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(465);
				expression(0);
				setState(466);
				match(COMMA);
				setState(467);
				expression(0);
				}
				break;
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(471);
				match(TO);
				setState(472);
				expression(0);
				setState(473);
				match(COMMA);
				setState(474);
				expression(0);
				}
				}
				setState(480);
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
		enterRule(_localctx, 60, RULE_plotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(PLOT);
			setState(482);
			expression(0);
			setState(483);
			match(COMMA);
			setState(484);
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
		enterRule(_localctx, 62, RULE_vtabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(VTAB);
			setState(487);
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
		enterRule(_localctx, 64, RULE_htabstmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(HTAB);
			setState(490);
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
		enterRule(_localctx, 66, RULE_himemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(HIMEM);
			setState(493);
			match(COLON);
			setState(494);
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
		enterRule(_localctx, 68, RULE_lomemstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(LOMEM);
			setState(497);
			match(COLON);
			setState(498);
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
		enterRule(_localctx, 70, RULE_datastmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(DATA);
			setState(501);
			datum();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					match(COMMA);
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(503);
						datum();
						}
						break;
					}
					}
					} 
				}
				setState(510);
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
		enterRule(_localctx, 72, RULE_datum);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				number();
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
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
		enterRule(_localctx, 74, RULE_waitstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(WAIT);
			setState(516);
			expression(0);
			setState(517);
			match(COMMA);
			setState(518);
			expression(0);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(519);
				match(COMMA);
				setState(520);
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
		enterRule(_localctx, 76, RULE_xdrawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(XDRAW);
			setState(524);
			expression(0);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(525);
				match(AT);
				setState(526);
				expression(0);
				setState(527);
				match(COMMA);
				setState(528);
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
		enterRule(_localctx, 78, RULE_drawstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(DRAW);
			setState(533);
			expression(0);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(534);
				match(AT);
				setState(535);
				expression(0);
				setState(536);
				match(COMMA);
				setState(537);
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
		enterRule(_localctx, 80, RULE_defstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DEF);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FN) {
				{
				setState(542);
				match(FN);
				}
			}

			setState(545);
			var();
			setState(546);
			match(LPAREN);
			setState(547);
			var();
			setState(548);
			match(RPAREN);
			setState(549);
			match(EQ);
			setState(550);
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
		enterRule(_localctx, 82, RULE_tabstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(TAB);
			setState(553);
			match(LPAREN);
			setState(554);
			expression(0);
			setState(555);
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
		enterRule(_localctx, 84, RULE_speedstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(SPEED);
			setState(558);
			match(EQ);
			setState(559);
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
		enterRule(_localctx, 86, RULE_rotstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ROT);
			setState(562);
			match(EQ);
			setState(563);
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
		enterRule(_localctx, 88, RULE_scalestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(SCALE);
			setState(566);
			match(EQ);
			setState(567);
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
		enterRule(_localctx, 90, RULE_colorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(COLOR);
			setState(570);
			match(EQ);
			setState(571);
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
		enterRule(_localctx, 92, RULE_hcolorstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(HCOLOR);
			setState(574);
			match(EQ);
			setState(575);
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
		enterRule(_localctx, 94, RULE_hlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(HLIN);
			setState(578);
			expression(0);
			setState(579);
			match(COMMA);
			setState(580);
			expression(0);
			setState(581);
			match(AT);
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
		enterRule(_localctx, 96, RULE_vlinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(VLIN);
			setState(585);
			expression(0);
			setState(586);
			match(COMMA);
			setState(587);
			expression(0);
			setState(588);
			match(AT);
			setState(589);
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
		enterRule(_localctx, 98, RULE_onerrstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(ONERR);
			setState(592);
			match(GOTO);
			setState(593);
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
		enterRule(_localctx, 100, RULE_prstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(PRNUMBER);
			setState(596);
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
		enterRule(_localctx, 102, RULE_instmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(INNUMBER);
			setState(599);
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
		enterRule(_localctx, 104, RULE_storestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(STORE);
			setState(602);
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
		enterRule(_localctx, 106, RULE_recallstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(RECALL);
			setState(605);
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
		enterRule(_localctx, 108, RULE_liststmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LIST);
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(608);
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
		enterRule(_localctx, 110, RULE_popstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(POP);
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(612);
				expression(0);
				setState(613);
				match(COMMA);
				setState(614);
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
		enterRule(_localctx, 112, RULE_amptstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(AMPERSAND);
			setState(619);
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
		enterRule(_localctx, 114, RULE_includestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(INCLUDE);
			setState(622);
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
		enterRule(_localctx, 116, RULE_endstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		enterRule(_localctx, 118, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
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
		enterRule(_localctx, 120, RULE_restorestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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
		enterRule(_localctx, 122, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(630);
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

			setState(633);
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
		enterRule(_localctx, 124, RULE_stringer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		enterRule(_localctx, 126, RULE_func);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				stringer();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				number();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				tabfunc();
				}
				break;
			case LETTERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				vardecl();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				chrfunc();
				}
				break;
			case SQR:
				enterOuterAlt(_localctx, 6);
				{
				setState(642);
				sqrfunc();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(643);
				lenfunc();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 8);
				{
				setState(644);
				strfunc();
				}
				break;
			case ASC:
				enterOuterAlt(_localctx, 9);
				{
				setState(645);
				ascfunc();
				}
				break;
			case SCRN:
				enterOuterAlt(_localctx, 10);
				{
				setState(646);
				scrnfunc();
				}
				break;
			case MID:
				enterOuterAlt(_localctx, 11);
				{
				setState(647);
				midfunc();
				}
				break;
			case PDL:
				enterOuterAlt(_localctx, 12);
				{
				setState(648);
				pdlfunc();
				}
				break;
			case PEEK:
				enterOuterAlt(_localctx, 13);
				{
				setState(649);
				peekfunc();
				}
				break;
			case INTF:
				enterOuterAlt(_localctx, 14);
				{
				setState(650);
				intfunc();
				}
				break;
			case SPC:
				enterOuterAlt(_localctx, 15);
				{
				setState(651);
				spcfunc();
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 16);
				{
				setState(652);
				frefunc();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(653);
				posfunc();
				}
				break;
			case USR:
				enterOuterAlt(_localctx, 18);
				{
				setState(654);
				usrfunc();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 19);
				{
				setState(655);
				leftfunc();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 20);
				{
				setState(656);
				valfunc();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 21);
				{
				setState(657);
				rightfunc();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 22);
				{
				setState(658);
				fnfunc();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 23);
				{
				setState(659);
				sinfunc();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 24);
				{
				setState(660);
				cosfunc();
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 25);
				{
				setState(661);
				tanfunc();
				}
				break;
			case ATN:
				enterOuterAlt(_localctx, 26);
				{
				setState(662);
				atnfunc();
				}
				break;
			case RND:
				enterOuterAlt(_localctx, 27);
				{
				setState(663);
				rndfunc();
				}
				break;
			case SGN:
				enterOuterAlt(_localctx, 28);
				{
				setState(664);
				sgnfunc();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 29);
				{
				setState(665);
				expfunc();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 30);
				{
				setState(666);
				logfunc();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 31);
				{
				setState(667);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(671);
				func();
				}
				break;
			case 2:
				{
				_localctx = new SignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(672);
					match(NOT);
					}
				}

				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(675);
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
				setState(678);
				func();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(679);
				match(LPAREN);
				setState(680);
				expression(0);
				setState(681);
				match(RPAREN);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(685);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(686);
						match(EXPONENT);
						setState(687);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new MulExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(689);
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
						setState(690);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AddExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(692);
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
						setState(693);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new RelExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(694);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(695);
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
						setState(696);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 130, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			varname();
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(703);
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
		enterRule(_localctx, 132, RULE_varname);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(LETTERS);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
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
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 134, RULE_varsuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		enterRule(_localctx, 136, RULE_varlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			vardecl();
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					match(COMMA);
					setState(717);
					vardecl();
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 138, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			expression(0);
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					match(COMMA);
					setState(725);
					expression(0);
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 140, RULE_sqrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(SQR);
			setState(732);
			match(LPAREN);
			setState(733);
			expression(0);
			setState(734);
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
		enterRule(_localctx, 142, RULE_chrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(CHR);
			setState(737);
			match(LPAREN);
			setState(738);
			expression(0);
			setState(739);
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
		enterRule(_localctx, 144, RULE_lenfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(LEN);
			setState(742);
			match(LPAREN);
			setState(743);
			expression(0);
			setState(744);
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
		enterRule(_localctx, 146, RULE_ascfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(ASC);
			setState(747);
			match(LPAREN);
			setState(748);
			expression(0);
			setState(749);
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
		enterRule(_localctx, 148, RULE_midfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(MID);
			setState(752);
			match(LPAREN);
			setState(753);
			expression(0);
			setState(754);
			match(COMMA);
			setState(755);
			expression(0);
			setState(756);
			match(COMMA);
			setState(757);
			expression(0);
			setState(758);
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
		enterRule(_localctx, 150, RULE_pdlfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(PDL);
			setState(761);
			match(LPAREN);
			setState(762);
			expression(0);
			setState(763);
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
		enterRule(_localctx, 152, RULE_peekfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(PEEK);
			setState(766);
			match(LPAREN);
			setState(767);
			expression(0);
			setState(768);
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
		enterRule(_localctx, 154, RULE_intfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(INTF);
			setState(771);
			match(LPAREN);
			setState(772);
			expression(0);
			setState(773);
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
		enterRule(_localctx, 156, RULE_spcfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(SPC);
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
		enterRule(_localctx, 158, RULE_frefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(FRE);
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
		enterRule(_localctx, 160, RULE_posfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(POS);
			setState(786);
			match(LPAREN);
			setState(787);
			expression(0);
			setState(788);
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
		enterRule(_localctx, 162, RULE_usrfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(USR);
			setState(791);
			match(LPAREN);
			setState(792);
			expression(0);
			setState(793);
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
		enterRule(_localctx, 164, RULE_leftfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(LEFT);
			setState(796);
			match(LPAREN);
			setState(797);
			expression(0);
			setState(798);
			match(COMMA);
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
		enterRule(_localctx, 166, RULE_rightfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(RIGHT);
			setState(803);
			match(LPAREN);
			setState(804);
			expression(0);
			setState(805);
			match(COMMA);
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
		enterRule(_localctx, 168, RULE_strfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(STR);
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
		enterRule(_localctx, 170, RULE_fnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(FN);
			setState(815);
			var();
			setState(816);
			match(LPAREN);
			setState(817);
			expression(0);
			setState(818);
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
		enterRule(_localctx, 172, RULE_valfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(VAL);
			setState(821);
			match(LPAREN);
			setState(822);
			expression(0);
			setState(823);
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
		enterRule(_localctx, 174, RULE_scrnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(SCRN);
			setState(826);
			match(LPAREN);
			setState(827);
			expression(0);
			setState(828);
			match(COMMA);
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
		enterRule(_localctx, 176, RULE_sinfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(SIN);
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
		enterRule(_localctx, 178, RULE_cosfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(COS);
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
		enterRule(_localctx, 180, RULE_tanfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(TAN);
			setState(843);
			match(LPAREN);
			setState(844);
			expression(0);
			setState(845);
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
		enterRule(_localctx, 182, RULE_atnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(ATN);
			setState(848);
			match(LPAREN);
			setState(849);
			expression(0);
			setState(850);
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
		enterRule(_localctx, 184, RULE_rndfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(RND);
			setState(853);
			match(LPAREN);
			setState(854);
			expression(0);
			setState(855);
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
		enterRule(_localctx, 186, RULE_sgnfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(SGN);
			setState(858);
			match(LPAREN);
			setState(859);
			expression(0);
			setState(860);
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
		enterRule(_localctx, 188, RULE_expfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(EXP);
			setState(863);
			match(LPAREN);
			setState(864);
			expression(0);
			setState(865);
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
		enterRule(_localctx, 190, RULE_logfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(LOG);
			setState(868);
			match(LPAREN);
			setState(869);
			expression(0);
			setState(870);
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
		enterRule(_localctx, 192, RULE_absfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(ABS);
			setState(873);
			match(LPAREN);
			setState(874);
			expression(0);
			setState(875);
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
		enterRule(_localctx, 194, RULE_tabfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(TAB);
			setState(878);
			match(LPAREN);
			setState(879);
			expression(0);
			setState(880);
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
		case 64:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u0375\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\6\2\u00c8\n\2\r\2\16\2\u00c9\3\2\3\2\3\3\3"+
		"\3\5\3\u00d0\n\3\3\3\3\3\3\3\5\3\u00d5\n\3\7\3\u00d7\n\3\f\3\16\3\u00da"+
		"\13\3\3\3\5\3\u00dd\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00e8"+
		"\n\6\3\7\3\7\6\7\u00ec\n\7\r\7\16\7\u00ed\7\7\u00f0\n\7\f\7\16\7\u00f3"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0127\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u012e\n\t\f\t\16\t\u0131\13\t\3\n\3"+
		"\n\5\n\u0135\n\n\3\13\3\13\3\13\5\13\u013a\n\13\7\13\u013c\n\13\f\13\16"+
		"\13\u013f\13\13\3\f\3\f\3\f\3\r\5\r\u0145\n\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u0150\n\17\3\17\3\17\5\17\u0154\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015e\n\20\3\20\6\20\u0161\n\20\r"+
		"\20\16\20\u0162\3\20\3\20\3\20\5\20\u0168\n\20\5\20\u016a\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0174\n\21\3\21\6\21\u0177\n\21"+
		"\r\21\16\21\u0178\3\21\3\21\3\21\5\21\u017e\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0188\n\22\3\23\3\23\3\23\3\23\7\23\u018e\n\23"+
		"\f\23\16\23\u0191\13\23\5\23\u0193\n\23\3\24\3\24\3\24\3\24\5\24\u0199"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u01b3\n\33"+
		"\f\33\16\33\u01b6\13\33\5\33\u01b8\n\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u01c7\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u01ce\n\36\f\36\16\36\u01d1\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u01d8\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u01df\n\37\f\37\16\37\u01e2"+
		"\13\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\5%\u01fb\n%\7%\u01fd\n%\f%\16%\u0200\13%\3&\3&\5&\u0204\n&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u020c\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u0215\n("+
		"\3)\3)\3)\3)\3)\3)\3)\5)\u021e\n)\3*\3*\5*\u0222\n*\3*\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\58\u0264\n8\39\39\39\39\39\59\u026b\n"+
		"9\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\5?\u027a\n?\3?\3?\3@\3@\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\5A\u029f\nA\3B\3B\3B\5B\u02a4\nB\3B\5B\u02a7\nB\3"+
		"B\3B\3B\3B\3B\5B\u02ae\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u02bc"+
		"\nB\fB\16B\u02bf\13B\3C\3C\5C\u02c3\nC\3D\3D\7D\u02c7\nD\fD\16D\u02ca"+
		"\13D\3E\3E\3F\3F\3F\7F\u02d1\nF\fF\16F\u02d4\13F\3G\3G\3G\7G\u02d9\nG"+
		"\fG\16G\u02dc\13G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3"+
		"W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3"+
		"[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_"+
		"\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\2\3\u0082"+
		"d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\2\f\4\2\17\17}}\r\2\33\33%%\60\62<<CCFHNOeet"+
		"twx{{\4\2\6\6yy\4\2\"\",,\3\2\27\30\3\2\u0080\u0081\3\2\31\32\3\2\34!"+
		"\3\2\177\u0080\3\2\3\4\2\u0399\2\u00c7\3\2\2\2\4\u00cf\3\2\2\2\6\u00de"+
		"\3\2\2\2\b\u00e0\3\2\2\2\n\u00e7\3\2\2\2\f\u00f1\3\2\2\2\16\u0126\3\2"+
		"\2\2\20\u0128\3\2\2\2\22\u0132\3\2\2\2\24\u0136\3\2\2\2\26\u0140\3\2\2"+
		"\2\30\u0144\3\2\2\2\32\u0148\3\2\2\2\34\u014c\3\2\2\2\36\u0155\3\2\2\2"+
		" \u016b\3\2\2\2\"\u017f\3\2\2\2$\u0189\3\2\2\2&\u0194\3\2\2\2(\u019c\3"+
		"\2\2\2*\u019f\3\2\2\2,\u01a2\3\2\2\2.\u01a5\3\2\2\2\60\u01a8\3\2\2\2\62"+
		"\u01ab\3\2\2\2\64\u01ae\3\2\2\2\66\u01b9\3\2\2\28\u01be\3\2\2\2:\u01c1"+
		"\3\2\2\2<\u01d2\3\2\2\2>\u01e3\3\2\2\2@\u01e8\3\2\2\2B\u01eb\3\2\2\2D"+
		"\u01ee\3\2\2\2F\u01f2\3\2\2\2H\u01f6\3\2\2\2J\u0203\3\2\2\2L\u0205\3\2"+
		"\2\2N\u020d\3\2\2\2P\u0216\3\2\2\2R\u021f\3\2\2\2T\u022a\3\2\2\2V\u022f"+
		"\3\2\2\2X\u0233\3\2\2\2Z\u0237\3\2\2\2\\\u023b\3\2\2\2^\u023f\3\2\2\2"+
		"`\u0243\3\2\2\2b\u024a\3\2\2\2d\u0251\3\2\2\2f\u0255\3\2\2\2h\u0258\3"+
		"\2\2\2j\u025b\3\2\2\2l\u025e\3\2\2\2n\u0261\3\2\2\2p\u0265\3\2\2\2r\u026c"+
		"\3\2\2\2t\u026f\3\2\2\2v\u0272\3\2\2\2x\u0274\3\2\2\2z\u0276\3\2\2\2|"+
		"\u0279\3\2\2\2~\u027d\3\2\2\2\u0080\u029e\3\2\2\2\u0082\u02ad\3\2\2\2"+
		"\u0084\u02c0\3\2\2\2\u0086\u02c4\3\2\2\2\u0088\u02cb\3\2\2\2\u008a\u02cd"+
		"\3\2\2\2\u008c\u02d5\3\2\2\2\u008e\u02dd\3\2\2\2\u0090\u02e2\3\2\2\2\u0092"+
		"\u02e7\3\2\2\2\u0094\u02ec\3\2\2\2\u0096\u02f1\3\2\2\2\u0098\u02fa\3\2"+
		"\2\2\u009a\u02ff\3\2\2\2\u009c\u0304\3\2\2\2\u009e\u0309\3\2\2\2\u00a0"+
		"\u030e\3\2\2\2\u00a2\u0313\3\2\2\2\u00a4\u0318\3\2\2\2\u00a6\u031d\3\2"+
		"\2\2\u00a8\u0324\3\2\2\2\u00aa\u032b\3\2\2\2\u00ac\u0330\3\2\2\2\u00ae"+
		"\u0336\3\2\2\2\u00b0\u033b\3\2\2\2\u00b2\u0342\3\2\2\2\u00b4\u0347\3\2"+
		"\2\2\u00b6\u034c\3\2\2\2\u00b8\u0351\3\2\2\2\u00ba\u0356\3\2\2\2\u00bc"+
		"\u035b\3\2\2\2\u00be\u0360\3\2\2\2\u00c0\u0365\3\2\2\2\u00c2\u036a\3\2"+
		"\2\2\u00c4\u036f\3\2\2\2\u00c6\u00c8\5\4\3\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\7\2\2\3\u00cc\3\3\2\2\2\u00cd\u00d0\5\b\5\2\u00ce\u00d0"+
		"\7|\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00dc\3\2\2\2\u00d1\u00d8\5\n\6\2\u00d2\u00d4\7\"\2\2\u00d3\u00d5\5\n"+
		"\6\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00dd\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\t\2\2\2\u00dc"+
		"\u00d1\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\5\3\2\2\2\u00de\u00df\7s\2\2"+
		"\u00df\7\3\2\2\2\u00e0\u00e1\7\u0080\2\2\u00e1\t\3\2\2\2\u00e2\u00e3\5"+
		"\6\4\2\u00e3\u00e4\5\16\b\2\u00e4\u00e8\3\2\2\2\u00e5\u00e8\5\16\b\2\u00e6"+
		"\u00e8\t\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\13\3\2\2\2\u00e9\u00eb\5\4\3\2\u00ea\u00ec\7#\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\r\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u0127"+
		"\t\3\2\2\u00f5\u0127\5v<\2\u00f6\u0127\5x=\2\u00f7\u0127\5z>\2\u00f8\u0127"+
		"\5r:\2\u00f9\u0127\5p9\2\u00fa\u0127\5n8\2\u00fb\u0127\5j\66\2\u00fc\u0127"+
		"\5\26\f\2\u00fd\u0127\5l\67\2\u00fe\u0127\5$\23\2\u00ff\u0127\5h\65\2"+
		"\u0100\u0127\5f\64\2\u0101\u0127\5d\63\2\u0102\u0127\5`\61\2\u0103\u0127"+
		"\5b\62\2\u0104\u0127\5\\/\2\u0105\u0127\5V,\2\u0106\u0127\5Z.\2\u0107"+
		"\u0127\5X-\2\u0108\u0127\5^\60\2\u0109\u0127\5D#\2\u010a\u0127\5F$\2\u010b"+
		"\u0127\5\22\n\2\u010c\u0127\5\66\34\2\u010d\u0127\5> \2\u010e\u0127\5"+
		"\34\17\2\u010f\u0127\5 \21\2\u0110\u0127\5\"\22\2\u0111\u0127\5&\24\2"+
		"\u0112\u0127\5T+\2\u0113\u0127\5*\26\2\u0114\u0127\5,\27\2\u0115\u0127"+
		"\5.\30\2\u0116\u0127\5\60\31\2\u0117\u0127\5\64\33\2\u0118\u0127\5\62"+
		"\32\2\u0119\u0127\58\35\2\u011a\u0127\5(\25\2\u011b\u0127\5:\36\2\u011c"+
		"\u0127\5<\37\2\u011d\u0127\5@!\2\u011e\u0127\5B\"\2\u011f\u0127\5L\'\2"+
		"\u0120\u0127\5H%\2\u0121\u0127\5N(\2\u0122\u0127\5P)\2\u0123\u0127\5R"+
		"*\2\u0124\u0127\5\30\r\2\u0125\u0127\5t;\2\u0126\u00f4\3\2\2\2\u0126\u00f5"+
		"\3\2\2\2\u0126\u00f6\3\2\2\2\u0126\u00f7\3\2\2\2\u0126\u00f8\3\2\2\2\u0126"+
		"\u00f9\3\2\2\2\u0126\u00fa\3\2\2\2\u0126\u00fb\3\2\2\2\u0126\u00fc\3\2"+
		"\2\2\u0126\u00fd\3\2\2\2\u0126\u00fe\3\2\2\2\u0126\u00ff\3\2\2\2\u0126"+
		"\u0100\3\2\2\2\u0126\u0101\3\2\2\2\u0126\u0102\3\2\2\2\u0126\u0103\3\2"+
		"\2\2\u0126\u0104\3\2\2\2\u0126\u0105\3\2\2\2\u0126\u0106\3\2\2\2\u0126"+
		"\u0107\3\2\2\2\u0126\u0108\3\2\2\2\u0126\u0109\3\2\2\2\u0126\u010a\3\2"+
		"\2\2\u0126\u010b\3\2\2\2\u0126\u010c\3\2\2\2\u0126\u010d\3\2\2\2\u0126"+
		"\u010e\3\2\2\2\u0126\u010f\3\2\2\2\u0126\u0110\3\2\2\2\u0126\u0111\3\2"+
		"\2\2\u0126\u0112\3\2\2\2\u0126\u0113\3\2\2\2\u0126\u0114\3\2\2\2\u0126"+
		"\u0115\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u0118\3\2"+
		"\2\2\u0126\u0119\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u011b\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2"+
		"\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\17\3\2\2"+
		"\2\u0128\u012f\5\u0084C\2\u0129\u012a\7\25\2\2\u012a\u012b\5\u008cG\2"+
		"\u012b\u012c\7\26\2\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\21\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0134\t\4\2\2\u0133\u0135\5\24\13\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\23\3\2\2\2\u0136\u013d\5\u0082B\2\u0137"+
		"\u0139\t\5\2\2\u0138\u013a\5\u0082B\2\u0139\u0138\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0137\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\25\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u0140\u0141\7q\2\2\u0141\u0142\5\u008cG\2\u0142\27\3\2\2\2\u0143\u0145"+
		"\7\'\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\5\32\16\2\u0147\31\3\2\2\2\u0148\u0149\5\20\t\2\u0149\u014a\7!"+
		"\2\2\u014a\u014b\5\u008cG\2\u014b\33\3\2\2\2\u014c\u014d\7\f\2\2\u014d"+
		"\u014f\5\u0082B\2\u014e\u0150\7\16\2\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0154\5\16\b\2\u0152\u0154\5\b\5\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\35\3\2\2\2\u0155\u0156"+
		"\7(\2\2\u0156\u0157\5\20\t\2\u0157\u0158\7!\2\2\u0158\u0159\5\u0082B\2"+
		"\u0159\u015a\7)\2\2\u015a\u015d\5\u0082B\2\u015b\u015c\7*\2\2\u015c\u015e"+
		"\5\u0082B\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0169\3\2\2"+
		"\2\u015f\u0161\7#\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\f\7\2\u0165"+
		"\u0167\7\r\2\2\u0166\u0168\5\20\t\2\u0167\u0166\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u016a\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\37\3\2\2\2\u016b\u016c\7(\2\2\u016c\u016d\5\20\t\2\u016d\u016e\7!\2\2"+
		"\u016e\u016f\5\u0082B\2\u016f\u0170\7)\2\2\u0170\u0173\5\u0082B\2\u0171"+
		"\u0172\7*\2\2\u0172\u0174\5\u0082B\2\u0173\u0171\3\2\2\2\u0173\u0174\3"+
		"\2\2\2\u0174\u0176\3\2\2\2\u0175\u0177\7#\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\5\f\7\2\u017b\u017d\7\r\2\2\u017c\u017e\5\20\t\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e!\3\2\2\2\u017f\u0180\7(\2\2\u0180"+
		"\u0181\5\20\t\2\u0181\u0182\7!\2\2\u0182\u0183\5\u0082B\2\u0183\u0184"+
		"\7)\2\2\u0184\u0187\5\u0082B\2\u0185\u0186\7*\2\2\u0186\u0188\5\u0082"+
		"B\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188#\3\2\2\2\u0189\u0192"+
		"\7\r\2\2\u018a\u018f\5\20\t\2\u018b\u018c\7\"\2\2\u018c\u018e\5\20\t\2"+
		"\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u018a\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193%\3\2\2\2\u0194\u0198\7+\2\2\u0195\u0196\5~@\2\u0196"+
		"\u0197\t\5\2\2\u0197\u0199\3\2\2\2\u0198\u0195\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\u008aF\2\u019b\'\3\2\2\2\u019c"+
		"\u019d\7T\2\2\u019d\u019e\5\u008aF\2\u019e)\3\2\2\2\u019f\u01a0\7-\2\2"+
		"\u01a0\u01a1\5\u008aF\2\u01a1+\3\2\2\2\u01a2\u01a3\7\7\2\2\u01a3\u01a4"+
		"\5\b\5\2\u01a4-\3\2\2\2\u01a5\u01a6\7\b\2\2\u01a6\u01a7\5\u0082B\2\u01a7"+
		"/\3\2\2\2\u01a8\u01a9\7\t\2\2\u01a9\u01aa\5\u0082B\2\u01aa\61\3\2\2\2"+
		"\u01ab\u01ac\7\13\2\2\u01ac\u01ad\5\20\t\2\u01ad\63\3\2\2\2\u01ae\u01b7"+
		"\7\n\2\2\u01af\u01b4\5\20\t\2\u01b0\u01b1\7\"\2\2\u01b1\u01b3\5\20\t\2"+
		"\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\65\3\2\2\2\u01b9\u01ba\7A\2\2\u01ba\u01bb\5\u0082"+
		"B\2\u01bb\u01bc\7\"\2\2\u01bc\u01bd\5\u0082B\2\u01bd\67\3\2\2\2\u01be"+
		"\u01bf\7\64\2\2\u01bf\u01c0\5\u008cG\2\u01c09\3\2\2\2\u01c1\u01c6\7\66"+
		"\2\2\u01c2\u01c3\5\u0082B\2\u01c3\u01c4\7\"\2\2\u01c4\u01c5\5\u0082B\2"+
		"\u01c5\u01c7\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cf"+
		"\3\2\2\2\u01c8\u01c9\7)\2\2\u01c9\u01ca\5\u0082B\2\u01ca\u01cb\7\"\2\2"+
		"\u01cb\u01cc\5\u0082B\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0;\3\2\2\2"+
		"\u01d1\u01cf\3\2\2\2\u01d2\u01d7\7\67\2\2\u01d3\u01d4\5\u0082B\2\u01d4"+
		"\u01d5\7\"\2\2\u01d5\u01d6\5\u0082B\2\u01d6\u01d8\3\2\2\2\u01d7\u01d3"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01e0\3\2\2\2\u01d9\u01da\7)\2\2\u01da"+
		"\u01db\5\u0082B\2\u01db\u01dc\7\"\2\2\u01dc\u01dd\5\u0082B\2\u01dd\u01df"+
		"\3\2\2\2\u01de\u01d9\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1=\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7?\2\2\u01e4"+
		"\u01e5\5\u0082B\2\u01e5\u01e6\7\"\2\2\u01e6\u01e7\5\u0082B\2\u01e7?\3"+
		"\2\2\2\u01e8\u01e9\7:\2\2\u01e9\u01ea\5\u0082B\2\u01eaA\3\2\2\2\u01eb"+
		"\u01ec\7;\2\2\u01ec\u01ed\5\u0082B\2\u01edC\3\2\2\2\u01ee\u01ef\7D\2\2"+
		"\u01ef\u01f0\7/\2\2\u01f0\u01f1\5\u0082B\2\u01f1E\3\2\2\2\u01f2\u01f3"+
		"\7E\2\2\u01f3\u01f4\7/\2\2\u01f4\u01f5\5\u0082B\2\u01f5G\3\2\2\2\u01f6"+
		"\u01f7\7R\2\2\u01f7\u01fe\5J&\2\u01f8\u01fa\7\"\2\2\u01f9\u01fb\5J&\2"+
		"\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f8"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"I\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\5|?\2\u0202\u0204\5~@\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204K\3\2\2\2\u0205\u0206\7S\2\2\u0206"+
		"\u0207\5\u0082B\2\u0207\u0208\7\"\2\2\u0208\u020b\5\u0082B\2\u0209\u020a"+
		"\7\"\2\2\u020a\u020c\5\u0082B\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2"+
		"\2\u020cM\3\2\2\2\u020d\u020e\7U\2\2\u020e\u0214\5\u0082B\2\u020f\u0210"+
		"\7W\2\2\u0210\u0211\5\u0082B\2\u0211\u0212\7\"\2\2\u0212\u0213\5\u0082"+
		"B\2\u0213\u0215\3\2\2\2\u0214\u020f\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"O\3\2\2\2\u0216\u0217\7V\2\2\u0217\u021d\5\u0082B\2\u0218\u0219\7W\2\2"+
		"\u0219\u021a\5\u0082B\2\u021a\u021b\7\"\2\2\u021b\u021c\5\u0082B\2\u021c"+
		"\u021e\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u021e\3\2\2\2\u021eQ\3\2\2\2"+
		"\u021f\u0221\7X\2\2\u0220\u0222\7Y\2\2\u0221\u0220\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5\u0084C\2\u0224\u0225\7\25\2"+
		"\2\u0225\u0226\5\u0084C\2\u0226\u0227\7\26\2\2\u0227\u0228\7!\2\2\u0228"+
		"\u0229\5\u0082B\2\u0229S\3\2\2\2\u022a\u022b\7[\2\2\u022b\u022c\7\25\2"+
		"\2\u022c\u022d\5\u0082B\2\u022d\u022e\7\26\2\2\u022eU\3\2\2\2\u022f\u0230"+
		"\7\\\2\2\u0230\u0231\7!\2\2\u0231\u0232\5\u0082B\2\u0232W\3\2\2\2\u0233"+
		"\u0234\7]\2\2\u0234\u0235\7!\2\2\u0235\u0236\5\u0082B\2\u0236Y\3\2\2\2"+
		"\u0237\u0238\7^\2\2\u0238\u0239\7!\2\2\u0239\u023a\5\u0082B\2\u023a[\3"+
		"\2\2\2\u023b\u023c\7_\2\2\u023c\u023d\7!\2\2\u023d\u023e\5\u0082B\2\u023e"+
		"]\3\2\2\2\u023f\u0240\7`\2\2\u0240\u0241\7!\2\2\u0241\u0242\5\u0082B\2"+
		"\u0242_\3\2\2\2\u0243\u0244\7a\2\2\u0244\u0245\5\u0082B\2\u0245\u0246"+
		"\7\"\2\2\u0246\u0247\5\u0082B\2\u0247\u0248\7W\2\2\u0248\u0249\5\u0082"+
		"B\2\u0249a\3\2\2\2\u024a\u024b\7b\2\2\u024b\u024c\5\u0082B\2\u024c\u024d"+
		"\7\"\2\2\u024d\u024e\5\u0082B\2\u024e\u024f\7W\2\2\u024f\u0250\5\u0082"+
		"B\2\u0250c\3\2\2\2\u0251\u0252\7I\2\2\u0252\u0253\7\7\2\2\u0253\u0254"+
		"\5\b\5\2\u0254e\3\2\2\2\u0255\u0256\78\2\2\u0256\u0257\7\u0080\2\2\u0257"+
		"g\3\2\2\2\u0258\u0259\79\2\2\u0259\u025a\7\u0080\2\2\u025ai\3\2\2\2\u025b"+
		"\u025c\7o\2\2\u025c\u025d\5\20\t\2\u025dk\3\2\2\2\u025e\u025f\7p\2\2\u025f"+
		"\u0260\5\20\t\2\u0260m\3\2\2\2\u0261\u0263\7$\2\2\u0262\u0264\5\u0082"+
		"B\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264o\3\2\2\2\u0265\u026a"+
		"\7d\2\2\u0266\u0267\5\u0082B\2\u0267\u0268\7\"\2\2\u0268\u0269\5\u0082"+
		"B\2\u0269\u026b\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"q\3\2\2\2\u026c\u026d\7s\2\2\u026d\u026e\5\u0082B\2\u026es\3\2\2\2\u026f"+
		"\u0270\7z\2\2\u0270\u0271\5\u0082B\2\u0271u\3\2\2\2\u0272\u0273\7&\2\2"+
		"\u0273w\3\2\2\2\u0274\u0275\7\5\2\2\u0275y\3\2\2\2\u0276\u0277\7v\2\2"+
		"\u0277{\3\2\2\2\u0278\u027a\t\6\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\t\7\2\2\u027c}\3\2\2\2\u027d\u027e"+
		"\7~\2\2\u027e\177\3\2\2\2\u027f\u029f\5~@\2\u0280\u029f\5|?\2\u0281\u029f"+
		"\5\u00c4c\2\u0282\u029f\5\20\t\2\u0283\u029f\5\u0090I\2\u0284\u029f\5"+
		"\u008eH\2\u0285\u029f\5\u0092J\2\u0286\u029f\5\u00aaV\2\u0287\u029f\5"+
		"\u0094K\2\u0288\u029f\5\u00b0Y\2\u0289\u029f\5\u0096L\2\u028a\u029f\5"+
		"\u0098M\2\u028b\u029f\5\u009aN\2\u028c\u029f\5\u009cO\2\u028d\u029f\5"+
		"\u009eP\2\u028e\u029f\5\u00a0Q\2\u028f\u029f\5\u00a2R\2\u0290\u029f\5"+
		"\u00a4S\2\u0291\u029f\5\u00a6T\2\u0292\u029f\5\u00aeX\2\u0293\u029f\5"+
		"\u00a8U\2\u0294\u029f\5\u00acW\2\u0295\u029f\5\u00b2Z\2\u0296\u029f\5"+
		"\u00b4[\2\u0297\u029f\5\u00b6\\\2\u0298\u029f\5\u00b8]\2\u0299\u029f\5"+
		"\u00ba^\2\u029a\u029f\5\u00bc_\2\u029b\u029f\5\u00be`\2\u029c\u029f\5"+
		"\u00c0a\2\u029d\u029f\5\u00c2b\2\u029e\u027f\3\2\2\2\u029e\u0280\3\2\2"+
		"\2\u029e\u0281\3\2\2\2\u029e\u0282\3\2\2\2\u029e\u0283\3\2\2\2\u029e\u0284"+
		"\3\2\2\2\u029e\u0285\3\2\2\2\u029e\u0286\3\2\2\2\u029e\u0287\3\2\2\2\u029e"+
		"\u0288\3\2\2\2\u029e\u0289\3\2\2\2\u029e\u028a\3\2\2\2\u029e\u028b\3\2"+
		"\2\2\u029e\u028c\3\2\2\2\u029e\u028d\3\2\2\2\u029e\u028e\3\2\2\2\u029e"+
		"\u028f\3\2\2\2\u029e\u0290\3\2\2\2\u029e\u0291\3\2\2\2\u029e\u0292\3\2"+
		"\2\2\u029e\u0293\3\2\2\2\u029e\u0294\3\2\2\2\u029e\u0295\3\2\2\2\u029e"+
		"\u0296\3\2\2\2\u029e\u0297\3\2\2\2\u029e\u0298\3\2\2\2\u029e\u0299\3\2"+
		"\2\2\u029e\u029a\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u0081\3\2\2\2\u02a0\u02a1\bB\1\2\u02a1\u02ae\5\u0080"+
		"A\2\u02a2\u02a4\7u\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6"+
		"\3\2\2\2\u02a5\u02a7\t\6\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02ae\5\u0080A\2\u02a9\u02aa\7\25\2\2\u02aa\u02ab"+
		"\5\u0082B\2\u02ab\u02ac\7\26\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02a0\3\2\2"+
		"\2\u02ad\u02a3\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ae\u02bd\3\2\2\2\u02af\u02b0"+
		"\f\7\2\2\u02b0\u02b1\7r\2\2\u02b1\u02bc\5\u0082B\7\u02b2\u02b3\f\6\2\2"+
		"\u02b3\u02b4\t\b\2\2\u02b4\u02bc\5\u0082B\7\u02b5\u02b6\f\5\2\2\u02b6"+
		"\u02b7\t\6\2\2\u02b7\u02bc\5\u0082B\6\u02b8\u02b9\f\4\2\2\u02b9\u02ba"+
		"\t\t\2\2\u02ba\u02bc\5\u0082B\5\u02bb\u02af\3\2\2\2\u02bb\u02b2\3\2\2"+
		"\2\u02bb\u02b5\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u0083\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0"+
		"\u02c2\5\u0086D\2\u02c1\u02c3\5\u0088E\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3\u0085\3\2\2\2\u02c4\u02c8\7\177\2\2\u02c5\u02c7\t\n\2\2"+
		"\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u0087\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\t\13\2\2"+
		"\u02cc\u0089\3\2\2\2\u02cd\u02d2\5\20\t\2\u02ce\u02cf\7\"\2\2\u02cf\u02d1"+
		"\5\20\t\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2"+
		"\u02d2\u02d3\3\2\2\2\u02d3\u008b\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02da"+
		"\5\u0082B\2\u02d6\u02d7\7\"\2\2\u02d7\u02d9\5\u0082B\2\u02d8\u02d6\3\2"+
		"\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u008d\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\7.\2\2\u02de\u02df\7\25"+
		"\2\2\u02df\u02e0\5\u0082B\2\u02e0\u02e1\7\26\2\2\u02e1\u008f\3\2\2\2\u02e2"+
		"\u02e3\7\20\2\2\u02e3\u02e4\7\25\2\2\u02e4\u02e5\5\u0082B\2\u02e5\u02e6"+
		"\7\26\2\2\u02e6\u0091\3\2\2\2\u02e7\u02e8\7\63\2\2\u02e8\u02e9\7\25\2"+
		"\2\u02e9\u02ea\5\u0082B\2\u02ea\u02eb\7\26\2\2\u02eb\u0093\3\2\2\2\u02ec"+
		"\u02ed\7\65\2\2\u02ed\u02ee\7\25\2\2\u02ee\u02ef\5\u0082B\2\u02ef\u02f0"+
		"\7\26\2\2\u02f0\u0095\3\2\2\2\u02f1\u02f2\7\21\2\2\u02f2\u02f3\7\25\2"+
		"\2\u02f3\u02f4\5\u0082B\2\u02f4\u02f5\7\"\2\2\u02f5\u02f6\5\u0082B\2\u02f6"+
		"\u02f7\7\"\2\2\u02f7\u02f8\5\u0082B\2\u02f8\u02f9\7\26\2\2\u02f9\u0097"+
		"\3\2\2\2\u02fa\u02fb\7>\2\2\u02fb\u02fc\7\25\2\2\u02fc\u02fd\5\u0082B"+
		"\2\u02fd\u02fe\7\26\2\2\u02fe\u0099\3\2\2\2\u02ff\u0300\7@\2\2\u0300\u0301"+
		"\7\25\2\2\u0301\u0302\5\u0082B\2\u0302\u0303\7\26\2\2\u0303\u009b\3\2"+
		"\2\2\u0304\u0305\7B\2\2\u0305\u0306\7\25\2\2\u0306\u0307\5\u0082B\2\u0307"+
		"\u0308\7\26\2\2\u0308\u009d\3\2\2\2\u0309\u030a\7J\2\2\u030a\u030b\7\25"+
		"\2\2\u030b\u030c\5\u0082B\2\u030c\u030d\7\26\2\2\u030d\u009f\3\2\2\2\u030e"+
		"\u030f\7K\2\2\u030f\u0310\7\25\2\2\u0310\u0311\5\u0082B\2\u0311\u0312"+
		"\7\26\2\2\u0312\u00a1\3\2\2\2\u0313\u0314\7L\2\2\u0314\u0315\7\25\2\2"+
		"\u0315\u0316\5\u0082B\2\u0316\u0317\7\26\2\2\u0317\u00a3\3\2\2\2\u0318"+
		"\u0319\7M\2\2\u0319\u031a\7\25\2\2\u031a\u031b\5\u0082B\2\u031b\u031c"+
		"\7\26\2\2\u031c\u00a5\3\2\2\2\u031d\u031e\7\22\2\2\u031e\u031f\7\25\2"+
		"\2\u031f\u0320\5\u0082B\2\u0320\u0321\7\"\2\2\u0321\u0322\5\u0082B\2\u0322"+
		"\u0323\7\26\2\2\u0323\u00a7\3\2\2\2\u0324\u0325\7\23\2\2\u0325\u0326\7"+
		"\25\2\2\u0326\u0327\5\u0082B\2\u0327\u0328\7\"\2\2\u0328\u0329\5\u0082"+
		"B\2\u0329\u032a\7\26\2\2\u032a\u00a9\3\2\2\2\u032b\u032c\7\24\2\2\u032c"+
		"\u032d\7\25\2\2\u032d\u032e\5\u0082B\2\u032e\u032f\7\26\2\2\u032f\u00ab"+
		"\3\2\2\2\u0330\u0331\7Y\2\2\u0331\u0332\5\u0084C\2\u0332\u0333\7\25\2"+
		"\2\u0333\u0334\5\u0082B\2\u0334\u0335\7\26\2\2\u0335\u00ad\3\2\2\2\u0336"+
		"\u0337\7Z\2\2\u0337\u0338\7\25\2\2\u0338\u0339\5\u0082B\2\u0339\u033a"+
		"\7\26\2\2\u033a\u00af\3\2\2\2\u033b\u033c\7c\2\2\u033c\u033d\7\25\2\2"+
		"\u033d\u033e\5\u0082B\2\u033e\u033f\7\"\2\2\u033f\u0340\5\u0082B\2\u0340"+
		"\u0341\7\26\2\2\u0341\u00b1\3\2\2\2\u0342\u0343\7f\2\2\u0343\u0344\7\25"+
		"\2\2\u0344\u0345\5\u0082B\2\u0345\u0346\7\26\2\2\u0346\u00b3\3\2\2\2\u0347"+
		"\u0348\7g\2\2\u0348\u0349\7\25\2\2\u0349\u034a\5\u0082B\2\u034a\u034b"+
		"\7\26\2\2\u034b\u00b5\3\2\2\2\u034c\u034d\7h\2\2\u034d\u034e\7\25\2\2"+
		"\u034e\u034f\5\u0082B\2\u034f\u0350\7\26\2\2\u0350\u00b7\3\2\2\2\u0351"+
		"\u0352\7i\2\2\u0352\u0353\7\25\2\2\u0353\u0354\5\u0082B\2\u0354\u0355"+
		"\7\26\2\2\u0355\u00b9\3\2\2\2\u0356\u0357\7j\2\2\u0357\u0358\7\25\2\2"+
		"\u0358\u0359\5\u0082B\2\u0359\u035a\7\26\2\2\u035a\u00bb\3\2\2\2\u035b"+
		"\u035c\7k\2\2\u035c\u035d\7\25\2\2\u035d\u035e\5\u0082B\2\u035e\u035f"+
		"\7\26\2\2\u035f\u00bd\3\2\2\2\u0360\u0361\7l\2\2\u0361\u0362\7\25\2\2"+
		"\u0362\u0363\5\u0082B\2\u0363\u0364\7\26\2\2\u0364\u00bf\3\2\2\2\u0365"+
		"\u0366\7m\2\2\u0366\u0367\7\25\2\2\u0367\u0368\5\u0082B\2\u0368\u0369"+
		"\7\26\2\2\u0369\u00c1\3\2\2\2\u036a\u036b\7n\2\2\u036b\u036c\7\25\2\2"+
		"\u036c\u036d\5\u0082B\2\u036d\u036e\7\26\2\2\u036e\u00c3\3\2\2\2\u036f"+
		"\u0370\7[\2\2\u0370\u0371\7\25\2\2\u0371\u0372\5\u0082B\2\u0372\u0373"+
		"\7\26\2\2\u0373\u00c5\3\2\2\2\67\u00c9\u00cf\u00d4\u00d8\u00dc\u00e7\u00ed"+
		"\u00f1\u0126\u012f\u0134\u0139\u013d\u0144\u014f\u0153\u015d\u0162\u0167"+
		"\u0169\u0173\u0178\u017d\u0187\u018f\u0192\u0198\u01b4\u01b7\u01c6\u01cf"+
		"\u01d7\u01e0\u01fa\u01fe\u0203\u020b\u0214\u021d\u0221\u0263\u026a\u0279"+
		"\u029e\u02a3\u02a6\u02ad\u02bb\u02bd\u02c2\u02c8\u02d2\u02da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}