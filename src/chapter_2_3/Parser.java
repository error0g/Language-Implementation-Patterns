package chapter_2_3;
public class Parser {

    String[] input;
    int index;

    public Parser(String[] input) {
        this.input = input;
        index=0;
    }


    public static void main(String[] args) {
        String[] LexerOut1=new String[]{"return","x","+","1",";"};
        Parser parser1=new Parser(LexerOut1);
        parser1.stat();

        String[] LexerOut2=new String[]{"add","x","+","1",";"};
        Parser parser2=new Parser(LexerOut2);
        parser2.stat();
    }

   public void stat(){
        if(LA().equals("if"))
            ifstat();
        else if(LA().equals("return"))
            returnstat();

    }
    void returnstat()
    {
        match("return");expr();match(";");
    }
    public void ifstat()
    {
        match("if");expr();match("then");stat();
    }
    void assign()
    {

    }
    void expr()
    {
        match("x"); match("+"); match("1");
    }

    void match(String token)
    {
        if(token.equals(input[index]))
        {
            consume();
        }
        else {
            throw new Error("Match failed! "+input[index]+"-->"+token);
        }
    }

    void consume()
    {
        if(index<input.length)
        {
            index++;
        }
    }
    String LA()
    {
        return input[index];
    }
}
