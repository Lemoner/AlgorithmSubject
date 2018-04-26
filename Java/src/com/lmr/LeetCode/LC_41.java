package com.lmr.LeetCode;

public class LC_41 {
	public int firstMissingPositive(int[] nums) {

		int len = nums.length;
		int[] count = new int[len + 1];

		for (int i = 0; i < len; i++) {
			if (nums[i] > 0 && nums[i] <= len) {
				count[nums[i]] = 1;
			}
		}

		for (int i = 1; i < count.length; i++) {
			if (count[i] != 1) {
				return i;
			}
		}

		return len + 1;

	}

	public int firstMissingPositive1(int[] nums) {
		int len = nums.length;
		int temp;

		for (int i = 0; i < len; i++) {
			while (nums[i] - 1 < nums.length && nums[i] - 1 >= 0 && nums[nums[i] - 1] != nums[i]) {
				temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}
		return len + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 3, -2, 1, -4 };

		LC_41 lc = new LC_41();
		
		System.out.println(lc.firstMissingPositive(nums));

	}
}
