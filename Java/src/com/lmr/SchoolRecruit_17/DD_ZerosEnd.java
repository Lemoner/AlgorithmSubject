package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class DD_ZerosEnd {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,count,t;
		
		n=scanner.nextInt();
		
		count=0;
		for(int i=1;i<=n;i++){
			t=i;
			while(t>=5&&t%5==0){
				t=t/5;
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
