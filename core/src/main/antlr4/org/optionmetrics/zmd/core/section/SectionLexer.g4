lexer grammar SectionLexer;

ZED: 'zed' -> mode(Z) ;
SCH: 'schema' -> mode(Z) ;
AX: 'axiom' -> mode(Z) ;
SECTION: 'section' -> mode(section) ;
CHAR : .;
NL: [\n\r] -> channel(HIDDEN);

mode section;
ENDS: 'end' -> mode(DEFAULT_MODE) ;
PARENTS: 'parents';
NAME  : [a-zA-Z] [a-zA-Z0-9_]+ ;
COMMA : ',';
WSS: [ \t\r\n] -> channel(HIDDEN);

mode Z;
ENDZ: 'end' -> mode(DEFAULT_MODE) ;
ZCHAR: .;
