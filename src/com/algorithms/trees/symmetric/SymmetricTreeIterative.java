package com.algorithms.trees.symmetric;

import com.algorithms.trees.CreateTree;
import com.algorithms.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.pow;

public class SymmetricTreeIterative {
    class Queue {
        List<Node> treeNodeList = new LinkedList<>();

        public void push(Node treeNode) {
            treeNodeList.add(treeNode);
        }


        public Node pop() {
            Node node = treeNodeList.get(0);
            treeNodeList.remove(0);
            return node;
        }

        public boolean isEmpty() {
            return treeNodeList.isEmpty();
        }

        public boolean isAllNull() {
            return this.treeNodeList.stream().allMatch(Objects::isNull);
        }

        public void emptyQueue() {
            this.treeNodeList.clear();
        }

    }

    Queue queue = new Queue();

    public boolean isSymmetric(Node root) {
        queue.push(root);
        int i = 0;
        double depth = pow(2, i);
        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            while (depth != 0) {
                Node treeNode = queue.pop();
                queue.push(Objects.nonNull(treeNode) ? treeNode.left : null);
                queue.push(Objects.nonNull(treeNode) ? treeNode.right : null);
                levelNodes.add(Objects.nonNull(treeNode) ? treeNode.val : null);
                depth--;
            }
            if (queue.isAllNull()) {
                queue.emptyQueue();
            }
            if (!isLevelPalindrome(levelNodes)) {
                return false;
            }
            levelNodes.clear();
            i++;
            depth = pow(2, i);
        }
        return true;
    }

    private boolean isLevelPalindrome(List<Integer> levelNodes) {
        int i = 0;
        int j = levelNodes.size() - 1;
        while (i <= j) {
            if((Objects.isNull(levelNodes.get(i)) && Objects.isNull(levelNodes.get(j)))){
                //do nothing
            }
            else if (Objects.isNull(levelNodes.get(i)) || !levelNodes.get(i).equals(levelNodes.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Node treeNode = CreateTree.createTree();
        SymmetricTreeIterative obj = new SymmetricTreeIterative();
        System.out.println(obj.isSymmetric(treeNode));
    }
}
