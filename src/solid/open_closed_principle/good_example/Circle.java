package solid.open_closed_principle.good_example;

public class Circle implements Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}
