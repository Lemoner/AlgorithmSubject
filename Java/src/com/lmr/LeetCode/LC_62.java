package com.lmr.LeetCode;

public class LC_62 {

	public int uniquePaths(int m, int n) {
		
		if(m==1||n==1){
			return 1;
		}
		
		int[] result=new int[m];
		
		for(int i=0;i<m;i++){
			result[i]=1;
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				result[j]=result[j-1]+result[j];
			}
		}
		
		return result[m-1];

	}
	
	public static void main(String[] args) {
		
		LC_62 lc=new LC_62();
		
		System.out.println(lc.uniquePaths(3, 7));
		
	}

}
