package com.ai.easy;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        int len = s.length();
        if(len == 0) {
            return(0);
        }
        
        int base = 26;
        int sum = 0;
        char[] c = s.toCharArray();
        for(int i=len-1; i>=0; i--) {
            int j = len -i -1;
            int val = c[i] - 'A' + 1;
            sum += val*Math.pow(base, j);
        }
        return(sum);
    }
}
