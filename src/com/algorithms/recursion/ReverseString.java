package com.algorithms.recursion;

public class ReverseString {

    StringBuilder sb;

    public ReverseString() {
        this.sb = new StringBuilder();
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
    }

    public void reverseString(char[] s) {
        reverse(s, 0);
        s = sb.toString().toCharArray();
        System.out.println(s);
    }


    public void reverse(char[] s, int index) {
        if (index == s.length) {
            return;
        }
        reverse(s, index + 1);
        sb.append(s[index]);
    }

}
