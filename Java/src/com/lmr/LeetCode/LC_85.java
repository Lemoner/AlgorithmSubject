package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LC_85 {

	public int maximalRectangle(char[][] matrix) {
		
		if(matrix==null||matrix.length==0){
            return 0;
        }
		
		int n,m,count;
		n=matrix.length;
		m=matrix[0].length;
		
		int h[][]=new int[n][m+1];
		
		for(int i=0;i<m;i++){
			count=0;
			for(int j=0;j<n;j++){
				if(matrix[j][i]=='1'){
					count++;
				}
				else{
					count=0;
				}
				h[j][i]=count;
			}
		}
		
		int maxarea=0;
		
		for(int i=0;i<n;i++){
			h[i][m]=0;
			maxarea=Math.max(maxarea, largestRectangleArea(h[i]));
		}
		
		return maxarea;

	}
	
	public int largestRectangleArea(int[] heights) {
		
		Stack<Integer> stack=new Stack<>();
		int index,max,area,t;
		index=0;
		max=0;
		
		while(index<heights.length){
			if(stack.isEmpty()||heights[index]>=heights[stack.peek()]){
				stack.push(index++);
			}
			else{
				t=stack.pop();
				if(stack.isEmpty()){
					area=heights[t]*index;
				}
				else{
					area=heights[t]*(index-stack.peek()-1);
				}
				max=Math.max(max, area);
			}
		}
		
		return max;
	}
	
	public int maximalRectangle1(char[][] matrix) {
		
		if(matrix==null||matrix.length==0){
            return 0;
        }
		
		int n,m,maxarea,tl,tr;
		n=matrix.length;
		m=matrix[0].length;
		maxarea=0;
		
		int h[]=new int[m];
		int l[]=new int[m];
		int r[]=new int[m];
		
		Arrays.fill(h, 0);
		Arrays.fill(l, 0);
		Arrays.fill(r, m);
		
		for(int i=0;i<n;i++){
			tl=0;
			tr=m;
			for(int j=0;j<m;j++){
				h[j]=matrix[i][j]=='1'?h[j]+1:0;
			}
			for(int j=0;j<m;j++){
				if(matrix[i][j]=='1'){
					l[j]=Math.max(l[j], tl);
				}
				else{
					l[j]=0;
					tl=j+1;
				}
			}
			for(int j=m-1;j>=0;j--){
				if(matrix[i][j]=='1'){
					r[j]=Math.min(r[j], tr);
				}
				else{
					r[j]=m;
					tr=j;
				}
			}
			for(int j=0;j<m;j++){
				maxarea=Math.max(maxarea, (r[j]-l[j])*h[j]);
			}
		}
		
		return maxarea;
		
	}
	
	public static void main(String[] args) {
		
		LC_85 lc=new LC_85();
		
//		char matrix[][]={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		char matrix[][]={{'1'}};
		
		System.out.println(lc.maximalRectangle1(matrix));
		
	}

}
