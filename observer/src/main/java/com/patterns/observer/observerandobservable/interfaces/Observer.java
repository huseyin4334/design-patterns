package com.patterns.observer.observerandobservable.interfaces;

import com.patterns.observer.observerandobservable.models.PropertyChangeEventArgs;

public interface Observer<T> {

    void handle(PropertyChangeEventArgs<T> args);
}
