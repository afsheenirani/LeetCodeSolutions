package com.ai.medium;

import java.util.*;
import com.ai.common.*;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        
        List<TreeNode> t = new ArrayList<>();
        if(root!=null)
            t.add(root);
            
        while(!t.isEmpty()) {
            TreeNode elem = t.get(0);
            tree.add(elem.val);
            t.remove(0);

            if(elem.right!=null)
                t.add(0, elem.right);
                
            if(elem.left!=null)
                t.add(0, elem.left);
        }
        
        return(tree);
    }
}
