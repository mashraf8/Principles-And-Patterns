package design_patterns.behavioral_patterns.mediator;

public interface AirTrafficControl
{
    void requestLanding(Airplane airplane);
    void notifyLandingCompleted(Airplane airplane);
}
