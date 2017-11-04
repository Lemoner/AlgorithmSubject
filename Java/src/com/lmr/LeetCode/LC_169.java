package com.lmr.LeetCode;

public class LC_169 {

	public int majorityElement(int[] nums) {
		
		int count,target;
		
		count=0;
		target=nums[0];
		
		for(int i=0;i<nums.length;i++){
			if(count==0){
				target=nums[i];
				count++;
			}
			else{
				if(target==nums[i]){
					count++;
				}
				else{
					count--;
				}
			}
		}
		
		return target;

	}

}
