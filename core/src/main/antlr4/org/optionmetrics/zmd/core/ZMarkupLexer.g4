lexer grammar ZMarkupLexer;


ZED: 'zed' ;
SCH: 'schema';
AX: 'axiom';
END: 'end' ;
SECTION: 'section';
PARENTS: 'parents';
COMMA : ',';
DEF : 'define';

WS:  [ \n\r\t]+ -> skip;

NAME  : [a-zA-Z] [a-zA-Z0-9]+ ;

fragment HEX : [abcdef0-9];
UNICODE : '\\u' HEX HEX HEX HEX;

DEFSTRING : UNICODE | NAME;

OTHER : . ;
