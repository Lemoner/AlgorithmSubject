package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_94 {

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

	public static void main(String[] args) {
		
		LC_94 lc=new LC_94();
		
		TreeNode root=new TreeNode(1);
		TreeNode root1 = null;
		TreeNode root2=new TreeNode(2);
		TreeNode root21=new TreeNode(3);
		
		root.left=root1;
		root.right=root2;
		root2.left=root21;
		
		System.out.println(lc.inorderTraversal(root));
		
	}

}
