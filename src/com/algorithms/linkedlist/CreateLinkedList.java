package com.algorithms.linkedlist;

public class CreateLinkedList {

    public static void main(String[] args) {
        createLL(2,4 ,3 );


    }

    public static ListNode createLL(int val1, int val2, int val3) {
        ListNode begin;

        ListNode newNode1  = new ListNode();
        newNode1.val = val1;
        begin = newNode1;

        ListNode newNode2  = new ListNode();
        newNode1.val = val2;
        newNode1.next = newNode2;

        ListNode newNode3  = new ListNode();
        newNode1.val = val3;
        newNode2.next = newNode3;
        return begin;
    }
}
