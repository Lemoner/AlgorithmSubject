package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_437 {
	
	private int count;

	public int pathSum1(TreeNode root, int sum) {
		
		count=0;
		
		if(root==null){
			return count;
		}
		
		List<Integer> list=new ArrayList<>();
		
		list.add(root.val);
		if(root.val==sum){
			count++;
		}
		
		if(root.left!=null){
			DFS(root.left,sum,list);
		}
		
		if(root.right!=null){
			DFS(root.right,sum,list);
		}
		
		return count;

	}

	private void DFS(TreeNode root, int sum, List<Integer> list) {
		
		List<Integer> rlist=new ArrayList<>();
		
		for(Integer result:list){
			result+=root.val;
			rlist.add(result);
			if(result==sum){
				count++;
			}
		}
		rlist.add(root.val);
		if(root.val==sum){
			count++;
		}
		
		if(root.left!=null){
			DFS(root.left,sum,rlist);
		}
		
		if(root.right!=null){
			DFS(root.right,sum,rlist);
		}
		
	}
	
	public int pathSum(TreeNode root, int sum) {
		
		if(root==null){
			return 0;
		}
		
		return pathDFS(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
		
	}
	
	private int pathDFS(TreeNode root, int sum) {
		
		if(root==null){
			return 0;
		}
		
		if(sum==root.val){
			System.out.println(root.val);
		}
		
		return (sum==root.val?1:0)+pathDFS(root.left,sum-root.val)+pathDFS(root.right, sum-root.val);
		
	}
	
	public int pathSum2(TreeNode root, int sum) {
		
		if(root==null){
			return 0;
		}
		
		Map<Integer, Integer> map=new HashMap<>();
		map.put(0, 1);
		
		return DFSByMap(root,sum,0,map);
		
	}
	
	private int DFSByMap(TreeNode root, int sum, int current, Map<Integer, Integer> map) {
		
		if(root==null){
			return 0;
		}
		
		int left,right,cur;
		
		current+=root.val;
		map.put(current, map.getOrDefault(current, 0)+1);
		left=DFSByMap(root.left, sum, current, map);
		right=DFSByMap(root.right, sum, current, map);
		map.put(current, map.get(current)-1);
		
		cur=map.getOrDefault(current-sum, 0);
		
		return left+right+cur;
		
	}
    
	public static void main(String[] args) {
		
		LC_437 lc=new LC_437();
		
//		TreeNode root=new TreeNode(10);
//		TreeNode node1=new TreeNode(5);
//		TreeNode node2=new TreeNode(-3);
//		TreeNode node11=new TreeNode(3);
//		TreeNode node12=new TreeNode(2);
//		TreeNode node22=new TreeNode(11);
//		TreeNode node111=new TreeNode(3);
//		TreeNode node112=new TreeNode(-2);
//		TreeNode node122=new TreeNode(1);
//		
//		root.left=node1;
//		root.right=node2;
//		node1.left=node11;
//		node1.right=node12;
//		node2.right=node22;
//		node11.left=node111;
//		node11.right=node112;
//		node12.right=node122;
		
		TreeNode root=new TreeNode(-2);
		TreeNode node1=new TreeNode(1);
//		TreeNode node2=new TreeNode(-3);
		TreeNode node11=new TreeNode(-2);
//		TreeNode node12=new TreeNode(3);
//		TreeNode node21=new TreeNode(-2);
//		TreeNode node111=new TreeNode(-1);
		
		root.left=node1;
//		root.right=node2;
		node1.left=node11;
//		node1.right=node12;
//		node2.right=node21;
//		node11.left=node111;
		
		int sum=-1;
		
		System.out.println(lc.pathSum2(root, sum));
		
	}

}
