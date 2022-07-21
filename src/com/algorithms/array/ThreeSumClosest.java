package com.algorithms.array;

import java.util.*;

import static java.lang.Math.abs;

public class ThreeSumClosest {


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i, j;
        int minTargetDiff = Integer.MAX_VALUE;
        int output = 0;
        for (int k = 0; k < nums.length; k++) {
            i = k+1;
            j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (abs(sum - target) < abs(minTargetDiff)) {
                    minTargetDiff = sum - target;
                    output = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return output;
    }


    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(obj.threeSumClosest(nums, target));
    }
}
