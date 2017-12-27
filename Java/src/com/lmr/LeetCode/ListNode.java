package com.lmr.LeetCode;

public class ListNode {

	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
	}
	
	public void printString(){
		
		ListNode node=this;
		while(node!=null){
    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
    	System.out.println();
		
	}
	
}
