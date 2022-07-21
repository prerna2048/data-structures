package com.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0 ;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    Integer count = map.get(nums[i]);
                    map.put(nums[i],++count);
                    if(count >nums.length/2){
                        return nums[i];
                    }
                }else{
                    map.put(nums[i],1);
                }
        }
        return 0;
    }

}
