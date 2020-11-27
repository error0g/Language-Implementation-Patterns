package Chapter2.chapter_2_2;
public class Parser {

    String[] input;
    int index;

    public Parser(String[] input) {
        this.input = input;
        index=0;
    }


    public static void main(String[] args)
    {
        //success
        String[] token1=new String[]{"return","x","+","1",";"};
        Parser parser1=new Parser(token1);
        parser1.stat();

        //failed
        String[] token2=new String[]{"add","x","+","1",";"};
        Parser parser2=new Parser(token2);
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
    void match(String token)
    {
        if(token.equals(input[index]))
        {
            consume();
        }
        else {
            throw new Error("expecting: "+token+" found: "+input[index]);
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
