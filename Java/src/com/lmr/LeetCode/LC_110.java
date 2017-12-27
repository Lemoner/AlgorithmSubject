package com.lmr.LeetCode;

public class LC_110 {

	public boolean isBalanced1(TreeNode root) {
		
		if(root==null){
			return true;
		}
		
		int leftDepth=maxDepth(root.left);
		int rightDepth=maxDepth(root.right);
		
		if(leftDepth-rightDepth<=1&&leftDepth-rightDepth>=-1){
			return isBalanced1(root.left)&&isBalanced1(root.right);
		}
		else{
			return false;
		}

	}

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

	}
	
	public boolean isBalanced2(TreeNode root) {
		
		return DFSBalance(root)!=-1;
		
	}

	private int DFSBalance(TreeNode root) {
		
		if(root==null){
			return 0;
		}
		
		int left=DFSBalance(root.left);
		if(left==-1){
			return -1;
		}
		
		int right=DFSBalance(root.right);
		if(right==-1){
			return -1;
		}
		
		if(Math.abs(left-right)>1){
			return -1;
		}
		
		return Math.max(left, right)+1;
	}

}
