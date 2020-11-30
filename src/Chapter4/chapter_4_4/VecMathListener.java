// Generated from E:/Language-Implementation-Patterns/src/Chapter4/chapter_4_4/Resources\VecMath.g4 by ANTLR 4.8
package Chapter4.chapter_4_4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecMathParser}.
 */
public interface VecMathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecMathParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(VecMathParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(VecMathParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VecMathParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VecMathParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VecMathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VecMathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecMathParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(VecMathParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(VecMathParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecMathParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(VecMathParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMathParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(VecMathParser.PrimaryContext ctx);
}