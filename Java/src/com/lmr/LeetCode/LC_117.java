package com.lmr.LeetCode;

public class LC_117 {
	public void connect(TreeLinkNode root) {
		if(root==null){
			return ;
		}
		if(root.left!=null&&root.right==null){
			TreeLinkNode temp=root.next;
			while(temp!=null){
				if(temp.left!=null){
					root.left.next=temp.left;
					break;
				}
				else if(temp.right!=null){
					root.left.next=temp.right;
					break;
				}
				else{
					temp=temp.next;
				}
			}
		}
		else if(root.right!=null){
			if(root.left!=null){
				root.left.next=root.right;
			}
			TreeLinkNode temp=root.next;
			while(temp!=null){
				if(temp.left!=null){
					root.right.next=temp.left;
					break;
				}
				else if(temp.right!=null){
					root.right.next=temp.right;
					break;
				}
				else{
					temp=temp.next;
				}
			}
		}
		
		connect(root.right);connect(root.left);
	}
	
	public static void main(String[] args) {
		
		LC_117 lc=new LC_117();
		
		TreeLinkNode root=new TreeLinkNode(2);
		TreeLinkNode node1=new TreeLinkNode(1);
		TreeLinkNode node2=new TreeLinkNode(3);
		TreeLinkNode node11=new TreeLinkNode(0);
		TreeLinkNode node12=new TreeLinkNode(7);
		TreeLinkNode node21=new TreeLinkNode(9);
		TreeLinkNode node22=new TreeLinkNode(1);
		TreeLinkNode node111=new TreeLinkNode(2);
		TreeLinkNode node121=new TreeLinkNode(1);
		TreeLinkNode node122=new TreeLinkNode(0);
		TreeLinkNode node221=new TreeLinkNode(8);
		TreeLinkNode node222=new TreeLinkNode(8);
		TreeLinkNode node1211=new TreeLinkNode(7);
		
		root.left=node1;
		root.right=node2;
		node1.left=node11;
		node1.right=node12;
		node2.left=node21;
		node2.right=node22;
		node11.left=node111;
		node12.left=node121;
		node12.right=node122;
		node22.left=node221;
		node22.right=node222;
		node121.left=node1211;
		
		lc.connect(root);
		
		System.out.println(node111.next.val);
		System.out.println(node111.next.next.val);
		System.out.println(node111.next.next.next.val);
		
		
	}
	
}
