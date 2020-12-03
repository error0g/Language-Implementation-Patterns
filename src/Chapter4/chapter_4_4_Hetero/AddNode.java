package Chapter4.chapter_4_4_Hetero;

public class AddNode extends ExprNode {
    ExprNode left;
    ExprNode rigth;
    public AddNode(Token token,ExprNode left,ExprNode rigth) {
        super(token);
        this.left=left;
        this.rigth=rigth;
    }

    @Override
    public String toStringTree() {

        if(rigth==null||left==null)return this.toString();

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(this.toString());
        stringBuffer.append(' ');
        stringBuffer.append(left.toStringTree());
        stringBuffer.append(' ');
        stringBuffer.append(rigth.toStringTree());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
