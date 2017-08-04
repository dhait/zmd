parser grammar ZMarkup;
options { tokenVocab=ZMarkupLexer; }
@header {
  import java.util.HashMap;
  import java.util.Map;
}

@members {

    Map<String, String> defines = new HashMap<String, String>() {{
        put("forall", "\u2200");
    }};
}

specification
	: (section | paragraph )* EOF
	;

section
	: SECTION NAME PARENTS formals? END paragraph*
	| SECTION NAME END paragraph*
	;

paragraph
	: ZED token* END #ZedParagraph
	| AX  token* END #AxParagraph
	| SCH token* END #SchemaParagraph
	| DEF NAME defstring END #DefParagraph
	;

formals
   	: NAME (COMMA NAME)*
   	;

defstring
    : UNICODE
    | NAME
    ;

token
    : NAME
    | OTHER+?
    ;