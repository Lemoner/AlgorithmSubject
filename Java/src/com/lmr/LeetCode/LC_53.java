package com.lmr.LeetCode;

public class LC_53 {

	public int maxSubArray(int[] nums) {

		int maxsum, sum;

		maxsum = Integer.MIN_VALUE;
		sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum > maxsum) {
				maxsum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		return maxsum;

	}

	public static void main(String[] args) {

		LC_53 lc = new LC_53();

		 int[] nums={8,-19,5,-4,20};
//		int[] nums = { -3 };

		System.out.println(lc.maxSubArray(nums));

	}

}
