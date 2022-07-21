package com.algorithms.trees.easy;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

public class MirrorImage {

    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}
