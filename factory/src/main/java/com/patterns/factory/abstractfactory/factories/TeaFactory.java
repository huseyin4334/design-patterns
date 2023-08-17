package com.patterns.factory.abstractfactory.factories;

import com.patterns.factory.abstractfactory.interfaces.HotDrink;
import com.patterns.factory.abstractfactory.interfaces.HotDrinkFactory;
import com.patterns.factory.abstractfactory.models.Tea;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour"
                        + amount + "ml, add lemon, enjoy!"
        );

        return new Tea();
    }
}
