package com.patterns.bridge.models;

import com.patterns.bridge.interfaces.Color;

public class Blue implements Color {

    @Override
    public String fill() {
        return "blue";
    }
}
