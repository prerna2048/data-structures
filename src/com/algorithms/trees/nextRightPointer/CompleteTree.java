package com.algorithms.trees.nextRightPointer;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

//CompleteBinaryTree
public class CompleteTree {


    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        root.left.next = root.right;
        root.right.next = root.next !=null ? root.next.left: null;
        connect(root.left);
        connect(root.right);
        return root;
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        CompleteTree obj = new CompleteTree();
        System.out.println(obj.connect(root));
    }
}
