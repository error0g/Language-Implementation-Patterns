package Chapter4.chapter_4_4_AST;

import Chapter3.chapter_3_3_memory.Lexer.ListLexer;
import Chapter3.chapter_3_3_memory.Parser.ListParse;
import org.junit.Test;

public class TestApplication {


    @Test
    public void AstTest()
    {
        Token plus=new Token(Token.PLUS,"+");
        Token one=new Token(Token.INT,"1");
        Token two=new Token(Token.INT,"2");
        AST root=new AST(plus);
        root.addChildren(one);
        root.addChildren(two);
        System.out.println("1+2 tree: "+root.toStringTree());

        AST list=new AST();
        list.addChildren(new AST(one));
        list.addChildren(new AST(two));
        System.out.println("1 and 2 in list:"+list.toStringTree());
    }
}