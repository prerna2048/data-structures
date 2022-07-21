package com.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
//    public static int thirdMax(int[] nums) {
//        Integer[] changeArr = new Integer[nums.length];
//
//        Arrays.setAll(changeArr, i -> nums[i]);
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        int max3 = Integer.MIN_VALUE;
//
//        Integer[] newArr = removeDuplicates(nums);
//
//        if (newArr.length == 2) {
//            return Math.max(newArr[0], newArr[1]);
//        } else if (newArr.length == 1) {
//            return newArr[0];
//        }
//
//
//        for (int i = 0; i < newArr.length - 2; i++) {
//            Integer[] maxes = calculateMaxes(newArr[i], newArr[i + 1], newArr[i + 2]);
//
//            max1 = Math.max(maxes[0], max1);
//            max2 = Math.max(maxes[1], max2);
//            max3 = Math.max(maxes[2], max3);
//
//        }
//        return max3;
//    }
//
//    private static Integer[] removeDuplicates(Integer[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0 ; i < nums.length;i++){
//            set.add(nums[i]);
//        }
//        ArrayList<Integer> list = new ArrayList<>(set);
//        return list.toArray(new Integer[list.size()]);
//    }
//
//    private static Integer[] calculateMaxes(int first, int second, int third) {
//        Integer[] arr = new Integer[3];
//        if (first > second && first > third) {
//            arr[0] = first;
//            if (second > third) {
//                arr[1] = second;
//                arr[2] = third;
//            } else {
//                arr[1] = second;
//                arr[2] = third;
//            }
//        } else if (second > first && second > third) {
//            arr[0] = second;
//            if (first > third) {
//                arr[1] = first;
//                arr[2] = third;
//            } else {
//                arr[1] = third;
//                arr[2] = first;
//            }
//        } else {
//            arr[0] = third;
//            if (first > second) {
//                arr[1] = first;
//                arr[2] = second;
//            } else {
//                arr[1] = second;
//                arr[2] = first;
//            }
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        Integer[] nums = {1, 1, 2};
//        System.out.println(ThirdMax.thirdMax(nums));
//    }
}
