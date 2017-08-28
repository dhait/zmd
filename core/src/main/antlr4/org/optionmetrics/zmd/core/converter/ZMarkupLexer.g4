lexer grammar ZMarkupLexer;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN);

ZED : 'zed' ;
WHERE : 'where';
SECTION : 'section' ;
PARENTS : 'parent' 's'? ;
AXIOM : 'axiom' ;
SCHEMA : 'schema' ;
DEFINE : 'define' ;
END : 'end' ;
COMMA : ',';
LBRACKET : '[';
RBRACKET : ']';
UNICODE : ('\\u' HEX HEX HEX HEX)+;
DEFSYM : '\\' ~[ \t\r\n,]+ ;
NAME   : WORD STROKE*;
WS : [ \t\r\n] -> channel(HIDDEN);
TEXT : .+?;

fragment
HEX : [a-zA-Z0-9];

fragment
STROKE : ['?!];

fragment
WORDPART : ALPHA ALPHANUM* ;

fragment
WORD : WORDPART ('_' WORDPART)* ;

fragment
ALPHA : [a-zA-Z];

fragment
DIGITS : [0-9];

fragment
ALPHANUM : ALPHA | DIGITS ;