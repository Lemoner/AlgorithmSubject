package com.lmr.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC_116 {
	public void connect(TreeLinkNode root) {
		
		if(root==null){
			return ;
		}
		
		int count;
		TreeLinkNode pre,node;
		Queue<TreeLinkNode> queue=new ArrayDeque<>();
		
		queue.add(root);
		count=1;
		
		while(!queue.isEmpty()){
			pre = null;
			for(int i=0;i<count;i++){
				node=queue.poll();
				if(node.left!=null){
					queue.add(node.left);
					queue.add(node.right);
					node.left.next=node.right;
					if(pre!=null){
						pre.next=node.left;
					}
					pre=node.right;
				}
			}
			count*=2;
		}
		
	}
	
	public void connect1(TreeLinkNode root) {
		if(root==null){
			return ;
		}
		if(root.left!=null){
			root.left.next=root.right;
			if(root.next!=null){
				root.right.next=root.next.left;
			}
		}
		connect1(root.left);
		connect1(root.right);
	}
	
}
