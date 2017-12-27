package com.lmr.LeetCode;

import java.util.Arrays;

/**
 * @problem Given an array nums containing n + 1 integers where each integer is
 *          between 1 and n (inclusive), prove that at least one duplicate
 *          number must exist. <br> Assume that there is only one duplicate number,
 *          find the duplicate one.
 * 
 * @Note You must not modify the array (assume the array is read only). <br> You must
 *       use only constant, O(1) extra space. <br> Your runtime complexity should be
 *       less than O(n2). <br> There is only one duplicate number in the array, but
 *       it could be repeated more than once.
 */
public class LC_287 {

	public int findDuplicate(int[] nums) {
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]){
				return nums[i];
			}
		}
		
		return 0;

	}
	
	public int findDuplicate1(int[] nums) {
		
		int n=nums.length;
		int slow,fast,meet;
		
		slow=n-1;
		fast=n-1;
		meet=n-1;
		
		do{
			slow=nums[slow]-1;
			fast=nums[nums[fast]-1]-1;
		}while(nums[slow]!=nums[fast]);
		
		while(nums[slow]!=nums[meet]){
			slow=nums[slow]-1;
			meet=nums[meet]-1;
		}
		
		return nums[meet];
		
	}
	
	public int findDuplicate2(int[] nums) {
		int n=nums.length;
		int slow,fast,meet;
		
		slow=n;
		fast=n;
		meet=n;
		
		do{
			slow=nums[slow-1];
			fast=nums[nums[fast-1]-1];
		}while(slow!=fast);
		
		while(slow!=meet){
			slow=nums[slow-1];
			meet=nums[meet-1];
		}
		
		return meet;
	}
	
	public static void main(String[] args) {
		
		LC_287 lc=new LC_287();
		
		int nums[]={2,1,1};
		
		System.out.println(lc.findDuplicate1(nums));
		
	}

}
