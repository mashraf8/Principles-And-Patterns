package design_patterns.creational_patterns.factory_method;

public class ShapeFactory
{
    public Shape createShape(String type)
    {
        if (type.equalsIgnoreCase("circle"))
        {
            return new Circle();
        }
        else if (type.equalsIgnoreCase("rectangle"))
        {
            return new Rectangle();
        }
        else if (type.equalsIgnoreCase("triangle"))
        {
            return new Triangle();
        }
        else
        {
            throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
