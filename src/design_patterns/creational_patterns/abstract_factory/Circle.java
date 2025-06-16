package design_patterns.creational_patterns.abstract_factory;

public class Circle implements TowDShape
{
    @Override
    public void towDraw()
    {
        System.out.println("Drawing a 2D Circle");
    }
}
