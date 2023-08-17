package com.patterns.factory.abstractfactory.interfaces;

import com.patterns.factory.abstractfactory.interfaces.HotDrink;

public interface HotDrinkFactory {

    HotDrink prepare(int amount);
}
