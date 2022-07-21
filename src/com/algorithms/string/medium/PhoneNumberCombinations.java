package com.algorithms.string.medium;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class PhoneNumberCombinations {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        Map<Integer, String> map = new HashMap() {{
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }};

        int input = Integer.valueOf(digits);

        List<String> outputList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();

        boolean inProgress = true;

        while (inProgress) {
            int currDig = input % 10;
            String currStr = map.get(currDig);
            if (outputList.isEmpty()) {
                outputList = currStr.chars().mapToObj(el -> String.valueOf((char) el)).collect(Collectors.toList());
            } else {
                for (char ch : currStr.toCharArray()) {
                    for (String str : outputList) {
                        tempList.add(ch + str);
                    }
                }
                outputList = new ArrayList<>(tempList);
                tempList.clear();
            }
            input = input / 10;
            if (input == 0) {
                inProgress = false;
            }

        }

        return outputList;
    }

    public static void main(String[] args) {
        PhoneNumberCombinations ph = new PhoneNumberCombinations();
        ph.letterCombinations("23");
    }
}
