package com.ai.easy;

public class ReverseInteger {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String res = "";
        char[] c = s.toCharArray();
        
        int start=0;
        if(c[start] == '-') {
            res = "-";
            start++;
        }
        
        for(int i=s.length()-1;i>=start;i--) {
            res += c[i];
        }
        
        long out = Long.parseLong(res);
        if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)
            return(0);
            
        return((int)out);
    }
}
