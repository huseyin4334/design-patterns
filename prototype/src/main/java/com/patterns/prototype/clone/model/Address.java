package com.patterns.prototype.clone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Address implements Cloneable {

    private String street, city, postCode;


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(street, city, postCode);
    }
}
