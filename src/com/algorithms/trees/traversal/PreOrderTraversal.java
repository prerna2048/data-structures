package com.algorithms.trees.traversal;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    List<Integer> outputList = new ArrayList<>();

    public List<Integer> preorderTraversal(Node root) {
        preOrder(root);
        outputList.forEach(System.out::println);
        return outputList;
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        outputList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        PreOrderTraversal obj = new PreOrderTraversal();
        obj.preorderTraversal(root);
    }

}
