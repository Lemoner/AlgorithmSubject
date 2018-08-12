package com.lmr.NK;

import java.util.Scanner;
import java.util.Stack;

public class ZJTD_Main_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int m, n, p, q;

		String[] s = in.nextLine().split(",");

		m = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);

		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			String[] ss = in.nextLine().split(",");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(ss[j]);
			}
		}

		int[] result = Fun(arr);
		p = result[0];
		q = result[1];
		System.out.println(p + "," + q);

	}

	public static int[] Fun(int[][] arr) {
		boolean[][] flag = new boolean[arr.length][arr[0].length];
		int[] dr = new int[] { 1, -1, 0, 0, -1, 1, -1, 1 };
		int[] dc = new int[] { 0, 0, 1, -1, -1, 1, 1, -1 };
		int[] result = new int[2];

		int p, q, shape, tr, tc;
		p = 0;
		q = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1 && !flag[i][j]) {
					shape = 0;
					Stack<int[]> stack = new Stack();
					stack.push(new int[] { i, j });
					flag[i][j] = true;
					while (!stack.empty()) {
						int[] node = stack.pop();
						shape++;
						for (int k = 0; k < 8; k++) {
							tr = node[0] + dr[k];
							tc = node[1] + dc[k];
							if (0 <= tr && tr < arr.length && 0 <= tc && tc < arr[0].length && arr[tr][tc] == 1
									&& !flag[tr][tc]) {
								stack.push(new int[] { tr, tc });
								flag[tr][tc] = true;
							}
						}
					}
					q++;
					p = Math.max(p, shape);
				}
			}
		}

		result[0] = q;
		result[1] = p;

		return result;
	}

}
