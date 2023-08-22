package com.patterns.composite.geometric.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GraphicObject {

    private String name = "GraphicObject";

    private List<GraphicObject> children = new ArrayList<>();

    public String color;

    public GraphicObject(String color, List<GraphicObject> objects) {
        this.children = objects;
        this.color = color;
    }


    private String getChildsToString() {

        if (children.isEmpty())
            return "{}";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < children.size(); i++) {

            builder.append(children.get(i).toString());

            if (children.size() - 1 != i) builder.append(", ");
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", children=" + getChildsToString() +
                '}';
    }
}
