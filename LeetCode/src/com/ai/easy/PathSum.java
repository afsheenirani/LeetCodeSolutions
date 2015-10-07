package com.ai.easy;

import com.ai.common.*;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return(false);
        }

        if(root.val == sum && root.left == null && root.right == null) {
            return(true);
        }

        if(hasPathSum(root.left,sum - root.val))
            return(true);
        
        if(hasPathSum(root.right,sum - root.val))
            return(true);
        
        return(false);
    }
}
