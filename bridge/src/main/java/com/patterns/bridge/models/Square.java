package com.patterns.bridge.models;

import com.patterns.bridge.interfaces.Color;
import com.patterns.bridge.interfaces.Shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn with " + color.fill() + " color";
    }
}
