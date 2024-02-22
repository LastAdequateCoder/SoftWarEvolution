grammar cobol;
import CobolTokens;
options { caseInsensitive = true; }

// Define the parser rules
display
    :   DISPLAY atomic+ withnoadvancing?
    ;

withnoadvancing
    :   WITH NO ADVANCING
    ;

atomic
    :   identifiers
    |   INT
    |   LITERAL
    ;

identifiers
    :   IDENTIFIER (OF IDENTIFIER)* ('(' INT ')')?
    ;
