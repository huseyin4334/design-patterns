package com.patterns.factory.abstractfactory;

import com.patterns.factory.abstractfactory.interfaces.HotDrink;
import com.patterns.factory.abstractfactory.models.HotDrinkMachine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();

        HotDrink drink = machine.makeDrink();

        drink.consume();
    }
}
