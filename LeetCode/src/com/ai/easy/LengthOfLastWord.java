package com.ai.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        
        int lastWord = 0;
        if(len == 0 )
            return(0);
        
        char[] c = s.toCharArray();
        
        int i=len-1;
        while(i>=0) {
            if(Character.isWhitespace(c[i]))
                i--;
            else
                break;
        }
        
        for(int j=i;j>=0; j--) {
            if(!Character.isWhitespace(c[j]))
                lastWord++;
            else
                break;
        }
        
        return(lastWord);
    }
}
