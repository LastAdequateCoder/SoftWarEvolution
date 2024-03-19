using System.Text;
using Antlr4.Runtime;

namespace ConsoleLaunch;

static class ConsoleApplication
{
    private static readonly string ProgramPath = "CobolProgram.txt";
    public static void Main()
    {
        StringBuilder builtString = FileReader.LineByLineRead(ProgramPath);
        
        ICharStream input = CharStreams.fromString(builtString.ToString());
        cobolLexer lexer = new cobolLexer(input);
        cobolParser parser = new cobolParser(new CommonTokenStream(lexer));
        cobolParser.ProgramContext program = parser.program();

        CustomVisitor visitor = new CustomVisitor();
        visitor.Visit(program);
    }
}