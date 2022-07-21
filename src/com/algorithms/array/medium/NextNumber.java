package com.algorithms.array.medium;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class NextNumber {

    public void nextPermutation(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = nums.length - 2; i > 0; i--) {
//                if(isGreaterDigit(Set<Integer>,i)){
//
//                }
        }
    }

    public static void main(String[] args) {
        NextNumber nn = new NextNumber();
        int[] input = {1, 2, 3};
        nn.nextPermutation(input);
    }
}
