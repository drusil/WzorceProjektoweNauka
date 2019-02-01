package Observer.Interface;

public interface Subject {

  public void registerObserver(Observer o);

  public void deleteObserver(Observer o);

  public void messageObservers();
}
