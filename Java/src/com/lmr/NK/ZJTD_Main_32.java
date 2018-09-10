package com.lmr.NK;

import java.util.Scanner;

public class ZJTD_Main_32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m,result;
		m= in.nextInt();
		int[][] a=new int[m][m];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				a[i][j]=in.nextInt();
			}
		}

		result=0;
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if(a[i][j]==1){
					result++;
					DFS(a,i,j);
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static void DFS(int[][] a,int i,int j){
		if(i<0||i>=a.length||j<0||j>=a[0].length||a[i][j]==0){
			return ;
		}
		
		a[i][j]=0;
		
		DFS(a,i,j+1);
		DFS(a,i,j-1);
		DFS(a,i+1,j);
		DFS(a,i-1,j);
	}

}
