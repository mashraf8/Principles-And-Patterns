package design_patterns.behavioral_patterns.strategy;

public class PayPal implements PaymentStrategy
{
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
