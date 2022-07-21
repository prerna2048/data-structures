package com.algorithms.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber {

    Map<Integer, String> phnNumbMap = new HashMap<Integer, String>() {{
        put(2, "abc");
        put(3, "def");
        put(4, "ghi");
        put(5, "jkl");
        put(6, "mno");
        put(7, "pqrs");
        put(8, "tuvw");
        put(9, "xyz");
    }};

//    public List<String> letterCombinations(String digits) {
//        List<String> output = new ArrayList<>();
//        List<String> temp = new ArrayList<>();
//        for (int i = 0; i < digits.length(); i++) {
//            int digit = digits.charAt(i);
//            String numStr = phnNumbMap.get(digit);
//            temp.add(phnNumbMap.get(numStr));
//        }
//
////        for(int)
//    }
}
