package com.lmr.LeetCode;

public class LC_114 {

	public void flatten1(TreeNode root) {

		if (root == null) {
			return;
		}

		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;

		root.left = null;

		if (leftNode == null) {
			leftNode = root;
		} else {
			flatten1(leftNode);
			root.right = leftNode;
			while (leftNode.right != null) {
				leftNode = leftNode.right;
			}
		}

		if (rightNode != null) {
			flatten1(rightNode);
			leftNode.right = rightNode;
		}

	}

	private TreeNode preNode = null;

	public void flatten2(TreeNode root) {

		if (root == null) {
			return;
		}

		if (preNode != null) {
			preNode.left = null;
			preNode.right = root;
		}

		preNode = root;

		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;
		flatten2(leftNode);
		flatten2(rightNode);

	}

	public static void main(String[] args) {

		LC_114 lc = new LC_114();

		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node12 = new TreeNode(3);
		TreeNode node2 = new TreeNode(4);

		root.left = node1;
		root.right = node2;
		node1.right = node12;

		TreeNode.Allorder(root);

		lc.flatten2(root);

		TreeNode.Allorder(root);

	}

}
