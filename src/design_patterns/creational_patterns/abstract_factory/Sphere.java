package design_patterns.creational_patterns.abstract_factory;

public class Sphere implements ThreeDShape
{
    @Override
    public void threeDraw()
    {
        System.out.println("Drawing a 3D Sphere");
    }
}
