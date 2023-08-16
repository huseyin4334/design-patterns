package com.patterns.solid.interfacesegregation.models;

import com.patterns.solid.interfacesegregation.interfaces.Machine;

public class OldFuncPrinter implements Machine {
    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) throws Exception {
        throw new Exception("I don't have this function");
    }

    @Override
    public void scan(Document document) {

    }
}
