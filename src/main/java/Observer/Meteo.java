package Observer;

import Observer.Interface.Subject;

public class Meteo {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
    StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay((Subject) weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMessurments((float) 26.6, 65, 1013.1f);
    weatherData.setMessurments((float) 27.7, 70, 997.0f);
    weatherData.setMessurments((float) 25.5, 90, 997.0f);
  }
}
