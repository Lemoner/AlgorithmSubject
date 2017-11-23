package com.lmr.LeetCode;

public class LC_543 {
	
	private int max;

	public int diameterOfBinaryTree(TreeNode root) {
		
		max=0;
		
		DFS(root);
		
		return max;

	}

	private int DFS(TreeNode root) {
		
		if(root==null){
			return 0;
		}
		
		int left,right;
		
		left=DFS(root.left);
		right=DFS(root.right);
		
		max=Math.max(max, left+right);
		
		return Math.max(left, right)+1;
		
	}
	
	public static void main(String[] args) {
		
		LC_543 lc=new LC_543();
		
		
		
	}

}
