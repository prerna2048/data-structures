package com.algorithms.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        int pivot = numRows + (numRows - 2);
        Map<Integer, String> zigzagMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int index = i % pivot;
            if (index > numRows - 1) {
                index = pivot - index;
            }
            String newString = zigzagMap.get(index) != null ? zigzagMap.get(index) + s.charAt(i) : String.valueOf(s.charAt(i));
            zigzagMap.put(index, newString);
        }

        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            outputBuilder.append(zigzagMap.get(i));
        }

        return outputBuilder.toString();

    }

    public static void main(String[] args) {
        ZigzagConversion obj = new ZigzagConversion();
        obj.convert("PAYPALISHIRING", 3);
    }


}
