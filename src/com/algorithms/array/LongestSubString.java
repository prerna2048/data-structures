package com.algorithms.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    private static Set<Integer> asciiSet = new HashSet<>();
    private static Set<Integer> uniqueLengths = new HashSet<>();

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!asciiSet.contains((int) s.charAt(i))) {
                asciiSet.add((int) (s.charAt(i)));
                longest++;
            } else {
                uniqueLengths.add(longest);
                longest = 0;
                asciiSet.clear();
                asciiSet.add((int) (s.charAt(i)));
                longest++;
            }
        }
        uniqueLengths.add(longest);
        return Collections.max(uniqueLengths);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}

