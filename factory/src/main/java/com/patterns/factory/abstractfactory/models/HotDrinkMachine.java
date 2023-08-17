package com.patterns.factory.abstractfactory.models;

import com.patterns.factory.abstractfactory.interfaces.HotDrinkFactory;
import com.patterns.factory.abstractfactory.interfaces.HotDrink;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class HotDrinkMachine {

    private Map<String, HotDrinkFactory> factories = new HashMap<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("com.pattern.factory.abstractfactory").getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types) {
            factories.put(
                    type.getSimpleName().replace("Factory", ""),
                    type.getConstructor().newInstance()
            );
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available Drinks: ");

        for (Map.Entry<String, HotDrinkFactory> entry: factories.entrySet()) {
            System.out.println(entry.getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HotDrinkFactory factory;

        while (true) {
            String consoleText, typeOfDrink;
            int amount;

            if ((consoleText = reader.readLine()) != null && factories.containsKey((typeOfDrink = consoleText))) {
                System.out.println("Specify amount:");

                consoleText = reader.readLine();

                if (consoleText != null && (amount = Integer.parseInt(consoleText)) > 0) {
                    return factories.get(typeOfDrink).prepare(amount);
                }

            }

        }
    }

}
