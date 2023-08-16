package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.interfaces.Filter;
import com.patterns.solid.openClosed.interfaces.Specification;

import java.util.List;
import java.util.stream.Stream;

public class OCPFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> item, Specification<Product> spec) {
        return item.stream().filter(spec::isSatisfied);
    }
}
