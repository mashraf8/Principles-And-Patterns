package design_patterns.creational_patterns.factory_method;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
