package com.algorithms.linkedlist.easy;

import com.algorithms.linkedlist.ListNode;

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode ptr3 = null;
        ListNode head = null;

        while (ptr1 != null && ptr2 != null) {
            if (ptr3 == null) {
                ptr3 = new ListNode();
                head = ptr3;
            } else {
                ptr3 = new ListNode();
            }
            if (ptr1 == null) {
                ptr3.val = ptr2.val;
                ptr2 = ptr2.next;
            } else if (ptr2 == null) {
                ptr3.val = ptr1.val;
                ptr1 = ptr1.next;
            } else if (ptr1.val <= ptr2.val) {
                ptr3.val = ptr1.val;
                ptr1 = ptr1.next;
            } else {
                ptr3.val = ptr2.val;
                ptr2 = ptr2.next;
            }
        }


        return head;


    }
}
