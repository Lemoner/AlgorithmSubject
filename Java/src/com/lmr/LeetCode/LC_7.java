package com.lmr.LeetCode;

public class LC_7 {

	public int reverse(int x) {

		int r = 0, t = 0;

		while (x != 0) {
			r = t * 10 + x % 10;
			if (r / 10 != t) {
				return 0;
			}
			t = r;
			x = x / 10;
		}

		return r;

	}

	public static void main(String[] args) {

		LC_7 lc = new LC_7();

		int x = 2134236469;

		System.out.println(lc.reverse(x));

	}

}
