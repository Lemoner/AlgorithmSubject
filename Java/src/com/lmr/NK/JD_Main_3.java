package com.lmr.NK;

import java.util.Scanner;

public class JD_Main_3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int t, n, m, x, y;
		int flag = 0;

		t = sc.nextInt();

		for (int k = 0; k < t; k++) {

			n = sc.nextInt();
			m = sc.nextInt();

			boolean[][] a = new boolean[n][n];
			int[] b = new int[n];

			for (int p = 0; p < m; p++) {
				x = sc.nextInt() - 1;
				y = sc.nextInt() - 1;
				a[x][y] = true;
				a[y][x] = true;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][j]) {
						b[i]++;
					}
				}
			}

			flag = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					if (!a[i][j] && b[i] != b[j]) {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 1) {
				break;
			}
		}
		if (flag == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
