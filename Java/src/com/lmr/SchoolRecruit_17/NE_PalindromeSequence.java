package com.lmr.SchoolRecruit_17;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class NE_PalindromeSequence {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,count,x,y;
		
		n=scanner.nextInt();
		Deque<Integer> deque=new LinkedList<>();
		
		for(int i=0;i<n;i++){
			deque.add(scanner.nextInt());
		}
		
		count=0;
		while(deque.size()>1){
			x=deque.getFirst().intValue();
			y=deque.getLast().intValue();
			if(x==y){
				deque.removeFirst();
				deque.removeLast();
			}
			else if(x<y){
				deque.addFirst(deque.removeFirst()+deque.removeFirst());
				count++;
			}
			else{
				deque.addLast(deque.removeLast()+deque.removeLast());
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
