package com.algorithms.trees.traversal;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostOrderTraversal {

    List<Integer> outputList = new ArrayList<>();

    public List<Integer> postorderTraversal(Node root) {
        postorder(root);
        outputList.forEach(System.out::println);
        return outputList;
    }

    private void postorder(Node root) {
        if (root == null) {
            return ;
        }
        postorder(root.left);
        postorder(root.right);
         if (Objects.nonNull(root)) {
            outputList.add(root.val);
        }
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        PostOrderTraversal obj = new PostOrderTraversal();
        obj.postorderTraversal(root);
    }
}
