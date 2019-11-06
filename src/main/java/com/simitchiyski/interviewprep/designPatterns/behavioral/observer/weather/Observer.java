package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
