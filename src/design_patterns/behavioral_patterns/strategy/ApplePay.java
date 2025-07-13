package design_patterns.behavioral_patterns.strategy;

public class ApplePay implements PaymentStrategy
{
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid " + amount + " using Apple Pay");
    }
}
