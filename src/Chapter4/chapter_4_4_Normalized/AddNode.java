package Chapter4.chapter_4_4_Normalized;

public class AddNode extends ExprNode {
    public AddNode(Token token,ExprNode left,ExprNode rigth) {
        super(token);
        addChildren(left);
        addChildren(rigth);
    }

    @Override
    public int getEvalTyepe() {
        return super.getEvalTyepe();
    }
}
