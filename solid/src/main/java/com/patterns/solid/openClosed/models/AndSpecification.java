package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.interfaces.Specification;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first;
    private Specification<T> second;

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
