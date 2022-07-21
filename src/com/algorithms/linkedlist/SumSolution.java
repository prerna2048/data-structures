package com.algorithms.linkedlist;

import java.util.List;

class SumSolution {

    static class Stack {
        public int[] arr = new int[10000000];
        public int length = 0;

        void push(int number) {
            arr[length] = number;
            length++;
        }

        int pop() {
            return arr[--length];
        }
    }

    private static Stack convertStack(ListNode listNode) {
        Stack stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        return stack;
    }

    static private long convertToNumber(Stack stack) {
        long convertedNum = 0;
        int n = stack.length;
        for (int i = 0; i < n; i++) {
            long individualNum = (long) (stack.pop() * (Math.pow(10d, (double) stack.length)));
            convertedNum = convertedNum + individualNum;
        }
        return convertedNum;
    }

    static ListNode convertNumToLL(long num) {
        ListNode begin = null;
        ListNode prev = null;
        while (num / 10 != 0) {
            ListNode currNode = new ListNode();
            currNode.val = (int)(num % 10);
            if (begin == null) {
                begin = currNode;
                prev = currNode;
            } else {
                prev.next = currNode;
                prev = currNode;
            }
            num = num / 10;
        }
        ListNode currNode = new ListNode();
        currNode.val = (int) num % 10;
        if (prev == null) {
            begin = currNode;
        } else {
            prev.next = currNode;
        }
        return begin;
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack stackL1 = convertStack(l1);
        Stack stackL2 = convertStack(l2);

        long numL1 = convertToNumber(stackL1);
        long numL2 = convertToNumber(stackL2);

        System.out.println("num "+ numL1+"num "+numL2);

        long output = numL1 + numL2;
        return convertNumToLL(output);
    }

    private static ListNode createLL(int val1, int val2, int val3,int val4, int val5,int val6, int val7, int val8,int val9, int val10) {
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
        System.out.println(addTwoNumbers(createOneNodeLL(9), createLL(1,9,9,9,9,9,9,9,9,9)));
    }

}
