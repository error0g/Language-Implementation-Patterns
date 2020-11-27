package Chapter3.chapter_3_3;

import Chapter3.chapter_3_3.Lexer.ListLexer;
import Chapter3.chapter_3_3.Parser.ListParse;
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