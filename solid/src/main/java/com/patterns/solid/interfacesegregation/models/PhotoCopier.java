package com.patterns.solid.interfacesegregation.models;

import com.patterns.solid.interfacesegregation.interfaces.Printer;
import com.patterns.solid.interfacesegregation.interfaces.Scanner;

public class PhotoCopier implements Scanner, Printer {
    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
