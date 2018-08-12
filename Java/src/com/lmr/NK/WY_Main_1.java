package com.lmr.NK;

import java.util.Scanner;

public class WY_Main_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n,k;
		
		n=in.nextInt();
		k=in.nextInt();
		
		int[] a=new int[n];
		int[] t=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			t[i]=in.nextInt();
		}
		
		long max,result,sum,temp;
		sum=0;
		temp=0;
		
		for(int i=0;i<k;i++){
			temp+=a[i];
		}
		
		for(int i=k;i<n;i++){
			if(t[i]==1){
				sum+=a[i];
			}
		}
		
		max=sum+temp;
		result=max;
		
		for(int i=k;i<n;i++){
			if(t[i-k]==0){
				result-=a[i-k];
			}
			if(t[i]==0){
				result+=a[i];
			}
			if(max<result){
				max=result;
			}
		}
		
		System.out.println(max);
	}

}
