package design_patterns.creational_patterns.factory_method;

public class Triangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}
