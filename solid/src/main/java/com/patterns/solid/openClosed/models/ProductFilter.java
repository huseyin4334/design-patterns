package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.enums.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(
            List<Product> products,
            Color color
    ) {
        return products.stream().filter(p -> p.color.equals(color));
    }

    public Stream<Product> filterBySize(
            List<Product> products,
            Size size
    ) {
        return products.stream().filter(p -> p.size.equals(size));
    }
}

