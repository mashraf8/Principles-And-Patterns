package design_patterns.creational_patterns.factory_method;

public class Run
{
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.createShape("circle");
        s1.draw(); // Output: Drawing a Circle

        Shape s2 = factory.createShape("rectangle");
        s2.draw(); // Output: Drawing a rectangle

        Shape s3 = factory.createShape("triangle");
        s3.draw(); // Output: Drawing a Triangle
    }
}
