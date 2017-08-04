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
    | informal
    ;

informal
    : CHAR+
    ;

zedParagraph
    : ZED ZCHAR* ENDZ
    ;

axParagraph
	: AX  ZCHAR* ENDZ
	;

schemaParagraph
	: SCH ZCHAR* ENDZ
	;

sectionHeader
	: SECTION NAME PARENTS formals ENDS
	| SECTION NAME ENDS
	;


formals
   	: NAME (COMMA NAME)*
   	;

