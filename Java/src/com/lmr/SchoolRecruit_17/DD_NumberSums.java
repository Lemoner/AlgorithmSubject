package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class DD_NumberSums {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,sum;
		long[][] dp=new long[1001][1001];
		n=scanner.nextInt();
		sum=scanner.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		dp[0][a[0]]=1;
		for(int i=1;i<n;i++){
			dp[i][a[i]]++;
			for(int j=0;j<=sum;j++){
				dp[i][j]+=dp[i-1][j];
				if(dp[i-1][j]!=0&&j+a[i]<=sum){
					dp[i][j+a[i]]+=dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[n-1][sum]);
		
	}
	
}
