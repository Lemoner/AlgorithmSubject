package com.lmr.LeetCode;

public class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
	
	public void PrintAll(){
		RandomListNode root=this;
		System.out.println("---------------------");
		while(root!=null){
			System.out.println(root.label+" - "+(root.next==null?"null":root.next.label)+" - "+(root.random==null?"null":root.random.label));
			root=root.next;
		}
	}
	
	public void PrintSelf(){
		System.out.println(this.label+" - "+(this.next==null?"null":this.next.label)+" - "+(this.random==null?"null":this.random.label));
	}
}
