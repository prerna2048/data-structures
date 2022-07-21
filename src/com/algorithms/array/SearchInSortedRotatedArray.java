package com.algorithms.array;

public class SearchInSortedRotatedArray {


    public int binarySearchForPivot(int[] arr, int l, int h) {
        int mid = (l + h) / 2;

        if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (arr[mid] > arr[0]) {
            return binarySearchForPivot(arr, mid + 1, h);
        }
        return binarySearchForPivot(arr, 0, mid);
    }

    public int binarySearch(int[] arr, int l, int h, int k) {
        int mid = (l + h) / 2;

        if (arr[mid] == k) {
            return mid;
        }
        if (arr[mid] > k) {
            return binarySearch(arr, l, mid, k);
        }
        return binarySearch(arr, mid + 1, h, k);
    }


    public static void main(String[] args) {
        SearchInSortedRotatedArray obj = new SearchInSortedRotatedArray();
        int[] arr = {3, 4, 5, 6, 1, 2};
        int k = 5;
        int pivot = obj.binarySearchForPivot(arr, 0, arr.length);
        System.out.println("pivot" + pivot);
        System.out.println(searchElement(obj, arr, k, pivot));
    }

    private static int searchElement(SearchInSortedRotatedArray obj, int[] arr, int k, int pivot) {
        if (k == arr[0]) {
            return 0;
        }
        if (k > arr[0]) {
            return obj.binarySearch(arr, 0, pivot + 1, k);
        }
        return obj.binarySearch(arr, pivot + 1, arr.length, k);
    }


}
