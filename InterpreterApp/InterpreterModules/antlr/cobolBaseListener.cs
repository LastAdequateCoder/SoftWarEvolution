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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IcobolListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class cobolBaseListener : IcobolListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProgram([NotNull] cobolParser.ProgramContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProgram([NotNull] cobolParser.ProgramContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.identification_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIdentification_division([NotNull] cobolParser.Identification_divisionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.identification_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIdentification_division([NotNull] cobolParser.Identification_divisionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.data_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterData_division([NotNull] cobolParser.Data_divisionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.data_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitData_division([NotNull] cobolParser.Data_divisionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.variables"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariables([NotNull] cobolParser.VariablesContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.variables"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariables([NotNull] cobolParser.VariablesContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.occurs"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOccurs([NotNull] cobolParser.OccursContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.occurs"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOccurs([NotNull] cobolParser.OccursContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.level"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLevel([NotNull] cobolParser.LevelContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.level"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLevel([NotNull] cobolParser.LevelContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.picture"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPicture([NotNull] cobolParser.PictureContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.picture"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPicture([NotNull] cobolParser.PictureContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.like"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLike([NotNull] cobolParser.LikeContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.like"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLike([NotNull] cobolParser.LikeContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.procedure_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProcedure_division([NotNull] cobolParser.Procedure_divisionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.procedure_division"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProcedure_division([NotNull] cobolParser.Procedure_divisionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.using"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterUsing([NotNull] cobolParser.UsingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.using"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitUsing([NotNull] cobolParser.UsingContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.use"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterUse([NotNull] cobolParser.UseContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.use"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitUse([NotNull] cobolParser.UseContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.sentence"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSentence([NotNull] cobolParser.SentenceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.sentence"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSentence([NotNull] cobolParser.SentenceContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.proc"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProc([NotNull] cobolParser.ProcContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.proc"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProc([NotNull] cobolParser.ProcContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStatement([NotNull] cobolParser.StatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStatement([NotNull] cobolParser.StatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.display"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDisplay([NotNull] cobolParser.DisplayContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.display"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDisplay([NotNull] cobolParser.DisplayContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.add"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAdd([NotNull] cobolParser.AddContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.add"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAdd([NotNull] cobolParser.AddContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.multiply"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMultiply([NotNull] cobolParser.MultiplyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.multiply"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMultiply([NotNull] cobolParser.MultiplyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.divide"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDivide([NotNull] cobolParser.DivideContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.divide"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDivide([NotNull] cobolParser.DivideContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.subtract"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSubtract([NotNull] cobolParser.SubtractContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.subtract"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSubtract([NotNull] cobolParser.SubtractContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.accept"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAccept([NotNull] cobolParser.AcceptContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.accept"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAccept([NotNull] cobolParser.AcceptContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.withnoadvancing"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWithnoadvancing([NotNull] cobolParser.WithnoadvancingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.withnoadvancing"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWithnoadvancing([NotNull] cobolParser.WithnoadvancingContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.atomic"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAtomic([NotNull] cobolParser.AtomicContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.atomic"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAtomic([NotNull] cobolParser.AtomicContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.giving"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterGiving([NotNull] cobolParser.GivingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.giving"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitGiving([NotNull] cobolParser.GivingContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.identifiers"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIdentifiers([NotNull] cobolParser.IdentifiersContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.identifiers"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIdentifiers([NotNull] cobolParser.IdentifiersContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.remainder"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterRemainder([NotNull] cobolParser.RemainderContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.remainder"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitRemainder([NotNull] cobolParser.RemainderContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.if"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIf([NotNull] cobolParser.IfContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.if"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIf([NotNull] cobolParser.IfContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.arithmetic_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArithmetic_expression([NotNull] cobolParser.Arithmetic_expressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.arithmetic_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArithmetic_expression([NotNull] cobolParser.Arithmetic_expressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.string_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterString_expression([NotNull] cobolParser.String_expressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.string_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitString_expression([NotNull] cobolParser.String_expressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.boolean"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBoolean([NotNull] cobolParser.BooleanContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.boolean"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBoolean([NotNull] cobolParser.BooleanContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.expressions"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpressions([NotNull] cobolParser.ExpressionsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.expressions"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpressions([NotNull] cobolParser.ExpressionsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.evaluate"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEvaluate([NotNull] cobolParser.EvaluateContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.evaluate"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEvaluate([NotNull] cobolParser.EvaluateContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.when_block"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWhen_block([NotNull] cobolParser.When_blockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.when_block"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWhen_block([NotNull] cobolParser.When_blockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.stop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStop([NotNull] cobolParser.StopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.stop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStop([NotNull] cobolParser.StopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.next_sentence"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNext_sentence([NotNull] cobolParser.Next_sentenceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.next_sentence"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNext_sentence([NotNull] cobolParser.Next_sentenceContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.perform"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPerform([NotNull] cobolParser.PerformContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.perform"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPerform([NotNull] cobolParser.PerformContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.through"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterThrough([NotNull] cobolParser.ThroughContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.through"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitThrough([NotNull] cobolParser.ThroughContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.times"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTimes([NotNull] cobolParser.TimesContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.times"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTimes([NotNull] cobolParser.TimesContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.copy"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCopy([NotNull] cobolParser.CopyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.copy"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCopy([NotNull] cobolParser.CopyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.replacing"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReplacing([NotNull] cobolParser.ReplacingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.replacing"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReplacing([NotNull] cobolParser.ReplacingContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.replacements"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReplacements([NotNull] cobolParser.ReplacementsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.replacements"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReplacements([NotNull] cobolParser.ReplacementsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.loop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoop([NotNull] cobolParser.LoopContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.loop"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoop([NotNull] cobolParser.LoopContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>loop_varying_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoop_varying_expression([NotNull] cobolParser.Loop_varying_expressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>loop_varying_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoop_varying_expression([NotNull] cobolParser.Loop_varying_expressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>loop_while_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoop_while_expression([NotNull] cobolParser.Loop_while_expressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>loop_while_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoop_while_expression([NotNull] cobolParser.Loop_while_expressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>loop_until_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoop_until_expression([NotNull] cobolParser.Loop_until_expressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>loop_until_expression</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoop_until_expression([NotNull] cobolParser.Loop_until_expressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>loop_statement_expession</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLoop_statement_expession([NotNull] cobolParser.Loop_statement_expessionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>loop_statement_expession</c>
	/// labeled alternative in <see cref="cobolParser.loop_expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLoop_statement_expession([NotNull] cobolParser.Loop_statement_expessionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.goto"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterGoto([NotNull] cobolParser.GotoContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.goto"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitGoto([NotNull] cobolParser.GotoContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.move"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMove([NotNull] cobolParser.MoveContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.move"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMove([NotNull] cobolParser.MoveContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.singlevar"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSinglevar([NotNull] cobolParser.SinglevarContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.singlevar"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSinglevar([NotNull] cobolParser.SinglevarContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.multivar"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMultivar([NotNull] cobolParser.MultivarContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.multivar"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMultivar([NotNull] cobolParser.MultivarContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.alter"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAlter([NotNull] cobolParser.AlterContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.alter"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAlter([NotNull] cobolParser.AlterContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="cobolParser.signal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSignal([NotNull] cobolParser.SignalContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="cobolParser.signal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSignal([NotNull] cobolParser.SignalContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
