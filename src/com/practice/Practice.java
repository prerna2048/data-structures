package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    private String name;
    private String rollNo;

    private Practice(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    private static final List<String> myList = new ArrayList<String>() {{
        add("foo");
        add("bar");
    }};


    public static List getMyList() { return Arrays.asList("foo","bar"); }

    public static String sampleMethod() {
        getMyList().add("Hello people");
        getMyList().add("Hello mates");

        getMyList().remove(0);


        return "Practice{}";
    }

    private static void printMyList() {
        System.out.println(getMyList().toArray().toString());

    }

    public static void main(String[] args) {
        sampleMethod();
        printMyList();

    }
}
