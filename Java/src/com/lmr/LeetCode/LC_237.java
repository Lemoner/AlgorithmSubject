package com.lmr.LeetCode;

public class LC_237 {
	
    public void deleteNode(ListNode node) {
        
        if(node.next==null){
            return ;
        }
        
        ListNode pre=node.next;
        
        node.val=pre.val;
        node.next=pre.next;
        
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
    	
    	LC_237 lc=new LC_237();
    	
    	ListNode node;
    	
    	node=node1;
    	while(node!=null){
    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
    	System.out.println();
    	
    	lc.deleteNode(node5);
    	
    	node=node1;
    	while(node!=null){
    		System.out.print(node.val+" -> ");
    		node=node.next;
    	}
    	
	}
	
}
