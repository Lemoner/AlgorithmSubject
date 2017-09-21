package com.lmr.LeetCode;

public class LC_23 {

	public ListNode mergeKLists(ListNode[] lists) {
		
		if(lists.length==0){
			return null;
		}
		return binaryLists(lists, 0, lists.length-1);

	}
	
	public ListNode binaryLists(ListNode[] lists, int start, int end){
		
		if(end==start){
			return lists[start];
		}
		
		return mergeTwoLists(binaryLists(lists, start, (start+end)/2), binaryLists(lists, (start+end)/2+1, end));
		
	}

	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode head=new ListNode(0);
		ListNode result=head;
		
		while(l1!=null&&l2!=null){
			if(l1.val<l2.val){
				result.next=l1;
				l1=l1.next;
			}
			else{
				result.next=l2;
				l2=l2.next;
			}
			result=result.next;
		}
		
		if(l1!=null){
			result.next=l1;
		}
		
		if(l2!=null){
			result.next=l2;
		}
		
		return head.next;

	}
	
	public static void main(String[] args) {
		
		LC_23 lc=new LC_23();
		
		ListNode list1=null;
		ListNode list2=new ListNode(1);
		
		ListNode[] lists={list1,list2};
		
		lc.mergeKLists(lists).printString();
		
	}

}
