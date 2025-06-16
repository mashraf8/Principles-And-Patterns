package solid.dependency_inversion.good_example;

public class Run
{
    public static void main(String[] args)
    {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod applePay = new ApplePayPayment();
        PaymentMethod payPal  = new PayPal();

        CheckoutService checkout1 = new CheckoutService(creditCard);
        checkout1.processOrder(150.0);

        CheckoutService checkout2 = new CheckoutService(applePay);
        checkout2.processOrder(150.0);

        CheckoutService checkout3 = new CheckoutService(payPal);
        checkout3.processOrder(150.0);
    }
}
