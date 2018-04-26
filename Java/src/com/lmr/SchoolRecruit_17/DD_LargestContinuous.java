package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class DD_LargestContinuous {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		long max,sum;
		int x;
		
		max=Long.MIN_VALUE;
		sum=0;
		for(int i=0;i<n;i++){
			x=scanner.nextInt();
			if(sum<=0){
				sum=x;
			}
			else{
				sum+=x;
			}
			max=Math.max(max, sum);
		}
		System.out.println(max);
		
	}
	
}
