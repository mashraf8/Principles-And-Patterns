package design_patterns.behavioral_patterns.observer;

public class User implements NotificationListener
{
    private String name;

    public User(String name)
    {
        this.name = name;
    }

    @Override
    public void onNotificationReceived(String message)
    {
        System.out.println(name + " received notification: " + message);
    }
}
