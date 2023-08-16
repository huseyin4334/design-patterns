package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Product {

    String name;
    Color color;
    Size size;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
