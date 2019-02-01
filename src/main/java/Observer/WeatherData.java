package Observer;



import Observer.Interface.Observer;
import Observer.Interface.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
  ArrayList<Observer> observers;
  float temperature;
  float humidity;
  float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }


  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void getChanges() {
  }

  public void setMessurments(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    messageObservers();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void deleteObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) observers.remove(i);
  }

  @Override
  public void messageObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer obs = (Observer) observers.get(i);
      obs.update(temperature, humidity, pressure);

    }

  }
}
