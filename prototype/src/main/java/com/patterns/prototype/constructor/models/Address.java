package com.patterns.prototype.constructor.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Address {

    private String street, city, postCode;

    public Address(Address other) {
        this.street = other.getStreet();
        this.city = other.getCity();
        this.postCode = other.getPostCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

}
