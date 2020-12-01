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

    public AST(int  type) {
        this.token = new Token(type);
    }


}
