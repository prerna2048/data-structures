package com.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class RearrayPostiveAlternateNegativeumbers {
    public static void main(String[] args) {

    }


    void rearrange(int arr[], int n) {
        // code here
        int j;
        int k;
        int sign;
        for (int i = 0; i < n - 1; i++) {
            if (!diffSign(arr, i, i + 1)) {
                k = i + 1;
                j = i + 2;
                if (arr[k] >= 0) sign = 1;
                else sign = -1;

                if (arr[k] == 0) {
                    while (arr[j] > 0) {
                        if (j == n - 1) {
                            return; // return from func.
                        }
                        j++;
                    }
                    swap(arr, k, j);
                } else {
                    while (arr[j] * sign > 0) {
                        if (j == n - 1) {
                            return; // return from func.
                        }
                        j++;
                        if (j != n && arr[j] == 0 && sign == -1) {
                            swap(arr, k, j);
                            break;
                        }
                    }
                    swap(arr, k, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean diffSign(int[] arr, int i, int j) {
        return (arr[i] * arr[j] < 0) || (arr[i] == 0 && arr[j] < 0) || (arr[j] == 0 && arr[i] < 0);
    }
}
