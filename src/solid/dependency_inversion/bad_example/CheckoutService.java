package solid.dependency_inversion.bad_example;

public class CheckoutService
{
    private CreditCardPayment payment_creditcard = new CreditCardPayment();
    private ApplePayPayment payment_applepay = new ApplePayPayment();
    private PayPalPayment payment_paypal = new PayPalPayment();


    public void processOrderCreditCard(double amount)
    {
        payment_creditcard.pay(amount);
    }
    public void processOrderApplePay(double amount)
    {
        payment_applepay.pay(amount);
    }
    public void processOrderPayPal(double amount)
    {
        payment_paypal.pay(amount);
    }
}
