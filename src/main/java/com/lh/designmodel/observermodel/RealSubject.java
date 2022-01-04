package com.lh.designmodel.observermodel;

public class RealSubject extends Subject{
    @Override
    public void addObserver(Observer observer) {
        if (null != observer && !observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void delObserver(Observer observer) {
        if (null != observer && observers.contains(observer)) {
            observers.remove(observer);
       }
    }

    @Override
    public void notifyObserver(String message ) {
        if (observers != null && observers.size()>0) {
            observers.stream().forEach(i->{
                i.showMessage(message);
            });
        }
    }
}
