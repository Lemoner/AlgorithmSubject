package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_DarkString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		long a,b,t;
		
		while(scanner.hasNext()){
			n=scanner.nextInt();
			a=3;
			b=9;
			
			if(n==1){
				System.out.println(a);
			}
			else if(n==2){
				System.out.println(b);
			}
			else{
				for(int i=3;i<=n;i++){
					t=2*b+a;
					a=b;
					b=t;
				}
				System.out.println(b);
			}
			
		}
		
	}
	
}
