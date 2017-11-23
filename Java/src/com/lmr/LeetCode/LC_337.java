package com.lmr.LeetCode;

public class LC_337 {
	
	private int max=0;

	public int rob(TreeNode root) {
		
		int sum=0;
		
		DFS(root,sum,0);
		
		return max;

	}

	private void DFS(TreeNode node, int sum, int flag) {
		
		if(node==null){
			max=Math.max(max, sum);
			return ;
		}
		
		if(flag==0){
			DFS(node.left, sum, 0);
			DFS(node.right, sum, 0);
			
			DFS(node.left, sum+node.val, 1);
			DFS(node.right, sum+node.val, 1);
		}
		else{
			DFS(node.left, sum, 0);
			DFS(node.right, sum, 0);
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_337 lc=new LC_337();
		
		TreeNode root=new TreeNode(4);
		TreeNode node1=new TreeNode(4);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(1);
		TreeNode node4=new TreeNode(3);
		TreeNode node5=new TreeNode(1);
		TreeNode node6=new TreeNode(4);
		
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		
		System.out.println(lc.rob(root));
		
	}

}
