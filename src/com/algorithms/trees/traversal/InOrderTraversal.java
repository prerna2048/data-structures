package com.algorithms.trees.traversal;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InOrderTraversal {

    List<Integer> outputList = new ArrayList<>();

    public List<Integer> inOrderTraversal(Node root) {
        inOrder(root);
        outputList.forEach(System.out::println);
        return outputList;
    }

    private void inOrder(Node root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        if (Objects.nonNull(root)) {
            outputList.add(root.val);
        }
         inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        InOrderTraversal obj = new InOrderTraversal();
        obj.inOrderTraversal(root);
    }
}
