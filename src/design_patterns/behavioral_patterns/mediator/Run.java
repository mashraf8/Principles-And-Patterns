package design_patterns.behavioral_patterns.mediator;

public class Run
{
    public static void main(String[] args)
    {
        ControlTower tower = new ControlTower();

        Airplane plane1 = new BoeingPlane("Plane A", tower);
        Airplane plane2 = new BoeingPlane("Plane B", tower);
        Airplane plane3 = new BoeingPlane("Plane C", tower);

        plane1.requestLanding();
        plane2.requestLanding();
        plane1.land();
        plane2.land();
        plane3.requestLanding();
        plane2.land();
    }
}
