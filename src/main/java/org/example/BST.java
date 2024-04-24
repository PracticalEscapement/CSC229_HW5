package org.example;

public class BST {
    private Node root;

    // Default constructor
    public BST() {
        this.root = null;
    }

    // copy constructor

    // Clear method
    public void clear() {
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
