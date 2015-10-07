package com.ai.easy;

import java.util.*;

public class ValidParentheses {
    private String[] stack = new String[10000];
    private int top = -1;
    
    private String pop() {
        return(stack[this.top--]);
    }
    
    private void push(String c) {
        stack[++this.top] = c;
    }
    
    private boolean isEmpty() {
        if(top == -1) 
            return(true);
        
        return(false);
    }
    
    public boolean isValid(String s) {
        Map<String,String> brackets = new HashMap<>();
        brackets.put("(",")");
        brackets.put("[","]");
        brackets.put("{","}");
        
        for(int i=0; i<s.length(); i++) {
            String character = s.substring(i,i+1);
            if(brackets.containsKey(character)) {
                push(character);
            }
            else {
                if(isEmpty())
                    return(false);
                    
                String top = pop();
                if(!brackets.get(top).equals(character))
                    return(false);
            }
        }
        
        if(!isEmpty())
            return(false);
        
        return(true);
    }
}
