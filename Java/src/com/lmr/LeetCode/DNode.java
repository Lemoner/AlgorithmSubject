package com.lmr.LeetCode;

public class DNode {

	int key;
	int val;
	DNode prev;
	DNode next;
	
	DNode(int key,int val){ 
		this.key=key;
		this.val=val;
	}
	
	public void printStringNext(){
		
		DNode node=this;
		while(node.val!=-2){
			System.out.print("("+node.key+","+node.val+") -> ");
//    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
//		System.out.print(node.val);
		System.out.print("("+node.key+","+node.val+")");
    	System.out.println();
		
	}
	
	public void printStringPrev(){
		
		DNode node=this;
		while(node.val!=-1){
//    		System.out.print(node.val+" -> ");
			System.out.print("("+node.key+","+node.val+") -> ");
    		node=node.prev;
    	}
//		System.out.print(node.val);
		System.out.print("("+node.key+","+node.val+")");
    	System.out.println();
		
	}
	
}
