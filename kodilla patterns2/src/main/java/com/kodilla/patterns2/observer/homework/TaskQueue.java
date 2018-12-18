package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements QObservable {
    private final List<QObserver> observers;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name){
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerQObserver(QObserver qObserver){
        observers.add(qObserver);
    }

    @Override
    public void notifyObservers(){
        for(QObserver qObserver : observers){
            qObserver.update(this);
        }
    }

    @Override
    public void removeQObserver(QObserver qObserver){
        observers.remove(qObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
