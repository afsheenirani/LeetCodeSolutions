package com.ai.easy;

import com.ai.common.*;

public class MergeTwoSortedLists {	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // If either list is empty, then return the other list
        if(l1 == null)
            return(l2);
        
        if(l2 == null)
            return(l1);
        
        // both lists are non-empty so do processing
        
        // First set the root to the start of one of the lists
        ListNode root, l;
        if(l1.val <= l2.val) {
            root = l1;
            l = l1;
            l1 = l1.next;
        }
        else {
            root = l2;
            l = l2;
            l2 = l2.next;
        }
        
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                l.next = l1;
                l1 = l1.next;
                l = l.next;
                l.next = null;
            }
            else {
                l.next = l2;
                l2 = l2.next;
                l = l.next;
                l.next = null;
            }
        }
        
        if(l1 != null) {
            l.next = l1;
        }
        
        if(l2 != null) {
            l.next = l2;
        }
        
        return(root);
    }
}
