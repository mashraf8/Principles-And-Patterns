package solid.dependency_inversion.bad_example;

public class CreditCardPayment
{
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
