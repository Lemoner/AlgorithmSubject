package com.lmr.SchoolRecruit_17;

import java.util.Arrays;
import java.util.Scanner;

public class NE_JumpSlate {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,m,t;
		n=scanner.nextInt();
		m=scanner.nextInt();
		int[] dp=new int[m+1];
		
		for(int i=n;i<m;i++){
			if(i==n||dp[i]!=0){
				for(int j=2;j<=Math.sqrt(i);j++){
					if(i%j==0){
						if(i+j<=m){
							if(dp[i+j]==0){
								dp[i+j]=dp[i]+1;
							}
						}
						t=i/j;
						if(i+t<=m){
							if(dp[i+t]==0){
								dp[i+t]=dp[i]+1;
							}
						}
					}
				}
			}
		}
		
		if(n==m){
			System.out.println(0);
		}
		else{
			System.out.println(dp[m]==0?-1:dp[m]);
		}
		
	}
	
}
