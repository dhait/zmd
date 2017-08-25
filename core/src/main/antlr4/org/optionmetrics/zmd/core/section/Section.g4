grammar Section;

specification
	: paragraph* EOF
	;

paragraph
    : DEFINE DEFSYM defstring END                       #Define
    | ZED zexpr* END                                    #ZedParagraph
    | AXIOM gen? zexpr* (WHERE zexpr*)? END             #AxiomParagraph
    | SCHEMA sname gen? zexpr* (WHERE zexpr*)? END      #SchemaParagraph
    | SECTION sname (PARENTS sparents)? END             #SectionHeader
    ;

defstring : (UNICODE | NAME | TEXT | RELSYM | MISCSYM)*;

zexpr : (TEXT | NAME | DEFSYM | COMMA | miscsym | relsyms ) ;

sname : NAME;

gen: (LBRACKET NAME (COMMA NAME)* RBRACKET) ;

sparents : sname (COMMA sname)* ;

keyword : ZED
        | AXIOM
        | SCHEMA
        ;


relsyms  : RELSYM+ ;
miscsym : MISCSYM+ ;



RELSYM : [:<=>]+;
MISCSYM : [\-+*@|];
LBRACKET : '[';
RBRACKET : ']';

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
UNICODE : ('\\u' HEX HEX HEX HEX)+;
DEFSYM : '\\' ~[ \t\r\n,]+ ;
WS : [ \t\r\n] -> channel(HIDDEN);

NAME: WORD STROKE*;

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