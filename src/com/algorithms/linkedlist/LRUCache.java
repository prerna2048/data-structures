package com.algorithms.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

    Map<Integer, Integer> lruMap = new HashMap<>();
    LinkedList<Integer> ll = new LinkedList<>();

    int count;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    private int findElementIndex(int key) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public int get(int key) {
        if (lruMap.containsKey(key)) {
            int index = findElementIndex(key);
            ll.remove(index);
            ll.add(key);
            return lruMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (count < capacity) {
            if (lruMap.containsKey(key)) {
                int index = findElementIndex(key);
                ll.remove(index);
                lruMap.remove(key);
            }
        } else {
            int head = ll.get(0);
            lruMap.remove(head);
            ll.remove(0);
        }
        ll.add(key);
        lruMap.put(key, value);
        count++;
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }


}