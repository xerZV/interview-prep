package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.weather;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherDataTest {

    private static WeatherData weatherData;

    @BeforeClass
    public static void beforeClass() {
        weatherData = WeatherData.getInstance();
    }

    @Test
    public void registerObserver() {
        int before = weatherData.numberOfObservers();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        assertEquals(before + 1, weatherData.numberOfObservers());
    }

    @Test
    public void removeObserver() {
        int before = weatherData.numberOfObservers();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        assertEquals(before + 2, weatherData.numberOfObservers());
        weatherData.removeObserver(statisticsDisplay);
        assertEquals(before + 1, weatherData.numberOfObservers());
    }

    @Test
    public void notifyObservers() {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
    }

    @Test
    public void measurementsChanged() {
        weatherData.measurementsChanged();
    }

    @Test
    public void setMeasurements() {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(20, 25, 15.3f);
    }
}