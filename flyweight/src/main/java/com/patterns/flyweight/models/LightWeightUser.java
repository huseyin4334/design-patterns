package com.patterns.flyweight.models;

import java.util.ArrayList;
import java.util.List;


public class LightWeightUser {

    private String name;

    private static List<String> names = new ArrayList<>();

    public LightWeightUser(String name) {
        if (!names.contains(name))
            names.add(name);
        this.name = name;
    }
}
