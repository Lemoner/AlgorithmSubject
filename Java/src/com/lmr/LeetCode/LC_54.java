package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_54 {
	public List<Integer> spiralOrder(int[][] matrix) {

		if(matrix==null||matrix.length==0||matrix[0].length==0){
			return new ArrayList<>();
		}
		
		List<Integer> result=new ArrayList<>();
		int m,n,t1,t2,t3,t4,i,j;
		m=matrix.length;
		n=matrix[0].length;
		t1=0;
		t2=n-1;
		t3=m-1;
		t4=0;
		i=0;
		j=0;
		
		while(t1<=t3&&t4<=t2){
			for(i=t1,j=t4;j<=t2;j++){
				result.add(matrix[i][j]);
			}
			t1++;
			for(i=t1,j=t2;i<=t3;i++){
				result.add(matrix[i][j]);
			}
			t2--;
			if(t1<=t3){
				for(i=t3,j=t2;j>=t4;j--){
					result.add(matrix[i][j]);
				}
			}
			t3--;
			if(t4<=t2){
				for(i=t3,j=t4;i>=t1;i--){
					result.add(matrix[i][j]);
				}
			}
			t4++;
		}
				
		return result;
		
	}
	
	public static void main(String[] args) {
		
		LC_54 lc=new LC_54();
		
		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(lc.spiralOrder(matrix).toString());
		
	}
}
