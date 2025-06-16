package solid.dependency_inversion.good_example;

public class PayPal implements PaymentMethod
{
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
