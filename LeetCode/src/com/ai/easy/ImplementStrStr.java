package com.ai.easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int index = -1;

        if(needle.length() > haystack.length())
            return(index);
        
        if(needle.equals(haystack))
            return(0);
        
        for(int i=0; i + needle.length() <= haystack.length(); i++) {
            if(needle.equals(haystack.substring(i,i+needle.length())))
                return(i);
        }
        
        return(index);
    }
}
