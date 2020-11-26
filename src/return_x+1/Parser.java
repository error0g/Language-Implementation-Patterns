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
        returnstat();
    }
    void returnstat()
    {
        match("return");expr();match(";");
    }

    void expr()
    {
        match("x"); match("+"); match("1");
    }
    void match(String world)
    {
        if(world.equals(input[index]))
        {
            consume();
        }
        else {
            throw new Error("Match failed! "+input[index]+"-->"+world);
        }
    }

    void consume()
    {
        if(index<input.length)
        {
            index++;
        }
    }
}