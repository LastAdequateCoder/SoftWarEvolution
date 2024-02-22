lexer grammar CobolTokens;

DISPLAY : 'D' SPACE* 'I' SPACE* 'S' SPACE* 'P' SPACE* 'L' SPACE* 'A' SPACE* 'Y' ;
OF: 'O' SPACE* 'F';
WITH: 'W' SPACE* 'I' SPACE* 'T' SPACE* 'H';
NO: 'N' SPACE* 'O';
ADVANCING: 'A' SPACE* 'D' SPACE* 'V' SPACE* 'A' SPACE* 'N' SPACE* 'C' SPACE* 'I' SPACE* 'N' SPACE* 'G';

IDENTIFIER
    :   LETTER ( LETTER | DIGIT | '-' )* ( '(' DIGIT ')' )?
    ;

INT
    :   DIGIT+
    ;

SPACE
    :   [ \t\r\n\f] -> skip
    ;

DOT
    :   '.'
    ;

LITERAL
    :   '"' ~'"'+ '"'
    ;

fragment LETTER
    :   [a-zA-Z]
    ;

fragment DIGIT
    :   [0-9]
    ;