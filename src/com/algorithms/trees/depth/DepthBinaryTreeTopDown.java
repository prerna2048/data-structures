package com.algorithms.trees.depth;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

public class DepthBinaryTreeTopDown {
    int max = 0;

    private void preOrder(Node root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > max) {
            max = depth;
        }
        preOrder(root.left, depth + 1);
        preOrder(root.right, depth + 1);

    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        DepthBinaryTreeTopDown obj = new DepthBinaryTreeTopDown();
        obj.preOrder(root, 1);
        System.out.println(obj.max);
    }
}
