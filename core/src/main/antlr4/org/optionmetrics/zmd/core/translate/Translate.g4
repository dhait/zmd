grammar Translate;

specification
	: paragraph* EOF
	;

paragraph
    : zedParagraph
    | axParagraph
    | schemaParagraph
    | sectionHeader
    | definition
    | tag
    | informal
    ;

zedParagraph : 'zed' misc* 'end';

axParagraph : 'axiom' gen misc* 'end';

schemaParagraph : 'schema' NAME gen? misc* 'end';


sectionHeader: 'section' NAME ('parents' sparents)? 'end' ;

sparents : NAME (COMMA NAME)* ;

gen: (LBRACKET NAME (COMMA NAME)* RBRACKET) ;

definition : 'define' misc misc;

tag : 'tag' misc;

informal : misc+;

misc: NAME | WORD | COMMA | NL | UNICODE | ESC ;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]* -> skip;
COMMA : ',';
LBRACKET : '[';
RBRACKET : ']';


NAME : [a-zA-Z] [a-zA-Z0-9_]*;
WORD : ~('\t' | '\n' | ' ')+? ;
NL : '\r' ? '\n';
UNICODE : '\\u' HEX HEX HEX HEX;
ESC : '\\' .;
WS : [ \t] -> channel(HIDDEN);

fragment HEX : [0-9a-fA-F];