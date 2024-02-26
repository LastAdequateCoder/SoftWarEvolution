//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from CobolTokens.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class CobolTokens : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		REPRESENTATION=1, IDENTIFICATION=2, DIVISION=3, OCCURS=4, TIMES=5, PICTURE=6, 
		IS=7, PROCEDURE=8, USING=9, BY=10, REFERENCE=11, CONTENT=12, VALUE=13, 
		DISPLAY=14, OF=15, WITH=16, NO=17, ADVANCING=18, IDENTIFIER=19, INT=20, 
		SPACE=21, DOT=22, LITERAL=23;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"REPRESENTATION", "IDENTIFICATION", "DIVISION", "OCCURS", "TIMES", "PICTURE", 
		"IS", "PROCEDURE", "USING", "BY", "REFERENCE", "CONTENT", "VALUE", "DISPLAY", 
		"OF", "WITH", "NO", "ADVANCING", "IDENTIFIER", "INT", "SPACE", "DOT", 
		"LITERAL", "LETTER", "DIGIT", "REPR"
	};


	public CobolTokens(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public CobolTokens(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'.'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "REPRESENTATION", "IDENTIFICATION", "DIVISION", "OCCURS", "TIMES", 
		"PICTURE", "IS", "PROCEDURE", "USING", "BY", "REFERENCE", "CONTENT", "VALUE", 
		"DISPLAY", "OF", "WITH", "NO", "ADVANCING", "IDENTIFIER", "INT", "SPACE", 
		"DOT", "LITERAL"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "CobolTokens.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static CobolTokens() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,23,734,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,1,0,4,0,55,8,0,11,0,12,0,
		56,1,1,1,1,5,1,61,8,1,10,1,12,1,64,9,1,1,1,1,1,5,1,68,8,1,10,1,12,1,71,
		9,1,1,1,1,1,5,1,75,8,1,10,1,12,1,78,9,1,1,1,1,1,5,1,82,8,1,10,1,12,1,85,
		9,1,1,1,1,1,5,1,89,8,1,10,1,12,1,92,9,1,1,1,1,1,5,1,96,8,1,10,1,12,1,99,
		9,1,1,1,1,1,5,1,103,8,1,10,1,12,1,106,9,1,1,1,1,1,5,1,110,8,1,10,1,12,
		1,113,9,1,1,1,1,1,5,1,117,8,1,10,1,12,1,120,9,1,1,1,1,1,5,1,124,8,1,10,
		1,12,1,127,9,1,1,1,1,1,5,1,131,8,1,10,1,12,1,134,9,1,1,1,1,1,5,1,138,8,
		1,10,1,12,1,141,9,1,1,1,1,1,5,1,145,8,1,10,1,12,1,148,9,1,1,1,1,1,1,2,
		1,2,5,2,154,8,2,10,2,12,2,157,9,2,1,2,1,2,5,2,161,8,2,10,2,12,2,164,9,
		2,1,2,1,2,5,2,168,8,2,10,2,12,2,171,9,2,1,2,1,2,5,2,175,8,2,10,2,12,2,
		178,9,2,1,2,1,2,5,2,182,8,2,10,2,12,2,185,9,2,1,2,1,2,5,2,189,8,2,10,2,
		12,2,192,9,2,1,2,1,2,5,2,196,8,2,10,2,12,2,199,9,2,1,2,1,2,1,3,1,3,5,3,
		205,8,3,10,3,12,3,208,9,3,1,3,1,3,5,3,212,8,3,10,3,12,3,215,9,3,1,3,1,
		3,5,3,219,8,3,10,3,12,3,222,9,3,1,3,1,3,5,3,226,8,3,10,3,12,3,229,9,3,
		1,3,1,3,5,3,233,8,3,10,3,12,3,236,9,3,1,3,1,3,1,4,1,4,5,4,242,8,4,10,4,
		12,4,245,9,4,1,4,1,4,5,4,249,8,4,10,4,12,4,252,9,4,1,4,1,4,5,4,256,8,4,
		10,4,12,4,259,9,4,1,4,1,4,5,4,263,8,4,10,4,12,4,266,9,4,1,4,1,4,1,5,1,
		5,5,5,272,8,5,10,5,12,5,275,9,5,1,5,1,5,5,5,279,8,5,10,5,12,5,282,9,5,
		1,5,1,5,5,5,286,8,5,10,5,12,5,289,9,5,1,5,1,5,5,5,293,8,5,10,5,12,5,296,
		9,5,1,5,1,5,5,5,300,8,5,10,5,12,5,303,9,5,1,5,1,5,5,5,307,8,5,10,5,12,
		5,310,9,5,1,5,1,5,1,6,1,6,5,6,316,8,6,10,6,12,6,319,9,6,1,6,1,6,1,7,1,
		7,5,7,325,8,7,10,7,12,7,328,9,7,1,7,1,7,5,7,332,8,7,10,7,12,7,335,9,7,
		1,7,1,7,5,7,339,8,7,10,7,12,7,342,9,7,1,7,1,7,5,7,346,8,7,10,7,12,7,349,
		9,7,1,7,1,7,5,7,353,8,7,10,7,12,7,356,9,7,1,7,1,7,5,7,360,8,7,10,7,12,
		7,363,9,7,1,7,1,7,5,7,367,8,7,10,7,12,7,370,9,7,1,7,1,7,5,7,374,8,7,10,
		7,12,7,377,9,7,1,7,1,7,1,8,1,8,5,8,383,8,8,10,8,12,8,386,9,8,1,8,1,8,5,
		8,390,8,8,10,8,12,8,393,9,8,1,8,1,8,5,8,397,8,8,10,8,12,8,400,9,8,1,8,
		1,8,5,8,404,8,8,10,8,12,8,407,9,8,1,8,1,8,1,9,1,9,5,9,413,8,9,10,9,12,
		9,416,9,9,1,9,1,9,1,10,1,10,5,10,422,8,10,10,10,12,10,425,9,10,1,10,1,
		10,5,10,429,8,10,10,10,12,10,432,9,10,1,10,1,10,5,10,436,8,10,10,10,12,
		10,439,9,10,1,10,1,10,5,10,443,8,10,10,10,12,10,446,9,10,1,10,1,10,5,10,
		450,8,10,10,10,12,10,453,9,10,1,10,1,10,5,10,457,8,10,10,10,12,10,460,
		9,10,1,10,1,10,5,10,464,8,10,10,10,12,10,467,9,10,1,10,1,10,5,10,471,8,
		10,10,10,12,10,474,9,10,1,10,1,10,1,11,1,11,5,11,480,8,11,10,11,12,11,
		483,9,11,1,11,1,11,5,11,487,8,11,10,11,12,11,490,9,11,1,11,1,11,5,11,494,
		8,11,10,11,12,11,497,9,11,1,11,1,11,5,11,501,8,11,10,11,12,11,504,9,11,
		1,11,1,11,5,11,508,8,11,10,11,12,11,511,9,11,1,11,1,11,5,11,515,8,11,10,
		11,12,11,518,9,11,1,11,1,11,1,12,1,12,5,12,524,8,12,10,12,12,12,527,9,
		12,1,12,1,12,5,12,531,8,12,10,12,12,12,534,9,12,1,12,1,12,5,12,538,8,12,
		10,12,12,12,541,9,12,1,12,1,12,5,12,545,8,12,10,12,12,12,548,9,12,1,12,
		1,12,1,13,1,13,5,13,554,8,13,10,13,12,13,557,9,13,1,13,1,13,5,13,561,8,
		13,10,13,12,13,564,9,13,1,13,1,13,5,13,568,8,13,10,13,12,13,571,9,13,1,
		13,1,13,5,13,575,8,13,10,13,12,13,578,9,13,1,13,1,13,5,13,582,8,13,10,
		13,12,13,585,9,13,1,13,1,13,5,13,589,8,13,10,13,12,13,592,9,13,1,13,1,
		13,1,14,1,14,5,14,598,8,14,10,14,12,14,601,9,14,1,14,1,14,1,15,1,15,5,
		15,607,8,15,10,15,12,15,610,9,15,1,15,1,15,5,15,614,8,15,10,15,12,15,617,
		9,15,1,15,1,15,5,15,621,8,15,10,15,12,15,624,9,15,1,15,1,15,1,16,1,16,
		5,16,630,8,16,10,16,12,16,633,9,16,1,16,1,16,1,17,1,17,5,17,639,8,17,10,
		17,12,17,642,9,17,1,17,1,17,5,17,646,8,17,10,17,12,17,649,9,17,1,17,1,
		17,5,17,653,8,17,10,17,12,17,656,9,17,1,17,1,17,5,17,660,8,17,10,17,12,
		17,663,9,17,1,17,1,17,5,17,667,8,17,10,17,12,17,670,9,17,1,17,1,17,5,17,
		674,8,17,10,17,12,17,677,9,17,1,17,1,17,5,17,681,8,17,10,17,12,17,684,
		9,17,1,17,1,17,5,17,688,8,17,10,17,12,17,691,9,17,1,17,1,17,1,18,1,18,
		1,18,1,18,5,18,699,8,18,10,18,12,18,702,9,18,1,18,1,18,1,18,1,18,3,18,
		708,8,18,1,19,4,19,711,8,19,11,19,12,19,712,1,20,1,20,1,20,1,20,1,21,1,
		21,1,22,1,22,4,22,723,8,22,11,22,12,22,724,1,22,1,22,1,23,1,23,1,24,1,
		24,1,25,1,25,0,0,26,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,
		23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,45,23,
		47,0,49,0,51,0,1,0,5,3,0,9,10,12,13,32,32,1,0,34,34,2,0,65,90,97,122,1,
		0,48,57,6,0,57,57,65,65,83,83,86,86,88,88,90,90,823,0,1,1,0,0,0,0,3,1,
		0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,
		15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,
		0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,
		0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,1,54,
		1,0,0,0,3,58,1,0,0,0,5,151,1,0,0,0,7,202,1,0,0,0,9,239,1,0,0,0,11,269,
		1,0,0,0,13,313,1,0,0,0,15,322,1,0,0,0,17,380,1,0,0,0,19,410,1,0,0,0,21,
		419,1,0,0,0,23,477,1,0,0,0,25,521,1,0,0,0,27,551,1,0,0,0,29,595,1,0,0,
		0,31,604,1,0,0,0,33,627,1,0,0,0,35,636,1,0,0,0,37,694,1,0,0,0,39,710,1,
		0,0,0,41,714,1,0,0,0,43,718,1,0,0,0,45,720,1,0,0,0,47,728,1,0,0,0,49,730,
		1,0,0,0,51,732,1,0,0,0,53,55,3,51,25,0,54,53,1,0,0,0,55,56,1,0,0,0,56,
		54,1,0,0,0,56,57,1,0,0,0,57,2,1,0,0,0,58,62,5,73,0,0,59,61,3,41,20,0,60,
		59,1,0,0,0,61,64,1,0,0,0,62,60,1,0,0,0,62,63,1,0,0,0,63,65,1,0,0,0,64,
		62,1,0,0,0,65,69,5,68,0,0,66,68,3,41,20,0,67,66,1,0,0,0,68,71,1,0,0,0,
		69,67,1,0,0,0,69,70,1,0,0,0,70,72,1,0,0,0,71,69,1,0,0,0,72,76,5,69,0,0,
		73,75,3,41,20,0,74,73,1,0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,
		0,77,79,1,0,0,0,78,76,1,0,0,0,79,83,5,78,0,0,80,82,3,41,20,0,81,80,1,0,
		0,0,82,85,1,0,0,0,83,81,1,0,0,0,83,84,1,0,0,0,84,86,1,0,0,0,85,83,1,0,
		0,0,86,90,5,84,0,0,87,89,3,41,20,0,88,87,1,0,0,0,89,92,1,0,0,0,90,88,1,
		0,0,0,90,91,1,0,0,0,91,93,1,0,0,0,92,90,1,0,0,0,93,97,5,73,0,0,94,96,3,
		41,20,0,95,94,1,0,0,0,96,99,1,0,0,0,97,95,1,0,0,0,97,98,1,0,0,0,98,100,
		1,0,0,0,99,97,1,0,0,0,100,104,5,70,0,0,101,103,3,41,20,0,102,101,1,0,0,
		0,103,106,1,0,0,0,104,102,1,0,0,0,104,105,1,0,0,0,105,107,1,0,0,0,106,
		104,1,0,0,0,107,111,5,73,0,0,108,110,3,41,20,0,109,108,1,0,0,0,110,113,
		1,0,0,0,111,109,1,0,0,0,111,112,1,0,0,0,112,114,1,0,0,0,113,111,1,0,0,
		0,114,118,5,67,0,0,115,117,3,41,20,0,116,115,1,0,0,0,117,120,1,0,0,0,118,
		116,1,0,0,0,118,119,1,0,0,0,119,121,1,0,0,0,120,118,1,0,0,0,121,125,5,
		65,0,0,122,124,3,41,20,0,123,122,1,0,0,0,124,127,1,0,0,0,125,123,1,0,0,
		0,125,126,1,0,0,0,126,128,1,0,0,0,127,125,1,0,0,0,128,132,5,84,0,0,129,
		131,3,41,20,0,130,129,1,0,0,0,131,134,1,0,0,0,132,130,1,0,0,0,132,133,
		1,0,0,0,133,135,1,0,0,0,134,132,1,0,0,0,135,139,5,73,0,0,136,138,3,41,
		20,0,137,136,1,0,0,0,138,141,1,0,0,0,139,137,1,0,0,0,139,140,1,0,0,0,140,
		142,1,0,0,0,141,139,1,0,0,0,142,146,5,79,0,0,143,145,3,41,20,0,144,143,
		1,0,0,0,145,148,1,0,0,0,146,144,1,0,0,0,146,147,1,0,0,0,147,149,1,0,0,
		0,148,146,1,0,0,0,149,150,5,78,0,0,150,4,1,0,0,0,151,155,5,68,0,0,152,
		154,3,41,20,0,153,152,1,0,0,0,154,157,1,0,0,0,155,153,1,0,0,0,155,156,
		1,0,0,0,156,158,1,0,0,0,157,155,1,0,0,0,158,162,5,73,0,0,159,161,3,41,
		20,0,160,159,1,0,0,0,161,164,1,0,0,0,162,160,1,0,0,0,162,163,1,0,0,0,163,
		165,1,0,0,0,164,162,1,0,0,0,165,169,5,86,0,0,166,168,3,41,20,0,167,166,
		1,0,0,0,168,171,1,0,0,0,169,167,1,0,0,0,169,170,1,0,0,0,170,172,1,0,0,
		0,171,169,1,0,0,0,172,176,5,73,0,0,173,175,3,41,20,0,174,173,1,0,0,0,175,
		178,1,0,0,0,176,174,1,0,0,0,176,177,1,0,0,0,177,179,1,0,0,0,178,176,1,
		0,0,0,179,183,5,83,0,0,180,182,3,41,20,0,181,180,1,0,0,0,182,185,1,0,0,
		0,183,181,1,0,0,0,183,184,1,0,0,0,184,186,1,0,0,0,185,183,1,0,0,0,186,
		190,5,73,0,0,187,189,3,41,20,0,188,187,1,0,0,0,189,192,1,0,0,0,190,188,
		1,0,0,0,190,191,1,0,0,0,191,193,1,0,0,0,192,190,1,0,0,0,193,197,5,79,0,
		0,194,196,3,41,20,0,195,194,1,0,0,0,196,199,1,0,0,0,197,195,1,0,0,0,197,
		198,1,0,0,0,198,200,1,0,0,0,199,197,1,0,0,0,200,201,5,78,0,0,201,6,1,0,
		0,0,202,206,5,79,0,0,203,205,3,41,20,0,204,203,1,0,0,0,205,208,1,0,0,0,
		206,204,1,0,0,0,206,207,1,0,0,0,207,209,1,0,0,0,208,206,1,0,0,0,209,213,
		5,67,0,0,210,212,3,41,20,0,211,210,1,0,0,0,212,215,1,0,0,0,213,211,1,0,
		0,0,213,214,1,0,0,0,214,216,1,0,0,0,215,213,1,0,0,0,216,220,5,67,0,0,217,
		219,3,41,20,0,218,217,1,0,0,0,219,222,1,0,0,0,220,218,1,0,0,0,220,221,
		1,0,0,0,221,223,1,0,0,0,222,220,1,0,0,0,223,227,5,85,0,0,224,226,3,41,
		20,0,225,224,1,0,0,0,226,229,1,0,0,0,227,225,1,0,0,0,227,228,1,0,0,0,228,
		230,1,0,0,0,229,227,1,0,0,0,230,234,5,82,0,0,231,233,3,41,20,0,232,231,
		1,0,0,0,233,236,1,0,0,0,234,232,1,0,0,0,234,235,1,0,0,0,235,237,1,0,0,
		0,236,234,1,0,0,0,237,238,5,83,0,0,238,8,1,0,0,0,239,243,5,84,0,0,240,
		242,3,41,20,0,241,240,1,0,0,0,242,245,1,0,0,0,243,241,1,0,0,0,243,244,
		1,0,0,0,244,246,1,0,0,0,245,243,1,0,0,0,246,250,5,73,0,0,247,249,3,41,
		20,0,248,247,1,0,0,0,249,252,1,0,0,0,250,248,1,0,0,0,250,251,1,0,0,0,251,
		253,1,0,0,0,252,250,1,0,0,0,253,257,5,77,0,0,254,256,3,41,20,0,255,254,
		1,0,0,0,256,259,1,0,0,0,257,255,1,0,0,0,257,258,1,0,0,0,258,260,1,0,0,
		0,259,257,1,0,0,0,260,264,5,69,0,0,261,263,3,41,20,0,262,261,1,0,0,0,263,
		266,1,0,0,0,264,262,1,0,0,0,264,265,1,0,0,0,265,267,1,0,0,0,266,264,1,
		0,0,0,267,268,5,83,0,0,268,10,1,0,0,0,269,273,5,80,0,0,270,272,3,41,20,
		0,271,270,1,0,0,0,272,275,1,0,0,0,273,271,1,0,0,0,273,274,1,0,0,0,274,
		276,1,0,0,0,275,273,1,0,0,0,276,280,5,73,0,0,277,279,3,41,20,0,278,277,
		1,0,0,0,279,282,1,0,0,0,280,278,1,0,0,0,280,281,1,0,0,0,281,283,1,0,0,
		0,282,280,1,0,0,0,283,287,5,67,0,0,284,286,3,41,20,0,285,284,1,0,0,0,286,
		289,1,0,0,0,287,285,1,0,0,0,287,288,1,0,0,0,288,290,1,0,0,0,289,287,1,
		0,0,0,290,294,5,84,0,0,291,293,3,41,20,0,292,291,1,0,0,0,293,296,1,0,0,
		0,294,292,1,0,0,0,294,295,1,0,0,0,295,297,1,0,0,0,296,294,1,0,0,0,297,
		301,5,85,0,0,298,300,3,41,20,0,299,298,1,0,0,0,300,303,1,0,0,0,301,299,
		1,0,0,0,301,302,1,0,0,0,302,304,1,0,0,0,303,301,1,0,0,0,304,308,5,82,0,
		0,305,307,3,41,20,0,306,305,1,0,0,0,307,310,1,0,0,0,308,306,1,0,0,0,308,
		309,1,0,0,0,309,311,1,0,0,0,310,308,1,0,0,0,311,312,5,69,0,0,312,12,1,
		0,0,0,313,317,5,73,0,0,314,316,3,41,20,0,315,314,1,0,0,0,316,319,1,0,0,
		0,317,315,1,0,0,0,317,318,1,0,0,0,318,320,1,0,0,0,319,317,1,0,0,0,320,
		321,5,83,0,0,321,14,1,0,0,0,322,326,5,80,0,0,323,325,3,41,20,0,324,323,
		1,0,0,0,325,328,1,0,0,0,326,324,1,0,0,0,326,327,1,0,0,0,327,329,1,0,0,
		0,328,326,1,0,0,0,329,333,5,82,0,0,330,332,3,41,20,0,331,330,1,0,0,0,332,
		335,1,0,0,0,333,331,1,0,0,0,333,334,1,0,0,0,334,336,1,0,0,0,335,333,1,
		0,0,0,336,340,5,79,0,0,337,339,3,41,20,0,338,337,1,0,0,0,339,342,1,0,0,
		0,340,338,1,0,0,0,340,341,1,0,0,0,341,343,1,0,0,0,342,340,1,0,0,0,343,
		347,5,67,0,0,344,346,3,41,20,0,345,344,1,0,0,0,346,349,1,0,0,0,347,345,
		1,0,0,0,347,348,1,0,0,0,348,350,1,0,0,0,349,347,1,0,0,0,350,354,5,69,0,
		0,351,353,3,41,20,0,352,351,1,0,0,0,353,356,1,0,0,0,354,352,1,0,0,0,354,
		355,1,0,0,0,355,357,1,0,0,0,356,354,1,0,0,0,357,361,5,68,0,0,358,360,3,
		41,20,0,359,358,1,0,0,0,360,363,1,0,0,0,361,359,1,0,0,0,361,362,1,0,0,
		0,362,364,1,0,0,0,363,361,1,0,0,0,364,368,5,85,0,0,365,367,3,41,20,0,366,
		365,1,0,0,0,367,370,1,0,0,0,368,366,1,0,0,0,368,369,1,0,0,0,369,371,1,
		0,0,0,370,368,1,0,0,0,371,375,5,82,0,0,372,374,3,41,20,0,373,372,1,0,0,
		0,374,377,1,0,0,0,375,373,1,0,0,0,375,376,1,0,0,0,376,378,1,0,0,0,377,
		375,1,0,0,0,378,379,5,69,0,0,379,16,1,0,0,0,380,384,5,85,0,0,381,383,3,
		41,20,0,382,381,1,0,0,0,383,386,1,0,0,0,384,382,1,0,0,0,384,385,1,0,0,
		0,385,387,1,0,0,0,386,384,1,0,0,0,387,391,5,83,0,0,388,390,3,41,20,0,389,
		388,1,0,0,0,390,393,1,0,0,0,391,389,1,0,0,0,391,392,1,0,0,0,392,394,1,
		0,0,0,393,391,1,0,0,0,394,398,5,73,0,0,395,397,3,41,20,0,396,395,1,0,0,
		0,397,400,1,0,0,0,398,396,1,0,0,0,398,399,1,0,0,0,399,401,1,0,0,0,400,
		398,1,0,0,0,401,405,5,78,0,0,402,404,3,41,20,0,403,402,1,0,0,0,404,407,
		1,0,0,0,405,403,1,0,0,0,405,406,1,0,0,0,406,408,1,0,0,0,407,405,1,0,0,
		0,408,409,5,71,0,0,409,18,1,0,0,0,410,414,5,66,0,0,411,413,3,41,20,0,412,
		411,1,0,0,0,413,416,1,0,0,0,414,412,1,0,0,0,414,415,1,0,0,0,415,417,1,
		0,0,0,416,414,1,0,0,0,417,418,5,89,0,0,418,20,1,0,0,0,419,423,5,82,0,0,
		420,422,3,41,20,0,421,420,1,0,0,0,422,425,1,0,0,0,423,421,1,0,0,0,423,
		424,1,0,0,0,424,426,1,0,0,0,425,423,1,0,0,0,426,430,5,69,0,0,427,429,3,
		41,20,0,428,427,1,0,0,0,429,432,1,0,0,0,430,428,1,0,0,0,430,431,1,0,0,
		0,431,433,1,0,0,0,432,430,1,0,0,0,433,437,5,70,0,0,434,436,3,41,20,0,435,
		434,1,0,0,0,436,439,1,0,0,0,437,435,1,0,0,0,437,438,1,0,0,0,438,440,1,
		0,0,0,439,437,1,0,0,0,440,444,5,69,0,0,441,443,3,41,20,0,442,441,1,0,0,
		0,443,446,1,0,0,0,444,442,1,0,0,0,444,445,1,0,0,0,445,447,1,0,0,0,446,
		444,1,0,0,0,447,451,5,82,0,0,448,450,3,41,20,0,449,448,1,0,0,0,450,453,
		1,0,0,0,451,449,1,0,0,0,451,452,1,0,0,0,452,454,1,0,0,0,453,451,1,0,0,
		0,454,458,5,69,0,0,455,457,3,41,20,0,456,455,1,0,0,0,457,460,1,0,0,0,458,
		456,1,0,0,0,458,459,1,0,0,0,459,461,1,0,0,0,460,458,1,0,0,0,461,465,5,
		78,0,0,462,464,3,41,20,0,463,462,1,0,0,0,464,467,1,0,0,0,465,463,1,0,0,
		0,465,466,1,0,0,0,466,468,1,0,0,0,467,465,1,0,0,0,468,472,5,67,0,0,469,
		471,3,41,20,0,470,469,1,0,0,0,471,474,1,0,0,0,472,470,1,0,0,0,472,473,
		1,0,0,0,473,475,1,0,0,0,474,472,1,0,0,0,475,476,5,69,0,0,476,22,1,0,0,
		0,477,481,5,67,0,0,478,480,3,41,20,0,479,478,1,0,0,0,480,483,1,0,0,0,481,
		479,1,0,0,0,481,482,1,0,0,0,482,484,1,0,0,0,483,481,1,0,0,0,484,488,5,
		79,0,0,485,487,3,41,20,0,486,485,1,0,0,0,487,490,1,0,0,0,488,486,1,0,0,
		0,488,489,1,0,0,0,489,491,1,0,0,0,490,488,1,0,0,0,491,495,5,78,0,0,492,
		494,3,41,20,0,493,492,1,0,0,0,494,497,1,0,0,0,495,493,1,0,0,0,495,496,
		1,0,0,0,496,498,1,0,0,0,497,495,1,0,0,0,498,502,5,84,0,0,499,501,3,41,
		20,0,500,499,1,0,0,0,501,504,1,0,0,0,502,500,1,0,0,0,502,503,1,0,0,0,503,
		505,1,0,0,0,504,502,1,0,0,0,505,509,5,69,0,0,506,508,3,41,20,0,507,506,
		1,0,0,0,508,511,1,0,0,0,509,507,1,0,0,0,509,510,1,0,0,0,510,512,1,0,0,
		0,511,509,1,0,0,0,512,516,5,78,0,0,513,515,3,41,20,0,514,513,1,0,0,0,515,
		518,1,0,0,0,516,514,1,0,0,0,516,517,1,0,0,0,517,519,1,0,0,0,518,516,1,
		0,0,0,519,520,5,84,0,0,520,24,1,0,0,0,521,525,5,86,0,0,522,524,3,41,20,
		0,523,522,1,0,0,0,524,527,1,0,0,0,525,523,1,0,0,0,525,526,1,0,0,0,526,
		528,1,0,0,0,527,525,1,0,0,0,528,532,5,65,0,0,529,531,3,41,20,0,530,529,
		1,0,0,0,531,534,1,0,0,0,532,530,1,0,0,0,532,533,1,0,0,0,533,535,1,0,0,
		0,534,532,1,0,0,0,535,539,5,76,0,0,536,538,3,41,20,0,537,536,1,0,0,0,538,
		541,1,0,0,0,539,537,1,0,0,0,539,540,1,0,0,0,540,542,1,0,0,0,541,539,1,
		0,0,0,542,546,5,85,0,0,543,545,3,41,20,0,544,543,1,0,0,0,545,548,1,0,0,
		0,546,544,1,0,0,0,546,547,1,0,0,0,547,549,1,0,0,0,548,546,1,0,0,0,549,
		550,5,69,0,0,550,26,1,0,0,0,551,555,5,68,0,0,552,554,3,41,20,0,553,552,
		1,0,0,0,554,557,1,0,0,0,555,553,1,0,0,0,555,556,1,0,0,0,556,558,1,0,0,
		0,557,555,1,0,0,0,558,562,5,73,0,0,559,561,3,41,20,0,560,559,1,0,0,0,561,
		564,1,0,0,0,562,560,1,0,0,0,562,563,1,0,0,0,563,565,1,0,0,0,564,562,1,
		0,0,0,565,569,5,83,0,0,566,568,3,41,20,0,567,566,1,0,0,0,568,571,1,0,0,
		0,569,567,1,0,0,0,569,570,1,0,0,0,570,572,1,0,0,0,571,569,1,0,0,0,572,
		576,5,80,0,0,573,575,3,41,20,0,574,573,1,0,0,0,575,578,1,0,0,0,576,574,
		1,0,0,0,576,577,1,0,0,0,577,579,1,0,0,0,578,576,1,0,0,0,579,583,5,76,0,
		0,580,582,3,41,20,0,581,580,1,0,0,0,582,585,1,0,0,0,583,581,1,0,0,0,583,
		584,1,0,0,0,584,586,1,0,0,0,585,583,1,0,0,0,586,590,5,65,0,0,587,589,3,
		41,20,0,588,587,1,0,0,0,589,592,1,0,0,0,590,588,1,0,0,0,590,591,1,0,0,
		0,591,593,1,0,0,0,592,590,1,0,0,0,593,594,5,89,0,0,594,28,1,0,0,0,595,
		599,5,79,0,0,596,598,3,41,20,0,597,596,1,0,0,0,598,601,1,0,0,0,599,597,
		1,0,0,0,599,600,1,0,0,0,600,602,1,0,0,0,601,599,1,0,0,0,602,603,5,70,0,
		0,603,30,1,0,0,0,604,608,5,87,0,0,605,607,3,41,20,0,606,605,1,0,0,0,607,
		610,1,0,0,0,608,606,1,0,0,0,608,609,1,0,0,0,609,611,1,0,0,0,610,608,1,
		0,0,0,611,615,5,73,0,0,612,614,3,41,20,0,613,612,1,0,0,0,614,617,1,0,0,
		0,615,613,1,0,0,0,615,616,1,0,0,0,616,618,1,0,0,0,617,615,1,0,0,0,618,
		622,5,84,0,0,619,621,3,41,20,0,620,619,1,0,0,0,621,624,1,0,0,0,622,620,
		1,0,0,0,622,623,1,0,0,0,623,625,1,0,0,0,624,622,1,0,0,0,625,626,5,72,0,
		0,626,32,1,0,0,0,627,631,5,78,0,0,628,630,3,41,20,0,629,628,1,0,0,0,630,
		633,1,0,0,0,631,629,1,0,0,0,631,632,1,0,0,0,632,634,1,0,0,0,633,631,1,
		0,0,0,634,635,5,79,0,0,635,34,1,0,0,0,636,640,5,65,0,0,637,639,3,41,20,
		0,638,637,1,0,0,0,639,642,1,0,0,0,640,638,1,0,0,0,640,641,1,0,0,0,641,
		643,1,0,0,0,642,640,1,0,0,0,643,647,5,68,0,0,644,646,3,41,20,0,645,644,
		1,0,0,0,646,649,1,0,0,0,647,645,1,0,0,0,647,648,1,0,0,0,648,650,1,0,0,
		0,649,647,1,0,0,0,650,654,5,86,0,0,651,653,3,41,20,0,652,651,1,0,0,0,653,
		656,1,0,0,0,654,652,1,0,0,0,654,655,1,0,0,0,655,657,1,0,0,0,656,654,1,
		0,0,0,657,661,5,65,0,0,658,660,3,41,20,0,659,658,1,0,0,0,660,663,1,0,0,
		0,661,659,1,0,0,0,661,662,1,0,0,0,662,664,1,0,0,0,663,661,1,0,0,0,664,
		668,5,78,0,0,665,667,3,41,20,0,666,665,1,0,0,0,667,670,1,0,0,0,668,666,
		1,0,0,0,668,669,1,0,0,0,669,671,1,0,0,0,670,668,1,0,0,0,671,675,5,67,0,
		0,672,674,3,41,20,0,673,672,1,0,0,0,674,677,1,0,0,0,675,673,1,0,0,0,675,
		676,1,0,0,0,676,678,1,0,0,0,677,675,1,0,0,0,678,682,5,73,0,0,679,681,3,
		41,20,0,680,679,1,0,0,0,681,684,1,0,0,0,682,680,1,0,0,0,682,683,1,0,0,
		0,683,685,1,0,0,0,684,682,1,0,0,0,685,689,5,78,0,0,686,688,3,41,20,0,687,
		686,1,0,0,0,688,691,1,0,0,0,689,687,1,0,0,0,689,690,1,0,0,0,690,692,1,
		0,0,0,691,689,1,0,0,0,692,693,5,71,0,0,693,36,1,0,0,0,694,700,3,47,23,
		0,695,699,3,47,23,0,696,699,3,49,24,0,697,699,5,45,0,0,698,695,1,0,0,0,
		698,696,1,0,0,0,698,697,1,0,0,0,699,702,1,0,0,0,700,698,1,0,0,0,700,701,
		1,0,0,0,701,707,1,0,0,0,702,700,1,0,0,0,703,704,5,40,0,0,704,705,3,49,
		24,0,705,706,5,41,0,0,706,708,1,0,0,0,707,703,1,0,0,0,707,708,1,0,0,0,
		708,38,1,0,0,0,709,711,3,49,24,0,710,709,1,0,0,0,711,712,1,0,0,0,712,710,
		1,0,0,0,712,713,1,0,0,0,713,40,1,0,0,0,714,715,7,0,0,0,715,716,1,0,0,0,
		716,717,6,20,0,0,717,42,1,0,0,0,718,719,5,46,0,0,719,44,1,0,0,0,720,722,
		5,34,0,0,721,723,8,1,0,0,722,721,1,0,0,0,723,724,1,0,0,0,724,722,1,0,0,
		0,724,725,1,0,0,0,725,726,1,0,0,0,726,727,5,34,0,0,727,46,1,0,0,0,728,
		729,7,2,0,0,729,48,1,0,0,0,730,731,7,3,0,0,731,50,1,0,0,0,732,733,7,4,
		0,0,733,52,1,0,0,0,93,0,56,62,69,76,83,90,97,104,111,118,125,132,139,146,
		155,162,169,176,183,190,197,206,213,220,227,234,243,250,257,264,273,280,
		287,294,301,308,317,326,333,340,347,354,361,368,375,384,391,398,405,414,
		423,430,437,444,451,458,465,472,481,488,495,502,509,516,525,532,539,546,
		555,562,569,576,583,590,599,608,615,622,631,640,647,654,661,668,675,682,
		689,698,700,707,712,724,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}