package design_patterns.behavioral_patterns.visitor;

public class Rectangle implements Shape
{
    double width, height;
    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
