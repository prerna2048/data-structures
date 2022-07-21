package com.algorithms.linkedlist.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpligyPath {


    class Stack {

        public List<String> stringList = new ArrayList<>();


        public void push(String s) {
            if (s.isEmpty()) {
                return;
            }
            stringList.add(s);
        }


        public String pop() {
            if (stringList.isEmpty()) {
                return null;
            }
            int length = stringList.size();
            String popStr = stringList.get(length - 1);
            stringList.remove(length - 1);
            return popStr;
        }


        public int getLength() {
            return stringList.size();
        }


    }

    public String simplifyPath(String path) {
        String newPath = path.replaceAll("//", "/");
        String[] inputArr = newPath.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < inputArr.length; i++) {
            String str = inputArr[i];
            if ("..".equals(str)) {
                stack.pop();
            } else if (!".".equals(str)) {
                stack.push(str);
            }
        }

        StringBuilder output = new StringBuilder();
        for (String str : stack.stringList) {
            output.append("/").append(str);
        }
        return output.toString().isEmpty() ? "/": output.toString();
    }

    public static void main(String[] args) {
        SimpligyPath sp = new SimpligyPath();
        sp.simplifyPath("/home/");
    }
}
