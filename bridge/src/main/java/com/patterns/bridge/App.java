package com.patterns.bridge;

import com.patterns.bridge.models.Square;
import com.patterns.bridge.models.Yellow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Square s = new Square(new Yellow());
        System.out.println(s.draw());
    }

    /*
        A mechanism that decouples an interface from implementation.
        We are defining features with interfaces. Later, we are implementing this features by type of class.

        More: https://refactoring.guru/design-patterns/bridge
     */
}
