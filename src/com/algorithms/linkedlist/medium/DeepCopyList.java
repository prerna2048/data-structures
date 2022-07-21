package com.algorithms.linkedlist.medium;

import com.algorithms.trees.Node;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyList {

    public Node copyRandomList(Node head) {

        Node temp = head;
        Map<Node, Integer> inputNodeMap = new HashMap<>();
        int i = 1;
        while (temp != null) {
            inputNodeMap.put(temp, ++i);
            temp = temp.next;
        }

        Map<Integer, Integer> map = new HashMap<>();
        temp = head;
        i = 1;
        while (temp != null) {
            map.put(++i, inputNodeMap.get(temp.random));
            temp = temp.next;
        }

        temp = head;
        Node prev = null;
        Node outputListHead = null;
        Map<Integer, Node> outputNodeMap = new HashMap<>();

        i = 1;
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = null;
            if (temp == head) {
                outputListHead = node;
                prev = node;
            } else {
                prev.next = node;
                prev = node;
            }
            outputNodeMap.put(++i, node);
            temp = temp.next;
        }

        temp = head;
        Node temp2 = outputListHead;
        i = 1;
        while (temp2 != null) {
            temp2.random = outputNodeMap.get(map.get(i));
            temp = temp.next;
            temp2 = temp2.next;
            i++;
        }

        return outputListHead;
    }
}
