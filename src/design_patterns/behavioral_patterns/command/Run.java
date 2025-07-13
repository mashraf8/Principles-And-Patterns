package design_patterns.behavioral_patterns.command;

public class Run
{
    public static void main(String[] args) {
        Chef chef = new Chef();

        // Different orders
        OrderCommand pizza = new PizzaOrder(chef);
        OrderCommand juice = new JuiceOrder(chef);

        // The waiter
        Waiter waiter = new Waiter();

        // The customer places orders
        waiter.takeOrder(pizza);
        waiter.takeOrder(juice);

        // The customer cancels the last order
        waiter.undoLastOrder();
        waiter.undoLastOrder();
    }
}
