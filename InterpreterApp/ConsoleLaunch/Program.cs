using Antlr4.Runtime;
class ConsoleLaunch
{
    public static void Main(string[] agrs)
    {
        ICharStream input = CharStreams.fromString("DISPLAY 123");
        cobolLexer lexer = new cobolLexer(input);
        cobolParser parser = new cobolParser(new CommonTokenStream(lexer));
        cobolParser.ProgramContext program = parser.program();

        CustomVisitor visitor = new CustomVisitor();
        visitor.Visit(program);
    }
}
