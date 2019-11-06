package com.simitchiyski.interviewprep.designPatterns.behavioral.observer.weather;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
