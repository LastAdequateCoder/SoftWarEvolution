// Generated from c:/Users/baran/SoftWarEvolution/InterpreterApp/InterpreterModules/antlr/cobol.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cobolParser}.
 */
public interface cobolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cobolParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(cobolParser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cobolParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(cobolParser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cobolParser#moveFrom}.
	 * @param ctx the parse tree
	 */
	void enterMoveFrom(cobolParser.MoveFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link cobolParser#moveFrom}.
	 * @param ctx the parse tree
	 */
	void exitMoveFrom(cobolParser.MoveFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link cobolParser#moveTo}.
	 * @param ctx the parse tree
	 */
	void enterMoveTo(cobolParser.MoveToContext ctx);
	/**
	 * Exit a parse tree produced by {@link cobolParser#moveTo}.
	 * @param ctx the parse tree
	 */
	void exitMoveTo(cobolParser.MoveToContext ctx);
}