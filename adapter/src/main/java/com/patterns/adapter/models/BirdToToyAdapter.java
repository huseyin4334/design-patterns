package com.patterns.adapter.models;

import com.patterns.adapter.interfaces.Bird;
import com.patterns.adapter.interfaces.ToyBird;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BirdToToyAdapter implements ToyBird {

    Bird bird;


    @Override
    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}
