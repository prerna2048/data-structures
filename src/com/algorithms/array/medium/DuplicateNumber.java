package com.algorithms.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);

        int i =0;
        int j = list.size()-1;

        int mid;
        while(i<j){ //==?
            mid = (i +j)/2;
            if(list.get(mid)  )

        }

        return 0;
    }


    public static void main(String[] args) {

    }

}
