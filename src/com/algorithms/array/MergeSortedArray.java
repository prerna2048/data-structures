package com.algorithms.array;

import java.util.Arrays;
import java.util.HashSet;

public class MergeSortedArray {
    int[] merge(int arr1[], int arr2[], int n, int m)
    {
        // code here
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[n+m];


        while(i< n || j< m){
            if ( i == n ) {
                arr3[k] = arr2[j];
                j++;
            }
            else if ( j == m ) {
                arr3[k] = arr1[i];
                i++;
            }else {
                if( arr1[i] < arr2[j] )
                {
                    arr3[k] = arr1[i];
                    i++;
                }else if(arr2[j] <arr1[i] ){
                    arr3[k] = arr2[j];
                    j++;
                }else{
                    arr3[k] = arr1[i];
                    i++;
                    j++;
                }
            }
            k++;
        }
        return arr3;
    }


    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        System.out.println(Arrays.toString(obj.merge(arr1,arr2,4,5)));
    }
}
