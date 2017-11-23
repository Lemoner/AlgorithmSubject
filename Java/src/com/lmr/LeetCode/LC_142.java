package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_142 {

	public ListNode detectCycle(ListNode head) {
		
		List<ListNode> nodelist=new ArrayList<>();
		
		while(head!=null){
			if(nodelist.contains(head)){
				return head;
			}
			nodelist.add(head);
			head=head.next;
		}
		
		return null;

	}
	
	public ListNode detectCycle1(ListNode head) {
		
		ListNode fnode,snode,mnode;
		
		fnode=head;
		snode=head;
		
		while(fnode!=null&&fnode.next!=null){
			fnode=fnode.next.next;
			snode=snode.next;
			if(fnode==snode){
				break;
			}
		}
		
		if(fnode==null||fnode.next==null){
			return null;
		}
		
		mnode=head;
		while(mnode!=snode){
			mnode=mnode.next;
			snode=snode.next;
		}
		
		return mnode;
		
	}

}
