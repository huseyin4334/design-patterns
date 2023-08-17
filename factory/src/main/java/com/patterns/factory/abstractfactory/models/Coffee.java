package com.patterns.factory.abstractfactory.models;

import com.patterns.factory.abstractfactory.interfaces.HotDrink;

public class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is good");
    }
}
