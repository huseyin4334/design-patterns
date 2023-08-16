package com.patterns.builder.fluent.models;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person;

    public SELF name(String name) {
        person.name = name;
        return self();
    }

    public SELF self() {
        return (SELF) this;
    }

    public Person build() {
        return person;
    }
}
