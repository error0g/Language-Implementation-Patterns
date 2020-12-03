package Chapter4.chapter_4_4_Normalized;

public abstract class ExprNode extends AST {
    public static final int tINVALID=0;
    public static final int tINTEGER=1;
    public static final int tVECTOR=2;

    int evalTyepe;

    public int getEvalTyepe() {
        return evalTyepe;
    }

    public ExprNode(Token token) {
        super(token);
    }

    @Override
    public String toString() {

        if(evalTyepe!=0)
        {
            return super.toString()+"<type="+(evalTyepe==tINTEGER?"tINTEGER":"tVECTOR")+">";
        }
        return super.toString();
    }
}
