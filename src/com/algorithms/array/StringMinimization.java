package com.algorithms.array;

public class StringMinimization {

    Stack stack = new Stack();
    Queue queue = new Queue();

    public static void main(String[] args) {
        String input = "aabcccabba";
        StringMinimization obj = new StringMinimization();
        System.out.println(obj.getMinimisedLength(input));
    }

    private int getMinimisedLength(String input) {
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return input.length();
        }

        int min = input.length();
        for (int i = 1; i <= input.length(); i++) {
            String queueString = input.substring(0, i);
            String stackString = input.substring(i);
            stack.pushAll(stackString);
            queue.pushAll(queueString);

            while (stack.getTop() == queue.getFirst()) {
                stack.popAll(stack.getTop());
                queue.popAll(queue.getFirst());
            }
            if (stack.getLength() + queue.getLength() < min) {
                min = stack.getLength() + queue.getLength();
            }
        }
        return min;
    }

}
