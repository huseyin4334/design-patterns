package com.patterns.iterator.tree;

import com.patterns.iterator.tree.models.BinaryTree;
import com.patterns.iterator.tree.models.Node;
import com.patterns.iterator.tree.models.NodeIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // Normal Node Iterator
        /*
            1
           / \
          2   3
             / \
            4   5
         */
        Node<Integer> root = new Node<>(
                1,
                new Node<>(2),
                new Node<>(
                        3,
                        new Node<>(4),
                        new Node<>(5)
                )
        );

        NodeIterator<Integer> it = new NodeIterator<>(root);

        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }


        // Binary Tree Iterator
        BinaryTree<Integer> tree = new BinaryTree<>(root);

        System.out.println();
        for (int n : tree) {
            System.out.print(n + ",");
        }
    }

    /*
        An object that facilitates the traversal of a data structure
     */
}
