package com.patterns.solid.openClosed.interfaces;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
