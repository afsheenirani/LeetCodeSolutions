package com.ai.easy;

import java.util.*;

public class MinStack {
	// Assumption is that top is always as 0
    // and so push operation needs to ensure the stack is in ascending sorted order
    private ArrayList<Integer> stack = new ArrayList<>();
    private int minindex = 0;
    public void push(int x) {
        Integer val = new Integer(x);
        stack.add(val);
        if(x < getMin())
            minindex = stack.size() - 1;
    }

    public void pop() {
        int top = stack.size() - 1;
        stack.remove(top);
        if(minindex == top) {
            // find new minindex;
            minindex = 0;
            for(int i=0; i<stack.size();i++) {
                if(stack.get(i).intValue() < stack.get(minindex).intValue()) {
                    minindex = i;
                }
            }
        }
    }

    public int top() {
        return(stack.get(stack.size()-1).intValue());
    }

    public int getMin() {
        return(stack.get(minindex).intValue());
    }
}
