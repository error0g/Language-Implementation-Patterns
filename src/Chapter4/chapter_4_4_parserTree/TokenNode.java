package Chapter4.chapter_4_4_parserTree;

public class TokenNode  extends ParserTree{
    Token token;

    public TokenNode(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token.text;
    }
}
