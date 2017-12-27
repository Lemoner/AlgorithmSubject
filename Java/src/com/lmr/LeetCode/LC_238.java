package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_238 {

	public int[] productExceptSelf(int[] nums) {
		
		int result[]=new int[nums.length];
		int product;
		
		result[0]=1;
		
		product=1;
		for(int i=0;i<nums.length-1;i++){
			product*=nums[i];
			result[i+1]=product;
		}
		
		product=1;
		for(int i=nums.length-1;i>0;i--){
			product*=nums[i];
			result[i-1]*=product;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		LC_238 lc=new LC_238();
		
		int nums[]={1,2,3,4};
		
		System.out.println(Arrays.toString(lc.productExceptSelf(nums)));
		
	}

}
