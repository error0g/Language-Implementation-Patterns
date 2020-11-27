package ChapterTwo.chapter_2_4_cache.Parser;


import ChapterTwo.chapter_2_4_cache.Lexer.Lexer;
import ChapterTwo.chapter_2_4_cache.Lexer.ListLexer;


public class ListParse extends Parse {

    public ListParse(Lexer input, int k) {
        super(input, k);
    }

    public void list()
    {
        match(ListLexer.LBRACK);elements();match(ListLexer.RBRACK);
    }

    public  void elements() {
        element();
        while (LA(1)== ListLexer.COMMA)
        {
            match(ListLexer.COMMA);
            element();
        }
    }

    public void element() {

         if(LA(1)== ListLexer.NAME&&LA(2)== ListLexer.EQUALS)
        {
            match(ListLexer.NAME); match(ListLexer.EQUALS);   match(ListLexer.NAME);
        }
        else if(LA(1)== ListLexer.NAME)
        {
            match(ListLexer.NAME);
        }
        else if(LA(1)== ListLexer.LBRACK){
            list();
        }
        else throw new Error("expecting name or list; found "+lookahead);
    }
}
