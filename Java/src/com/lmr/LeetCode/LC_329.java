package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_329 {
	public int longestIncreasingPath(int[][] matrix) {
		
		if(matrix==null||matrix.length==0||matrix[0].length==0){
			return 0;
		}
		
		int[][] temp=new int[matrix.length][matrix[0].length];
		int longpath;
		
		longpath=0;
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(temp[i][j]==0){
					DFS(matrix,temp,i,j);
				}
				longpath=Math.max(longpath, temp[i][j]);
			}
		}
		
		for(int i=0;i<temp.length;i++){
			System.out.println(Arrays.toString(temp[i]));
		}
		
		return longpath;
		
	}

	private int DFS(int[][] matrix, int[][] temp, int i, int j) {
		
		int max=1;
		
		if(i-1>=0&&matrix[i][j]<matrix[i-1][j]){
			if(temp[i-1][j]==0){
				max=Math.max(max, DFS(matrix, temp, i-1, j)+1);
			}
			else{
				max=Math.max(max, temp[i-1][j]+1);
			}
		}
		
		if(i+1<matrix.length&&matrix[i][j]<matrix[i+1][j]){
			if(temp[i+1][j]==0){
				max=Math.max(max, DFS(matrix, temp, i+1, j)+1);
			}
			else{
				max=Math.max(max, temp[i+1][j]+1);
			}
		}
		
		if(j-1>=0&&matrix[i][j]<matrix[i][j-1]){
			if(temp[i][j-1]==0){
				max=Math.max(max, DFS(matrix, temp, i, j-1)+1);
			}
			else{
				max=Math.max(max, temp[i][j-1]+1);
			}
		}
		
		if(j+1<matrix[0].length&&matrix[i][j]<matrix[i][j+1]){
			if(temp[i][j+1]==0){
				max=Math.max(max, DFS(matrix, temp, i, j+1)+1);
			}
			else{
				max=Math.max(max, temp[i][j+1]+1);
			}
		}
		
		temp[i][j]=max;
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		LC_329 lc=new LC_329();
		
		int[][] matrix={{9,9,4},{6,6,8},{2,1,1}};
		
		System.out.println(lc.longestIncreasingPath(matrix));
		
	}
}
