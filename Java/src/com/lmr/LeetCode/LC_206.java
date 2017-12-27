package com.lmr.LeetCode;

public class LC_206 {

	public ListNode reverseList(ListNode head) {

		ListNode headnode=new ListNode(0);
		
		while(head!=null){
			ListNode node=head;
			head=head.next;
			if(headnode.next==null){
				node.next=null;
				headnode.next=node;
			}
			else{
				node.next=headnode.next;
				headnode.next=node;
			}
		}
		
		return headnode.next;
		
	}
	
	public ListNode reverseList2(ListNode head) {
		ListNode next = null;
		ListNode pre = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	public static void main(String[] args) {
		
		LC_206 lc=new LC_206();
		
		ListNode head=new ListNode(1);
		ListNode node=new ListNode(2);
		
		head.next=node;
		
		lc.reverseList(head).printString();
		
	}

}
