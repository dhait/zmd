parser grammar SectionParser;
options { tokenVocab=SectionLexer; }

specification
	: paragraph* EOF
	;

paragraph
    : DEFINE DEFSYM zexpr* END                          #Define
    | ZED zexpr* END                                    #ZedParagraph
    | AXIOM gen? zexpr* (WHERE zexpr*)? END             #AxiomParagraph
    | SCHEMA sname gen? zexpr* (WHERE zexpr*)? END      #SchemaParagraph
    | SECTION sname (PARENTS sparents)? END             #SectionHeader
    ;

zexpr : (TEXT | NAME | DEFSYM | COMMA | UNICODE) ;

sname : NAME;

gen: (LBRACKET NAME (COMMA NAME)* RBRACKET) ;

sparents : sname (COMMA sname)* ;

