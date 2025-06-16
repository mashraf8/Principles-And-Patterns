package solid.dependency_inversion.bad_example;

public class Run
{
    public static void main(String[] args)
    {
        CreditCardPayment creditCard = new CreditCardPayment();
        ApplePayPayment applePay = new ApplePayPayment();
        PayPalPayment paypal = new PayPalPayment();

        CheckoutService checkout = new CheckoutService();

        checkout.processOrderCreditCard(150.0);
        checkout.processOrderApplePay(150.0);
        checkout.processOrderPayPal(150.0);


    }
}
