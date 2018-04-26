package com.lmr.LeetCode;

import java.util.HashMap;

public class LC_146 {

	public static void main(String[] args) {
	
//		lru.head.printStringNext();
//		lru.tail.printStringPrev();
		
		LRUCache lru=new LRUCache(2);
	
		lru.put(2, 1);
		lru.head.printStringNext();
		lru.tail.printStringPrev();
		lru.put(2, 2);
		lru.head.printStringNext();
		lru.tail.printStringPrev();
		System.out.println(lru.get(2));
		lru.put(1, 1);
		lru.put(4, 1);
		System.out.println(lru.get(2));
		
	}
	
}

class LRUCache {
	
	int capacity;
	int count;
	DNode head;
	DNode tail;
	HashMap<Integer, DNode> map;
	
    public LRUCache(int capacity) {
    	this.capacity=capacity;
    	count=0;
    	head=new DNode(-1,-1);
    	tail=new DNode(-2,-2);
    	head.next=tail;
    	tail.prev=head;
    	map=new HashMap<>();
    }
    
    public int get(int key) {
    	DNode node=map.get(key);
    	if(node!=null){
    		node.prev.next=node.next;
    		node.next.prev=node.prev;
    		head.next.prev=node;
    		node.next=head.next;
    		head.next=node;
    		node.prev=head;
    		return node.val;
    	}
		return -1;
    }
    
    public void put(int key, int value) {
    	DNode node;
    	if(count<capacity){
    		node=map.get(key);
        	if(node!=null){
        		node.prev.next=node.next;
        		node.next.prev=node.prev;
        		head.next.prev=node;
        		node.next=head.next;
        		head.next=node;
        		node.prev=head;
        		node.val=value;
        	}
        	else{
        		node=new DNode(key,value);
				head.next.prev=node;
	    		node.next=head.next;
	    		head.next=node;
	    		node.prev=head;
	    		map.put(key, node);
	    		count++;
        	}
		}
    	else{
    		node=map.get(key);
        	if(node!=null){
        		node.prev.next=node.next;
        		node.next.prev=node.prev;
        		head.next.prev=node;
        		node.next=head.next;
        		head.next=node;
        		node.prev=head;
        		node.val=value;
        	}
        	else{
        		node=new DNode(key,value);
    			head.next.prev=node;
        		node.next=head.next;
        		head.next=node;
        		node.prev=head;
        		DNode p=tail.prev;
        		map.remove(p.key);
        		p.prev.next=p.next;
        		p.next.prev=p.prev;
        		map.put(key, node);
        	}
    	}
    }
    
}