// ConcreteObserver
public class User implements IObserver {
    private String notifications;

    @Override
    public void update(String notifications) {
        this.notifications = notifications;
        System.out.println("Notifications: " + notifications);
    }

    public String getNotifications() {
        return this.notifications;
    }
}
