package com.ai.easy;

import com.ai.common.*;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode newhead = head;
        while(head != null) {
            while( head.next != null && head.next.val == val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        
        return(newhead);
    }
}
