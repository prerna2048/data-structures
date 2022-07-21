package com.algorithms.string.medium;

//Easy
public class CompareRevisions {
    public int compareVersion(String version1, String version2) {

        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");

        int version1Len = version1Arr.length;
        int version2Len = version2Arr.length;

        int maxLen = Math.max(version1Len, version2Len);

        int firstEl;
        int secondEl;
        for (int i = 0; i < maxLen; i++) {
            if (i > version1Len - 1) {
                firstEl = 0;
                secondEl = Integer.parseInt(version2Arr[i]);
            } else if (i > version2Len - 1) {
                firstEl = Integer.parseInt(version1Arr[i]);
                secondEl = 0;
            } else {
                firstEl = Integer.parseInt(version1Arr[i]);
                secondEl = Integer.parseInt(version2Arr[i]);
            }
            if (firstEl > secondEl) {
                return 1;
            } else if (firstEl < secondEl) {
                return -1;
            }
        }


        return 0;
    }
}
