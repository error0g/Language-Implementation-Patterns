// Generated from /Users/error0/Language-Implementation-Patterns/src/Chapter4/chapter_4_4/Resources/VecMath.g4 by ANTLR 4.8
package Chapter4.chapter_4_4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VecMathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VecMathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VecMathParser#statlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatlist(VecMathParser.StatlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(VecMathParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(VecMathParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VecMathParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(VecMathParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VecMathParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(VecMathParser.PrimaryContext ctx);
}