package com.ai.easy;

import java.util.*;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        if(nums.length == 1)
            return(nums[0]);
        
        int maxCount = 0;
        int maxVal = nums[0];
            
        for(int i=0; i<nums.length; i++ ) {
            if(count.containsKey(new Integer(nums[i]))) {
                int existingCount = count.get(new Integer(nums[i])).intValue();
                count.put(new Integer(nums[i]), existingCount +1);
                if(existingCount + 1 > maxCount) {
                    maxCount = existingCount + 1;
                    maxVal = nums[i];
                }
            }
            else {
                count.put(new Integer(nums[i]), new Integer(1));
            }
        }
        return(maxVal);
    }
}
