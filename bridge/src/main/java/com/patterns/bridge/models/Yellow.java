package com.patterns.bridge.models;

import com.patterns.bridge.interfaces.Color;

public class Yellow implements Color {
    @Override
    public String fill() {
        return "yellow";
    }
}
