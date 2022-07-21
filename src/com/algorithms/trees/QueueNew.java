package com.algorithms.trees;

import java.util.LinkedList;
import java.util.List;

public class QueueNew {
    List<QueueNode> queueNodeList = new LinkedList<>();

    public QueueNode pop() {
        if (queueNodeList.isEmpty()) {
            return null;
        }
        QueueNode queueNode = queueNodeList.get(0);
        queueNodeList.remove(0);
        return queueNode;
    }

    public void push(QueueNode queueNode) {
        queueNodeList.add(queueNode);
    }

    public boolean isEmpty() {
        return queueNodeList.isEmpty();
    }

    public QueueNode getFirst() {
        return !this.queueNodeList.isEmpty() ? this.queueNodeList.get(0) : null;
    }
}
