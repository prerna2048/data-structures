package com.algorithms.array;

import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[] arr= {0, 1, 9, 8, 4, 0, 0, 2,
                7, 0, 6, 0, 9};
        int n = arr.length;
        MoveZerosEnd.moveZerosToEnd(arr,n);
        System.out.println(Arrays.toString(arr));
    }


    static void moveZerosToEnd(int arr[], int n) {

        int j;
        for(int i =0; i<n-1 ;i++){
            if(arr[i] ==0){
                j= i+1;
                while(arr[j] == 0){
                    j++;
                    if(j == n){
                        return;
                    }
                }
                swap(arr, i,j);
            }
        }
    }

    static private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
