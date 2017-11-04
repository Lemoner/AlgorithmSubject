package com.lmr.LeetCode;

public class LC_148 {

	//²åÈëÅÅÐò
	public ListNode sortList(ListNode head) {
		
		ListNode phead=new ListNode(Integer.MIN_VALUE);
		phead.next=null;
		ListNode qhead;
		ListNode temp;
		
		while(head!=null){
			temp=head;
			head=head.next;
			temp.next=null;
			qhead=phead;
			while(qhead.next!=null){
				if(qhead.next.val>=temp.val){
					break;
				}
				else{
					qhead=qhead.next;
				}
			}
			if(qhead.next==null){
				qhead.next=temp;
			}
			else{
				temp.next=qhead.next;
				qhead.next=temp;
			}
		}
		
		return phead.next;

	}
	
	public static void main(String[] args) {
		
		LC_148 lc=new LC_148();
		
		ListNode head=new ListNode(3);
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(4);
		ListNode node3=new ListNode(2);
		
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		
		lc.sortList(head).printString();
		
	}

}
