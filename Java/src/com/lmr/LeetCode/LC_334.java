package com.lmr.LeetCode;

public class LC_334 {
	public boolean increasingTriplet(int[] nums) {
		
		int temp;
		
		for(int i=1;i<nums.length-1;i++){
			temp=i-1;
			while(temp>=0&&nums[temp]>=nums[i]){
				temp--;
			}
			if(temp>=0){
				temp=i+1;
				while(temp<nums.length&&nums[temp]<=nums[i]){
					temp++;
				}
				if(temp<nums.length){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean increasingTriplet1(int[] nums) {
		
		if(nums==null||nums.length<3){
			return false;
		}
		
		int start,mid;
		
		start=nums[0];
		mid=Integer.MAX_VALUE;
		
		for(int i=1;i<nums.length;i++){
			if(nums[i]<=start){
				start=nums[i];
			}
			else if(nums[i]<=mid){
				mid=nums[i];
			}
			else{
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		LC_334 lc=new LC_334();
		
		int[] nums={2,1,5,0,4,6};
		
		System.out.println(lc.increasingTriplet1(nums));
		
	}
}
