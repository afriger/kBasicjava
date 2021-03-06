grammar kbas;

prog: block EOF;
   // a line starts with an INT
line
  : (linenumber | STATUS)? ((amprstmt (COMMA amprstmt?)*) | (COMMENT | REM))
  ;
amperoper: AMPERSAND;
linenumber: NUMBER;

amprstmt
   : (amperoper statement)
   | (statement)
   | (COMMENT | REM)
   ;

block: (line NEWLINE+)*;

statement
   : (CLS | LOAD | SAVE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | CLEAR | RUN | STOP | TEXT | HOME | HGR | HGR2)
   | endstmt
   | returnstmt
   | restorestmt
   | amptstmt
   | popstmt
   | liststmt
   | storestmt
   | getstmt
   | recallstmt
   | nextstmt
   | instmt
   | prstmt
   | onerrstmt
   | hlinstmt
   | vlinstmt
   | colorstmt
   | speedstmt
   | scalestmt
   | rotstmt
   | hcolorstmt
   | himemstmt
   | lomemstmt
   | printstmt1
   | pokestmt
   | plotstmt
   | ifstmt
   | forstmt1
   | forstmt2
   | inputstmt
   | tabstmt
   | dimstmt
   | gotostmt
   | gosubstmt
   | gpsstmt
   | psstmt
   | returnsubstmt
   | callstmt
   | readstmt
   | hplotstmt
   | vplotstmt
   | vtabstmnt
   | htabstmnt
   | waitstmt
   | datastmt
   | xdrawstmt
   | drawstmt
   | defstmt
   | letstmt
   | includestmt
   ;

vardecl   			 : var (LPAREN exprlist RPAREN)*   ;
printstmt1			 : (PRINT | QUESTION) printlist?   ;
printlist 			 : expression ((COMMA | SEMICOLON) expression?)*   ;
getstmt   			 : GET exprlist;
letstmt   			 : LET? variableassignment;
variableassignment   : vardecl EQ exprlist   ;
ifstmt				 : IF expression THEN? (statement | linenumber);



// for stmt 1 puts the for-next on one line
forstmt1: FOR vardecl EQ expression TO expression (STEP expression)? ( NEWLINE+ block NEXT vardecl?)?   ;

// for stmt 2 puts the for, the statment, and the next on 3 lines.  It needs "nextstmt"
forstmt2: FOR vardecl EQ expression TO expression (STEP expression)?;
nextstmt: NEXT (vardecl (',' vardecl)*)? ;

inputstmt: INPUT (stringer (COMMA | SEMICOLON))? varlist;
readstmt: READ varlist;
dimstmt: DIM varlist;
gotostmt: GOTO linenumber ;
gosubstmt: GOSUB expression;
gpsstmt: GPS expression;
returnsubstmt: RPS vardecl;
psstmt: PS (vardecl (',' vardecl)*)? ;
pokestmt: POKE expression COMMA expression;
callstmt: CALL exprlist;

hplotstmt: HPLOT (expression COMMA expression)? (TO expression COMMA expression)*;
vplotstmt: VPLOT (expression COMMA expression)? (TO expression COMMA expression)*;
plotstmt: PLOT expression COMMA expression;
vtabstmnt: VTAB expression;
htabstmnt: HTAB expression;
himemstmt: HIMEM COLON expression;
lomemstmt: LOMEM COLON expression;
datastmt: DATA datum (COMMA datum?)*;

datum: number
   | stringer
   ;

waitstmt: WAIT expression COMMA expression (COMMA expression)?;
xdrawstmt: XDRAW expression (AT expression COMMA expression)?;
drawstmt: DRAW expression (AT expression COMMA expression)?;
defstmt: DEF FN? var LPAREN var RPAREN EQ expression;
tabstmt: TAB LPAREN expression RPAREN;
speedstmt: SPEED EQ expression;
rotstmt: ROT EQ expression;
scalestmt: SCALE EQ expression;
colorstmt: COLOR EQ expression;
hcolorstmt: HCOLOR EQ expression;
hlinstmt: HLIN expression COMMA expression AT expression;
vlinstmt: VLIN expression COMMA expression AT expression;
onerrstmt: ONERR GOTO linenumber;
prstmt: PRNUMBER NUMBER;
instmt: INNUMBER NUMBER;
storestmt: STORE vardecl;
recallstmt: RECALL vardecl;
liststmt: LIST expression?;
popstmt: POP (expression COMMA expression)?;
amptstmt: AMPERSAND expression;
includestmt: INCLUDE expression;
endstmt: END;
returnstmt: RETURN;
restorestmt: RESTORE;
// expressions and such
number:  ('+' | '-')? (NUMBER | FLOAT);
stringer: STRINGLITERAL ;
func // func sasa
   : stringer
   | number
   | tabfunc
   | vardecl
   | chrfunc
   | sqrfunc
   | lenfunc
   | strfunc
   | ascfunc
   | scrnfunc
   | midfunc
   | pdlfunc
   | peekfunc
   | intfunc
   | spcfunc
   | frefunc
   | posfunc
   | usrfunc
   | leftfunc
   | valfunc
   | rightfunc
   | fnfunc
   | sinfunc
   | cosfunc
   | tanfunc
   | atnfunc
   | rndfunc
   | sgnfunc
   | expfunc
   | logfunc
   | absfunc
   ;

