using Antlr4.Runtime;
using System.Text;
using static System.Runtime.InteropServices.JavaScript.JSType;

class ConsoleLaunch
{
    public static void Main(string[] agrs)
    {
        StringBuilder builtString = new StringBuilder();

        builtString.AppendLine("IDENTIFICATION DIVISION.");
        builtString.AppendLine("PROGRAM-ID. \"TESTING\".");
        builtString.AppendLine("AUTHOR. \"KLEAN KODE\".INSTALLATION. \"1\".");
        builtString.AppendLine("DATE-WRITTEN. \"04/04/2023\".DATE-COMPILED. \"04/04/2023\".");
        builtString.AppendLine("DATA DIVISION.");
        builtString.AppendLine("PROCEDURE DIVISION.");
        builtString.AppendLine("DISPLAY 123.");
        builtString.AppendLine("ADD 1 2 3 TO X.");

        ICharStream input = CharStreams.fromString(builtString.ToString());
        cobolLexer lexer = new cobolLexer(input);
        cobolParser parser = new cobolParser(new CommonTokenStream(lexer));
        cobolParser.ProgramContext program = parser.program();

        CustomVisitor visitor = new CustomVisitor();
        visitor.Visit(program);
    }
}
