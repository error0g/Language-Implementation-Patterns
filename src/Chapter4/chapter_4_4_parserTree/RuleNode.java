package Chapter4.chapter_4_4_parserTree;

public class RuleNode extends ParserTree {
    String RuleName;

    public RuleNode(String ruleName) {
        RuleName = ruleName;
    }

    @Override
    public String toString() {
        return RuleName;
    }
}