package com.algorithms.recursion;

import com.algorithms.linkedlist.CreateLinkedList;
import com.algorithms.linkedlist.ListNode;

public class ReverseLL {

    public static void main(String[] args) {
        ReverseLL obj = new ReverseLL();
        ListNode head = CreateLinkedList.createLL(1, 2, 3);
        ListNode listNode = obj.reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, 1);
    }

    public ListNode reverse(ListNode head,int count) {
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode tmp = ptr2.next;
        ptr2.next = ptr1;

        if (count == 1) {
            ptr1.next = null;
        }

        if (head.next == null) {
            return head;
        }

        return reverse(tmp,count + 1);
    }
}
