package com.lmr.LeetCode;

public class LC_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0){
			return null;
		}
		return CreateTree(nums,0,nums.length);
	}

	private TreeNode CreateTree(int[] nums, int left, int right) {
		if(right-left<=0){
			return null;
		}
		int mid=(left+right)/2;
		TreeNode node=new TreeNode(nums[mid]);
		node.left=CreateTree(nums, left, mid);
		node.right=CreateTree(nums, mid+1, right);
		return node;
	}
}
