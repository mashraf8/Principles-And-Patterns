package design_patterns.creational_patterns.abstract_factory;

public class ShapeFactory
{
    public TowDShape towCreateShape(String type)
    {
        if (type.equalsIgnoreCase("circle"))
        {
            return new Circle();
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

    public ThreeDShape threeCreateShape(String type)
    {
        if (type.equalsIgnoreCase("sphere"))
        {
            return new Sphere();
        }
        else if (type.equalsIgnoreCase("pyramid"))
        {
            return new Pyramid();
        }
        else
        {
            throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
