package design_patterns.behavioral_patterns.observer;
import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Notifier
{
    private List<NotificationListener> listeners = new ArrayList<>();

    @Override
    public void subscribe(NotificationListener listener)
    {
        listeners.add(listener);
    }

    @Override
    public void unsubscribe(NotificationListener listener)
    {
        listeners.remove(listener);
    }

    @Override
    public void notifyAll(String message)
    {
        for (NotificationListener listener : listeners)
        {
            listener.onNotificationReceived(message);
        }
    }

    public void sendNotification(String message)
    {
        System.out.println("New Notification Sent: " + message);
        notifyAll(message);
    }
}
