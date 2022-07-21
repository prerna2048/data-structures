package com.algorithms.trees.nextRightPointer;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.Objects;

//BinaryTree Not complete
public class NotCompleteTreeWrongWithDepthApproach {


    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null)
            root.left.next = Objects.nonNull(root.right) ? root.right :
                    Objects.nonNull(root.next) ? getNext(root.next) : null;

        if (root.right != null)
            root.right.next = Objects.nonNull(root.next) ? getNext(root.next) : null;

        connect(root.left);
        connect(root.right);
        return root;

    }

    private Node getNext(Node node) {
        Node node1 = node.left != null ? node.left : node.right;
        return node1 == null ? node.next != null ? getNext(node.next) : null : node1;
    }


    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        NotCompleteTreeWrongWithDepthApproach obj = new NotCompleteTreeWrongWithDepthApproach();
        System.out.println(obj.connect(root));
    }
}
