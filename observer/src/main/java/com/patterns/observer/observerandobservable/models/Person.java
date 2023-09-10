package com.patterns.observer.observerandobservable.models;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Person extends Observable<Person> {

    private int age;

    public void setAge(int age) {
        if (age == this.age) return;
        this.age = age;
        propertyChanged(this, "age", age);
    }
}
