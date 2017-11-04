package com.lmr.LeetCode;

public class WordTreeNode {

	String val;
	WordTreeNode left;
	WordTreeNode right;

	WordTreeNode(String x) {
		val = x;
	}
	
	public static void Inorder(WordTreeNode root) {

		if (root != null) {
			Inorder(root.left);
			System.out.print(root.val + " - ");
			Inorder(root.right);
		}

	}
	
}
