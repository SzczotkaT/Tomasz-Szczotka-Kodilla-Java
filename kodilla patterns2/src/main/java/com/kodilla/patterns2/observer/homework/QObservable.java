package com.kodilla.patterns2.observer.homework;

public interface QObservable {
    void registerQObserver(QObserver qObserver);
    void notifyObservers();
    void removeQObserver(QObserver qObserver);
}
