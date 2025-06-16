package solid.dependency_inversion.good_example;

public class CreditCardPayment implements PaymentMethod
{
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
