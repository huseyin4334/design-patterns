package com.patterns.decorator.dynamic.models;

import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransparentShape implements Shape {

    private Shape shape;
    private int transparency;

    @Override
    public String info() {
        return shape.info() + " Applied " + transparency + " transparency.";
    }
}
