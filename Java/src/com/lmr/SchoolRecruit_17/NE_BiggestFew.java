package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_BiggestFew {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		long n,sum;
		
		n=scanner.nextLong();
		
		sum=0l;
		if(n%2==0){
			sum=(1+n-1)*(n/2)/2;
		}
		else{
			sum=(1+n)*(n+1)/2/2;
		}
		for(int i=2;i<=n;i+=2){
			sum+=Few(i);
		}
		
		System.out.println(sum);
		
	}

	public static long Few(int x) {
		
		int t;
		for(int i=x;i>=1;){
			t=i/2;
			if(t%2==1){
				return t;
			}
			i=t;
		}
		
		return 1;
	}
	
}
