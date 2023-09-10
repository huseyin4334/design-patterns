package com.patterns.template.models;

public class Example {

    public static void main(String[] args) {
        Creature [] creatures = new Creature[2];
        creatures[0] = new Creature(1, 2);
        creatures[1] = new Creature(1, 3);

        TemporaryCardDamageGame game = new TemporaryCardDamageGame(creatures);
        System.out.println(game.combat(0, 1));
    }
}

class Creature
{
    public int attack, health;

    public Creature(int attack, int health)
    {
        this.attack = attack;
        this.health = health;
    }
}

abstract class CardGame
{
    public Creature [] creatures;

    public CardGame(Creature[] creatures)
    {
        this.creatures = creatures;
    }

    // returns -1 if no clear winner (both alive or both dead)
    public int combat(int creature1, int creature2)
    {
        Creature first = creatures[creature1];
        Creature second = creatures[creature2];
        hit(first, second);
        hit(second, first);
        // todo: determine who won and return either creature1 or creature2

        if ((first.health > 0 && second.health > 0) || (first.health <= 0 && second.health <= 0))
            return -1;
        else if (first.health > 0)
            return creature1;
        else
            return creature2;
    }

    // attacker hits other creature
    protected abstract void hit(Creature attacker, Creature other);
}

class TemporaryCardDamageGame extends CardGame
{
    public TemporaryCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        int health = other.health - attacker.attack;

        if (health <= 0)
            other.health = 0;
    }
    // todo
}

class PermanentCardDamageGame extends CardGame
{
    public PermanentCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        int health = other.health - attacker.attack;
        other.health = Math.max(health, 0);
    }
    // todo
}