lexer grammar CobolTokens;

REPRESENTATION
    : REPR+
    ;

IDENTIFICATION : 'I' SPACE* 'D' SPACE* 'E' SPACE* 'N' SPACE* 'T' SPACE* 'I' SPACE* 'F' SPACE* 'I' SPACE* 'C' SPACE* 'A' SPACE* 'T' SPACE* 'I' SPACE* 'O' SPACE* 'N';
DIVISION : 'D' SPACE* 'I' SPACE* 'V' SPACE* 'I' SPACE* 'S' SPACE* 'I' SPACE* 'O' SPACE* 'N';
OCCURS: 'O' SPACE* 'C' SPACE* 'C' SPACE* 'U' SPACE* 'R' SPACE* 'S';
TIMES: 'T' SPACE* 'I' SPACE* 'M' SPACE* 'E' SPACE* 'S';
PICTURE: 'P' SPACE* 'I' SPACE* 'C' SPACE* 'T' SPACE* 'U' SPACE* 'R' SPACE* 'E';
IS: 'I' SPACE* 'S';
PROCEDURE: 'P' SPACE* 'R' SPACE* 'O' SPACE* 'C' SPACE* 'E' SPACE* 'D' SPACE* 'U' SPACE* 'R' SPACE* 'E';
USING: 'U' SPACE* 'S' SPACE* 'I' SPACE* 'N' SPACE* 'G';
BY: 'B' SPACE* 'Y';
REFERENCE: 'R' SPACE* 'E' SPACE* 'F' SPACE* 'E' SPACE* 'R' SPACE* 'E' SPACE* 'N' SPACE* 'C' SPACE* 'E';
CONTENT: 'C' SPACE* 'O' SPACE* 'N' SPACE* 'T' SPACE* 'E' SPACE* 'N' SPACE* 'T';
VALUE: 'V' SPACE* 'A' SPACE* 'L' SPACE* 'U' SPACE* 'E';
LIKE: 'L' SPACE* 'I' SPACE* 'K' SPACE* 'E';
DISPLAY : 'D' SPACE* 'I' SPACE* 'S' SPACE* 'P' SPACE* 'L' SPACE* 'A' SPACE* 'Y' ;
OF: 'O' SPACE* 'F';
WITH: 'W' SPACE* 'I' SPACE* 'T' SPACE* 'H';
NO: 'N' SPACE* 'O';
ADVANCING: 'A' SPACE* 'D' SPACE* 'V' SPACE* 'A' SPACE* 'N' SPACE* 'C' SPACE* 'I' SPACE* 'N' SPACE* 'G';
DATA: 'D' SPACE* 'A' SPACE* 'T' SPACE* 'A';
ADD : 'A' SPACE* 'D' SPACE* 'D' ;
TO : 'T' SPACE* 'O';
GIVING : 'G' SPACE* 'I' SPACE* 'V' SPACE* 'I' SPACE* 'N' SPACE* 'G';

IDENTIFIER
    : LETTER ( LETTER | DIGIT | '-' )* ( '(' DIGIT ')' )?
    ;

INT
    : DIGIT+
    ;

SPACE
    : [ \t\r\n\f] -> skip
    ;

DOT
    : '.'
    ;

LITERAL
    : '"' ~'"'+ '"'
    ;

fragment LETTER
    : [a-zA-Z]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment REPR
    : '9'
    | 'A'
    | 'X'
    | 'Z'
    | 'S'
    | 'V'
    ;