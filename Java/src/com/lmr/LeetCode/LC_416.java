package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_416 {

	public boolean canPartition(int[] nums) {
		
		int sum;
		sum=0;
		
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		
		if(sum%2==1){
			return false;
		}
		
		sum=sum/2;
		boolean dp[]=new boolean[sum+1];
		
		dp[0]=true;
		for(int i=0;i<nums.length;i++){
			if(nums[i] > sum) return false;
            if(nums[i] == sum) return true;
			for(int j=sum;j>=nums[i];j--){
				dp[j]=dp[j]||dp[j-nums[i]];
			}
		}
		
		return dp[sum];
		
	}
	
	public boolean canPartition1(int[] nums) {
		
		int sum;
		sum=0;
		
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		
		if(sum%2==1){
			return false;
		}
		
		sum=sum/2;
		
//		return dp(sum, 0, 0, nums, new int[sum]);
		
//		boolean dp[]=new boolean[sum+1];
		
		return DFSDP(nums,new int[sum+1],0,sum);
//		return DFS(nums,nums.length-1,sum/2);
	}
	
	public boolean dp(int target, int sum, int index,int[] nums, int[] dp){
        if(sum>target || index>=nums.length){
            return false;
        } 
        
        if(sum==target){
            return true;
        }
         
        if(dp[sum]==1) {
            return true;
        } 
        if(dp[sum]==-1) {
            return false;
        }
         
        boolean res = dp(target, sum+nums[index],index+1,nums,dp) || dp(target, sum,index+1,nums,dp);
        dp[sum] = (res)? 1:-1;
        return res;
    }
	
	private boolean DFSDP(int[] nums, int[] dp, int index, int sum) {
		
		if(sum==0){
			return true;
		}
		if(index>=nums.length||sum<0){
			return false;
		}
		if(dp[sum]==1){
			return true;
		}
		if(dp[sum]==-1) {
            return false;
        }
		
		boolean res = nums[index]>sum?DFSDP(nums, dp, index+1, sum-nums[index]):DFSDP(nums, dp, index+1, sum-nums[index])||DFSDP(nums, dp, index+1, sum);
		dp[sum] = (res)? 1:-1;
		return res;
	}

	private boolean DFS(int[] nums, int index, int sum) {

		if(sum==0){
			return true;
		}
		if(index<0||sum<0){
			return false;
		}
		
		if(nums[index]>sum){
			return DFS(nums, index-1, sum);
		}
		
		return DFS(nums, index-1, sum)||DFS(nums, index-1, sum-nums[index]);
	}

	public static void main(String[] args) {
		
		LC_416 lc=new LC_416();
		
		int nums[] = { 1,2,6,1,2 };

		System.out.println(lc.canPartition1(nums));
		
	}
	

}
