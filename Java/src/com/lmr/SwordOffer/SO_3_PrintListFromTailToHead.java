package com.lmr.SwordOffer;

import java.util.ArrayList;

public class SO_3_PrintListFromTailToHead {
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		ArrayList<Integer> list=new ArrayList<>();

		DFS(listNode, list);
		
		return list;
		
	}

	private void DFS(ListNode listNode, ArrayList<Integer> list) {
		if(listNode!=null){
			DFS(listNode.next, list);
			list.add(listNode.val);
		}
	}
	
}
