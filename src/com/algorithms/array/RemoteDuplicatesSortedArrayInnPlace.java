package com.algorithms.array;

public class RemoteDuplicatesSortedArrayInnPlace {


    int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int j, count;
        int finalArraySize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE) {
                break;
            }
            if (i + 1 >= nums.length) {
                finalArraySize++;
                break;
            }
            if (nums[i] == nums[i + 1]) {
                j = i;
                count = 0;
                while (nums[j] == nums[j + 1]) {
                    count++;
                    j++;
                    if (j + 1 >= nums.length) {
                        break;
                    }
                }
                shiftArrayByCount(nums, count, i + 1);
            }
            finalArraySize++;
        }
        return finalArraySize;
    }

    private void shiftArrayByCount(int[] nums, int count, int startIndex) {
        int i = startIndex;
        while (i < nums.length) {
            if (i + count >= nums.length) {
                nums[i] = Integer.MIN_VALUE;
            } else {
                nums[i] = nums[i + count];
            }
            i++;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0};
        RemoteDuplicatesSortedArrayInnPlace obj = new RemoteDuplicatesSortedArrayInnPlace();
        System.out.println(obj.removeDuplicates(nums));
    }


}

