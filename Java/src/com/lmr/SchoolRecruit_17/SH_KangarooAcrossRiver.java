package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class SH_KangarooAcrossRiver {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int[] a=new int[n];
		int[] dp=new int[n+1];
		int index;
		
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		dp[0]=0;
		index=1;
		for(int i=0;i<n;i++){
			if(index<i){
				break;
			}
			if(a[i]!=0){
				for(int j=index;j<=i+a[i]&&j<n+1;j++){
					dp[j]=dp[i]+1;
					index++;
				}
				if(index>n){
					break;
				}
			}
		}
		
		System.out.println(dp[n]==0?-1:dp[n]);
		
	}
	
}
