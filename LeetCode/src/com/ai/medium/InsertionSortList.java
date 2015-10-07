package com.ai.medium;

import com.ai.common.*;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return(head);
        
        ListNode sortedHead = head;
        ListNode unsortedHead = sortedHead.next;
        while(sortedHead.next != null ) {
            
            while(sortedHead != unsortedHead) {
                int unsortedVal = unsortedHead.val;

                int sortedVal = sortedHead.val;
                if(sortedVal > unsortedVal) {
                    int temp = sortedVal;
                    sortedHead.val = unsortedVal;
                    unsortedHead.val = temp;
                }
                sortedHead = sortedHead.next;
            }
            unsortedHead = unsortedHead.next;
            if(unsortedHead == null) {
                break;
            }
            sortedHead = head;
        }
        
        return(head);
    }
}
