package com.patterns.decorator.dynamic.models;

import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {


    private int radius;

    private void calculateRadius(int factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius + ".";
    }
}
