package com.patterns.iterator.preorder.models;

import java.util.Iterator;

public class Node<T>
{
    public T value;
    public Node<T> left, right, parent;

    private boolean yieldedStart;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;

        left.parent = right.parent = this;
    }

    public Node<T> getCurrent() {
        return this;
    }

    public Iterator<Node<T>> preOrder() {
        return new PreOrderIterator<>(this);
    }
}