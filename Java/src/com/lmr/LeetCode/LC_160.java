package com.lmr.LeetCode;

public class LC_160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		ListNode nodeA=headA;
		ListNode nodeB=headB;
		ListNode node=null;
		
		int flag = 0,count=0;
		
		while(nodeA!=null&&nodeB!=null){
			nodeA=nodeA.next;
			nodeB=nodeB.next;
		}
		
		if(nodeA!=null){
			while(nodeA!=null){
				nodeA=nodeA.next;
				count++;
			}
			flag=1;
		}
		
		if(nodeB!=null){
			while(nodeB!=null){
				nodeB=nodeB.next;
				count++;
			}
			flag=-1;
		}
		
		nodeA=headA;
		nodeB=headB;
		
		if(flag==1){
			while(count>0){
				nodeA=nodeA.next;
				count--;
			}
		}
		else if(flag==-1){
			while(count>0){
				nodeB=nodeB.next;
				count--;
			}
		}
		
		while(nodeA!=null&&nodeB!=null){
			if(nodeA==nodeB){
				node=nodeA;
				break;
			}
			nodeA=nodeA.next;
			nodeB=nodeB.next;
		}
		
		return node;

	}
	
	public static void main(String[] args) {
		
		LC_160 lc=new LC_160();
		
		ListNode headA=new ListNode(1);
		ListNode headB=new ListNode(10);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		ListNode node8=new ListNode(8);
		ListNode node9=new ListNode(9);
		
	}

}
