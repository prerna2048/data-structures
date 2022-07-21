package com.algorithms.string.medium;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String numAsString = countAndSay(n - 1);

        String output = null;
        int i = numAsString.length() - 1;
        while (i != -1) {
            char digit = numAsString.charAt(i);
            int count = 0;
            while (i >= 0 && numAsString.charAt(i) == digit) {
                count++;
                i--;
            }

            String concatStr = String.valueOf(count) + digit;
            output = output == null ? concatStr : concatStr + output;
        }
        return output;
    }


    public static void main(String[] args) {
        CountAndSay cs = new CountAndSay();
        cs.countAndSay(4);
    }
}
