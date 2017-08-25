grammar Section;

specification
	: paragraph* EOF
	;

paragraph
    : DEFINE DEFSYM defstring END               #Define
    | keyword (TEXT | DEFSYM | COMMA )*  END    #StandardParagraph
    | SECTION sname (PARENTS sparents)? END     #SectionHeader
    ;

defstring : (UNICODE | TEXT);

sname : TEXT;

sparents : sname (COMMA sname)* ;

keyword : ZED
        | AXIOM
        | SCHEMA
        ;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN);
ZED : 'zed' ;
AXIOM : 'axiom' ;
SECTION : 'section' ;
SCHEMA : 'schema' ;
DEFINE : 'define' ;
PARENTS : 'parent' 's'?;
END : 'end' ;
UNICODE : ('\\u' HEX HEX HEX HEX)+;
DEFSYM : '\\' ~[ \t\r\n,]+ ;
SEMI : ';';
COMMA : ',';
WS : [ \t\r\n] -> channel(HIDDEN);
// everything else
TEXT : ~[ \t\r\n,]+  ;

fragment HEX : [0-9a-fA-F];

