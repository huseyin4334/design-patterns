package com.patterns.adapter;

import com.patterns.adapter.interfaces.ToyBird;
import com.patterns.adapter.models.BirdToToyAdapter;
import com.patterns.adapter.models.PlasticDuck;
import com.patterns.adapter.models.Sparrow;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args)
    {
        Sparrow sparrow = new Sparrow();
        ToyBird toyDuck = new PlasticDuck();

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyBird birdAdapter = new BirdToToyAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }

    /*
        Adapter pattern is a structural pattern.
        If and bird working with bird interface this bird have to work with toybird class too.
        But this bird is not toybird. We are converting with adapter pattern.
        We can choose this way. In this example, We converted bird object to toybird object with abstractions.

        More: https://refactoring.guru/design-patterns/adapter
        https://www.geeksforgeeks.org/adapter-pattern/
     */
}
