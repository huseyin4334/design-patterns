package com.patterns.composite.neuralnetworks;


import com.patterns.composite.neuralnetworks.models.Layer;
import com.patterns.composite.neuralnetworks.models.Neuron;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        Neuron neuron1ForLayer1 = new Neuron();
        Neuron neuron2ForLayer1 = new Neuron();

        Neuron neuron1ForLayer2 = new Neuron();

        neuron1ForLayer2.connectTo(neuron1ForLayer1);
        neuron1ForLayer2.connectTo(neuron2ForLayer1);

        layer1.add(neuron1ForLayer1);
        layer1.add(neuron2ForLayer1);

        layer2.add(neuron1ForLayer2);
    }

    /*
        Composite is a structural design pattern that lets you compose objects into tree structures and then work
        with these structures as if they were individual objects.
        More: https://refactoring.guru/design-patterns/composite
     */
}
