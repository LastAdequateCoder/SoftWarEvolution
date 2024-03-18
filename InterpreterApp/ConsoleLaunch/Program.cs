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
        builtString.AppendLine("01 CR PICTURE IS 99.");
        builtString.AppendLine("02 MS PICTURE IS 99.");
        builtString.AppendLine("PROCEDURE DIVISION.");
        builtString.AppendLine("DISPLAY 123.");
        builtString.AppendLine("ADD 1 2 3 TO 5 GIVING e.");
        builtString.AppendLine("ADD 1 2 3 TO CR.");
        builtString.AppendLine("DISPLAY e.");
        builtString.AppendLine("DISPLAY CR.");
        //builtString.AppendLine("ACCEPT MS OF CR.");
        // builtString.AppendLine("MULTIPLY 2 BY 5 GIVING e.");
        // builtString.AppendLine("DISPLAY e.");
        // builtString.AppendLine("SUBTRACT 1 2 3 FROM 10 GIVING e.");
        // builtString.AppendLine("DISPLAY e.");

        ICharStream input = CharStreams.fromString(builtString.ToString());
        cobolLexer lexer = new cobolLexer(input);
        cobolParser parser = new cobolParser(new CommonTokenStream(lexer));
        cobolParser.ProgramContext program = parser.program();

        CustomVisitor visitor = new CustomVisitor();
        visitor.Visit(program);
    }
}
