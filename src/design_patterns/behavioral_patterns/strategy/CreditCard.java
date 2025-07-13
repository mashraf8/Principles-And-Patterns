package design_patterns.behavioral_patterns.strategy;

public class CreditCard implements PaymentStrategy
{
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
