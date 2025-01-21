import java.util.ArrayList;
import java.util.List;

public class SujetNotification implements ISubject {
    private List<IObserver> observers;
    private String notifications;

    public SujetNotification() {
        observers = new ArrayList<>();
    }

    public void ajouterAbonne(IObserver o) {
        observers.add(o);
    }

    public void supprimerAbonne(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(notifications);
        }
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
        notifyObservers();
    }
}
