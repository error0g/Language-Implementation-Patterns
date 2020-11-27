package ChapterTwo.chapter_2_4_cache;

import ChapterTwo.chapter_2_4_cache.Lexer.ListLexer;

public class Token {
   public int type;
   public String text;

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        String tname= ListLexer.tokenNames[type];
        return "<"+text+","+tname+">";
    }
}
