package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_FibonacciSequence {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,a,b,t;
		
		n=scanner.nextInt();
		
		a=0;
		b=1;
		
		for(int i=1;i<31;i++){
			t=a+b;
			System.out.print(t+" ");
			if(t>=n){
				System.out.println(Math.min(t-n, n-b));
				break;
			}
			a=b;
			b=t;
		}
		
	}
	
}
