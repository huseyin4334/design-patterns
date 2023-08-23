package com.patterns.proxy.property.models;

public class Creature {

    private final Property<Integer> agility = new Property<>(10);


    public Integer getAgility() {
        return agility.getValue();
    }

    public void setAgility(Integer agility) {
        this.agility.setValue(agility);
    }
}
