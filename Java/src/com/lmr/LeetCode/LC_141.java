package com.lmr.LeetCode;

public class LC_141 {

	public boolean hasCycle(ListNode head) {
		
		if(head==null){
			return false;
		}
		
		ListNode fhead=head.next;
		ListNode shead=head;
		
		while(fhead!=null&&fhead.next!=null){
			fhead=fhead.next.next;
			shead=shead.next;
			if(fhead==shead){
				return true;
			}
		}
		
		return false;

	}
	
	public static void main(String[] args) {
		
		LC_141 lc=new LC_141();
		
		ListNode head=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(2);
		
		head.next=node1;
		node1.next=node2;
		node2.next=node2;
		
		System.out.println(lc.hasCycle(head));
		
	}

}
