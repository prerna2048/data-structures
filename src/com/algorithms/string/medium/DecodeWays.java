package com.algorithms.string.medium;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i)).append(s.charAt(i + 1));
            int el = Integer.parseInt(sb.toString());
            if (el % 10 == 0 && el / 10 > 3) {
                return 0;
            } else if (el <= 26 && el % 10 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DecodeWays dw = new DecodeWays();
        dw.numDecodings("12");
    }
}
