package com.ai.common;

public class ListNode {	
	// These are kept public just to facilitate easy dev of the actual problems
	// so that we can copy-paste back into Leetcode and evaluate.
	// Or else, these should be made private with the necessary publicly scoped
	// getter/setter methods for access
	public int val;		
	public ListNode next;
	public ListNode(int x) { val = x; }
}
