package com.lh.designmodel.observermodel;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    public List<Observer> observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    public abstract void addObserver(Observer observer);
    public abstract void delObserver(Observer observer);
    public abstract void notifyObserver(String message );

}
