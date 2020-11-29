package Chapter3.chapter_3_3_memory;

import Chapter3.chapter_3_3_memory.Lexer.ListLexer;
import Chapter3.chapter_3_3_memory.Parser.ListParse;
import org.junit.Test;

public class TestApplication {


    @Test
    public void ParserTest()
    {
        ListLexer lexer=new ListLexer("[a,b]=[b,c]");
        ListParse parse=new ListParse(lexer);
        parse.stat();

    }
}