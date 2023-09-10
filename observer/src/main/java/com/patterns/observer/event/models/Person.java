package com.patterns.observer.event.models;


import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter
    private int age;

    public Event<PropertyChangeArgs> propertyChanged = new Event<>();

    public void setAge(int age) {
        if (age == this.age) return;
        this.age = age;
        propertyChanged.fire(new PropertyChangeArgs(this, "age"));
    }
}
