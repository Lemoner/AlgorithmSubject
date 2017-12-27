package com.lmr.LeetCode;

public class LC_617 {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
//		return DFS(t1, t2);
		
		if(t1==null){
			return t2;
		}
		
		if(t2!=null){
			t1.val=t1.val+t2.val;
			t1.left=mergeTrees(t1.left, t2.left);
			t1.right=mergeTrees(t1.right, t2.right);
		}
		
		return t1;

	}

	private TreeNode DFS(TreeNode t1, TreeNode t2) {
		
		if(t1==null){
			return t2;
		}
		
		if(t2!=null){
			t1.val=t1.val+t2.val;
			t1.left=DFS(t1.left, t2.left);
			t1.right=DFS(t1.right, t2.right);
		}
		
		return t1;
		
	}

}
