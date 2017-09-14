package com.lmr.LeetCode;

public class LC_2 {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode list=new ListNode(0);
		ListNode head=list;
		
		int x,y,sum,flag;
		flag=0;
		while(true){
			x=l1.val;
			y=l2.val;
			sum=x+y+flag;
			if(sum>=10){
				sum=sum%10;
				flag=1;
			}
			else{
				flag=0;
			}
			ListNode node=new ListNode(sum);
			list.next=node;
			list=node;
			if(l1.next==null||l2.next==null){
				break;
			}
			else{
				l1=l1.next;
				l2=l2.next;
			}
		}
		
		while(l1.next!=null){
			l1=l1.next;
			sum=l1.val+flag;
			if(sum>=10){
				sum=sum%10;
				flag=1;
			}
			else{
				flag=0;
			}
			ListNode node=new ListNode(sum);
			list.next=node;
			list=node;
		}
		while(l2.next!=null){
			l2=l2.next;
			sum=l2.val+flag;
			if(sum>=10){
				sum=sum%10;
				flag=1;
			}
			else{
				flag=0;
			}
			ListNode node=new ListNode(sum);
			list.next=node;
			list=node;
		}
		
		if(flag==1){
			ListNode node=new ListNode(1);
			list.next=node;
		}
		
		return head.next;
		
	}

}
