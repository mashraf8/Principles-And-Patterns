package design_patterns.behavioral_patterns.chain_of_responsibility;

public abstract class Handler
{
    protected Handler next;

    public Handler setNext(Handler next)
    {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String email, String password);
}
