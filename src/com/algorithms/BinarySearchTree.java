package com.algorithms;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class BinarySearchTree {


    public static void main(String[] args) {

//        Integer p = new Integer(5);
//        dummy(p);
//                p       a
//        0 1     2       3       4    5   6   7   8
//         5      0x      0x


//
//        Node root = new Node(10);
//        List<Integer> treeData = asList(2, 1, 4);
//
//        for (Integer data : treeData) {
//            insertInBST(root, data);
//        }

        Node newRoot = new Node(9);
        List<Integer> treeData2 = asList(2, 1, 4);


        for (Integer data : treeData2) {
            insertInBinarySearchTree(newRoot, data);
        }

//        Node foundNode = searchBST(root, 4);
        Node foundNode2 = searchBST(newRoot, 4);
//        printFoundNode(foundNode);
        printFoundNode(foundNode2);

    }

    private static void printFoundNode(Node foundNode) {
        if (Objects.nonNull(foundNode)) {
            System.out.println(String.format("%s" + foundNode.data, "Found Node "));
        } else {
            System.out.println("Node not Found");
        }
    }


    private static Node insertInBST(Node node, int numberToInsert) {
        if (node == null) {
            return new Node(numberToInsert);
        }
        if (numberToInsert < node.data) {
            node.left = insertInBST(node.left, numberToInsert);
        } else {
            node.right = insertInBST(node.right, numberToInsert);
        }
        return node;
    }

    private static Node searchBST(Node root, int numberToSearch) {
        if (root == null) {
            return null;
        }
        if (numberToSearch == root.data) {
            return root;
        }
        if (numberToSearch < root.data) {
            return searchBST(root.left, numberToSearch);
        } else {
            return searchBST(root.right, numberToSearch);
        }
    }


    private static void insertInBinarySearchTree(Node root, int numberToInsert) {
        if (numberToInsert < root.data) {
            if (root.left == null) {
                root.left = new Node(numberToInsert);
                return;
            }
            insertInBinarySearchTree(root.left, numberToInsert);
        } else {
            if (root.right == null) {
                root.right = new Node(numberToInsert);
                return;
            }
            insertInBinarySearchTree(root.right, numberToInsert);
        }

    }

}
