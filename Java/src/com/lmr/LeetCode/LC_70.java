package com.lmr.LeetCode;

public class LC_70 {

	public int climbStairs(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return climbStairs(n - 1) + climbStairs(n - 2);

	}

	public int climbStairs2(int n) {

		int x, y;

		x = 1;
		y = 1;

		for (int i = 1; i <= n; i++) {
			y = x + y;
			x = y - x;
		}

		return x;

	}

}
