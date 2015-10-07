package com.ai.medium;

import java.util.*;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        if(nums.length == 0 )
            return(0);
        
        if(nums.length <= 2)
            return(nums[0]);
        
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(count.containsKey(nums[i])) {
                count.remove(new Integer(nums[i]));
            }
            else {
                count.put(new Integer(nums[i]), new Integer(0));
            }
        }
        
        Object[] res = count.keySet().toArray();
        Integer result = (Integer)res[0];
        int val = result.intValue();
        
        return(val);
    }
}
