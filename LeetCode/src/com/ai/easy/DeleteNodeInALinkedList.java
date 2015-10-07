package com.ai.easy;

import com.ai.common.*;

public class DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
        if(node != null) {
            while(node.next != null) {
                node.val = node.next.val;
                if(node.next.next != null) {
                    node = node.next;
                }
                else
                {
                    node.next = null;
                }
            }
        }
    }
}
