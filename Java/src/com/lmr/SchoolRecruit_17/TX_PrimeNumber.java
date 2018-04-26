package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class TX_PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,index,count;
		
		n=scanner.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=1;
		}
		for(int i=2;i<n;i++){
			if(a[i]==1){
				index=2;
				while(i*index<n){
					a[i*index]=0;
					index++;
				}
			}
		}
		
		count=0;
		for(int i=2;i<=n/2;i++){
			if(a[i]==1&&a[n-i]==1){
				System.out.println(i+" "+(n-i));
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
