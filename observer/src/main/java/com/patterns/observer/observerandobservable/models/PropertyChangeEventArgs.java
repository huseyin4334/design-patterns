package com.patterns.observer.observerandobservable.models;

import lombok.Getter;

@Getter
public class PropertyChangeEventArgs<T> {

    private T source; // the object that is the source of the event
    private String propertyName; // the name of the property that changed
    private Object newValue; // the new value of the property

    public PropertyChangeEventArgs(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}
