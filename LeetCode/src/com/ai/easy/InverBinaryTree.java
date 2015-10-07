package com.ai.easy;

import com.ai.common.*;

public class InverBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return(root);
        }
        
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        
        return(root);
    }
}
