package com.algorithms.string;

public class HayStackNeedle {
    public int strStr(String haystack, String needle) {
        int length2 = 0;
        int index = 0;
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(length2)) {
                index = i;
                length2++;
                if (length2 == needle.length()) {
                    return index - needle.length() + 1;
                }
            } else {
                i = i - length2;
                length2 = 0;
            }
        }
        return -1;
    }
}
