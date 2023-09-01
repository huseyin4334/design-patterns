package com.patterns.chain_of_responsibility.method.models;

public class DefenseModifier extends CreatureModifier {
    public DefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Defensing " + creature.getName() + " attack");
        creature.setDefense(creature.getDefense() + 3);
        super.handle();
    }
}
