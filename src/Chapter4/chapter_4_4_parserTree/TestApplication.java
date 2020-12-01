package Chapter4.chapter_4_4_parserTree;

import Chapter4.chapter_4_4_parserTree.Parser.ListParse;
import Chapter4.chapter_4_4_parserTree.Lexer.ListLexer;
import org.junit.Test;

import java.util.List;

public class TestApplication {


    @Test
    public void ParserTest()
    {
        ListLexer lexer=new ListLexer("[a]=[b]");
        ListParse parse=new ListParse(lexer);
        parse.stat();
    }
}