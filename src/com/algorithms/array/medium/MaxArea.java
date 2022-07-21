package com.algorithms.array.medium;

//O(n2)
public class MaxArea {
    int max = 0;
    int l, b;

    public int maxArea(int[] height) {
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                l = Math.min(height[i], height[j]);
                b = j - i;
                if (l * b > max) {
                    max = l * b;
                }
            }
        }
        return max;
    }

    //optimised apporach O(n)
    public int maxArea2(int[] height) {
        int l, b;
        int i = 0;
        int j = height.length -1;

        while (i < j) {
            l = Math.min(height[i], height[j]);
            b = j - i;
            if (l * b > max) {
                max = l * b;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        int [] input = {1,8,6,2,5,4,8,3,7};
        maxArea.maxArea2(input);
    }
}
