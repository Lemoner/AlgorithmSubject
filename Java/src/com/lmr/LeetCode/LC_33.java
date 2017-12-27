package com.lmr.LeetCode;

public class LC_33 {

	public int search(int[] nums, int target) {

		if(nums==null||nums.length==0){
			return -1;
		}
		
		int left, mid, right;

		left = 0;
		right = nums.length - 1;

		while (left <= right) {

			mid = (left + right) / 2;
			
			if(target==nums[mid]){
				return mid;
			}
			if(target==nums[right]){
				return right;
			}
			if(target==nums[left]){
				return left;
			}
			
			if(nums[left]<nums[right]){
				if(target>nums[mid]){
					left=mid+1;
				}
				else{
					right=mid-1;
				}
			}
			else if(nums[mid]>nums[left]){
				if(target>nums[mid]||target<nums[right]){
					left=mid+1;
				}
				else{
					right=mid-1;
				}
			}
			else{
				if(target<nums[mid]||target>nums[left]){
					right=mid-1;
				}
				else{
					left=mid+1;
				}
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		LC_33 lc = new LC_33();

//		int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int[] nums = { 1};

//		System.out.println(lc.search(nums, 2));
		
		for(int i=0;i<nums.length;i++){
			
			System.out.println(nums[i]+" - "+i+" - "+lc.search(nums, nums[i]));
			
		}

	}

}
