package com.lmr.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LC_102 {

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result=new ArrayList<>();
		Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
		int num=0;
		
		if(root==null){
			return result;
		}
		
		queue.add(root);
		num=1;
		
		while(!queue.isEmpty()){
			List<Integer> temp=new ArrayList<>();
			while(num>0){
				TreeNode node=queue.poll();
				temp.add(node.val);
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}
				num--;
			}
			result.add(temp);
			num=queue.size();
		}
		
		return result;

	}

}
