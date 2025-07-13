package design_patterns.behavioral_patterns.strategy;

public class Run
{
    public  static void main(String[] args)
    {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new PayPal());
        context.executePayment(100);  // Will pay via PayPal

        context.setStrategy(new CreditCard());
        context.executePayment(200);  // Will pay using the credit card

        context.setStrategy(new ApplePay());
        context.executePayment(300);  // Will pay using Apple Pay
    }
}
