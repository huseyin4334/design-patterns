package com.patterns.decorator.dynamic.models;


import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColoredShape implements Shape {

    private Shape shape;
    private String color;

    @Override
    public String info() {
        return shape.info() + " Applied " + color + " color.";
    }
}
