package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class MT_PutTogetherDenomination {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		n=scanner.nextInt();
		long[] dp=new long[n+1];
		int[] a=new int[]{1,5,10,20,50,100};
		
		dp[0]=1;
		for(int i=0;i<a.length;i++){
			for(int k=0;k<=n;k++){
				if(a[i]+k<=n){
					dp[a[i]+k]+=dp[k];
				}
				else{
					break;
				}
			}
		}
		
		System.out.println(dp[n]);
		
	}
	
}
