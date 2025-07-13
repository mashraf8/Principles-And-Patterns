package design_patterns.behavioral_patterns.visitor;

public class Run
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(4)
        };

        Visitor areaVisitor = new AreaCalculator();
        Visitor perimeterVisitor = new PerimeterCalculator();

        System.out.println("--- Area Results ---");
        for (Shape shape : shapes)
        {
            shape.accept(areaVisitor);
        }

        System.out.println("\n--- Perimeter Results ---");
        for (Shape shape : shapes)
        {
            shape.accept(perimeterVisitor);
        }
    }
}
