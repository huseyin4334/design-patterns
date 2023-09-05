package com.patterns.iterator.arraybacked;

import com.patterns.iterator.arraybacked.models.Creature;
import com.patterns.iterator.arraybacked.models.CreatureIterator;
import com.patterns.iterator.tree.models.Node;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setAgility(12);
        creature.setIntelligence(13);
        creature.setStrength(17);

        CreatureIterator iterator = new CreatureIterator(creature);

        iterator.forEach(q -> System.out.println("Stat: " + q));

        System.out.println("Creature has a max stat of " + creature.getMaxStat());
        System.out.println("Creature has an average stat of " + creature.getAverageStat());
        System.out.println("Creature has a sum of stats of " + creature.getSumOfStats());

    }
}
