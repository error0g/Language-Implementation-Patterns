package Chapter2.chapter_2_4_cache.Parser;

import Chapter2.chapter_2_4_cache.Lexer.Lexer;
import Chapter2.chapter_2_4_cache.Token;

public  class Parse {
    Lexer input;
    Token []lookahead;
    int k;
    int p=0;


    public Parse(Lexer input,int k) {
        this.input = input;
        this.k=k;
        lookahead=new Token[k];
        for(int i=1;i<=k;i++) consume();
    }

    public void match(int x)
    {
       if(LA(1)==x)
       {
           consume();
       }
       else throw new Error("expecing "+input.getTokenName(x)+"; found"+LT(1));
    }

    public void consume() {
        lookahead[p]=input.nextToken();
        p=(p+1)%k;
    }

    public Token LT(int i)
    {
        return lookahead[(p+i-1)%k];
    }
    public int LA(int i)
    {
        return LT(i).type;
    }

}
