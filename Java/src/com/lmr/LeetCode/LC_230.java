package com.lmr.LeetCode;

public class LC_230 {
	
	int count,result;
	
	public int kthSmallest(TreeNode root, int k) {
		
		result=0;
		count=0;
		DFS(root, k);
		return result;
		
	}
	
	public void DFS(TreeNode root, int k){
		if(count>k){
			return ;
		}
		if(root.left!=null){
			DFS(root.left, k);
		}
		count++;
		if(count==k){
			result=root.val;
		}
		if(root.right!=null){
			DFS(root.right, k);
		}
	}
	
}
