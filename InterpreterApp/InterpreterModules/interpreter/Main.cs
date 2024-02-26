using System;
using System.Runtime.InteropServices;
using Antlr4.Runtime;
class MainInterpreter {
// Main Method
static public void Main(String[] args){
        ICharStream input = CharStreams.fromString("DISPLAY 123");
        cobolLexer lexer = new cobolLexer(input);
        cobolParser parser = new cobolParser(new CommonTokenStream(lexer));
        cobolParser.ProgramContext program = parser.program();

        CustomVisitor visitor = new CustomVisitor();
        visitor.Visit(program);
    }
}