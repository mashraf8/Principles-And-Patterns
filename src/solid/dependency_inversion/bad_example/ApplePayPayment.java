package solid.dependency_inversion.bad_example;

public class ApplePayPayment
{
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Apple Pay.");
    }
}
