package com.patterns.composite.neuralnetworks.models;

import java.util.ArrayList;

public class Neuron {

    ArrayList<Neuron> in = new ArrayList<>(), out = new ArrayList<>();

    public void connectTo(Neuron other) {
        in.add(other);
        other.out.add(this);
    }
}
