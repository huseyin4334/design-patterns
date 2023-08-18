package com.patterns.adapter.models;

import com.patterns.adapter.interfaces.ToyBird;

public class PlasticDuck implements ToyBird {
    @Override
    public void squeak() {
        System.out.println("Squeak gıcırtı");
    }
}
