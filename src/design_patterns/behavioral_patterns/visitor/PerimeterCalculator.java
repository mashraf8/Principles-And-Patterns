package design_patterns.behavioral_patterns.visitor;

public class PerimeterCalculator implements Visitor
{
    @Override
    public void visit(Circle circle)
    {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * circle.radius));
    }

    @Override
    public void visit(Rectangle rectangle)
    {
        System.out.println("Perimeter of Rectangle: " + (2 * (rectangle.width + rectangle.height)));
    }

    @Override
    public void visit(Square square)
    {
        System.out.println("Perimeter of Square: " + (4 * square.side));
    }
}