expression //sasa expression
   : func                                               #FuncExpr
   | NOT? (PLUS | MINUS)? func                          #SignExp
   | <assoc=right> expression EXPONENT expression       #ExponentExp
   | expression  op=(TIMES | DIV) expression            #MulExp
   | expression op=(PLUS | MINUS) expression            #AddExp
   | expression (op=(GTE|GT|LTE|LT|EQ|NEQ)) expression  #RelExp
   | (LPAREN expression RPAREN)                         #ParenExpr
   ;

// lists var
var: varname varsuffix?;
varname: LETTERS (LETTERS | NUMBER)* ;
varsuffix: (DOLLAR | PERCENT) ;
varlist: vardecl (COMMA vardecl)*    ;
exprlist: expression (COMMA expression)*;

// functions
sqrfunc: SQR LPAREN expression RPAREN;
chrfunc: CHR LPAREN expression RPAREN;
lenfunc: LEN LPAREN expression RPAREN;
ascfunc: ASC LPAREN expression RPAREN;
midfunc: MID LPAREN expression COMMA expression COMMA expression RPAREN;
pdlfunc: PDL LPAREN expression RPAREN;
peekfunc: PEEK LPAREN expression RPAREN;
intfunc: INTF LPAREN expression RPAREN;
spcfunc: SPC LPAREN expression RPAREN;
frefunc: FRE LPAREN expression RPAREN;
posfunc: POS LPAREN expression RPAREN;
usrfunc: USR LPAREN expression RPAREN;
leftfunc: LEFT LPAREN expression COMMA expression RPAREN;
rightfunc: RIGHT LPAREN expression COMMA expression RPAREN;
strfunc: STR LPAREN expression RPAREN;
fnfunc: FN var LPAREN expression RPAREN;
valfunc: VAL LPAREN expression RPAREN;
scrnfunc: SCRN LPAREN expression COMMA expression RPAREN;
sinfunc: SIN LPAREN expression RPAREN;
cosfunc: COS LPAREN expression RPAREN;
tanfunc: TAN LPAREN expression RPAREN;
atnfunc: ATN LPAREN expression RPAREN;
rndfunc: RND LPAREN expression RPAREN;
sgnfunc: SGN LPAREN expression RPAREN;
expfunc: EXP LPAREN expression RPAREN;
logfunc: LOG LPAREN expression RPAREN;
absfunc: ABS LPAREN expression RPAREN;
tabfunc: TAB LPAREN expression RPAREN;

DOLLAR   : '$'   ;
PERCENT   : '%'   ;
RETURN   : 'RETURN' | 'return';
PRINT   : 'PRINT' | 'print';
GOTO   : 'GOTO' | 'goto';


GOSUB: 'GOSUB' | 'gosub';
GPS : 'GPS' | 'gps';
PS: 'PS' | 'ps';
RPS: 'RPS' | 'rps';


IF: 'IF' | 'if';
NEXT: 'NEXT' | 'next';
THEN: 'THEN' | 'then';


REM: 'REM' | 'rem';


CHR: 'CHR$';
MID: 'MID$';
LEFT: 'LEFT$';
RIGHT: 'RIGHT$';
STR: 'STR$';
LPAREN: '(';
RPAREN: ')';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
COLON: ':';

// logical
NEQ : '<>' ;
GTE : '>=' ;
LTE : '<=' ;
GT  : '>' ;
LT  : '<' ;
EQ  : '=' ;
COMMA   : ','  ;
NEWLINE :'\r'? '\n' ;  // return newlines to parser (end-statement signal)
LIST: 'LIST' | 'list';
RUN: 'RUN' | 'run';
END: 'END' | 'end';
LET: 'LET' | 'let';
FOR: 'FOR' | 'for';
TO: 'TO' | 'to'   ;
STEP: 'STEP' | 'step';
INPUT: 'INPUT' | 'input';
SEMICOLON: ';' ;
DIM: 'DIM' | 'dim';
SQR: 'SQR' | 'sqr';

