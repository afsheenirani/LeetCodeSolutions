package com.ai.medium;

import com.ai.common.*;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode start = new ListNode(0);
        ListNode res = start;
        while( l1 != null && l2 != null )
        {
            res.val = l1.val + l2.val + carry;
            
            carry = res.val / 10;
            res.val = res.val % 10;
            res.next = null;
            
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null || l2 != null || carry != 0)
                res.next = new ListNode(carry);
            
            res = res.next;
        }
        
        while(l1 != null)
        {
            res.val = l1.val + carry;
            
            carry = res.val / 10;
            res.val = res.val % 10;
            res.next = null;
            
            l1 = l1.next;
            if(l1 != null || carry != 0)
                res.next = new ListNode(carry);
            
            res=res.next;
        }
        
        while(l2 != null)
        {
            res.val = l2.val + carry;
            
            carry = res.val / 10;
            res.val = res.val % 10;
            res.next = null;
            
            l2 = l2.next;
            if(l2 != null || carry != 0)
                res.next = new ListNode(carry);
            
            res = res.next;
        }
        
        return( start );
    }
}
