package Chapter4.chapter_4_4;


import Chapter4.chapter_4_3.GraphicsLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

public class TestApplication {


    @Test
    public void ParserTest()
    {
        CharStream input = CharStreams.fromString("x=1+2 y=1*2+3 a=[1,2].[3,4] print x");
        VecMathLexer lexer=new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VecMathParser parser=new VecMathParser(tokens);
        parser.statlist();
    }
}