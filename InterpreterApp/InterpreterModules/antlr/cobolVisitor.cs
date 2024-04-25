//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from cobol.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="cobolParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public interface IcobolVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] cobolParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.identification_division"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIdentification_division([NotNull] cobolParser.Identification_divisionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.data_division"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitData_division([NotNull] cobolParser.Data_divisionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.variables"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariables([NotNull] cobolParser.VariablesContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.occurs"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitOccurs([NotNull] cobolParser.OccursContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.level"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLevel([NotNull] cobolParser.LevelContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.picture"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPicture([NotNull] cobolParser.PictureContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.like"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLike([NotNull] cobolParser.LikeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.procedure_division"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProcedure_division([NotNull] cobolParser.Procedure_divisionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.using"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUsing([NotNull] cobolParser.UsingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.use"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUse([NotNull] cobolParser.UseContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.sentence"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSentence([NotNull] cobolParser.SentenceContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.proc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProc([NotNull] cobolParser.ProcContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] cobolParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.display"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDisplay([NotNull] cobolParser.DisplayContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.add"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAdd([NotNull] cobolParser.AddContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.multiply"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMultiply([NotNull] cobolParser.MultiplyContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.divide"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDivide([NotNull] cobolParser.DivideContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.subtract"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSubtract([NotNull] cobolParser.SubtractContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.accept"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAccept([NotNull] cobolParser.AcceptContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.withnoadvancing"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWithnoadvancing([NotNull] cobolParser.WithnoadvancingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.atomic"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAtomic([NotNull] cobolParser.AtomicContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.giving"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGiving([NotNull] cobolParser.GivingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.identifiers"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIdentifiers([NotNull] cobolParser.IdentifiersContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.remainder"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitRemainder([NotNull] cobolParser.RemainderContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.if"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIf([NotNull] cobolParser.IfContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.arithmetic_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArithmetic_expression([NotNull] cobolParser.Arithmetic_expressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.string_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitString_expression([NotNull] cobolParser.String_expressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.boolean"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBoolean([NotNull] cobolParser.BooleanContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.expressions"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpressions([NotNull] cobolParser.ExpressionsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.evaluate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitEvaluate([NotNull] cobolParser.EvaluateContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.when_block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhen_block([NotNull] cobolParser.When_blockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.stop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStop([NotNull] cobolParser.StopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.next_sentence"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNext_sentence([NotNull] cobolParser.Next_sentenceContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.perform"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPerform([NotNull] cobolParser.PerformContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.times"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTimes([NotNull] cobolParser.TimesContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.copy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCopy([NotNull] cobolParser.CopyContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.replacing"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReplacing([NotNull] cobolParser.ReplacingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.replacements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReplacements([NotNull] cobolParser.ReplacementsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="cobolParser.loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop([NotNull] cobolParser.LoopContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>loop_varying_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop_varying_expression([NotNull] cobolParser.Loop_varying_expressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>loop_while_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop_while_expression([NotNull] cobolParser.Loop_while_expressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>loop_until_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop_until_expression([NotNull] cobolParser.Loop_until_expressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>loop_statement_expession</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop_statement_expession([NotNull] cobolParser.Loop_statement_expessionContext context);
}
