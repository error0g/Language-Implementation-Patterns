package Chapter4.chapter_4_4_AST;

import Chapter3.chapter_3_3.Lexer.ListLexer;

public class Token {
    public static final int INT=1;
    public static final int PLUS=2;
    public static String[] tokenNames={"n/a","","+"};
    public int type;
   public String text="v";

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    public Token(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String tname= ListLexer.tokenNames[type];
        return "<"+text+","+tname+">";
    }
}
