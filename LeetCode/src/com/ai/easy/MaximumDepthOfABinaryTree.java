package com.ai.easy;

import com.ai.common.*;

public class MaximumDepthOfABinaryTree {
	public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null) {
            int leftDepth=0, rightDepth=0;
            
            if(root.left != null) {
                leftDepth = maxDepth(root.left);
            }
            
            if(root.right != null) {
                rightDepth = maxDepth(root.right);
            }
            
            depth = 1 + Math.max(leftDepth,rightDepth);
        }
        
        return(depth);
    }
}
