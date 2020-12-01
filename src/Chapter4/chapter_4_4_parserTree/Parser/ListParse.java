package Chapter4.chapter_4_4_parserTree.Parser;


import Chapter4.chapter_4_4_parserTree.Lexer.Lexer;
import Chapter4.chapter_4_4_parserTree.Lexer.ListLexer;
import Chapter4.chapter_4_4_parserTree.RuleNode;
import Chapter4.chapter_4_4_parserTree.ParserTree;
import Chapter4.chapter_4_4_parserTree.TokenNode;

import java.util.HashMap;
import java.util.Map;


public class ListParse extends Parse {

    public ListParse(Lexer input) {
        super(input);
    }

    ParserTree root;
    ParserTree currentNode;

    public ParserTree getRoot() {
        return root;
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
        else throw  new Error("expecting stat found "+LT(1));
    }

    public boolean speculate_stat_alt1()
    {
        boolean success=true;
        mark();
        try {
            list();
            match(Lexer.EOF_TYPE);
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
        // 删除掉规则1 推演时添加的节点
        root=null;
        currentNode=null;

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

    Map<Integer,Integer> list_memo=new HashMap();
    @Override
    void cleanMemo() {
        list_memo.clear();
    }
    void list()
    {
        boolean faile=false;
        int startTokenIndex=index();
        if(isSpeculating()&&alreadyParsedRuel(list_memo))return;

        try{
            _list();
        }catch (Error error)
        {
            faile=true;
            throw  error;
        }
        finally {
            memoize(list_memo,startTokenIndex,faile);
        }
    }

    private void memoize(Map<Integer, Integer> list_memo, int startTokenIndex, boolean faile) {
        int stopTokenIndex=faile?FAILED:index();
        list_memo.put(startTokenIndex,stopTokenIndex);
    }

    private boolean alreadyParsedRuel(Map<Integer, Integer> list_memo) {
        Integer MemoI=list_memo.get(index());
        if(MemoI==null)return false;
        int memo=MemoI.intValue();
        if(memo==FAILED) throw  new Error("previous Parse Failed Exception");

        seek(memo);
        return true;
    }

    @Override
    public void match(int x) {
        if(!isSpeculating())
            currentNode.addChild(LT(1));
        super.match(x);
    }

    private int index() {
        return p;
    }

    public void _list()
    {
        System.out.println("parse list rule at token index:"+index());
        RuleNode r=new RuleNode("list");
        if(root==null) {
            root=r;
            currentNode=r;
        }
        else currentNode.addChild(r);
        ParserTree _save=currentNode;
        currentNode=r;
        match(ListLexer.LBRACK);elements();match(ListLexer.RBRACK);
        currentNode=_save;
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
