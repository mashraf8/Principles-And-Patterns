package solid.dependency_inversion.good_example;

public class CheckoutService
{
    private PaymentMethod paymentMethod;

    public CheckoutService(PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(double amount)
    {
        paymentMethod.pay(amount);
    }
}
