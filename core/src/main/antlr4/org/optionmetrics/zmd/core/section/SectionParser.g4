parser grammar SectionParser;
options { tokenVocab=SectionLexer; }

specification
	: paragraph* EOF
	;

paragraph
    : zedParagraph
    | axParagraph
    | schemaParagraph
    | sectionHeader
    | definition
    | informal
    ;

informal
    : CHAR+
    ;

zedParagraph
    : ZED ZCHAR* ENDZ
    ;

axParagraph
	: AX  (LBRACKET  genformals RBRACKET)? ZCHAR* ENDZ
	;

schemaParagraph
	: SCH (LBRACKET  genformals RBRACKET)? ZCHAR* ENDZ
	;

sectionHeader
	: SECTION NAME PARENTS formals ENDS
	| SECTION NAME ENDS
	;


formals
   	: NAME (COMMA NAME)*
   	;

genformals
    : FORMAL (FCOMMA FORMAL)*
    ;

definition
    : DEF CHUNK CHUNK ENDD
    ;