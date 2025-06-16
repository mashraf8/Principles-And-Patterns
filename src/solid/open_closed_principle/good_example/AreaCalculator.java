package solid.open_closed_principle.good_example;

public class AreaCalculator
{
    // The area calculator class does not need any modification when adding new shapes
    public double calculateShapeArea(Shape shape)
    {
        return shape.calculateArea();
    }
}
