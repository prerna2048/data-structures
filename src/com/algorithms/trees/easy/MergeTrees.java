package com.algorithms.trees.easy;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

public class MergeTrees {

    public Node mergeTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        return merge(root1, root2, new Node());

    }

    private Node merge(Node root1, Node root2, Node root3) {
        Node left1 = null;
        Node right1 = null;
        Node left2 = null;
        Node right2 = null;

        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 != null) {
            left1 = root1.left;
            right1 = root1.right;
        }
        if (root2 != null) {
            left2 = root2.left;
            right2 = root2.right;
        }
        if (root2.left != null || root1.left != null) {
            root3.left = new Node();
        }
        if (root2.right != null || root1.right != null) {
            root3.right = new Node();
        }
        root3.val = (root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0);
        merge(left1, left2, root3.left);
        merge(right1, right2, root3.right);
        return root3;
    }

    public static void main(String[] args) {
        MergeTrees mergeTrees = new MergeTrees();
        Node root1 = CreateTree.createTree();
        Node root2 = CreateTree.createTree2();
        mergeTrees.merge(root1, root2, new Node());
    }

}
