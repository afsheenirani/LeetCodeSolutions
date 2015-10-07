package com.ai.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        if(a.equals(""))
            return(b);
        
        if(b.equals(""))
            return(a);
        
        String res = "";
        int carry = 0;
        while(i>=0 && j >=0) {
            int sum = carry + Integer.parseInt(a.substring(i,i+1)) + Integer.parseInt(b.substring(j,j+1));
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else if(sum == 3) {
                carry = 1;
                sum = 1;
            }
            else {
                carry = 0;
            }
            res = "" + sum + res;
            i--;
            j--;
        }
        
        while(i>=0) {
            int sum = carry + Integer.parseInt(a.substring(i,i+1));
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else if(sum == 3) {
                carry = 1;
                sum = 1;
            }
            else {
                carry = 0;
            }
            res = "" + sum + res;
            i--;
        }
        
        while(j>=0){
            int sum = carry + Integer.parseInt(b.substring(j,j+1));
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else if(sum == 3) {
                carry = 1;
                sum = 1;
            }
            else {
                carry = 0;
            }
            res = "" + sum + res;
            j--;
        }
        
        if(carry == 1) {
            res = "" + carry + res;
        }
        
        return(res);
    }
}
