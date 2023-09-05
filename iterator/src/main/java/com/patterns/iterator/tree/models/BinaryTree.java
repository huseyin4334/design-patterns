package com.patterns.iterator.tree.models;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@AllArgsConstructor
public class BinaryTree<T> implements Iterable<T> {

    private Node<T> root;

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator<>(root);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T item : this) {
            action.accept(item);
        }
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
