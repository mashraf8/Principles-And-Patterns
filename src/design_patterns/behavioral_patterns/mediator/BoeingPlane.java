package design_patterns.behavioral_patterns.mediator;

public class BoeingPlane implements Airplane
{
    private AirTrafficControl control;
    private String name;

    public BoeingPlane(String name, AirTrafficControl control)
    {
        this.control = control;
        this.name = name;
    }

    @Override
    public void requestLanding()
    {
        System.out.println(name + " requests permission to land.");
        control.requestLanding(this);
    }

    @Override
    public void land()
    {
        System.out.println(name + " is landing...");
        control.notifyLandingCompleted(this);
    }

    @Override
    public String getName()
    {
        return this.name;
    }
}
