package com.lmr.SwordOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SO_70_maxInWindows {
	
	public static void main(String[] args) {
		
		SO_70_maxInWindows so=new SO_70_maxInWindows();
		
		int[] num=new int[]{16,12,12,12,8,6,4};
		int size=4;
		
		System.out.println(so.maxInWindows(num, size).toString());
		
	}
	
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		
		if(num==null||num.length==0||size==0){
			return new ArrayList<>();
		}

		ArrayList<Integer> result=new ArrayList<>();
		Deque<Integer> deque=new ArrayDeque<>();
		
		for(int i=0;i<size&&i<num.length;i++){
			while(!deque.isEmpty()&&num[i]>num[deque.getLast()]){
				deque.removeLast();
			}
			deque.addLast(i);
		}
		
		result.add(num[deque.getFirst()]);
		
		for(int i=size;i<num.length;i++){
			if(i-deque.getFirst()>=size){
				deque.removeFirst();
			}
			while(!deque.isEmpty()&&num[i]>num[deque.getLast()]){
				deque.removeLast();
			}
			deque.addLast(i);
			result.add(num[deque.getFirst()]);
		}
		
		return result;
		
	}
}
