package com.patterns.iterator.arraybacked.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Creature {

    private int strength, agility, intelligence;

    public double getAverageStat() {
        return getSumOfStats() / 3.0;
    }

    public int getMaxStat() {
        return Math.max(strength, Math.max(agility, intelligence));
    }

    public int getSumOfStats() {
        return strength + agility + intelligence;
    }
}
