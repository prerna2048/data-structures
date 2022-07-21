package com.algorithms.trees.nextRightPointer;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;
import com.algorithms.trees.Queue;

public class NotCompleteTreeIterative {

    Queue queue = new Queue();

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        queue.push(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            Node popNode = new Node();
            int countInNextLevel = 0;

            while (depth != 0) {

                popNode = queue.pop();

                if (popNode.left != null) {
                    queue.push(popNode.left);
                    countInNextLevel++;
                }

                if (popNode.right != null) {
                    queue.push(popNode.right);
                    countInNextLevel++;
                }
                popNode.next = queue.getFirst();
                depth--;
            }
            popNode.next = null;
            depth = countInNextLevel;

        }
        return root;
    }


    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        NotCompleteTreeIterative obj = new NotCompleteTreeIterative();
        System.out.println(obj.connect(root));
    }

}
