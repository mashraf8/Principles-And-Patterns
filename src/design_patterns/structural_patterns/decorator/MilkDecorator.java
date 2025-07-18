package design_patterns.structural_patterns.decorator;

public class MilkDecorator extends CoffeeDecorator
{
    public MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 1.0;
    }
}
