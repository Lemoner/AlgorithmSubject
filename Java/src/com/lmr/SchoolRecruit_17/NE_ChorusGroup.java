package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_ChorusGroup {
	
	public static long ChorusGroup(int n, int[] a, int k, int d){
		
		long result;
		long[][] dp=new long[n+1][k+1];
		long[][] fp=new long[n+1][k+1];
		
		result=Long.MIN_VALUE;
		
		for(int i=1;i<=n;i++){
			dp[i][1]=a[i];			
			fp[i][1]=a[i];
			for(int t=2;t<=k;t++){
				for(int j=i-1;j>0&&i-j<=d;j--){
					dp[i][t]=Math.max(dp[i][t],Math.max(dp[j][t-1]*a[i], fp[j][t-1]*a[i]));
					fp[i][t]=Math.min(fp[i][t],Math.min(dp[j][t-1]*a[i], fp[j][t-1]*a[i]));
				}
			}
			result=Math.max(result, dp[i][k]);
		}
		
		return result;
 		
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,k,d;
		n=scanner.nextInt();
		int[] a=new int[n];
		for(int i=1;i<=n;i++){
			a[i]=scanner.nextInt();
		}
		k=scanner.nextInt();
		d=scanner.nextInt();
		
		System.out.println(ChorusGroup(n, a, k, d));
		
	}
	
}
