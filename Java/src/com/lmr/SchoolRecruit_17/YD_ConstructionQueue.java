package com.lmr.SchoolRecruit_17;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class YD_ConstructionQueue {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int t,n;
		
		t=scanner.nextInt();
		
		for(int i=0;i<t;i++){
			n=scanner.nextInt();
			Deque<Integer> deque=new LinkedList<>();
			for(int j=n;j>0;j--){
				deque.push(j);
				deque.push(deque.removeLast());
			}
			System.out.print(deque.pop());
			while(!deque.isEmpty()){
				System.out.print(" "+deque.pop());
			}
			System.out.println();
		}
		
	}
	
}
