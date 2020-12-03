package Chapter4.chapter_4_4_Hetero;


public class Token  extends AST {
    public static final int INT=1;
    public static final int PLUS=2;
    public int type;
   public String text;

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    public Token(int type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return text;
    }
}
