package com.lmr.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		if(root==null){
			return new ArrayList<>();
		}
		
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		Queue<TreeNode> queue=new ArrayDeque<>();
		int count,flag;
		
		queue.add(root);
		flag=1;
		
		while(!queue.isEmpty()){
			count=queue.size();
			temp=new ArrayList<>();
			while(count>0){
				TreeNode node=queue.poll();
				temp.add(node.val);
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}
				count--;
			}
			if(flag==1){
				flag=0;
			}
			else{
				Collections.reverse(temp);
				flag=1;
			}
			result.add(temp);
			
		}
		
		return result;
	}
	
	public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        if(root == null) return new ArrayList();
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
            
        helper(root, list, 0);
        
        return list;
    }
    
    public void helper(TreeNode root, List<List<Integer>> list, int level) {
        
        if(root == null) return;
        
        if(list.size() <= level) {
            list.add(level, new LinkedList<Integer>());
        }
        
        if(level%2==0) list.get(level).add(root.val);
        else list.get(level).add(0,root.val);
        
        helper(root.left, list, level+1);
        helper(root.right, list, level+1);
    }
	
	public static void main(String[] args) {
		
		LC_103 lc=new LC_103();
		
		TreeNode root=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(3);
		TreeNode node11=new TreeNode(4);
		TreeNode node12=new TreeNode(5);
		TreeNode node21=new TreeNode(6);
		TreeNode node22=new TreeNode(7);
		root.left=node1;
		root.right=node2;
		node1.left=node11;
		node1.right=node12;
		node2.left=node21;
		node2.right=node22;
		
		System.out.println(lc.zigzagLevelOrder(root).toString());
		
		
	}
}
