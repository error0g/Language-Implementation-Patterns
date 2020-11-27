package ChapterTwo.chapter_2_4_cache;

import ChapterTwo.chapter_2_4_cache.Lexer.Lexer;
import ChapterTwo.chapter_2_4_cache.Lexer.ListLexer;
import ChapterTwo.chapter_2_4_cache.Parser.ListParse;
import org.junit.Test;

public class TestApplication {


    @Test
    public void ParserTest()
    {
        ListLexer lexer=new ListLexer("[a,b=c,[d,e]]");
        ListParse parse=new ListParse(lexer,2);
        parse.list();

    }
}
