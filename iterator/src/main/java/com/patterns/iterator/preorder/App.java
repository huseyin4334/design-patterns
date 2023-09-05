package com.patterns.iterator.preorder;


import com.patterns.iterator.preorder.models.Node;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // Normal Node Iterator
        /*
            1
           / \
          2   3
             / \
            4   5
         */
        Node<String> root = new Node<>(
                "a",
                new Node<>("b"),
                new Node<>(
                        "c",
                        new Node<>("d"),
                        new Node<>("e")
                )
        );

        Iterator<Node<String>> it = root.preOrder();

        while (it.hasNext()) {
            System.out.print(it.next().value + ",");
        }
    }

    /*
        https://en.wikipedia.org/wiki/Tree_traversal#Pre-order
     */
}
