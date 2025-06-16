package solid.open_closed_principle.bad_example;

public class Run
{
    public static void main(String[] args) {

        // Create and calculate area for a Rectangle
        Shape rectangle = new Shape("Rectangle", 10.0, 5.0,20);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("-----");

        // Create and calculate area for a Circle
        Shape circle = new Shape("Circle", 10.0,5.0,20);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("-----");


    }
}
