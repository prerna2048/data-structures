package com.algorithms.string.medium;

import java.util.HashMap;
import java.util.Map;

public class MinSteps {
    public int minSteps(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            int count = 1;
            if (map.containsKey(key)) {
                count = map.get(key) + 1;
            }
            map.put(s.charAt(i), count);
        }

        int output = 0;
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map.containsKey(key)) {
                Integer count = map.get(key);
                if (count == 0) {
                    output++;
                } else {
                    map.put(key, --count);
                }
            } else {
                output++;
            }
        }
        return output;
    }
}
