package com.patterns.interpreter.parsing.models;

import com.patterns.interpreter.parsing.interfaces.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Integer implements Element {

    private int value;
    @Override
    public int eval() {
        return value;
    }
}
