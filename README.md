# Cobol Interpreter

Done by
1. Kirill Fedorov
2. Grigory Baranov
3. Danila Koryugin

## Description
This project is designed to interpret BabyCOBOL code.<br>

It is recommended to avoid using one letter variables, as interpreter can missmatch them with the keywords in the Cobol.

## Installation
To compile the new antlr rules file:

0. Ensure java is installed on your machine
1. cd ../InterpreterApp/InterpreterModules/antlr
2. run java -jar antlr-4.13.1-complete.jar -Dlanguage=CSharp -visitor cobol.g4 CobolTokens.g4

To run the program run Program.cs

## Implemented functions:
- ACCEPT
- ADD
- DISPLAY
- DIVIDE
- EVALUATE
- IF
- MOVE
- MULTIPLY
- PERFORM
- STOP
- SUBSTRACT
- OCCURS
- LIKE
- NEXT SENTENCE
- LOOP
- COPY (PARTIALLY)
- GO TO
- ALTER
- SIGNAL
