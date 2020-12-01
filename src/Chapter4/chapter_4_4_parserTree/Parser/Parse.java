package Chapter4.chapter_4_4_parserTree.Parser;

import Chapter4.chapter_4_4_parserTree.Lexer.Lexer;
import Chapter4.chapter_4_4_parserTree.ParserTree;
import Chapter4.chapter_4_4_parserTree.Token;

import java.util.ArrayList;
import java.util.List;

public  abstract class Parse {
    Lexer input;
    List<Token> lookahead;
    List<Integer> markers;
    static final int FAILED=-1;
    int p=0;


    public Parse(Lexer input) {
        this.input = input;
        lookahead=new ArrayList<>();
        markers=new ArrayList<>();
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
        p++;
        //非推断状态构成循环列表
        if(p==lookahead.size()&&!isSpeculating())
        {
            p=0;
            lookahead.clear();
            cleanMemo();
        }
        sync(1);
    }



    public Token LT(int i)
    {
        sync(i);
        return lookahead.get((p+i-1));
    }
    public int LA(int i)
    {
        return LT(i).type;
    }

    public void sync(int i)
    {
        if(p+i-1>(lookahead.size()-1))
        {
            int n=(p+i-1)-(lookahead.size()-1);
            fill(n);
        }
    }

    private void fill(int n) {
        for(int i=1;i<=n;i++)
        {
            lookahead.add(input.nextToken());
        }
    }
    public int mark()
    {
        markers.add(p);
        return p;
    }
    public void release()
    {
        int marker=markers.get(markers.size()-1);
        markers.remove(markers.size()-1);
        seek(marker);
    }

    public void seek(int index) {
        p=index;
    }
    abstract void cleanMemo();

    public boolean isSpeculating() {
        return markers.size()>0;
    }
}
