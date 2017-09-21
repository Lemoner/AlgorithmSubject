package com.lmr.LeetCode;

public class LC_19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        
		ListNode chain1=head;
		ListNode chain2=head;
		
		for(int i=0;i<n;i++){
			chain1=chain1.next;
		}
		
		if(chain1==null){
			head=head.next;
			return head;
		}
		
		while(chain1!=null&&chain1.next!=null){
			chain1=chain1.next;
			chain2=chain2.next;
		}
		
		if(chain2.next!=null){
			if(chain2.next.next!=null){
				chain2.next=chain2.next.next;
			}
			else{
				chain2.next=null;
			}
		}
		else{
			head=null;
		}
		
		return head;
		
    }
	
	public static void main(String[] args) {
		
		ListNode node1=new ListNode(1);
    	ListNode node2=new ListNode(2);
    	ListNode node3=new ListNode(3);
    	ListNode node4=new ListNode(4);
    	ListNode node5=new ListNode(5);
    	
    	node1.next=node2;
    	node2.next=node3;
    	node3.next=node4;
    	node4.next=node5;
    	
    	ListNode node;
    	
    	node=node1;
    	while(node!=null){
    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
    	System.out.println();
    	
    	LC_19 lc=new LC_19();
    	
    	node=lc.removeNthFromEnd(node1, 5);
    	while(node!=null){
    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
    	System.out.println();
		
	}
	
}
