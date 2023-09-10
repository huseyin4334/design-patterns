package com.patterns.observer.observerandobservable.models;

import com.patterns.observer.observerandobservable.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object newValue) {
        for (Observer<T> observer : observers) {
            observer.handle(new PropertyChangeEventArgs<T>(
                    source, propertyName, newValue
            ));
        }
    }
}
