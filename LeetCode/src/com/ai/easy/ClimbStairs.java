package com.ai.easy;

import java.util.*;

public class ClimbStairs {
    private Map<Integer, Integer> stairs = new HashMap<>();
    public int climbStairs(int n) {
        int count = 0;
        if(n<=0)
            return(0);
        
        if(n - 1 == 0) {
            return(1);
        }
        
        if(n - 2 == 0) {
            return(2);
        }
        
        if(stairs.containsKey(new Integer(n))) {
            return(stairs.get(new Integer(n)).intValue());
        }
        else {
            count = climbStairs(n-1) + climbStairs(n-2);
            stairs.put(new Integer(n), new Integer(count));
        }
        return(count);
    }
}
