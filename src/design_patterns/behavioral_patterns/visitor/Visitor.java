package design_patterns.behavioral_patterns.visitor;

public interface Visitor
{
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Square square);
}
