package design_patterns.creational_patterns.factory_method;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}
