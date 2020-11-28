package Chapter3.chapter_3_3.Parser;


import Chapter3.chapter_3_3.Lexer.Lexer;
import Chapter3.chapter_3_3.Lexer.ListLexer;


public class ListParse extends Parse {

    public ListParse(Lexer input, int k) {
        super(input,k);
    }


    public void stat()
    {
        if(speculate_stat_alt1())
        {
            list();match(Lexer.EOF_TYPE);
        }
        else if(speculate_stat_alt2())
        {
            assign();match(Lexer.EOF_TYPE);
        }
        else throw  new Error("expecting stat found "+LA(1));
    }
    public boolean speculate_stat_alt1()
    {
        boolean success=true;
        mark();
        try {
            list();match(Lexer.EOF_TYPE);
        }
        catch (Error e)
        {
            success=false;
        }
        release();
        return success;
    }

    public boolean speculate_stat_alt2()
    {
        boolean success=true;
        mark();
        try {
            assign();match(Lexer.EOF_TYPE);
        }
        catch (Error e)
        {
            success=false;
        }
        release();
        return success;
    }


    public void assign()
    {
        list();match(ListLexer.EQUALS);list();
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
            match(ListLexer.NAME); match(ListLexer.EQUALS);match(ListLexer.NAME);
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
