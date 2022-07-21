package com.algorithms.array;

public class CommonElementsInThreeSortedArray {

    private void commonElemets(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            boolean incrementI = false;
            boolean incrementJ = false;
            boolean incrementK = false;

            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
                continue;
            }

            if (arr1[i] < arr2[j] || arr1[i] < arr3[k]) {
                incrementI = true;
            }

            if (arr2[j] < arr3[k] || arr2[j] < arr1[i]) {
                incrementJ = true;
            }

            if (arr3[k] < arr1[i] || arr3[k] < arr2[j]) {
                incrementK = true;
            }

            if (incrementI) {
                i++;
            }

            if (incrementJ) {
                j++;
            }

            if (incrementK) {
                k++;
            }

            // check out of bound, === case, two equal case.
        }
    }

    public static void main(String[] args) {
        CommonElementsInThreeSortedArray obj = new CommonElementsInThreeSortedArray();
        int[] arr1 = {12, 8, 2, 11, 5, 14, 10};
        int[] arr2 = {12, 8, 2, 11, 5, 14, 10};
        int[] arr3 = {12, 8, 2, 11, 5, 14, 10};

//        System.out.println(obj.commonElemets(arr1, arr2, arr3));
    }
}
