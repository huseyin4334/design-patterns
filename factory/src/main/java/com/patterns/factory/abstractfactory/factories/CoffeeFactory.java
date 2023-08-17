package com.patterns.factory.abstractfactory.factories;

import com.patterns.factory.abstractfactory.interfaces.HotDrink;
import com.patterns.factory.abstractfactory.interfaces.HotDrinkFactory;
import com.patterns.factory.abstractfactory.models.Coffee;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in some beans, boil water, pour"
                + amount + "ml, add cream and sugar, enjoy!"
        );

        return new Coffee();
    }
}
