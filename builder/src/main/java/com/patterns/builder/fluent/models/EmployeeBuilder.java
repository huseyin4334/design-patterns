package com.patterns.builder.fluent.models;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder position(String position) {
        person.position = position;
        return self();
    }
}
