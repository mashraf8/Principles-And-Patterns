package solid.dependency_inversion.bad_example;

public class PayPalPayment
{
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Paypal.");
    }
}
