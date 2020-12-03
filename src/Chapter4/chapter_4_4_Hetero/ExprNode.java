package Chapter4.chapter_4_4_Hetero;

public abstract class ExprNode extends HeteroAST {

    public static final int tINVALID=0;
    public static final int tINTEGER=1;
    public static final int tVECTOR=2;

    public   int evalTyepe=0;
    public ExprNode(Token token) {
        super(token);
    }

    @Override
    public String toString() {
        if(evalTyepe!=tINVALID)
        {
            return super.toString()+"<type="+(evalTyepe==tINTEGER?"tINTEGER":"tVECTOR")+">";
        }
        return super.toString();
    }

    @Override
    public String toStringTree() {
       return toString();
    }
}
