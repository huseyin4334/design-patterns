package com.patterns.decorator.dynamic.models;

import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Square implements Shape {

    @Setter
    private float side;

    @Override
    public String info() {
        return "A square of side " + side + ".";
    }
}
