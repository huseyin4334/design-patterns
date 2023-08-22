package com.patterns.decorator.finalobjects;

import com.patterns.decorator.finalobjects.models.StringObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StringObject stringObject = new StringObject("TEstTfghd");

        stringObject.compareTo("TEst");
    }

    /*
        Decorator design pattern takes based on open close principle.

        We cant extend final objects. We will do a demo about decorator design pattern for final objects.

        More: https://refactoring.guru/design-patterns/decorator
     */
}
