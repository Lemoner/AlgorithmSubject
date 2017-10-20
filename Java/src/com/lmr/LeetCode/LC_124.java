package com.lmr.LeetCode;

public class LC_124 {

	private int maxsum;
	
	public int maxPathSum(TreeNode root) {
		
		if(root==null){
			return 0;
		}
		maxsum=root.val;
		DFSSum(root);
		return maxsum;
	}
	
//	public int DFSSum(TreeNode root){
//		
//		if(root==null){
//			return 0;
//		}
//		
//		int leftsum=DFSSum(root.left);
//		int rightsum=DFSSum(root.right);
//		
//		if(leftsum>0&&rightsum>0){
//			maxsum=Math.max(maxsum, leftsum+rightsum+root.val);
//			int maxleftright=Math.max(leftsum, rightsum);
//			maxsum=Math.max(maxsum, maxleftright+root.val);
//			return maxleftright+root.val;
//		}
//		else if(leftsum>0){
//			maxsum=Math.max(maxsum, leftsum+root.val);
//			return leftsum+root.val;
//		}
//		else if(rightsum>0){
//			maxsum=Math.max(maxsum, rightsum+root.val);
//			return rightsum+root.val;
//		}
//		else{
//			maxsum=Math.max(maxsum, root.val);
//			return root.val;
//		}
//		
//	}
	
	public int DFSSum(TreeNode root){
		
		if(root==null){
			return 0;
		}
		
		int leftsum=DFSSum(root.left);
		int rightsum=DFSSum(root.right);
		
		maxsum=Math.max(maxsum, leftsum+rightsum+root.val);
		
		int maxleftright=Math.max(leftsum, rightsum);
		if(maxleftright+root.val>0){
			return maxleftright+root.val;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		LC_124 lc=new LC_124();
		
		TreeNode root=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(13);
		TreeNode node11=new TreeNode(10);
		TreeNode node12=new TreeNode(11);
		
		root.left=node1;
		root.right=node2;
		node1.left=node11;
		node1.right=node12;
		
//		root.left=node1;
		
		System.out.println(lc.maxPathSum(root));
		
	}

}
