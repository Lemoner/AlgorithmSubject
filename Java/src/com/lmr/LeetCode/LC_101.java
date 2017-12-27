package com.lmr.LeetCode;

public class LC_101 {

	public boolean isSymmetric(TreeNode root) {

		return DFSSymmetric(root,root);

	}

	private boolean DFSSymmetric(TreeNode left, TreeNode right) {
		
		if(left==null&&right==null){
			return true;
		}
		else if(left!=null&&right!=null){
			return left.val==right.val&&DFSSymmetric(left.left, right.right)&&DFSSymmetric(left.right, right.left);
		}
		else{
			return false;
		}
		
	}

}
