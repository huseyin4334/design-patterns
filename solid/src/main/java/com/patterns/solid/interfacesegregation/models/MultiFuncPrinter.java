package com.patterns.solid.interfacesegregation.models;

import com.patterns.solid.interfacesegregation.interfaces.Machine;

public class MultiFuncPrinter implements Machine {
    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
