package com.lmr.LeetCode;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static void Preorder(TreeNode root) {

		if (root != null) {
			System.out.print(root.val + " - ");
			Preorder(root.left);
			Preorder(root.right);
		}

	}

	public static void Inorder(TreeNode root) {

		if (root != null) {
			Inorder(root.left);
			System.out.print(root.val + " - ");
			Inorder(root.right);
		}

	}

	public static void Outorder(TreeNode root) {

		if (root != null) {
			Outorder(root.left);
			Outorder(root.right);
			System.out.print(root.val + " - ");
		}

	}
	
	public static void Allorder(TreeNode root){
		
		System.out.println("---------------");
		System.out.print("Preorder: ");
		Preorder(root);
		System.out.println();
		System.out.print("Inorder: ");
		Inorder(root);
		System.out.println();
		System.out.print("Outorder: ");
		Outorder(root);
		System.out.println();
		System.out.println("---------------");
		
	}

}
