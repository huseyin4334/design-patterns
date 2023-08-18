package com.patterns.prototype.constructor.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String name;
    private String position;

    private Address address;

    public Employee(Employee other) {
        this.name = other.getName();
        this.position = other.getPosition();

        this.address = new Address(other.address);
    }
}
