grammar VecMath;
statlist :stat+;
stat: ID '=' expr
      |'print' expr
      ;

expr: multExpr ('+' multExpr)*;

multExpr: primary (('*'|'.') primary)*;

primary: INT | ID | '[' expr (','expr)* ']';

WS:(' '|'\t'|'\r'|'\n'){skip();};
INT : '0'..'9';
ID :('a'..'z'|'A'..'Z')+;