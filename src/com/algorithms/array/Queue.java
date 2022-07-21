package com.algorithms.array;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Queue {

    public List<Character> charList = new LinkedList<>();

    public void pushAll(String characters) {
        charList = characters.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

    }

    public Character pop() {
        Character popChar = charList.get(0);
        charList.remove(0);
        return popChar;
    }


    public void popAll(char element) {
        if(charList.isEmpty()){
            return;
        }
        Character firstChar = charList.get(0);
        while(firstChar == element){
            pop();
            if(charList.isEmpty()){
                return;
            }
            firstChar = charList.get(0);
        }
    }

    public int getLength() {
        return charList.size();
    }

    public Character getFirst() {
        if(charList.isEmpty()){
            return  null;
        }
        return charList.get(0);
    }
}
