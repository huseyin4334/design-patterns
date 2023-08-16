package com.patterns.builder.faceted.models;

public class EmployeeBuilder extends PersonBuilder {

    public EmployeeBuilder(Person person) {
        this.person = person;
    }

    public EmployeeBuilder position(String position) {
        person.position = position;
        return this;
    }

    public EmployeeBuilder companyName(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public EmployeeBuilder annualIncome(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }

    public Person build() {
        return person;
    }
}
