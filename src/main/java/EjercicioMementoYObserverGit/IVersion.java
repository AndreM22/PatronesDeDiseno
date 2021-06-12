package EjercicioMementoYObserverGit;


public interface IVersion {
    void attach(ISubscriptor observer);
    void deattach(ISubscriptor observer);
    void notifyObserver(int version);
}
