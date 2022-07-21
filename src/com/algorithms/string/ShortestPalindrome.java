package com.algorithms.string;

public class ShortestPalindrome {

    public String shortestPalindrome(String s) {

        int j = s.length() - 1;
        int k = 0;
        String newStr = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
                continue;
            } else {
                k = s.length() - 1 - j;
                newStr = createNew(s, k, s.charAt(j));
                s = newStr;
            }
        }

        return s;
    }

    private String createNew(String s, int k, char newChar) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(k, newChar);
        return stringBuilder.toString();
    }


}
