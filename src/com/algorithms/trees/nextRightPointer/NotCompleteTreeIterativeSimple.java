package com.algorithms.trees.nextRightPointer;

import com.algorithms.trees.*;

public class NotCompleteTreeIterativeSimple {

    QueueNew queue = new QueueNew();

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        queue.push(new QueueNode(root, 1));

        while (!queue.isEmpty()) {
            QueueNode popQueueNode = queue.pop();

            if (queue.getFirst() != null && queue.getFirst().level == popQueueNode.level) {
                popQueueNode.node.next = queue.getFirst().node;
            }
            if (popQueueNode.node.left != null) {
                queue.push(new QueueNode(popQueueNode.node.left, popQueueNode.level + 1));
            }

            if (popQueueNode.node.right != null) {
                queue.push(new QueueNode(popQueueNode.node.right, popQueueNode.level + 1));
            }

        }
        return root;
    }


    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        NotCompleteTreeIterativeSimple obj = new NotCompleteTreeIterativeSimple();
        System.out.println(obj.connect(root));
    }

}
