package solid.open_closed_principle.good_example;

// A new class for a new shape, without modifying the old code.
public class Triangle implements Shape
{
    double base;
    double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return 0.5 * base * height;
    }

}
