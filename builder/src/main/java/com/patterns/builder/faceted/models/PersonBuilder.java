package com.patterns.builder.faceted.models;

public class PersonBuilder {

    protected Person person = new Person();

    public PersonAddressBuilder address() {
        return new PersonAddressBuilder(person);
    }

    public EmployeeBuilder job() {
        return new EmployeeBuilder(person);
    }

    public Person build() {
        return person;
    }
}
