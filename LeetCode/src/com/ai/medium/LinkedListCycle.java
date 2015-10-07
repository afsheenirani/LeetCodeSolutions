package com.ai.medium;

import com.ai.common.*;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head == null)
            return(false);
        
        ListNode fast = head.next;
        if(fast == null)
            return(false);
        
        while(fast.next != null) {
            head = head.next;
            if(fast.next != null)
                if(fast.next.next!=null)
                    fast = fast.next.next;
                else
                    break;
            else
                break;
            
            if(head == fast)
                return(true);
        }
        
        return(false);
    }
}
