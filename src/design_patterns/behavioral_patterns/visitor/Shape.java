package design_patterns.behavioral_patterns.visitor;

public interface Shape
{
    void accept(Visitor visitor);
}
