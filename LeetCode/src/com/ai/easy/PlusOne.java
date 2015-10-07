package com.ai.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits.length < 1)
            return(digits);
        
        int[] res;
        int carry = 1;
        for(int i=digits.length - 1; i>=0; i--) {
            digits[i] = digits[i] + carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        
        if(carry == 1) {
            res = new int[digits.length + 1];
            res[0] = carry;
            for(int j=0; j< digits.length; j++) {
                res[j+1] = digits[j];
            }
        }
        else
        {
            res = digits;
        }
        
        return(res);
    }
}
