package com.lmr.LeetCode;

public class LC_226 {

	public TreeNode invertTree(TreeNode root) {
		
		if(root!=null){
			TreeNode leftNode=invertTree(root.left);
			TreeNode rightNode=invertTree(root.right);
			root.left=rightNode;
			root.right=leftNode;
		}
		
		return root;

	}

}
