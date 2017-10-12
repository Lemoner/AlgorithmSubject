package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_98 {

	public boolean isValidBST1(TreeNode root) {
		
		List<Integer> nums=inorderTraversal(root);
		
		for(int i=1;i<nums.size();i++){
			if(nums.get(i)<=nums.get(i-1)){
				return false;
			}
		}
		
		return true;
		
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> result=new ArrayList<>();
		
		DFSInorder(root, result);
		
		return result;

	}
	
	private void DFSInorder(TreeNode root, List<Integer> result) {
		
		if(root!=null){
			DFSInorder(root.left, result);
			result.add(root.val);
			DFSInorder(root.right, result);
		}
		
	}
	
	
	public boolean isValidBST2(TreeNode root) {
		
		if(root==null){
			return true;
		}
		
		return DFSValidBST(root.left,null,root.val)&&DFSValidBST(root.right, root.val, null);
		
	}
	
	private boolean DFSValidBST(TreeNode root, Integer left, Integer right) {
		
		if(root==null){
			return true;
		}

		if((left==null||(left!=null&&root.val>left))&&(right==null||(right!=null&&root.val<right))){
			return DFSValidBST(root.left, left, root.val)&&DFSValidBST(root.right, root.val, right);
		}
		else{
			return false;
		}
		
	}
	
	public boolean isValidBST3(TreeNode root) {
		
		if(root==null){
			return true;
		}
		
		return DFSValidBST3(root.left,Long.MIN_VALUE,root.val)&&DFSValidBST3(root.right, root.val, Long.MAX_VALUE);
		
	}
	
	private boolean DFSValidBST3(TreeNode root, long left, long right) {
		
		if(root==null){
			return true;
		}

		if(root.val>left&&root.val<right){
			return DFSValidBST3(root.left, left, root.val)&&DFSValidBST3(root.right, root.val, right);
		}
		else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		LC_98 lc=new LC_98();
		
//		TreeNode root = new TreeNode(10);
//		TreeNode root1 = new TreeNode(5);
//		TreeNode root2 = new TreeNode(15);
//		TreeNode root21 = new TreeNode(6);
//		TreeNode root22 = new TreeNode(20);
		
		System.out.println(Short.MAX_VALUE+" - "+Short.MIN_VALUE);		
		System.out.println(Integer.MAX_VALUE+" - "+Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE+" - "+Long.MIN_VALUE);
		
		TreeNode root = new TreeNode(2147483647);
		TreeNode root1 = new TreeNode(-2147483648);
		
		root.left = root1;
//		root.right = root2;
//		root2.left = root21;
//		root2.right = root22;
		
		System.out.println(lc.isValidBST2(root));
		
	}

}
