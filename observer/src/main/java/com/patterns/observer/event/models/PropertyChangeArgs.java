package com.patterns.observer.event.models;

public class PropertyChangeArgs {

    private Object source;
    private String propertyName;
    public PropertyChangeArgs(Object source, String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }

    public Object getSource() {
        return source;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
