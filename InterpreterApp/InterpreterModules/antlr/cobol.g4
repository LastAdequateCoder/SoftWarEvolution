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
    : DATA DIVISION DOT (INT IDENTIFIER (picture | like)? (OCCURS INT TIMES)? DOT)*
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
    ;

// Define the parser rules
display
    : DISPLAY atomic+ withnoadvancing?
    ;
add
    : ADD additions+=INT+ TO identifiers
    | ADD additions+=INT TO base=INT giving
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
    :   GIVING identifiers
    ;

identifiers
    : IDENTIFIER (OF IDENTIFIER)* ('(' INT ')')?
    ;
