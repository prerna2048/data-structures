package com.algorithms.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Queue {
    List<Node> treeNodeList = new LinkedList<>();

    public void push(Node treeNode) {
        treeNodeList.add(treeNode);
    }


    public Node pop() {
        if (treeNodeList.isEmpty()) {
            return null;
        }
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

    public Node getFirst() {
        return !this.treeNodeList.isEmpty() ? this.treeNodeList.get(0) : null;
    }

    public Node getFirstNonNull() {
        for (Node node : this.treeNodeList) {
            if (node != null) {
                return node;
            }
        }
        return null;
    }
}
