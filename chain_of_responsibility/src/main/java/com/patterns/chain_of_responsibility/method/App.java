package com.patterns.chain_of_responsibility.method;

import com.patterns.chain_of_responsibility.method.models.Creature;
import com.patterns.chain_of_responsibility.method.models.CreatureModifier;
import com.patterns.chain_of_responsibility.method.models.DefenseModifier;
import com.patterns.chain_of_responsibility.method.models.DoubleAttackModifier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Creature rootC = new Creature("rootC", 1, 2);
        Creature creature = new Creature("Goblin", 1, 2);
        Creature creature2 = new Creature("Spiderman", 5, 3);

        System.out.println(creature);
        System.out.println(creature2);
        System.out.println(rootC);

        CreatureModifier root = new CreatureModifier(rootC);

        root.add(new DoubleAttackModifier(creature2));
        root.add(new DoubleAttackModifier(creature));

        root.add(new DoubleAttackModifier(creature2));
        root.add(new DoubleAttackModifier(creature));

        root.add(new DefenseModifier(creature2));
        root.add(new DefenseModifier(creature));

        root.handle();

        System.out.println(creature);
        System.out.println(creature2);
        System.out.println(rootC);
    }
}
