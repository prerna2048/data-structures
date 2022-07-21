package com.algorithms.string.medium;

public class DecodeAtIndex {
    public String decodeAtIndex(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int val = Integer.parseInt(String.valueOf(ch));
                StringBuilder sb2 = new StringBuilder(sb.toString());
                while (val > 1) {
                    sb.append(sb2);
                    val--;
                }
            } else {
                sb.append(ch);
            }
            if (sb.toString().length() >= k) {
                return String.valueOf(sb.toString().charAt(k - 1));
            }
        }
        return null;

    }

    public static void main(String[] args) {
        DecodeAtIndex di = new DecodeAtIndex();
        di.decodeAtIndex("leet2code3", 10);
    }
}
