package solid.open_closed_principle.good_example;

public class Rectangle implements Shape
{
    double width;
    double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return width * height;
    }
}
