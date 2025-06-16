package design_patterns.creational_patterns.abstract_factory;

public class Run
{
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();

        TowDShape shape2D_1 = factory.towCreateShape("circle"); // Circle
        ThreeDShape shape3D_1 = factory.threeCreateShape("sphere"); // Sphere

        shape2D_1.towDraw();  // Drawing a 2D Circle
        shape3D_1.threeDraw();  // Drawing a 3D Sphere
    }
}
