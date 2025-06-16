package solid.open_closed_principle.good_example;

public class Run
{
    public static void main(String[] args)
    {

        // Create and calculate area for a Rectangle
        Shape rectangle = new Rectangle(10.0, 5.0);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("-----");

        // Create and calculate area for a Circle
        Shape circle = new Circle(10.0);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("-----");

        // Create and calculate area for a Triangle
        Shape triangle = new Triangle(10.0,5.0);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("-----");


    }
}
