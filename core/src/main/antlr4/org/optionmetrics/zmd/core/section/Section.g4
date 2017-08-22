grammar Section;

specification
	: paragraph* EOF
	;

paragraph
    : keyword (TEXT | COMMA)* END             #StandardParagraph
    | SECTION sname (PARENTS sparents)? END #SectionHeader
    ;

sname : TEXT+;

sparents : sname (COMMA sname)* ;

keyword : ZED
        | AXIOM
        | SCHEMA
        | DEFINE
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
COMMA : ',';
EOL : [ \r\n] -> channel(HIDDEN);
TEXT : .+?  ;

