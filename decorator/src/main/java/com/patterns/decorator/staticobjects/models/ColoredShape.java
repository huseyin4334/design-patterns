package com.patterns.decorator.staticobjects.models;


import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;

import java.util.function.Supplier;


public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> s, String color) {
        shape = s.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " Applied " + color + " color.";
    }
}
