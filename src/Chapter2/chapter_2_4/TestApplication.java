package Chapter2.chapter_2_4;

import Chapter2.chapter_2_4.Lexer.Lexer;
import Chapter2.chapter_2_4.Lexer.ListLexer;
import Chapter2.chapter_2_4.Parser.ListParse;
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

    @Test
    public void ParserTest()
    {
        ListLexer lexer=new ListLexer("[a,]");
        ListParse parse=new ListParse(lexer);
        parse.list();

    }
}
