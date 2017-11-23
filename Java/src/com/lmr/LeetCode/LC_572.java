package com.lmr.LeetCode;

public class LC_572 {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		
		if(s==null){
			return false;
		}
		
		if(DFS(s, t)){
			return true;
		}
		
		return isSubtree(s.left, t)||isSubtree(s.right, t);

	}
	
	public boolean DFS(TreeNode s, TreeNode t) {

		if(s==null&&t==null){
			return true;
		}
		if(s==null||t==null){
			return false;
		}
		
		if(s.val==t.val){
			return DFS(s.left, t.left)&&DFS(s.right, t.right);
		}
		else{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_572 lc=new LC_572();
		
		TreeNode s=new TreeNode(2);
		
	}

}
