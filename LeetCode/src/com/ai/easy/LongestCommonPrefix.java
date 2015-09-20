package com.ai.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int charCount = 0;
        String result = "";
        
        if(strs.length==0)
            return(result);
        
        while(charCount < strs[0].length()) {
            String base = strs[0].substring(0,charCount+1);
            boolean allMatch = true;
            for(int i=1; i< strs.length; i++) {
                if(strs[i].length() <= charCount) {
                    allMatch = false;
                    break;
                }
                String sub = strs[i].substring(0,charCount+1);
                if(!sub.equals(base)) {
                    allMatch = false;
                    break;
                }
            }
            if(allMatch)
                result = base;
                
            charCount++;
        }
        return(result);
    }
}
