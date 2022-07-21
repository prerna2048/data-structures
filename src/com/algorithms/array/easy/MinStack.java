package com.algorithms.array.easy;

import java.util.*;

class MinStack {

    List<Integer> stackList;
    List<Integer> sortedList;
    int length;

    public MinStack() {
        stackList = new ArrayList<>();
        length = stackList.size();
        sortedList = new LinkedList<>();
    }

    public void push(int val) {
        stackList.add(val);
        length++;
    }

    // pop and top always on non empty stacks
    public void pop() {
        stackList.remove(length - 1);
        length--;

    }

    public int top() {
        return stackList.get(length - 1);
    }

//    public int getMin() {
//    }


}