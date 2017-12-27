package com.lmr.LeetCode;

public class LC_198 {

	public int rob(int[] nums) {
		
		if(nums.length==0){
			return 0;
		}
		
		int dp[]=new int[nums.length+1];
		
		dp[0]=0;
		dp[1]=nums[0];
		
		for(int i=1;i<nums.length;i++){
			dp[i+1]=Math.max(dp[i], dp[i-1]+nums[i]);
		}
		
		return dp[nums.length];

	}
	
	public int rob1(int[] nums) {
		
		int prevSum = 0, currSum = 0, maxSum = 0;
		if (nums.length <= 0)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			maxSum = Math.max(prevSum + nums[i], currSum);
			prevSum = currSum;
			currSum = maxSum;
		}
		return maxSum;
	    
	}
	
}
