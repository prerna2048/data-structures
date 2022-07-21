package com.algorithms.array;

import java.util.*;

public class LongestSubStringCorrect {

    private  Map<Integer, Integer> asciiMap = new LinkedHashMap<>();

    public  int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0, longest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!asciiMap.containsKey((int) s.charAt(i))) {
                asciiMap.put((int) (s.charAt(i)), i);
                longest++;
            } else {
                max = Math.max(longest, max);
                removeAllBeforeIndex((s.charAt(i)));
                asciiMap.put((int) (s.charAt(i)), i);
                longest = asciiMap.size();
            }
        }
        if (max == 0) {
            return longest;
        }
        return Math.max(longest, max);
    }

    private  void removeAllBeforeIndex(int mapKey) {
        for(Iterator<Integer> iterator = asciiMap.keySet().iterator(); iterator.hasNext(); ) {
            Integer key = iterator.next();
            iterator.remove();
            if(key == mapKey) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        LongestSubStringCorrect obj = new LongestSubStringCorrect();
        System.out.println(obj.lengthOfLongestSubstring("aab"));
    }
}

