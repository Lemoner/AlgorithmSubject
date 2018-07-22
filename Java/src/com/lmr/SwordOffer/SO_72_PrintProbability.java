package com.lmr.SwordOffer;

import java.util.Arrays;

public class SO_72_PrintProbability {

	public static int MaxPoint=6;
	
	public static void main(String[] args) {
		
		SO_72_PrintProbability so=new SO_72_PrintProbability();
		
		int number=1;
		
		so.PrintProbability(number);
		
		so.PrintProbability1(number);
		
	}
	
	public void PrintProbability(int number){
		
		int[][] dp=new int[2][number*MaxPoint+1];
		int flag;
		
		for(int i=0;i<dp[0].length;i++){
			dp[0][i]=0;
			dp[1][i]=0;
		}
		
		flag=0;
		for(int i=1;i<=MaxPoint;i++){
			dp[flag][i]=1;
		}
		for(int k=2;k<=number;k++){
			for(int i=0;i<k;i++){
				dp[1-flag][i]=0;
			}
			for(int i=k;i<=k*MaxPoint;i++){
				dp[1-flag][i]=0;
				for(int j=1;j<=i&&j<=MaxPoint;j++){
					dp[1-flag][i]+=dp[flag][i-j];
				}
			}
			flag=1-flag;
		}
		
		System.out.println(Arrays.toString(dp[flag]));
		
	}
	
	public void PrintProbability1(int number){
		
		int[] dp=new int[number*MaxPoint+1];
		
		for(int i=0;i<dp.length;i++){
			dp[i]=0;
		}
		
		DFS(number,dp,0);
		
		System.out.println(Arrays.toString(dp));
		
	}

	private void DFS(int number, int[] dp, int sum) {
		
		if(number==0){
			dp[sum]++;
			return ;
		}
		
		for(int i=1;i<=MaxPoint;i++){
			DFS(number-1, dp, sum+i);
		}
		
	}
	
}
