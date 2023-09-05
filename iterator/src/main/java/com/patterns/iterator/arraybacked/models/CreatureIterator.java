package com.patterns.iterator.arraybacked.models;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class CreatureIterator implements Iterable<Integer> {

    private int[] stats = new int[3];

    public CreatureIterator(Creature creature) {
        stats[0] = creature.getStrength();
        stats[1] = creature.getAgility();
        stats[2] = creature.getIntelligence();
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.of(stats).iterator();
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return IntStream.of(stats).spliterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int x : stats) {
            action.accept(x);
        }
    }

    public int sum() {
        return IntStream.of(stats).sum();
    }

    public int max() {
        return IntStream.of(stats).max().getAsInt();
    }

    public double average() {
        return IntStream.of(stats).average().getAsDouble();
    }

    public int getStrength() {
        return stats[0];
    }

    public void setStrength(int value) {
        stats[0] = value;
    }

    public int getAgility() {
        return stats[1];
    }

    public void setAgility(int value) {
        stats[1] = value;
    }

    public int getIntelligence() {
        return stats[2];
    }

    public void setIntelligence(int value) {
        stats[2] = value;
    }
}
