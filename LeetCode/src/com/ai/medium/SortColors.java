package com.ai.medium;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero=0, one=0;
        
        if(nums.length > 1) {
            
            if(nums[0]==0)
                zero++;
            else if(nums[0]==1)
                one++;
            
            for(int i=1; i< nums.length; i++) {
                switch(nums[i]) {
                    case 0: 
                        nums[i]=nums[i-1];
                        if(zero+one-1 >= 0)
                            nums[zero+one] = nums[zero+one-1];
                        nums[zero] = 0;
                        zero++;
                        break;
                    case 1:
                        nums[i]=nums[i-1];
                        nums[zero+one]=1;
                        ++one;
                        break;
                }
            }
        }
    }	
}
