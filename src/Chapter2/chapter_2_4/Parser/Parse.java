package Chapter2.chapter_2_4.Parser;

import Chapter2.chapter_2_4.Lexer.Lexer;
import Chapter2.chapter_2_4.Token;

public  class Parse {
    Lexer input;
    Token lookahead;

    public Parse(Lexer input) {
        this.input = input;
        lookahead=input.nextToken();
    }

    public void match(int x)
    {
        if(lookahead.type==x)consume();
        else throw new Error("expecting "+input.getTokenName(x)+"; found "+lookahead);
    }

    public void consume() {
        lookahead=input.nextToken();
    }
}
