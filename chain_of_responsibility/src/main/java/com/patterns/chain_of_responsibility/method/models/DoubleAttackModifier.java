package com.patterns.chain_of_responsibility.method.models;

public class DoubleAttackModifier extends CreatureModifier {
    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.getName() + " attack");
        creature.setAttack(creature.getAttack() * 2);
        super.handle();
    }
}
