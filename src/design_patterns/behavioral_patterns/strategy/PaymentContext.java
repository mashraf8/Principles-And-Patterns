package design_patterns.behavioral_patterns.strategy;

public class PaymentContext
{
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void executePayment(int amount)
    {
        strategy.pay(amount);
    }
}
