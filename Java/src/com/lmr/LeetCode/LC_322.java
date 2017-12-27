package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_322 {

	public int coinChange(int[] coins, int amount) {

		int count;
		
		count=0;
		
		Arrays.sort(coins);
		
		for(int i=coins.length-1;i>=0;i--){
			count+=amount/coins[i];
			amount=amount%coins[i];
			if(amount==0){
				break;
			}
		}
		
		return amount==0?count:-1;
		
	}
	
	private int mincount;
	
	public int coinChange1(int[] coins, int amount) {

		mincount=Integer.MAX_VALUE;
		
		Arrays.sort(coins);
		
		DFS(coins,amount,0,0,coins.length-1);
		
		return mincount==Integer.MAX_VALUE?-1:mincount;
		
	}
	

	private void DFS(int[] coins, int amount, int sum, int count, int index) {
		
		if(amount==sum&&count<mincount){
			mincount=count;
			return ;
		}
		
		if(index>=0){
			int max=(amount-sum)/coins[index];
			for(int i=max;i>=0;i--){
				if(count+i<mincount){
					DFS(coins, amount, sum+coins[index]*i, count+i, index-1);
				}
				else{
					break;
				}
			}
		}
		
	}
	
	public int coinChange2(int[] coins, int amount) {
		
		int dp[]=new int[amount+1];
		
//		for(int i=1;i<=amount;i++){
//			dp[i]=Integer.MAX_VALUE;
//			for(int j=0;j<coins.length;j++){
//				if(i-coins[j]>=0&&dp[i-coins[j]]!=Integer.MAX_VALUE){
//					dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
//				}
//			}
//		}
//		
//		return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
		
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		
		for(int i=0;i<coins.length;i++){
			for(int j=coins[i];j<=amount;j++){
				dp[j]=Math.min(dp[j], dp[j-coins[i]]+1);
			}
		}
		
		return dp[amount]>amount?-1:dp[amount];
		
	}

	public static void main(String[] args) {
		
		LC_322 lc=new LC_322();
		
		int coins[]={346,29,395,188,155,109};
		int amount=9401;
		
		System.out.println(lc.coinChange2(coins, amount));
		
	}
	
	
}
