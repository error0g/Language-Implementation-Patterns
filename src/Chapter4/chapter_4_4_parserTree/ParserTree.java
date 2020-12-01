package Chapter4.chapter_4_4_parserTree;

import java.util.ArrayList;
import java.util.List;

public abstract class ParserTree {
    public List<ParserTree> children;

    public List<ParserTree> getChildren() {
        return children;
    }

    public RuleNode addChild(String value)
    {
        RuleNode ruleNode =new RuleNode(value);
        addChild(ruleNode);
        return ruleNode;
    }
    public TokenNode addChild(Token value)
    {
        TokenNode tokenNode=new TokenNode(value);
        addChild(tokenNode);
        return tokenNode;
    }
    public void addChild(ParserTree parserTree) {
        if(children==null)children=new ArrayList<ParserTree>();
         children.add(parserTree);
    }
}
