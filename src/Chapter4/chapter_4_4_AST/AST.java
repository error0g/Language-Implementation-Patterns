package Chapter4.chapter_4_4_AST;

import java.util.ArrayList;
import java.util.List;

public class AST {

    Token token;
    List<AST> children;
    public AST(){}

    public void addChildren(AST t)
    {
        if(children==null)
            children=new ArrayList<>();
        children.add(t);
    }
    public int getNodeType()
    {
        return token.type;
    }
    public AST(int  type) {
        this.token = new Token(type);
    }
    public AST(Token  token) {
        this.token =token;
    }
    public boolean isNil(){return token==null;}

    @Override
    public String toString() {
        return token==null?"nil":token.toString();
    }
    public String toStringTree()
    {
        if(children==null||children.size()==0)return this.toString();
        StringBuffer stringBuffer=new StringBuffer();
        if(!isNil())
        {
            stringBuffer.append("(");
            stringBuffer.append(this.toString());
            stringBuffer.append(" ");
        }

        for(int i=0;i<children.size();i++)
        {
            stringBuffer.append(children.get(i).toString());
            if(i<children.size()-1)
            {
                stringBuffer.append(" ");
            }
        }

        if(!isNil())
            stringBuffer.append(")");

        return stringBuffer.toString();
    }
}
