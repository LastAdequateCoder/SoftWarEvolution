grammar cobol;

// Define the parser rules
moveStatement
    : MOVE moveFrom TO moveTo
    ;

moveFrom
    : IDENTIFIER
    | FIGURATIVE_VALUE
    ;

moveTo
    : IDENTIFIER
    ;

// Define the lexer rules
MOVE : 'MOVE';
TO : 'TO';
IDENTIFIER : [a-zA-Z0-9]+;
FIGURATIVE_VALUE : 'SPACES' | 'ZEROES' | 'HIGH-VALUES' | 'LOW-VALUES';
