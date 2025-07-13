package design_patterns.behavioral_patterns.command;

public class PizzaOrder implements OrderCommand
{
    private Chef chef;

    public PizzaOrder(Chef chef)
    {
        this.chef = chef;
    }

    @Override
    public void execute()
    {
        chef.makePizza();
    }

    @Override
    public void undo()
    {
        chef.cancelPizza();
    }
}
