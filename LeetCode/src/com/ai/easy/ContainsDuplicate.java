package com.ai.easy;

import java.util.*;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1)
            return(false);
            
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer entry = new Integer(nums[i]);
            if(list.containsKey(entry)) {
                return(true);
            }
            else {
                list.put(entry,entry);
            }
        }
        return(false);
    }
}
