package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_448 {

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> result=new ArrayList<>();
		
		Arrays.sort(nums);
		
		for(int i=1,j=0;i<=nums.length;){
			if(j>=nums.length||i<nums[j]){
				result.add(i);
				i++;
			}
			else if(i==nums[j]){
				i++;
				j++;
			}
			else{
				j++;
			}
		}
		
		return result;
		
	}
	
	public List<Integer> findDisappearedNumbers1(int[] nums) {
		
		List<Integer> result=new ArrayList<>();
		int index;
		
		for(int i=0;i<nums.length;i++){
			index=Math.abs(nums[i])-1;
			if(nums[index]>0){
				nums[index]*=-1;
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				result.add(i+1);
			}
		}
		
		return result;
		
	}
	
	public List<Integer> findDisappearedNumbers2(int[] nums) {
		
		List<Integer> result=new ArrayList<>();
		int index,len;
		
		len=nums.length;
		for(int i=0;i<nums.length;i++){
			index=(nums[i]-1)%len;
			nums[index]+=len;
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]<=len){
				result.add(i+1);
			}
		}
		
		return result;
		
	}
	
	public List<Integer> findDisappearedNumbers3(int[] nums) {
		int[] counts = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			counts[nums[i] - 1] += 1;
		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) {
				result.add(i + 1);
			}
		}

		return result;

	}
	
	public static void main(String[] args) {

		LC_448 lc=new LC_448();
		
		int nums[]={4,3,2,7,8,2,3,1};
		
		System.out.println(lc.findDisappearedNumbers2(nums).toString());
		
	}

}
