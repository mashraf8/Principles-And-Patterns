package design_patterns.behavioral_patterns.visitor;

public class AreaCalculator implements Visitor
{
    @Override
    public void visit(Circle circle)
    {
        System.out.println("Area of Circle: " + (Math.PI * circle.radius * circle.radius));
    }

    @Override
    public void visit(Rectangle rectangle)
    {
        System.out.println("Area of Rectangle: " + (rectangle.width * rectangle.height));
    }

    @Override
    public void visit(Square square)
    {
        System.out.println("Area of Square: " + (square.side * square.side));
    }
}
