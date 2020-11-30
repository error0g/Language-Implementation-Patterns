package Chapter4.chapter_4_3;

import Chapter3.chapter_3_3.Lexer.ListLexer;
import Chapter3.chapter_3_3.Parser.ListParse;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

public class TestApplication {


    @Test
    public void ParserTest()
    {
        CharStream input = CharStreams.fromString("line from 0,0 to 0,10");
        GraphicsLexer lexer=new GraphicsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphicsParser parser=new GraphicsParser(tokens);
        parser.file();

    }
}