// Generated from /home/feri/Documents/compilers/T08-code/LExpr.g4 by ANTLR 4.13.2
package LExpr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(LExprParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LExprParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(LExprParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOrMinus}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrMinus(LExprParser.AddOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegNumber}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegNumber(LExprParser.NegNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(LExprParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDiv(LExprParser.MultOrDivContext ctx);
}