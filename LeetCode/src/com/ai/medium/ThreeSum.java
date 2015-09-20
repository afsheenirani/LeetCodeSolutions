package com.ai.medium;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        if(nums.length >= 3) {
            Arrays.sort(nums);
            if(nums[0] <=0 && nums[nums.length - 1] >=0 ) {
                System.out.println(Arrays.toString(nums));
                for(int i=0; i<nums.length; i++) {
                    if(nums[i] > 0) 
                        continue;
                    
                    if(i>0 && (nums[i] == nums[i-1]))
                        continue;
                    
                    for(int j=i+1; j<nums.length; j++) {
                        if((nums[i] + nums[j]) > 0)
                            continue;
                        
                        if(j>i+1 && (nums[j] == nums[j-1]))
                            continue;
                        
                        for(int k = j+1; k<nums.length; k++) {
                            //System.out.println("(" + nums[i] + ", " + nums[j] + ", " + nums[k] + ")");
                            
                            int sum = nums[i] + nums[j] + nums[k];
                            if(sum == 0) {
                                List<Integer> triplet = new ArrayList<Integer>();
                                triplet.add(nums[i]);
                                triplet.add(nums[j]);
                                triplet.add(nums[k]);
                                triplets.add(triplet);
                            }
                            
                            if(sum >=0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return(triplets);
    }
}
