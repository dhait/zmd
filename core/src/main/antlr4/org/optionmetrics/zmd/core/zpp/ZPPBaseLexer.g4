lexer grammar ZPPBaseLexer;

@header {
  import java.util.List;
}

@members {
    public ZPreProcessor preProcessor;
}

INCLUDE : '#include' [ \t]* STRING [ \t]* '\r'? '\n'
{
        System.out.println("including.." + getText());
 		List<ZPPToken> tokens = preProcessor.include(getText());
 		System.out.println("back from include");
 		if ( tokens!=null ) {
 			for (ZPPToken t : tokens)
 			{
 			    emit(t);
 			}
 		}
};

DEFINE :  '#define' [ \t]* NSTRING [ \t]* '\r'? '\n' ;

fragment
STRING : '"' .*? '"' ;

fragment
NSTRING : .*? ;

OTHER_CMD : '#' ~[\r\n]* '\r'? '\n' ;

CHUNK : ~'#'+ ; // anything else


