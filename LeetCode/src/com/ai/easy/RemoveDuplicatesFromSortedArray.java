package com.ai.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int val;
        
        if(nums.length <= 1)
            return(nums.length);
        
        for(int i=1; i< nums.length; i++) {
            val = nums[ j ];
            
            if(nums[i]!=nums[j]) {
                j++;
                val = nums[i];
                nums[j]=val;
            }
        }
        return(j+1);
    }
}
