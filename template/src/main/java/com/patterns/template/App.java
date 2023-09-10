package com.patterns.template;

import com.patterns.template.models.Chess;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chess chess = new Chess();

        chess.run();
    }

    /*
        * Allows us to define the 'skeleton' of the algorithm, with concrete implementations defined in subclasses
        *
        *  In this example, we have a Game class that defines the skeleton of a game, with abstract methods that are implemented in the Chess class
        * We haven't defined the rules of the game in the Game class, but we have defined the structure of the game
        * We haven't changed structure of the game, but we have set the rules of the game with the Chess class
        *
        *
        * More: https://www.baeldung.com/java-template-method-pattern - https://refactoring.guru/design-patterns/template-method
     */
}
