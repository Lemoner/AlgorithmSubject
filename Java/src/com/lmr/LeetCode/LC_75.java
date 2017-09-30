package com.lmr.LeetCode;

public class LC_75 {

	public void sortColors1(int[] nums) {

		if(nums==null||nums.length<2){
			return;
		}
		
		int left, right;

		left = 0;
		right = nums.length - 1;

		for (int i = left; i <= right;i++) {

			if (nums[i] == 0) {
				swap(nums, i, left);
				left++;
			}else if (nums[i] == 2) {
				swap(nums, i, right);
				right--;
				if(nums[i]==0||nums[i]==2){
					i--;
				}
			}

		}
		
//		for (int i = 0; i <= right;i++) {
//
//			if (nums[i] == 0) {
//				swap(nums, i, left);
//				left++;
//			}else if (nums[i] == 2) {
//				swap(nums, i, right);
//				while (right>i&&nums[right] == 2) {
//					right--;
//				}
//				if(nums[i]==0||nums[i]==2){
//					i--;
//				}
//			}
//
//		}

	}
	
	public void sortColors2(int[] nums) {

		if(nums==null||nums.length<2){
			return;
		}
		
		int left, right;

		left = 0;
		right = nums.length - 1;

		for (int i = left; i <= right;i++) {

			while(i<right&&nums[i] == 2) {
				swap(nums, i, right);
				right--;
			}
			
			while(i>left&&nums[i] == 0) {
				swap(nums, i, left);
				left++;
			}

		}

	}

	public void swap(int[] nums, int x, int y) {
		int temp;
		temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}

	public static void main(String[] args) {

		LC_75 lc = new LC_75();

//		int[] nums = { 1, 0, 2, 1, 1, 0, 2, 0, 0, 2, 2, 1 };
		int[] nums = { 0, 0};
//		int[] nums = { 2, 1};
//		int[] nums = { 2};

//		for (int j = 0; j < nums.length; j++) {
//			System.out.print(nums[j]);
//		}
//		System.out.println();

		lc.sortColors1(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}

	}

}
