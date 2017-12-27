package com.lmr.LeetCode;

public class LC_234 {

	public boolean isPalindrome(ListNode head) {
		
		if(head==null||head.next==null){
			return true;
		}
		
		ListNode fast,slow,rhead,temp;
		fast=head;
		slow=head;
		
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		
		rhead=new ListNode(0);
		while(slow!=null){
			temp=slow;
			slow=slow.next;
			temp.next=rhead.next;
			rhead.next=temp;
		}
		
		rhead=rhead.next;
		while(rhead!=null){
			if(head.val!=rhead.val){
				return false;
			}
			head=head.next;
			rhead=rhead.next;
		}
		
		return true;

	}
	
//	public boolean isPalindrome1(ListNode head) {
//		if (head == null || head.next == null)
//			return true;
//		if (head.val == head.next.val && head.next.next == null)
//			return true;
//		ListNode slow = head;
//		ListNode cur = head.next;
//		while (cur.next != null) {
//			if (slow.val == cur.next.val) {
//				if (cur.next.next != null)
//					return false;
//				cur.next = null;
//				slow = slow.next;
//				cur = slow.next;
//				if (cur == null || slow.val == cur.val)
//					return true;
//			} else
//				cur = cur.next;
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		
		LC_234 lc=new LC_234();
		
		ListNode head=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(1);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(1);
		ListNode node5=new ListNode(2);
		ListNode node6=new ListNode(1);
		
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		System.out.println(lc.isPalindrome(head));
		
	}

}
