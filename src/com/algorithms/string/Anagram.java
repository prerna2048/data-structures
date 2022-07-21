package com.algorithms.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Integer count = map.get(s.charAt(i));
                map.put(s.charAt(i), ++count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                Integer count = map.get(t.charAt(i));
                map.put(t.charAt(i), --count);
                if (count == 0) {
                    map.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();


    }
}
