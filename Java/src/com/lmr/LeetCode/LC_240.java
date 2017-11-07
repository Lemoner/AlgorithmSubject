package com.lmr.LeetCode;

public class LC_240 {

	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int xlength = matrix.length;
		int ylength = matrix[0].length;

		for (int i = 0; i < xlength; i++) {
			for (int j = 0; j < ylength; j++) {
				if (matrix[i][j] == target) {
					return true;
				} else if (matrix[i][j] > target) {
					break;
				}
			}
		}

		return false;

	}
	
	public boolean searchMatrix1(int[][] matrix, int target) {
		
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int i = 0;
		int j = matrix[0].length-1;
		
		while(i<matrix.length&&j>=0){
			if(matrix[i][j]<target){
				i++;
			}
			else if(matrix[i][j]>target){
				j--;
			}
			else{
                return true;
			}
		}
		
		return false;
		
	}

}
