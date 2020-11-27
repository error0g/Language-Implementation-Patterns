package ChapterTwo.chapter_2_4;

import ChapterTwo.chapter_2_4.Lexer.Lexer;
import ChapterTwo.chapter_2_4.Lexer.ListLexer;
import org.junit.Test;

public class TestApplication {
    @Test
    public void LexerTest()
    {
        Lexer lexer=new ListLexer("[a,b]");
        Token token=lexer.nextToken();
        while (token.type!=Lexer.EOF_TYPE)
        {
            System.out.println(token);
            token=lexer.nextToken();
        }
    }
}
