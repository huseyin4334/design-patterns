package com.patterns.singleton.multiton.models;

import com.patterns.singleton.multiton.enums.Subsystem;

import java.util.HashMap;

public class Printer {

    private static HashMap<Subsystem, Printer> instances = new HashMap<>();
    private static int createdInstance = 0;

    private Printer() {
        System.out.println("Created Instance: " + (++createdInstance));
    }

    public static synchronized Printer get(Subsystem ss) {
        if (instances.containsKey(ss))
            return instances.get(ss);

        Printer printer = new Printer();
        instances.put(ss, printer);

        return printer;
    }


}
