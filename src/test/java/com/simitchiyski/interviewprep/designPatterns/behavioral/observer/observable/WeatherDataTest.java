package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.observable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherDataTest {

    @Test
    public void testObservable() {
        WeatherData weatherData = WeatherData.getInstance();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        assertEquals(4, weatherData.countObservers());

        weatherData.deleteObserver(currentConditions);
        assertEquals(3, weatherData.countObservers());
    }

}