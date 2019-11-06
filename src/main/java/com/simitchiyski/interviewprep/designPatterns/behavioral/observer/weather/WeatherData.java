package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private static final WeatherData INSTANCE = new WeatherData();

    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public static WeatherData getInstance() {
        return INSTANCE;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        this.observers.parallelStream().forEach(observer -> observer.update(this.temperature, this.humidity, this.pressure));
    }

    public void measurementsChanged() {
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

    public int numberOfObservers() {
        return this.observers.size();
    }

}
