package com.patterns.solid.interfacesegregation.interfaces;

import com.patterns.solid.interfacesegregation.models.Document;

public interface Machine {
    void print(Document document);
    void fax(Document document) throws Exception;
    void scan(Document document);
}
