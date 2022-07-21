package com.algorithms.stack;

import java.util.ArrayList;
import java.util.List;

public class ValidateStackSequences {


     class Stack {

        public List<Integer> integerList = new ArrayList<>();

        public void push(int element) {
            integerList.add(element);
        }

        public Integer pop() {
            int length = integerList.size();
            Integer popInt = integerList.get(length - 1);
            integerList.remove(length - 1);
            return popInt;
        }

        public Integer getTop() {
            if (integerList.isEmpty()) {
                return null;
            }
            int length = integerList.size();
            return integerList.get(length - 1);
        }

        public boolean isEmpty() {
            return integerList.size() ==0;
        }
    }


    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack stack = new Stack();
        int j = 0;
        int i = 0;

        while (j < popped.length) {
            if (stack.getTop()!=null && stack.getTop() == popped[j]) {
                j++;
                stack.pop();
            } else {
                if(i>=pushed.length){
                    return false;
                }
                stack.push(pushed[i]);
                i++;
            }
        }

        return stack.isEmpty();
    }
}
