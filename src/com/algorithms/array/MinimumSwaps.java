package com.algorithms.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            scanner.nextLine();
            String inputArray = scanner.nextLine();
            int k = scanner.nextInt();
            String s[] = inputArray.split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
//        int[] arr = {2,7,9,5,8,7,4};
//        int k= 7;
            System.out.println(minSwaps(arr, k));
        }


    }

    private static int minSwaps(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while (i < j) {
            if (arr[i] > k && arr[j] <= k) {
                swap(arr, i, j);
                count++;
                i++;
                j--;
            }else {
                if (arr[i] <= k) {
                    i++;
                }
                if (arr[j] > k) {
                    j--;
                }
            }

        }
        return count;
    }

    static private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
