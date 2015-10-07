package com.ai.easy;

public class NumberOf1Bits {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int bits = 32;
        if(n != 0) {
            while(bits >= 0) {
                if(n%2 == 1 || n%2 == -1)
                    ++count;
                
                bits--;
                n = n >>> 1;
            }
        }
        return(count);
    }
}
