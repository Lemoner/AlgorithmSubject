package com.lmr.LeetCode;

public class LC_328 {
	public ListNode oddEvenList(ListNode head) {
		
		ListNode even,odd,evenpre,oddpre;
		int index=1;
		
		even=new ListNode(-1);
		odd=new ListNode(-2);
		evenpre=even;
		oddpre=odd;
		
		while(head!=null){
			ListNode node=head;
			head=head.next;
			node.next=null;
			if(index%2==1){
				evenpre.next=node;
				evenpre=evenpre.next;
			}
			else{
				oddpre.next=node;
				oddpre=oddpre.next;
			}
			index++;
		}
		
		if(odd.next!=null){
			evenpre.next=odd.next;
		}
		
		return even.next;
	}
	
	public ListNode oddEvenList1(ListNode head) {
        if(head==null) return head;
        ListNode odd,even,evenStart;
        odd=head;
        even=head.next;
        evenStart=even;
        
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next; 
        }
        odd.next=evenStart;
        return head;
    }
	
	public static void main(String[] args) {
		
		LC_328 lc=new LC_328();
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		
		node1.next=node2;
		node2.next=node3;
		
		node1.printString();
		
		lc.oddEvenList1(node1).printString();
		
	}
	
}
