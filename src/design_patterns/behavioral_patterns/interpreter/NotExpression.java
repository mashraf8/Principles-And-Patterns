package design_patterns.behavioral_patterns.interpreter;

public class NotExpression implements Expression
{
    private Expression expr;

    public NotExpression(Expression expr)
    {
        this.expr = expr;
    }

    @Override
    public boolean interpret(String context)
    {
        return !expr.interpret(context);
    }
}
