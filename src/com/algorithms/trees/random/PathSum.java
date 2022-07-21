package com.algorithms.trees.random;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.Objects;

public class PathSum {

    public boolean hasPathSum(Node root, int value, int sum) {
        if (root == null) {
            return false;
        }
        if (value == sum && root.left == null && root.right == null) {
            return true;
        }
        int leftValue = Objects.nonNull(root.left) ? value + root.left.val : value;
        int rightValue = Objects.nonNull(root.right) ? value + root.right.val : value;

        boolean flag1 = hasPathSum(root.left, leftValue, sum);
        boolean flag2 = hasPathSum(root.right, rightValue, sum);

        return flag1 || flag2;
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        PathSum obj = new PathSum();
        System.out.println(obj.hasPathSum(root, root.val,3));
    }
}
