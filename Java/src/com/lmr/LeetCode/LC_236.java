package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_236 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		List<TreeNode> plist = new ArrayList<>();
		List<TreeNode> qlist = new ArrayList<>();

		FindListByDFS(root, p, plist);
		FindListByDFS(root, q, qlist);

		plist.add(p);
		qlist.add(q);

		TreeNode pre = root, tp, tq;
		int index = 1, len = Math.min(plist.size(), qlist.size());
		while (index < len) {
			tp = plist.get(index);
			tq = qlist.get(index);
			if (tp == tq) {
				pre = tp;
				index++;
			} else {
				break;
			}
		}

		return pre;

	}

	private boolean FindListByDFS(TreeNode root, TreeNode p, List<TreeNode> plist) {
		if (root == null) {
			return false;
		}
		if (root == p) {
			return true;
		}
		plist.add(root);
		if (FindListByDFS(root.left, p, plist)) {
			return true;
		} else {
			if (FindListByDFS(root.right, p, plist)) {
				return true;
			} else {
				plist.remove(root);
				return false;
			}
		}
	}

	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null || root == p || root == q)
			return root;
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left == null)
			return right;
		if (right == null)
			return left;
		return root;
		
	}

}
