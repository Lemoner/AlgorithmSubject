package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_31 {

	public void nextPermutation(int[] nums) {

		int index,temp,protemp,x;
		
		for(index=nums.length-2;index>=0;index--){
			if(nums[index]<nums[index+1]){
				break;
			}
		}
		
		if(index<0){
			for(int i=0;i<nums.length/2;i++){
				temp=nums[i];
				nums[i]=nums[nums.length-i-1];
				nums[nums.length-i-1]=temp;
			}
		}
		else{
			x=nums[index];
			Arrays.sort(nums, index, nums.length);
			protemp=nums[index];
			for(int i=index+1;i<nums.length;i++){
				if(nums[i]>x){
					temp=nums[i];
					nums[i]=protemp;
					nums[index]=temp;
					break;
				}
				else{
					temp=nums[i];
					nums[i]=protemp;
					protemp=temp;
				}
			}
		}
		
	}
	
	public void nextPermutation1(int[] nums) {

		int index;
		
		for(index=nums.length-2;index>=0;index--){
			if(nums[index]<nums[index+1]){
				break;
			}
		}
		
		if(index<0){
			reverse(nums,0,nums.length-1);
		}
		else{
			int i=index+1;
			while(i<nums.length&&nums[i]>nums[index]){
				i++;
			}
			i--;
			swap(nums,i,index);
			reverse(nums, index+1, nums.length-1);
		}
		
	}
	
	private void swap(int[] nums, int i, int j) {
		int temp;
		temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

	private void reverse(int[] nums, int left, int right) {
		int temp;
		while(left<right){
			temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		
		LC_31 lc=new LC_31();
		
		int nums[]={1,3,2,1};
		
		System.out.println(Arrays.toString(nums));
		lc.nextPermutation1(nums);
		System.out.println(Arrays.toString(nums));
	}

}
