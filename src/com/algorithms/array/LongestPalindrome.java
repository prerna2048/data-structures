package com.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    private Map<Integer, Character> charsMap = new HashMap<>();
    private char[] charsList = new char[1000];
    int maxPDLength = 1;
    String palindrome;

    public String longestPalindrome(String s) {
        if(s.isEmpty()){
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (charsMap.containsValue(s.charAt(i))) {
                charsMap.put(i, s.charAt(i));
                charsList[i] = s.charAt(i);
                checkAndUpdatePD(i, s.charAt(i));
            } else {
                charsMap.put(i, s.charAt(i));
                charsList[i] = s.charAt(i);
            }
        }
        if (maxPDLength == 1) {
            return Character.toString(s.charAt(0));
        }
        return palindrome;
    }

    private void checkAndUpdatePD(int i, char charAt) {
        for (Map.Entry<Integer, Character> entry : charsMap.entrySet()) {
            if (entry.getValue().equals(charAt)) {
                if (((i - entry.getKey()) + 1) > maxPDLength) {
                    update(entry.getKey(), i);
                }
            }
        }
    }

    void update(int first, int last) {
        int i = first;
        int j = last;
        int count = 0;
        int val = ((last - first + 1) / 2) == 0 ? ((last - first + 1) / 2) : ((last - first + 2) / 2);
        char[] tempPD = new char[last - first + 1];
        while (i <= j) {
            if (charsList[i] == charsList[j]) {
                count++;
                tempPD[i - first] = charsList[i];
                tempPD[j - first] = charsList[i];
                i++;
                j--;
            } else {
                break;
            }
        }
        if (count == val) {
            palindrome = String.valueOf(tempPD);
            maxPDLength = last - first + 1;
        }

    }

    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();
        obj.longestPalindrome("");
        System.out.println(obj.palindrome);
    }
}
