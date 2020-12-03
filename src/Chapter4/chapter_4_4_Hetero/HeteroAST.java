package Chapter4.chapter_4_4_Hetero;

public abstract class HeteroAST {
    Token token;
    public HeteroAST(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token.toString();
    }
    public String toStringTree()
    {
        return toString();
    }
}
