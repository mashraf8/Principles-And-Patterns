package design_patterns.behavioral_patterns.command;
import java.util.Stack;

public class Waiter
{
    private Stack<OrderCommand> history = new Stack<>();

    public void takeOrder(OrderCommand order)
    {
        order.execute();
        history.push(order);
    }

    public void undoLastOrder()
    {
        if (!history.isEmpty())
        {
            OrderCommand lastOrder = history.pop();
            lastOrder.undo();
        }
        else
        {
            System.out.println("There is no order to undo.");
        }
    }
}
