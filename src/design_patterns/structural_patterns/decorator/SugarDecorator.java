package design_patterns.structural_patterns.decorator;

public class SugarDecorator extends CoffeeDecorator
{
    public SugarDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 0.5;
    }
}
