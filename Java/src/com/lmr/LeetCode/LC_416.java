package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_416 {

	public boolean canPartition(int[] nums) {
		
		int left,right,len;
		
		Arrays.sort(nums);
		
		len=nums.length;
		left=nums[len-1];
		right=nums[len-2];
		
		for(int i=len-3;i>=0;i--){
			if(left>=right){
			}
			else{
				right+=nums[i];
			}
		}
		
		return false;

	}
	
	

}
