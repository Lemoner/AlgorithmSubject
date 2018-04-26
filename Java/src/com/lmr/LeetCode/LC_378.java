package com.lmr.LeetCode;

public class LC_378 {
	public int kthSmallest(int[][] matrix, int k) {
		
		int[] index=new int[matrix.length];
		int count,min,mini;
		
		count=0;
		min=0;
		
		while(count<k){
			min=Integer.MAX_VALUE;
			mini=0;
			for(int i=0;i<index.length;i++){
				if(index[i]<matrix[0].length&&matrix[i][index[i]]<min){
					min=matrix[i][index[i]];
					mini=i;
				}
			}
			count++;
			index[mini]++;
		}
		
		return min;

	}
	
	public int kthSmallest1(int[][] matrix, int k) {
		
		int m,n,start,end,mid;
		
		m=matrix.length;
		n=matrix[0].length;
		start=matrix[0][0];
		end=matrix[m][n];
		
		while(start<end){
			mid=start+(end-start)/2;
			if(Sum(matrix,mid)<k){
				start=mid+1;
			}
			else{
				end=mid;
			}
		}
		
		return start;
		
	}

	private int Sum(int[][] matrix, int target) {
		
		int count=0;
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]<=target){
					count++;
				}
				else{
					break;
				}
			}
		}
		
		return count;
	}
	
}
