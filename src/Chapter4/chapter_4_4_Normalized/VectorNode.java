package Chapter4.chapter_4_4_Normalized;

import java.util.List;

public class VectorNode extends ExprNode {
    public VectorNode(Token token, List<ExprNode> elements) {
        super(token);
        evalTyepe=tVECTOR;
        for(ExprNode exprNode:elements)addChildren(exprNode);
    }
}
