package com.patterns.decorator.staticobjects.models;

import com.patterns.decorator.dynamic.interfaces.Shape;
import lombok.AllArgsConstructor;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

    private Shape shape;
    private int transparency;

    public TransparentShape(Supplier<? extends T> supplier, int transparency) {
        shape = supplier.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " Applied " + transparency + " transparency.";
    }
}
