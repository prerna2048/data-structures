package com.algorithms.array;

import java.util.HashSet;

public class CountTriplets {

    int countTriplet(int arr[], int n) {
        // code here

        HashSet<Integer> set = createSet(arr);
        int count = 0;
        for(int i= 0 ; i<Math.ceil(arr.length/2); i++){
            for(int j=i+1; j<arr.length; j++){
                if(set.contains(Math.abs(arr[i]-arr[j]))){
                    count++;
                }
            }
        }

       return count;

    }

    private HashSet<Integer> createSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int el : arr) {
            set.add(el);
        }
        return set;
    }

    public static void main(String[] args) {
        CountTriplets obj = new CountTriplets();
        int[] arr = {12, 8, 2, 11, 5, 14, 10};
        System.out.println(obj.countTriplet(arr,7));
    }
}
