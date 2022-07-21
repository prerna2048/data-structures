package com.practice;

import java.util.*;


public class Node {

    Node next;
    Integer value;

    public Node(Node next, Integer value) {
        this.next = next;
        this.value = value;
    }

    static <T> LinkedList<T> createLinkedList(T...elements){
        LinkedList<T> inputList = new LinkedList<T>();
        for(T el: elements){
            inputList.add(el);
        }
        return inputList;
    }

    public static void main(String[] args) {
        List<Node> inputList = createLinkedList();
        Set<Node> setOfElements= new HashSet<>();

        Node node = inputList.get(0);
        while(node!= null){
//            if(existsInSet(node)){
//                break;
//            }else{
//                setOfElements.add(node);
//            }
            node = node.next;
        }

        System.out.println("No loop present");
    }




}

