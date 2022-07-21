package com.algorithms.array.medium;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                if (target < nums[0]) {
                    low = mid + 1;
                } else if (target > nums[0]) {
                    high = mid - 1;
                } else {
                    return nums[0];
                }
            } else {
                return nums[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        obj.search(input, 0);
    }
}
