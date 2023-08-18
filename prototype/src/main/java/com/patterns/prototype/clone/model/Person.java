package com.patterns.prototype.clone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@Setter
@Getter
public class Person implements Cloneable {

    private String[] names;

    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(
                names.clone(),
                (Address) address.clone()
        );
    }
}
