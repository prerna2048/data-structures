package com.algorithms.array.medium;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ThreeSum {

    //O(n2) with extra space
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int index = 0;
        for (int num : nums) {
            map.put(num, index);
            index++;
        }
        List<List<Integer>> ouputList = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                boolean isThirdUniqueIndex;
                if (map.containsKey(0 - (nums[i] + nums[j]))) {
                    Integer thirdElementIndex = map.get(0 - (nums[i] + nums[j]));
                    isThirdUniqueIndex = thirdElementIndex != i && thirdElementIndex != j;
                } else {
                    continue;
                }
                if (isThirdUniqueIndex && !alreadyCapturedInAnswer(ouputList, nums[i], nums[j])) {
                    ouputList.add(asList(nums[i], nums[j], 0 - (nums[i] + nums[j])));
                }
            }
        }
        return ouputList;
    }

    private boolean alreadyCapturedInAnswer(List<List<Integer>> outputList, int num, int num1) {
        List<Integer> tripletList = asList(num, num1, 0 - (num + num1));
        Collections.sort(tripletList);
        for (List<Integer> list : outputList) {
            Collections.sort(list);
            if (list.equals(tripletList)) {
                return true;
            }
        }
        return false;
    }


    public List<List<Integer>> threeSum2(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        if (numsList.isEmpty() || numsList.size() < 3) {
            return Collections.emptyList();
        }
        Collections.sort(numsList);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsList.get(i);
        }

        List<List<Integer>> ouputList = new ArrayList<>();

        int l, h;
        for (int i = 0; i < nums.length - 2; i++) {
            l = i + 1;
            h = nums.length - 1;

            while (l < h) {

                if (nums[i] + nums[l] + nums[h] == 0) {
                    if (!alreadyCapturedInAnswer(ouputList, nums[i], nums[l])) {
                        ouputList.add(asList(nums[i], nums[l], nums[h]));
                    }
                    l++;
                    h--;
                } else if (nums[i] + nums[l] + nums[h] < 0) {
                    l++;
                } else if (nums[i] + nums[l] + nums[h] > 0) {
                    h--;
                }

            }
        }
        return ouputList;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] input = {-1, 0, 1, 2, -1, -4};
        threeSum.threeSum2(input);
    }
}
