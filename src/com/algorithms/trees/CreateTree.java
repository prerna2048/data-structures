package com.algorithms.trees;

public class CreateTree {

    public static Node createTree() {
        Node node1 = new Node();
        node1.val = 1;

        Node node2 = new Node();
        node2.val = 3;

        Node node3 = new Node();
        node3.val = 2;

        Node node4 = new Node();
        node4.val =5;

//        Node node5 = new Node();
//        node5.val =5;

//        Node node6 = new Node();
//        node6.val =6;
//
//        Node node7 = new Node();
//        node7.val =7;

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
//        node2.right = node5;

//        node3.left = node6;
//        node3.right = node7;

        return node1;
    }
    public static Node createTree2() {
        Node node1 = new Node();
        node1.val = 2;

        Node node2 = new Node();
        node2.val = 1;

        Node node3 = new Node();
        node3.val = 3;

        Node node4 = new Node();
//        node4.val =5;

        Node node5 = new Node();
        node5.val =4;

        Node node6 = new Node();
//        node6.val =6;
//
        Node node7 = new Node();
        node7.val =7;

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        return node1;
    }
}
