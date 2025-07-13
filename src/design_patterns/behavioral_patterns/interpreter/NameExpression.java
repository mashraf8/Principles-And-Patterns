package design_patterns.behavioral_patterns.interpreter;

public class NameExpression implements Expression
{
    private String name;

    public NameExpression(String name)
    {
        this.name = name;
    }

    @Override
    public boolean interpret(String context)
    {
        return context.contains(name);
    }
}
