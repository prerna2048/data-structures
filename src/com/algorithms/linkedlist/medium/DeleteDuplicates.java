package com.algorithms.linkedlist.medium;

import com.algorithms.trees.Node;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeleteDuplicates {
    public Node deleteDuplicates(Node head) {

        Node temp = head;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        while (temp != null) {
            if (map.containsKey(temp.val)) {
                map.put(temp.val, map.get(temp.val) + 1);
            } else {
                map.put(temp.val, 1);
            }
            temp = temp.next;
        }

        Node node = null;
        Node prev = null;
        Node newHead = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (node == null && entry.getValue() == 1) {
                node = new Node();
                node.val = entry.getKey();
                newHead = node;
                prev = node;
            } else if (node != null && entry.getValue() == 1) {
                node = new Node();
                node.val = entry.getKey();
                prev.next = node;
                prev = node;
            }
        }

        head = newHead;
        return head;
    }
}
