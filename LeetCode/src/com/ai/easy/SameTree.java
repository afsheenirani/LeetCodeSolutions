package com.ai.easy;

import com.ai.common.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q!=null) || (p!=null && q==null))
            return(false);
        
        if(p==null && q==null)
            return(true);
        
        if(p.val != q.val) 
            return(false);
        
        if(isSameTree(p.left,q.left)) {
            if(isSameTree(p.right,q.right)) {
                return(true);
            }
        }
        
        return(false);
    }
}
