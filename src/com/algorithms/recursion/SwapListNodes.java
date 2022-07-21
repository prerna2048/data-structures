package com.algorithms.recursion;

import com.algorithms.linkedlist.ListNode;

public class SwapListNodes {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        return swap(head, head, head, 0);
    }

    public ListNode swap(ListNode head, ListNode top, ListNode linkNode, int count) {
        if (head == null || head.next == null) {
            return top;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode tmp = ptr2.next;
        ptr2.next = ptr1;
        ptr1.next = tmp;

        if (count != 0) {
            linkNode.next = ptr2;
            linkNode = ptr1;
        }

        if (count == 0) {
            top = ptr2;
        }
        return swap(tmp, top, linkNode, count + 1);
    }

}
