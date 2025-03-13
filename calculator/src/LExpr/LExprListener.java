// Generated from /home/feri/Documents/compilers/calculator/LExpr.g4 by ANTLR 4.13.2
package LExpr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LExprParser}.
 */
public interface LExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(LExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(LExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterParent(LExprParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitParent(LExprParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrMinus}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAddOrMinus(LExprParser.AddOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrMinus}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAddOrMinus(LExprParser.AddOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegNumber}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterNegNumber(LExprParser.NegNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegNumber}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitNegNumber(LExprParser.NegNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPow(LExprParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPow(LExprParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDouble(LExprParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDouble(LExprParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(LExprParser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(LExprParser.MultOrDivContext ctx);
}