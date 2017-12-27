package com.lmr.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LC_102 {

	public List<List<Integer>> levelOrder1(TreeNode root) {
		
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
	
	public List<List<Integer>> levelOrder2(TreeNode root) {
		
		List<List<Integer>> result=new ArrayList<>();
		
		DFSOrder(root,result,0);
		
		return result;
		
	}

	private void DFSOrder(TreeNode root, List<List<Integer>> result, int depth) {
		
		if(root==null){
			return ;
		}
		
		if(depth>=result.size()){
			result.add(new ArrayList<>());
		}
		
		result.get(depth).add(root.val);
		DFSOrder(root.left, result, depth+1);
		DFSOrder(root.right, result, depth+1);
		
	}

}
