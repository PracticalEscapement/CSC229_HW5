package org.example;

public class BST {
    private Node root;

    // Default constructor
    public BST() {
        this.root = null;
    }


    class Node {
        Item data;
        Node right = null;
        Node left = null;

        Node(Item i) {
            data = i;
        }
    }
}
