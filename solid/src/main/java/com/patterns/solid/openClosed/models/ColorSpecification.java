package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.interfaces.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {

    private Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return color == item.color;
    }
}
