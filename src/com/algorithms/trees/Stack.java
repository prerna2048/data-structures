package com.algorithms.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Stack {
    public List<Node> treeNodeList = new ArrayList<>();

    public void push(Node treeNode) {
        treeNodeList.add(treeNode);
    }


    public Node pop() {
        int size = treeNodeList.size();
        Node node = treeNodeList.get(size - 1);
        treeNodeList.remove(size -1);
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

    public boolean hasNode(Node node) {
        return treeNodeList.stream().anyMatch(treeNode -> treeNode == node);
    }

    public boolean isPresentNodeVal(int nodeVal) {
        return treeNodeList.stream().anyMatch(node -> node.val == nodeVal);
    }
}
