package com.ai.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length < 1)
            return(0);
        
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return(j);
    }
}
