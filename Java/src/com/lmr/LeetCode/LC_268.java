package com.lmr.LeetCode;

public class LC_268 {

	public int missingNumber(int[] nums) {
		
		int[] x=new int[nums.length+1];
		
		for(int i=0;i<nums.length;i++){
			x[nums[i]]=1;
		}
		
		for(int i=0;i<x.length;i++){
			if(x[i]!=1){
				return i;
			}
		}
		
		return -1;
		
	}
	
	public int missingNumber1(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

}
