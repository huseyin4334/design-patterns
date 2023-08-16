package com.patterns.builder.faceted.models;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder streetAddress(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder city(String city) {
        person.city = city;
        return this;
    }

    public PersonAddressBuilder postCode(String postCode) {
        person.postCode = postCode;
        return this;
    }
}
