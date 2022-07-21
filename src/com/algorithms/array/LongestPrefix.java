package com.algorithms.array;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        int len = smallestStringLength(strs);

        for (int i = 0; i < len; i++) {
            char charAt = strs[i].charAt(i);
            for (String str : strs) {
                if(str.charAt(i)== charAt){

                }
            }
        }
        return  null;
    }

    private int smallestStringLength(String[] strs) {
        int min = -1;
        for (String str : strs) {
            min = min > str.length() ? min : str.length();
        }
        return min;
    }

    public static void main(String[] args) {
        LongestPrefix longestPrefix = new LongestPrefix();
//        longestPrefix.longestCommonPrefix();
    }
}
