package com.ai.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Convert to non-zero integer
        if(x<0) {
            return(false);
        }
        
        if(x < 10)
            return(true);
        
        char[] c = Integer.toString(x).toCharArray();
        for(int i=0; i< c.length-i; i++) {
            if(c[i] != c[c.length - 1 - i])
                return(false);
        }
        
        return(true);
    }
}
