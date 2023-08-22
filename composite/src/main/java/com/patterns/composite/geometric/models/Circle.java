package com.patterns.composite.geometric.models;

import java.util.List;

public class Circle extends GraphicObject {

    public Circle(String color) {
        setName("Circle");
        setColor(color);
    }

    public Circle(String color, List<GraphicObject> childs) {
        super(color, childs);
        setName("Circle");
    }

}
