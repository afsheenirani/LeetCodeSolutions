package com.ai.easy;

import com.ai.common.*;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode currHead = null;
        while(temp != null) {
            while(temp.next != null) {
                ListNode newHead = temp.next;
                temp.next = currHead;
                currHead = temp;
                temp = newHead;
            }
            temp.next = currHead;
            currHead = temp;
            break;
        }
        return(currHead);
    }
}
