package design_patterns.behavioral_patterns.observer;

public interface Notifier
{
    void subscribe(NotificationListener listener);
    void unsubscribe(NotificationListener listener);
    void notifyAll(String message);
}
