grammar LExpr;

s : e ;

e : MINUS e                 # NegNumber
  | LPARENT e RPARENT       # Parent
  | <assoc=right> e POW e    # Pow
  | e op=(MULT|DIV) e       # MultOrDiv
  | e op=(ADD|MINUS) e      # AddOrMinus
  | DOUBLE                  # Double

  ;



LPARENT: '(' ;
RPARENT: ')' ;
MULT: '*' ;
POW: ('^'|'**') ;
DIV : '/' ;
MINUS: '-' ;
ADD : '+' ;
DOUBLE : DIGIT+ | DIGIT* ('.' DIGIT | DIGIT '.') DIGIT* ;
WS : [ \t\n]+ -> skip ;

fragment
DIGIT   : [0-9] ;

