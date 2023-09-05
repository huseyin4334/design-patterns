package com.patterns.iterator.preorder.models;

import java.util.Iterator;

public class PreOrderIterator<T> implements Iterator<Node<T>> {

    private Node<T> current;

    private boolean yieldedStart;

    public PreOrderIterator(Node<T> root) {
        this.current = root;
    }

    private Node<T> getParentRightChild(Node<T> node) {
        while (node.parent != null) {
            if (node.parent.left == node) {
                return node.parent.right;
            }
            node = node.parent;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return current != null && (current.left != null || current.right != null || getParentRightChild(current) != null);
    }

    @Override
    public Node<T> next() {
        if (!yieldedStart) {
            yieldedStart = true;
            return current;
        }
        if (current.left != null) {
            current = current.left;
        } else if (current.right != null) {
            current = current.right;
        } else {
            current = getParentRightChild(current);
        }
        return current;
    }
}
