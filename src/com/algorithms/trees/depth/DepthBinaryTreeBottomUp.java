package com.algorithms.trees.depth;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

public class DepthBinaryTreeBottomUp {

    private int bottomUp(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = bottomUp(root.left);
        int rightHeight = bottomUp(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        DepthBinaryTreeBottomUp obj = new DepthBinaryTreeBottomUp();
        obj.bottomUp(root);
        System.out.println(obj.bottomUp(root));
    }
}