CLEAR: 'CLEAR' | 'clear';
TEXT: 'TEXT' | 'text';
HGR: 'HGR' | 'hgr';
HGR2: 'HGR2' | 'hgr2';
LEN: 'LEN' | 'len';
CALL: 'CALL' | 'call';
ASC: 'ASC' | 'asc';
HPLOT: 'HPLOT' | 'hplot';
VPLOT: 'VPLOT' | 'vplot';
PRNUMBER: 'PR#';
INNUMBER: 'IN#';
VTAB: 'VTAB' | 'vtab';
HTAB: 'HTAB' | 'htab';
HOME: 'HOME' | 'home';
ON: 'ON' | 'on';
PDL: 'PDL' | 'pdl';
PLOT: 'PLOT' | 'plot';
PEEK: 'PEEK' | 'peek';
POKE: 'POKE' | 'poke';
INTF: 'INT' | 'int';
STOP: 'STOP' | 'stop';
HIMEM: 'HIMEM' | 'himem';
LOMEM: 'LOMEM' | 'lomem';
FLASH: 'FLASH' | 'flash';
INVERSE: 'INVERSE' | 'inverse';
NORMAL: 'NORMAL' | 'normal';
ONERR: 'ONERR' | 'onerr';
SPC: 'SPC' | 'spc';
FRE: 'FRE' | 'fre';
POS: 'POS' | 'pos';
USR: 'USR' | 'usr';
TRACE: 'TRACE' | 'trace';
NOTRACE: 'NOTRACE' | 'notrace';
AND: 'AND' | 'and';
OR: 'OR' | 'or';
DATA: 'DATA' | 'data';
WAIT: 'WAIT' | 'wait';
READ: 'READ' | 'read';
XDRAW: 'XDRAW' | 'xdraw';
DRAW: 'DRAW' | 'draw';
AT: 'AT' | 'at';
DEF: 'DEF' | 'def';
FN: 'FN' | 'fn';
VAL: 'VAL' | 'val';
TAB: 'TAB' | 'tab';
SPEED: 'SPEED' | 'speed';
ROT: 'ROT' | 'rot';
SCALE: 'SCALE' | 'scale';
COLOR: 'COLOR' | 'color';
HCOLOR: 'HCOLOR' | 'hcolor';
HLIN: 'HLIN' | 'hlin';
VLIN: 'VLIN' | 'vlin';
SCRN: 'SCRN' | 'scrn';
POP: 'POP' | 'pop';
SHLOAD: 'SHLOAD' | 'shload';
SIN: 'SIN' | 'sin';
COS: 'COS' | 'cos';
TAN: 'TAN' | 'tan';
ATN: 'ATN' | 'atn';
RND: 'RND' | 'rnd';
SGN: 'SGN' | 'sgn';
EXP: 'EXP' | 'exp';
LOG: 'LOG' | 'log';
ABS: 'ABS' | 'abs';
STORE: 'STORE' | 'store';
RECALL: 'RECALL' | 'recall';
GET: 'GET' | 'get' ;
EXPONENT: '^';
AMPERSAND: '&' ;
GR: 'GR' | 'gr';
NOT: 'NOT' | 'not'   ;
RESTORE: 'RESTORE' | 'restore'   ;
SAVE: 'SAVE' | 'save'   ;
LOAD: 'LOAD' | 'load'   ;
QUESTION: '?' ;
INCLUDE: 'INCLUDE' | 'include';
CLS: 'CLS' | 'cls';STATUS : 'S'; //view status of system while in CLS Debug
COMMENT :
        REM ~[\r\n]*
        | SEMICOLON ~[\r\n]*
        ;
STRINGLITERAL: '"' ~ ["\r\n]* '"';
LETTERS: ('a' .. 'z' | 'A' .. 'Z') +;
NUMBER: ('0' .. '9') + (('e' | 'E') NUMBER)*;
FLOAT: ('0' .. '9')* '.' ('0' .. '9') + (('e' | 'E') ('0' .. '9') +)*   ;
WS: [ \t]+ -> skip ; // toss out whitespace
//WS: [ \r\n\t] + -> channel (HIDDEN) ;
