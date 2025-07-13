package design_patterns.behavioral_patterns.observer;

public class Run
{
    public static void main(String[] args)
    {
        NotificationService service = new NotificationService();

        User user1 = new User("Ahmed");
        User user2 = new User("Laila");

        service.subscribe(user1);
        service.subscribe(user2);

        service.sendNotification("You have a new message.");
        service.sendNotification("System maintenance at 12 AM.");

        service.unsubscribe(user1);

        service.sendNotification("Update installed successfully.");
    }
}
