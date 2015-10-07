package com.ai.medium;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
        String res = "";
        String regex = " ";
        s = s.trim();
        if(s.length() > 0)
        {
            String[] tokens = s.split(regex);
            for(int i=tokens.length -1; i>=0; i--) {
                String token = tokens[i].trim();
                if(token.length() > 0 ) {
                    if(res.equals("")) {
                        res = token;
                    }
                    else {
                        res += " " + token;
                    }
                }
            }
        }
        return(res);
    }
}
