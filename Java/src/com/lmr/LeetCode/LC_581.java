package com.lmr.LeetCode;

public class LC_581 {

	public int findUnsortedSubarray(int[] nums) {
		
		int max,min,left,right;
		
		max=nums[0];
		right=0;

		for(int i=1;i<nums.length;i++){
			if(max>nums[i]){
				right=i;
			}
			else{
				max=nums[i];
			}
		}
		
		min=nums[nums.length-1];
		left=nums.length-1;
		
		for(int i=nums.length-1;i>=0;i--){
			if(min<nums[i]){
				left=i;
			}
			else{
				min=nums[i];
			}
		}
		
		return left<right?right-left+1:0;

	}
	
	public static void main(String[] args) {
		
		LC_581 lc=new LC_581();
		
		int nums[]={1};
		
		System.out.println(lc.findUnsortedSubarray(nums));
		
	}

}
