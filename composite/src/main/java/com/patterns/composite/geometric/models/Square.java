package com.patterns.composite.geometric.models;

import java.util.List;

public class Square extends GraphicObject {

    public Square(String color) {
        setName("Square");
        setColor(color);
    }

    public Square(String color, List<GraphicObject> childs) {
        super(color, childs);
        setName("Square");
    }

}
