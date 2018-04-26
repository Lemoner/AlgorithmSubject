package com.lmr.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_138 {
	public RandomListNode copyRandomList(RandomListNode head) {
		
		RandomListNode oldhead,newhead,front,node;
		Map<RandomListNode, RandomListNode> map=new HashMap<>();
		
		oldhead=head;
		front=new RandomListNode(-1);
		newhead=front;
		
		while(head!=null){
			node=new RandomListNode(head.label);
			map.put(head, node);
			head=head.next;
			front.next=node;
			front=node;
		}
		
		head=oldhead;
		front=newhead.next;
		
		while(head!=null){
			front.random=map.get(head.random);
			head=head.next;
			front=front.next;
		}
		
		return newhead.next;

	}
	
	public RandomListNode copyRandomList1(RandomListNode head) {
		
		RandomListNode oldhead,newhead,oldfront,newfront;
		
		oldhead=head;
		
		while(head!=null){
			RandomListNode node=new RandomListNode(head.label);
			node.next=head.next;
			head.next=node;
			head=head.next.next;
		}
		
		head=oldhead;
		
		while(head!=null){
			head.next.random=head.random==null?head.random:head.random.next;
			head=head.next.next;
		}
		
		head=oldhead;
		oldfront=new RandomListNode(-1);
		newfront=new RandomListNode(-1);
		newhead=newfront;
		
		while(head!=null){
			newfront.next=head.next;
			newfront=newfront.next;
			oldfront.next=head;
			oldfront=oldfront.next;
			head=head.next.next;
			newfront.next=null;
			oldfront.next=null;
		}
		
		return newhead.next;
		
	}
	
	public static void main(String[] args) {
		
		LC_138 lc=new LC_138();
		
		RandomListNode node1=new RandomListNode(1);
		RandomListNode node2=new RandomListNode(2);
		RandomListNode node3=new RandomListNode(3);
		RandomListNode node4=new RandomListNode(4);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node1.random=node3;
		node4.random=node2;
		
		lc.copyRandomList1(node1);
		
	}
	
}
