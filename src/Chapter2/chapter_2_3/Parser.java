package Chapter2.chapter_2_3;
public class Parser
{

    String[] input;
    int index;

    public Parser(String[] input)
    {
        this.input = input;
        index=0;
    }


    public static void main(String[] args)
    {
        //success
        String[] LexerOut1=new String[]{"if","x","<","0","then","x","=","0",";"};
        Parser parser1=new Parser(LexerOut1);
        parser1.stat();
        //failed
        String[] LexerOut2=new String[]{"return","x","+","0","1"};
        Parser parser2=new Parser(LexerOut2);
        parser2.stat();
    }

   public void stat(){
        if(LA().equals("if"))
            ifstat();
        else if(LA().equals("return"))
            returnstat();
        else if(LA().equals("x"))
        {
            assign();
        }
        else throw new Error();
    }
    void returnstat()
    {
        match("return");expr();match(";");
    }
     void ifstat()
    {
        match("if");expr();match("then");stat();
    }

    void assign()
    {
        match("x"); match("=");expr();
    }

    void expr()
    {
        if(LA().equals("x"))
        {
            match("x");

            if(LA().equals("+"))
            {
                match("+");

            }
            else if(LA().equals("<"))
            {
                match("<");
            }
        }

        match("0");

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
    //Look forward
    String LA()
    {
        return input[index];
    }
}
