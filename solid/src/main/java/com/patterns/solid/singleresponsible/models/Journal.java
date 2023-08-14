package com.patterns.solid.singleresponsible.models;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<String>();
    private static int count;

    public void addEntry(String text) {
        entries.add((++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
