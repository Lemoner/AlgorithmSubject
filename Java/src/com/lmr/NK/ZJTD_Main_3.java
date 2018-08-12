package com.lmr.NK;

import java.util.Scanner;

public class ZJTD_Main_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		System.out.println(Fun(n, x, y));
	}

	private static int Fun(int n, int[] x, int[] y) {
		int MAXN = 100001;

		int[][][] dp = new int[2][2][MAXN];

		int now, pre, temp, value;

		now = 0;
		pre = 1;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < MAXN; j++) {
				dp[now][i][j] = Integer.MIN_VALUE;
			}
		}
		dp[now][0][0] = 0;
		for (int i = 0; i < n; i++) {

			temp = pre;

			pre = now;

			now = temp;

			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < MAXN; k++) {
					dp[now][j][k] = Integer.MIN_VALUE;
				}
			}
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < MAXN; k++) {
					if (dp[pre][j][k] == Integer.MIN_VALUE) {
						continue;
					}
					dp[now][j][k] = Math.max(dp[now][j][k], dp[pre][j][k]);

					value = k;

					if (j == 0) {
						value = -value;
					}

					Fun_Up(value + x[i], now, dp[pre][j][k] + y[i], dp);

					Fun_Up(value - x[i], now, dp[pre][j][k] + y[i], dp);
				}
			}
		}
		return dp[now][0][0];
	}

	private static void Fun_Up(int value, int cur, int sum, int[][][] dp) {
		int i = 0;
		int j = value;
		if (value < 0) {
			i = 1;
			j = -j;
		}
		dp[cur][i][j] = Math.max(dp[cur][i][j], sum);
	}

}
