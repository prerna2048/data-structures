package com.algorithms.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Brackets {

    class Stack {

        List<Character> list = new ArrayList<>();
        public  void push(Character el){
            list.add(el);
        }

        public Character pop(){
            Character popEl = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return popEl;
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public boolean isNotEmpty(){
            return list.size() > 0;
        }
    }


    public boolean isValid(String s) {

        List<Character> closedList = new ArrayList<>();
        closedList.add(']');
        closedList.add('}');
        closedList.add(')');

        if(s.length() == 1){
            return false;
        }

        Map<Character,Character> map= new HashMap();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');


        List<Character> openList = new ArrayList<>();
        openList.add('(');
        openList.add('{');
        openList.add('[');



        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openList.contains(c)){
                stack.push(c);
            }else if(stack.isNotEmpty() && c == map.get(stack.pop())){
                continue;
            }else if(stack.isEmpty()){
                return false;
            }
            else {
                return false;
            }
        }
        if(stack.list.size() == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.isValid("(){}}{"));
    }

}