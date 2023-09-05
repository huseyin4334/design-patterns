package com.patterns.mediator.example;


import com.patterns.mediator.example.models.Mediator;
import com.patterns.mediator.example.models.Participant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Mediator mediator = new Mediator();
        Participant p1 = new Participant(mediator);
        Participant p2 = new Participant(mediator);

        p1.say(10);
        p2.say(20);

        System.out.println("P1: " + p1.value);

        System.out.println("P2: " + p2.value);

    }

    /*
        A component which facilitates communication between other components
        without them necessarily being aware of each other or having direct (reference) access to each other.

        More: https://refactoring.guru/design-patterns/mediator
     */
}
