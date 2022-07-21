package com.algorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stack {

    public List<Character> charList = new ArrayList<>();
    public List<Integer> integerList = new ArrayList<>();

    public void pushAll(String characters) {
        charList = characters.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }

    public void push(Character ch) {
        charList.add(ch);
    }

    public void pushInt(int element) {
        integerList.add(element);
    }

    public Integer popInt() {
        int length = integerList.size();
        Integer popInt = integerList.get(length - 1);
        integerList.remove(length - 1);
        return popInt;
    }

    public boolean isEmpty() {
        return charList.size() == 0;
    }

    public Character pop() {
        int length = charList.size();
        Character popChar = charList.get(length - 1);
        charList.remove(length - 1);
        return popChar;
    }



    public void popAll(char element) {
        if (charList.isEmpty()) {
            return;
        }
        int length = charList.size();
        Character topChar = charList.get(length - 1);
        while (topChar == element) {
            pop();
            if (charList.isEmpty()) {
                return;
            }
            length = charList.size();
            topChar = charList.get(length - 1);
        }


    }


    public int getLength() {
        return charList.size();
    }

    public Character getTop() {
        if (charList.isEmpty()) {
            return null;
        }
        int length = charList.size();
        return charList.get(length - 1);
    }

    public Integer getIntStackTop() {
        if (integerList.isEmpty()) {
            return null;
        }
        int length = integerList.size();
        return integerList.get(length - 1);
    }


    public boolean isIntStackEmpty() {
        return integerList.size() ==0;
    }
}
