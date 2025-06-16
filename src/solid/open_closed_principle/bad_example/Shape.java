package solid.open_closed_principle.bad_example;

public class Shape
{
    private String type;
    private double width;
    private double height;
    private double radius;

    public Shape(String type, double width, double height, double radius)
    {
        this.type =type;
        this.width=width;
        this.height=height;
        this.radius=radius;
    }

    public double calculateArea()
    {
        double area = 0;
        if (this.type.equals("Rectangle"))
        {
            area = this.width * this.height;
        } else if (this.type.equals("Circle"))
        {
            area = Math.PI * this.radius * this.radius;
        }
        // If we want to add a new shape (e.g, a Triangle), we will have to modify this code
        // by adding else if (shape.type.equals("Triangle")) {...} And Constructor Shape
        return area;
    }

}
