package com.lmr.LeetCode;

public class LC_48 {

	public void rotate(int[][] matrix) {

		int n,temp;
		
		n=matrix.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n/2;j++){
				temp=matrix[i][j];
				matrix[i][j]=matrix[i][n-j-1];
				matrix[i][n-j-1]=temp;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_48 lc=new LC_48();
		
		int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		lc.rotate(matrix);
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
