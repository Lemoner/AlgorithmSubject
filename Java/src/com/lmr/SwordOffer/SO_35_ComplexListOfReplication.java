package com.lmr.SwordOffer;

import java.util.HashMap;
import java.util.Map;

public class SO_35_ComplexListOfReplication {

	public RandomListNode Clone(RandomListNode pHead){
		
		Map<RandomListNode, RandomListNode> map=new HashMap<>();
		RandomListNode pCloneHead=new RandomListNode(0);
		RandomListNode pNode=pHead;
		RandomListNode pCloneNode=pCloneHead;
		
		while(pNode!=null){
			RandomListNode pClone=new RandomListNode(pNode.label);
			map.put(pNode, pClone);
			pCloneNode.next=pClone;
			pNode=pNode.next;
			pCloneNode=pCloneNode.next;
		}
		
		pNode=pHead;
		pCloneNode=pCloneHead.next;
		while(pNode!=null){
			if(pNode.random!=null){
				pCloneNode.random=map.get(pNode.random);
			}
			pNode=pNode.next;
			pCloneNode=pCloneNode.next;
		}
		
		return pCloneHead.next;
        
    }
	
	public RandomListNode Clone1(RandomListNode pHead){
		
		RandomListNode pNode=pHead;
		
		while(pNode!=null){
			RandomListNode pClone=new RandomListNode(pNode.label);
			pClone.next=pNode.next;
			pNode.next=pClone;
			pNode=pNode.next.next;
		}
		
		pNode=pHead;
		while(pNode!=null){
			if(pNode.random!=null){
				pNode.next.random=pNode.random.next;
			}
			pNode=pNode.next.next;
		}
		
		RandomListNode pCloneHead=new RandomListNode(0);
		RandomListNode pClone=pCloneHead;
		pNode=pHead;
		while(pNode!=null){
			pClone.next=pNode.next;
			pNode.next=pNode.next.next;
			pClone=pClone.next;
			pNode=pNode.next;
		}
		
		return pCloneHead.next;
		
	}
	
}
