package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_34 {

	public int[] searchRange1(int[] nums, int target) {

		int left, mid, right;
		int[] result = { -1, -1 };

		if (nums == null || nums.length == 0) {
			return result;
		}

		left = 0;
		right = nums.length - 1;

		while (left <= right) {

			mid = (left + right) / 2;

			if (target > nums[mid]) {
				left = mid + 1;
				while (left <= right && nums[left] == nums[mid]) {
					left++;
				}
			} else if (target == nums[mid]) {
				result[0] = mid;
				result[1] = mid;
				while (result[0] >= left && nums[result[0]] == nums[mid]) {
					result[0]--;
				}
				result[0]++;
				while (result[1] <= right && nums[result[1]] == nums[mid]) {
					result[1]++;
				}
				result[1]--;
				return result;
			} else {
				right = mid - 1;
				while (right >= left && nums[right] == nums[mid]) {
					right--;
				}
			}

		}

		return result;

	}

	public int[] searchRange2(int[] nums, int target) {

		int left, mid, right, tleft, tright;

		if (nums == null || nums.length == 0) {
			return new int[] { -1, -1 };
		}

		left = 0;
		right = nums.length - 1;

		while (left < right) {

			mid = (left + right) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}

		if (nums[left] != target) {
			return new int[] { -1, -1 };
		}

		tleft = left;

		left = 0;
		right = nums.length - 1;

		while (left < right) {

			mid = (left + right + 1) / 2;

			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid;
			}

		}

		tright = right;

		return new int[] { tleft, tright };

	}

	public static void main(String[] args) {

		LC_34 lc = new LC_34();

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 5;

		System.out.println(Arrays.toString(lc.searchRange2(nums, target)));

	}

}
