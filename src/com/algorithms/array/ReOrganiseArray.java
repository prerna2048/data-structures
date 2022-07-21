package com.algorithms.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReOrganiseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            scanner.nextLine();
            String inputArray = scanner.nextLine();
            String s[] = inputArray.split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            reOrganise(arr);
            System.out.println(Arrays.toString(arr));
        }


    }

    private static void reOrganise(int[] arr) {
        int i = 0;
        for (int el : arr) {
            if (el != -1 && arr[el] != el) {
                recursiveCalls(el, arr, i);
            }
            i++;
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
    }

    static void recursiveCalls(int el, int[] arr, int startIndex) {
        if (arr[el] == -1 || el == startIndex || arr[el] == el) {
            arr[el] = el;
            return;
        }

        recursiveCalls(arr[el], arr, startIndex);
        arr[el] = el;

    }
}
