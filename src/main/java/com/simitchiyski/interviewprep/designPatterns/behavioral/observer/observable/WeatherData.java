package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.observable;

import java.util.Observable;

public class WeatherData extends Observable {
    private static final WeatherData INSTANCE = new WeatherData();

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData() {
    }

    public static WeatherData getInstance() {
        return INSTANCE;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
}
