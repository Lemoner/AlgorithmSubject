package com.lmr.LeetCode;

public class LC_538 {
	
	private int sum;
	private int pre;
	private int count;

	public TreeNode convertBST(TreeNode root) {
		
		sum=0;
		count=0;
		
		DFS(root);
		
		return root;

	}
	
	public void DFS(TreeNode node){
		if(node==null){
			return ;
		}
		DFS(node.right);
		
		if(count==0||pre!=node.val){
			pre=node.val;
			count=1;
		}
		else{
			count++;
		}
		
		sum+=pre;
		node.val=sum-(count-1)*pre;
		DFS(node.left);
	}
	
    public TreeNode convertBST1(TreeNode root) {
    	sum=0;
        helper(root);
        return root;
    }
    
    private TreeNode helper(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = helper(root.right);
        sum += root.val;
        root.val = sum;
        root.left = helper(root.left);
        return root;
    }
	
	public static void main(String[] args) {
		
		LC_538 lc=new LC_538();
		
		TreeNode root=new TreeNode(5);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(5);
		TreeNode node4=new TreeNode(13);
		
		root.left=node1;
		root.right=node2;
		node2.left=node3;
		node2.right=node4;
		
		lc.convertBST(root);
		
		TreeNode.Inorder(root);
		
	}

}
