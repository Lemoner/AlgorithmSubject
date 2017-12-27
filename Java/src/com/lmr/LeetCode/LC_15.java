package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_15 {
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		int index,left,mid,right,sum;
		List<List<Integer>> resultlist=new ArrayList<>();
		
		Arrays.sort(nums);
		
		for(left=0;left<nums.length&&nums[left]<=0;){
			
			mid=left+1;
			right=nums.length-1;
			
			while(mid<right){
				sum=nums[left]+nums[mid]+nums[right];
				if(sum==0){
					List<Integer> list=new ArrayList<>();
					list.add(nums[left]);
					list.add(nums[mid]);
					list.add(nums[right]);
					resultlist.add(list);
					
					index=1;
					while(mid+index<right&&nums[mid]==nums[mid+index]){
						index++;
					}
					mid=mid+index;
					
					index=1;
					while(right-index>mid&&nums[right]==nums[right-index]){
						index++;
					}
					right=right-index;
					
				}
				else if(sum<0){
					mid++;
				}
				else{
					right--;
				}
				
			}
			
			index=1;
			while(left+index<nums.length&&nums[left]==nums[left+index]){
				index++;
			}
			left=left+index;
			
		}
		
		return resultlist;

	}
	
	public static void main(String[] args) {
		
		LC_15 lc=new LC_15();
		
		int[] nums={-1, 0, 1, 2, -1, -4};
		
		System.out.println(lc.threeSum(nums));
		
	}

}
