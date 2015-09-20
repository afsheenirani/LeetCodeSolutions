package com.ai.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int len = s.length();
        if(len == 0)
            return(0);
        
        char[] c = s.toCharArray();
        int prev = 0;
        int sum = 0;
        for(int i=len-1; i>=0; i--){
            int val = getValue(c[i]);
            if(val >= prev)
                sum+=val;
            else
                sum-=val;
            
            prev = val;
        }
        
        return(sum);
    }
    
    private int getValue(char c) {
        switch(c) {
            case 'I':   return(1);
            case 'V':   return(5);
            case 'X':   return(10);
            case 'L':   return(50);
            case 'C':   return(100);
            case 'D':   return(500);
            case 'M':   return(1000);
        }
        return(0);
    }
}
