package com.algorithms.string.medium;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (k < s3.length()) {
            if (i < s1.length() && s3.charAt(k) == s1.charAt(i)) {
                while(s3.charAt(k) == s1.charAt(i)){
                    i++;
                    k++;
                }
            } else if (j < s2.length() && s3.charAt(k) == s2.charAt(j)) {
                while(s3.charAt(k) == s2.charAt(i)){
                    j++;
                    k++;
                }
            } else {
                return false;
            }
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        InterleavingString is = new InterleavingString();
        is.isInterleave("aabcc",
                "dbbca",
                "aadbbcbcac");
    }
}
