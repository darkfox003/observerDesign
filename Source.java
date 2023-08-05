package observerDesign;

public interface Source {
    public void notifyObserver();
    public void register(Observer o);
    public void unregister(Observer o);
}
