package com.patterns.iterator.tree.models;

import java.util.Iterator;

public class NodeIterator<T> implements Iterator<T> {

    private Node<T> current, root;
    private boolean yieldedStart;

    public NodeIterator(Node<T> root) {
        this.root = current = root;
        while (current.left != null) {
            current = current.left;
        }
    }

    public boolean hasRightmostParent(Node<T> node) {
        if (node.parent == null) return false;
        else return (node.parent.left == node) || hasRightmostParent(node.parent);
    }

    public void reset() {
        current = root;
    }

    @Override
    public boolean hasNext() {
        return current.left != null || current.right != null || hasRightmostParent(current);
    }

    @Override
    public T next() {
        if (!yieldedStart) {
            yieldedStart = true;
            return current.value;
        }

        if (current.right != null) {
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }
            return current.value;
        } else {
            Node<T> p = current.parent;
            while (p != null && current == p.right) {
                current = p;
                p = p.parent;
            }
            current = p;
            return current.value;
        }
    }
}
