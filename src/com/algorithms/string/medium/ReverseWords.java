package com.algorithms.string.medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String s) {

        List<String> inputs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                if (i != 0 && !Character.isWhitespace(s.charAt(i - 1))) {
                    inputs.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        if (!Character.isWhitespace(s.charAt(s.length() - 1))) {
            inputs.add(sb.toString());
        }

        StringBuilder output = new StringBuilder(inputs.get(inputs.size() - 1));
        for (int i = inputs.size() - 2; i >= 0; i--) {
            output.append(" ").append(inputs.get(i));
        }

        return output.toString();
    }

    //other optimised way
    public String reverseWords2(String s) {

        int i = 0, j = 0;
        boolean swap = false;
        while (j < s.length()) {
            if (Character.isWhitespace(s.charAt(j)) && !Character.isWhitespace(s.charAt(j - 1))) {
                swapWord(i, j - 1, s);
                swap = true;
            } else if (swap && Character.isWhitespace(s.charAt(j))) {
                s = s.substring(0, j - 1)
                        + ";"
                        + s.substring(j + 1 + 1);
            } else if (swap && !Character.isWhitespace(s.charAt(j))) {
                i = j;
                swap = false;
            }
            j++;
        }

        return null;
    }

    boolean swapWord(int i, int j, String s) {
        return false;
    }


    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        rw.reverseWords("the sky is blue");
    }
}
