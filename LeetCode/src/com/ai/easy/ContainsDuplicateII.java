package com.ai.easy;

import java.util.*;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <=1 )
            return(false);
        
        if(k <= 0 )
            return(false);
        
        Map<Integer,Integer> dupes = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            if(dupes.containsKey(nums[i])) {
                int diff = i - dupes.get(nums[i]).intValue();
                if(diff <= k)
                    return(true);
                else
                    dupes.put(new Integer(nums[i]), new Integer(i));
            }
            else {
                dupes.put(new Integer(nums[i]), new Integer(i));
            }
        }
        
        return(false);
    }
}
