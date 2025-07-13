package design_patterns.behavioral_patterns.visitor;

public class Square implements Shape
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
