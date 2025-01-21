// Subject
public interface ISubject {
    public void ajouterAbonne(IObserver o);
    public void supprimerAbonne(IObserver o);
    public void notifyObservers();
}
