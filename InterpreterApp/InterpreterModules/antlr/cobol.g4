grammar cobol;
import CobolTokens;
options { caseInsensitive = true; }

program
    : identification_division (data_division)? (procedure_division) EOF
    ;

identification_division
    : IDENTIFICATION DIVISION DOT (IDENTIFIER DOT LITERAL DOT)*
    ;

data_division
    : DATA DIVISION DOT variables*
    ;

variables
    : (level IDENTIFIER (picture | like)? (OCCURS INT TIMES)? DOT)
    ;

level
    : INT
    ;

picture
    : PICTURE IS REPRESENTATION
    ;

like
    : LIKE identifiers
    ;

procedure_division
    : PROCEDURE DIVISION (using)? DOT sentence+
    ;

using
    : USING use+
    ;

use
    : BY REFERENCE identifiers
    | BY CONTENT atomic
    | BY VALUE atomic
    ;

sentence
    : (IDENTIFIER DOT)? statement+ DOT
    ;

statement
    : display
    | add
    | accept
    | multiply
    | subtract
    | divide
    ;

// Define the parser rules
display
    : DISPLAY atomic+ withnoadvancing?
    ;

add
    : ADD additions+=INT+ TO identifiers
    | ADD additions+=INT+ TO base=INT giving
    ;
multiply
    : MULTIPLY multiplier=INT BY identifiers+
    | MULTIPLY multiplier=INT BY base=INT giving
    ;
divide
    : DIVIDE divisor=INT INTO identifiers+
    | DIVIDE divisor=INT INTO base=INT giving
    | DIVIDE divisor=INT INTO base=INT giving remainder
    ;
    
subtract
    : SUBTRACT subtractors+=INT+ FROM identifiers
    | SUBTRACT subtractors+=INT+ FROM base=INT giving
    ;

accept
    : ACCEPT identifiers+
    ;

withnoadvancing
    : WITH NO ADVANCING
    ;

atomic
    : identifiers
    | INT
    | LITERAL
    ;
giving
    : GIVING identifiers
    ;

identifiers
    : IDENTIFIER (OF IDENTIFIER)* ('(' INT ')')?
    ;
remainder
    :   REMAINDER identifiers
    ;
