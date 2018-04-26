package com.lmr.common;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public void method1(int[] nums){
		
		int[] dp=new int[nums.length];
		int max;
		
		dp[0]=1;
		
		for(int i=1;i<nums.length;i++){
			for(int j=0;j<i;j++){
				if(nums[j]<nums[i]&&dp[j]+1>dp[i]){
					dp[i]=dp[j]+1;
				}
			}
		}
		
		max=0;
		for(int i=0;i<nums.length;i++){
			if(max<dp[i]){
				max=dp[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	public void method2(int[] nums){
		
		int len,index;
		int[] dp=new int[nums.length];
		
		len=0;
		
		for(int i=0;i<nums.length;i++){
			index=0;
			while(index<len&&dp[index]<nums[i]){
				index++;
			}
			dp[index]=nums[i];
			if(index>=len){
				len++;
			}
		}
		
		System.out.println(len);
		
	}
	
	public static void main(String[] args) {
		
		LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
		
		int[] nums={5,6,7,1,2,8};
		
		lis.method2(nums);
		
	}
	
}
