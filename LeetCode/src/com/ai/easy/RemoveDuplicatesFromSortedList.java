package com.ai.easy;

import com.ai.common.ListNode;

public class RemoveDuplicatesFromSortedList {	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            while(temp.next != null) {
                if(temp.val == temp.next.val) {
                    // Delete the next node
                    ListNode del = temp.next;
                    temp.next = del.next;
                    del.next = null;
                }
                else {
                    break;
                }
            }
            temp = temp.next;
        }
        
        return(head);
    }
}
