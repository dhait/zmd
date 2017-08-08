lexer grammar SectionLexer;

ZED: 'zed' -> mode(Z) ;
SCH: 'schema' -> mode(Z) ;
AX: 'axiom' -> mode(Z) ;
DEF: 'define' -> mode(define);
SECTION: 'section' -> mode(section) ;

CHAR : .;   // informals
NL: [\n\r] -> channel(HIDDEN);

mode section;
ENDS: 'end' -> mode(DEFAULT_MODE) ;
PARENTS: 'parents';
NAME  : [a-zA-Z] [a-zA-Z0-9_]+ ;
COMMA : ',';
WSS: [ \t\r\n] -> channel(HIDDEN);

mode Z;
ENDZ: 'end' -> mode(DEFAULT_MODE) ;
LBRACKET : '[' -> mode(generic);
WSZ: [ \t] -> channel(HIDDEN);
ZCHAR: '.';

mode define;
CHUNK : ~[ \t\n\r]+ ;
WSD: [ \t] -> channel(HIDDEN);
ENDD: [\r\n] -> mode(DEFAULT_MODE) ;

mode generic;
RBRACKET : ']' -> mode(Z);
FORMAL : [a-zA-Z] [a-zA-Z0-9_]* ;
FCOMMA : ',';
WSG: [ \t\r\n] -> channel(HIDDEN);


