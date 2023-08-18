package com.patterns.singleton.multiton;

import com.patterns.singleton.multiton.enums.Subsystem;
import com.patterns.singleton.multiton.models.Printer;

public class App {

    public static void main(String[] args) {

        Printer printer = Printer.get(Subsystem.FALLBACK);
        Printer printer1 = Printer.get(Subsystem.AUXILIARY);
        Printer printer2 = printer.get(Subsystem.AUXILIARY);
        Printer printer3 = Printer.get(Subsystem.AUXILIARY);

    }
}
