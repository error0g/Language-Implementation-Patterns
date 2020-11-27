package Chapter2.chapter_2_4.Parser;


import Chapter2.chapter_2_4.Lexer.Lexer;
import Chapter2.chapter_2_4.Lexer.ListLexer;


public class ListParse extends Parse {

    public ListParse(Lexer input) {
        super(input);
    }

    public void list()
    {
        match(ListLexer.LBRACK);elements();match(ListLexer.RBRACK);
    }

    public  void elements() {
        element();
        while (lookahead.type==ListLexer.COMMA)
        {
            match(ListLexer.COMMA);
            element();
        }
    }

    public void element() {
        if(lookahead.type==ListLexer.NAME)
        {
            match(ListLexer.NAME);
        }
        else if(lookahead.type==ListLexer.LBRACK){
            list();
        }
        else throw new Error("expecting name or list; found "+lookahead);
    }
}
