package ChapterTwo.chapter_2_4.Lexer;

import ChapterTwo.chapter_2_4.Token;

public class ListLexer  extends Lexer{
    public static int NAME=2;
    public static int COMMA=3;
    public static int LBRACK=4;
    public static int RBRACK=5;

    public static String[] tokenNames={"n/a","<EOF>","NAME","COMMA","LBRACK","RBRACK"};

    public ListLexer(String input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        while (c!=EOF)
        {
            switch (c)
            {
                case ' ': case '\t': case '\n': case '\r':WS();continue;
                
                default:
            }
        }
        return new Token(EOF_TYPE,"<EOF>");
    }

    @Override
    public String getTokenName(int tokenType) {
        return tokenNames[tokenType];
    }


    public void WS()
    {
        while (c==' '||c=='\t'||c=='\n'||c=='\r')
        {
            consume();
        }
    }
}
