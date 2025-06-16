package design_patterns.creational_patterns.abstract_factory;

public class Pyramid implements ThreeDShape
{
    @Override
    public void threeDraw()
    {
        System.out.println("Drawing a 3D Pyramid");
    }
}
