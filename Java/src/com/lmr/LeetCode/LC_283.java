package com.lmr.LeetCode;

/**
 * @problem Given an array nums, write a function to move all 0's to the end of
 *          it while maintaining the relative order of the non-zero elements.
 * @example given nums = [0, 1, 0, 3, 12], after calling your function, nums
 *          should be [1, 3, 12, 0, 0].
 * @Note You must do this in-place without making a copy of the array. Minimize
 *       the total number of operations
 */
public class LC_283 {

	public void moveZeroes(int[] nums) {
		
		if(nums==null||nums.length==0){
			return ;
		}
		
		int i,j;
		
		i=0;
		while(i<nums.length&&nums[i]!=0){
			i++;
		}
		j=i;
		i++;
		
		while(i<nums.length){
			if(nums[i]!=0){
				nums[j]=nums[i];
				nums[i]=0;
				j++;
			}
			i++;
		}
		
	}
	
	public void moveZeroes1(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
             
                 if(nums[i]!=0){
                 nums[j++]=nums[i];
             }
            
        }
        for(;j<nums.length;j++){
            nums[j]=0;
        }
    }

}
