package com.algorithms.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int arrSum = 0 ;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            arrSum = arrSum + nums[i];
        }

        int setSum =0;
        for(Integer el : set){
            setSum = setSum+el;
        }

        int s1 = arrSum - setSum;
        return arrSum - 2*s1;
    }
}
