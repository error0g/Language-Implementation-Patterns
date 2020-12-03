package Chapter4.chapter_4_4_Hetero;

import org.junit.Test;

public class TestApplication {


    @Test
    public void AstTest()
    {
        Token plus=new Token(Token.PLUS,"+");
        Token one=new Token(Token.INT,"1");
        Token two=new Token(Token.INT,"2");
        ExprNode root=new AddNode(plus,new IntNode(one),new IntNode(two));
        System.out.println(root.toStringTree());
    }
}