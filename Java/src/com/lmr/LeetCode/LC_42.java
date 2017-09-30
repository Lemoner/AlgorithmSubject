package com.lmr.LeetCode;

public class LC_42 {

	public int trap(int[] height) {

		int left, right, index, result;

		left = 0;
		right = height.length - 1;
		result = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				index = left + 1;
				while (index < right && height[index] <= height[left]) {
					result += height[left] - height[index];
					index++;
				}
				left = index;
			} else {
				index = right - 1;
				while (index > left && height[index] <= height[right]) {
					result += height[right] - height[index];
					index--;
				}
				right = index;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		LC_42 lc = new LC_42();

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(lc.trap(height));

	}

}
