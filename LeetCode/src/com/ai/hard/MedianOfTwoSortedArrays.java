package com.ai.hard;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m, n;
        m = nums1.length;
        n = nums2.length;
        
        int res[] = new int[m+n];
        int mid = (m+n)/2;
        double median = 0.0;
        
        int index = 0, p=0, q=0;
        
        while(p < m && q < n) {
            if(nums1[p] < nums2[q])
                res[index++] = nums1[p++];
            else
                res[index++] = nums2[q++];
        }
        
        while(p < m) {
            res[index++] = nums1[p++];
        }
        
        while(q < n) {
            res[index++] = nums2[q++];
        }
        
        if(res.length > 1) {
            if(res.length % 2 == 0)
                median = (res[mid-1] + res[mid]) / 2.0;
            else
                median = res[mid] / 1.0;
        }
        else if(res.length == 1 )
            median = res[0] / 1.0;
        
        return( median );
    }
}
