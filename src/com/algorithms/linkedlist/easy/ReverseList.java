package com.algorithms.linkedlist.easy;

import com.algorithms.linkedlist.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;


        return curr;
    }
}
