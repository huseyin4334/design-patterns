package com.patterns.solid.singleresponsible;

import com.patterns.solid.singleresponsible.models.Journal;
import com.patterns.solid.singleresponsible.models.Persistence;

public class SolidApplication {

    public static void main(String[] args) throws Exception{
        Journal j = new Journal();

        j.addEntry("I create this app today");
        j.addEntry("I find a bug");

        System.out.println(j);


        Persistence p = new Persistence();
        String fileName = "classpath:journal.txt";

        p.save(j, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
