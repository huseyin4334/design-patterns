package com.patterns.singleton.monostate;

import lombok.Getter;
import lombok.Setter;


public class ChiefExecutiveOfficer {

    @Getter
    @Setter
    private static String name;

    @Getter
    @Setter
    private static int age;

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name: " + name + ", " +
                "age: " + age +
                "}";
    }
}
