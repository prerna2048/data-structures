package com.algorithms.array;

//Even number followed by odd numbers
public class SortByParity {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        int i = 0;
        int j =1;
        int temp =0;
        while(i<n && j<n){
            if(isOdd(A[i]) && isEven(A[j])){
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                i++;
                j++;
            } else {
                if(isEven(A[i])){
                    i++;
                } if(isOdd(A[j])){
                    j++;
                }
            }
        }

        return A;
    }


    private boolean isOdd(int element){
        return element% 2 !=0;
    }

    private boolean isEven(int element){
        return element% 2 ==0;
    }

    public static void main(String[] args) {
        SortByParity obj = new SortByParity();
        int[] input = {0, 2, 1};
        obj.sortArrayByParity(input);
    }
}
