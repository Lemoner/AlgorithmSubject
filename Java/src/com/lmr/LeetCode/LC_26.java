package com.lmr.LeetCode;

public class LC_26 {
	public int removeDuplicates(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		
		int count,pre;
		count=1;
		pre=nums[0];
		
		for(int i=1;i<nums.length;i++){
			if(pre!=nums[i]){
				pre=nums[i];
				nums[count]=pre;
				count++;
			}
		}
		
		return count;
	}
}
