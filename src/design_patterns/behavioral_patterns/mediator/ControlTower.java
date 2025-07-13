package design_patterns.behavioral_patterns.mediator;

import java.util.Queue;
import java.util.LinkedList;


public class ControlTower implements AirTrafficControl
{
    private Queue<Airplane> landingQueue = new LinkedList<>();
    private boolean runwayAvailable = true;

    @Override
    public void requestLanding(Airplane airplane)
    {
        if (runwayAvailable)
        {
            System.out.println("Permission granted to " + airplane.getName());
            runwayAvailable = false;
        }
        else
        {
            System.out.println("Runway busy. " + airplane.getName() + " added to queue.");
            landingQueue.add(airplane);
        }
    }

    @Override
    public void notifyLandingCompleted(Airplane airplane)
    {
        System.out.println(airplane.getName()+ " has landed.");
        runwayAvailable = true;
        if (!landingQueue.isEmpty())
        {
            Airplane next = landingQueue.poll();
            requestLanding(next);
        }
    }
}
