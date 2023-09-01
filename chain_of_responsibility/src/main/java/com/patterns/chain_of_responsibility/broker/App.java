package com.patterns.chain_of_responsibility.broker;

import com.patterns.chain_of_responsibility.broker.models.Game;
import com.patterns.chain_of_responsibility.broker.models.IncreasedDefenseModifier;
import com.patterns.chain_of_responsibility.broker.models.Creature;
import com.patterns.chain_of_responsibility.broker.models.DoubleAttackModifier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // Modifiers special for creature
        new IncreasedDefenseModifier(game, goblin);

        try (DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin))
        {
            System.out.println(goblin);
        }

        System.out.println(goblin);

    }

    /*
        Command Query Separation
        Command: Asking for an action or change
        Query: Asking for information

        More: https://refactoring.guru/design-patterns/chain-of-responsibility
     */
}
