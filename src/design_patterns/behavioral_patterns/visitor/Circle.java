package design_patterns.behavioral_patterns.visitor;

public class Circle implements Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
