package com.lmr.NK;

import java.util.Scanner;

public class ZJTD_Main_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;
		
		n=in.nextInt();
		
		long[] a=new long[n];
		long[] b=new long[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextLong();
		}
		for(int i=0;i<n;i++){
			b[i]=in.nextLong();
		}
		
		System.out.println(Fun(n,a,b));
		
	}

	private static long Fun(int n, long[] a, long[] b) {

		long sum,min,max,MIN,MAX;
		sum=0;
		
		MIN=Long.MAX_VALUE;
		MAX=Long.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>MAX){
				MAX=a[i];
			}
			if(b[i]<MIN){
				MIN=b[i];
			}
		}

		for(int i=0;i<n;i++){
//			max=a[i];
//			min=b[i];
//			if(max<min){
//				sum++;
//			}
			min=Long.MAX_VALUE;
			max=Long.MIN_VALUE;
			for(int j=i;j<n;j++){
				max=Math.max(max, a[j]);
				min=Math.min(min, b[j]);
				
				if(max<min){
					sum++;
				}
			}
		}
		
		return sum;
	}
}
