package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.enums.Size;
import com.patterns.solid.openClosed.interfaces.Specification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {

    private Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return size == item.size;
    }
}
