package com.algorithms.string.medium;

public class RepeatedStringMatch {

    public int repeatedStringMatch(String a, String b) {
        if (b.equals("")) {
            return 0;
        }
        boolean found = false;
        int count = 1;
        StringBuilder sb = new StringBuilder(a);
        while (!found) {
            if (count > 1 && sb.toString().length() > 2 * b.length()) {
                return -1;
            }
            if (sb.toString().contains(b)) {
                found = true;
            } else {
                sb.append(a);
                count++;
            }

        }

        return count;
    }

    //optimised
    public int repeatedStringMatch2(String a, String b) {
        if (b.equals("")) {
            return 0;
        }
        int count = 1;
        StringBuilder sb = new StringBuilder(a);
        int i = a.indexOf(b.charAt(0));

        int j = 0;
        while (j < b.length()) {
            if (sb.toString().charAt(i) != b.charAt(j)) {
                return -1;
            }
            if (((i + 1) % a.length()) == 0) {
                sb.append(a);
                count++;
            }

            j++;
            i++;
        }

        return count;
    }


    public static void main(String[] args) {
        RepeatedStringMatch rrp = new RepeatedStringMatch();
        rrp.repeatedStringMatch2("a",
                "aa");
    }
}
