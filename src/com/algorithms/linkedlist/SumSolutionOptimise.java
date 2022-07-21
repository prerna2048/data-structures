package com.algorithms.linkedlist;

class SumSolutionOptimise {

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode begin = null;
        ListNode prev = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            ListNode newNode = new ListNode();
            int digitSum = val1 + val2 + carry;
            if (digitSum / 10 > 0) {
                newNode.val = digitSum % 10;
                carry = 1;
            } else {
                newNode.val = digitSum;
                carry = 0;
            }
            if (begin == null) {
                begin = newNode;
                prev = newNode;
            } else {
                prev.next = newNode;
                prev = newNode;
            }
            l1 = l1== null? null: l1.next;
            l2 = l2== null? null: l2.next;
        }
        if (carry != 0) {
            ListNode newNode = new ListNode();
            newNode.val = 1;
            prev.next = newNode;
        }
        return begin;
    }

    private static ListNode createLL(int val1, int val2, int val3, int val4, int val5, int val6, int val7, int val8, int val9, int val10) {
        ListNode begin;

        ListNode newNode1 = new ListNode();
        newNode1.val = val1;
        begin = newNode1;

        ListNode newNode2 = new ListNode();
        newNode2.val = val2;
        newNode1.next = newNode2;

        ListNode newNode3 = new ListNode();
        newNode3.val = val3;
        newNode2.next = newNode3;

        ListNode newNode4 = new ListNode();
        newNode4.val = val4;
        newNode3.next = newNode4;

        ListNode newNode5 = new ListNode();
        newNode5.val = val5;
        newNode4.next = newNode5;

        ListNode newNode6 = new ListNode();
        newNode6.val = val6;
        newNode5.next = newNode6;

        ListNode newNode7 = new ListNode();
        newNode7.val = val7;
        newNode6.next = newNode7;

        ListNode newNode8 = new ListNode();
        newNode8.val = val8;
        newNode7.next = newNode8;

        ListNode newNode9 = new ListNode();
        newNode9.val = val9;
        newNode8.next = newNode9;

        ListNode newNode10 = new ListNode();
        newNode10.val = val10;
        newNode9.next = newNode10;

        return begin;
    }

    private static ListNode createOneNodeLL(int val1) {
        ListNode begin;

        ListNode newNode1 = new ListNode();
        newNode1.val = val1;
        begin = newNode1;

        return begin;
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(createOneNodeLL(9), createLL(1, 9, 9, 9, 9, 9, 9, 9, 9, 9)));
    }

}
