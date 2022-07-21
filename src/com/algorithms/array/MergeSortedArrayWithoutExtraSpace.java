package com.algorithms.array;

import java.util.Arrays;

public class MergeSortedArrayWithoutExtraSpace {
    int[] merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i = 0;
        while (i < n) {
            if (arr2[0] < arr1[i]) {
                swap(arr1, arr2, i);
                placeInt(arr2);
            }
            i++;
        }


        return arr2;
    }

    private void placeInt(int[] arr2) {
        int element = arr2[0];
        if(arr2[0] < arr2[1]){
            return;
        }
        arr2[0] = arr2[1];
        int j = 1;
        while (j < arr2.length-1) {
            if (element > arr2[j] && element < arr2[j + 1]) {
                arr2[j] = element;
                break;

            }
            arr2[j] = arr2[j + 1];
            j++;
        }
    }


    private void swap(int[] arr1, int[] arr2, int i) {
        int temp;
        temp = arr1[i];
        arr1[i] = arr2[0];
        arr2[0] = temp;
    }


    public static void main(String[] args) {
        MergeSortedArrayWithoutExtraSpace obj = new MergeSortedArrayWithoutExtraSpace();
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        System.out.println(Arrays.toString(obj.merge(arr1, arr2, 4, 5)));
    }
}
