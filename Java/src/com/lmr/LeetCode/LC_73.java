package com.lmr.LeetCode;

import java.util.Random;

public class LC_73 {
	public void setZeroes(int[][] matrix) {

		int m, n, s, d;

		m = matrix.length;
		n = matrix[0].length;

		s = new Random().nextInt(Integer.MAX_VALUE) + 1;
		d = -s;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					int ti = i - 1, tj = j - 1;
					while (ti >= 0) {
						matrix[ti][j] = 0;
						ti--;
					}
					while (tj >= 0) {
						matrix[i][tj] = 0;
						tj--;
					}
					if (i + 1 < m && matrix[i + 1][j] != 0) {
						if (matrix[i + 1][j] == d) {
							matrix[i + 1][j] = 0;
						} else {
							matrix[i + 1][j] = s;
						}
					}
					if (j + 1 < n && matrix[i][j + 1] != 0) {
						if (matrix[i][j + 1] == s) {
							matrix[i][j + 1] = 0;
						} else {
							matrix[i][j + 1] = d;
						}
					}
				} else if (matrix[i][j] == s) {
					matrix[i][j] = 0;
					if (i + 1 < m && matrix[i + 1][j] != 0) {
						if (matrix[i + 1][j] == d) {
							matrix[i + 1][j] = 0;
						} else {
							matrix[i + 1][j] = s;
						}
					}
				} else if (matrix[i][j] == d) {
					matrix[i][j] = 0;
					if (j + 1 < n && matrix[i][j + 1] != 0) {
						if (matrix[i][j + 1] == s) {
							matrix[i][j + 1] = 0;
						} else {
							matrix[i][j + 1] = d;
						}
					}
				}
			}
		}

	}

	public void setZeroes1(int[][] matrix) {

		int m, n;
		boolean fi, fj;

		m = matrix.length;
		n = matrix[0].length;
		fi = false;
		fj = false;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					if (i == 0) {
						fi = true;
					}
					if (j == 0) {
						fj = true;
					}
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		if (fi) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
		}
		if (fj) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

	}

	public static void main(String[] args) {

		LC_73 lc = new LC_73();

		// int[][] matrix={{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		// int[][] matrix={{1,2,3,4},{5,0,5,2},{8,9,2,0},{5,7,2,1}};
		int[][] matrix = { { 3, 5, 5, 6, 9, 1, 4, 5, 0, 5 }, { 2, 7, 9, 5, 9, 5, 4, 9, 6, 8 },
				{ 6, 0, 7, 8, 1, 0, 1, 6, 8, 1 }, { 7, 2, 6, 5, 8, 5, 6, 5, 0, 6 }, { 2, 3, 3, 1, 0, 4, 6, 5, 3, 5 },
				{ 5, 9, 7, 3, 8, 8, 5, 1, 4, 3 }, { 2, 4, 7, 9, 9, 8, 4, 7, 3, 7 }, { 3, 5, 2, 8, 8, 2, 2, 4, 9, 8 } };

		Tool.PrintTwoArray(matrix);

		lc.setZeroes1(matrix);

		Tool.PrintTwoArray(matrix);

	}
}
