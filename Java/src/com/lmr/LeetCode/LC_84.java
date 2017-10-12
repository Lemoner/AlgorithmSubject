package com.lmr.LeetCode;

public class LC_84 {

	public int largestRectangleArea(int[] heights) {
		
		int result,left,right;
		
		result=0;
		
		for(int i=0;i<heights.length;i++){
			
			left=i;
			right=i;
			
			while(left>=0&&heights[i]<=heights[left]){
				left--;
			}
			
			while(right<heights.length&&heights[i]<=heights[right]){
				right++;
			}
			
			result=Math.max(result, heights[i]*(right-left-1));
			
		}
		
		return result;

	}

	public static void main(String[] args) {
		
		LC_84 lc=new LC_84();
		
		int[] heights={2,1,5,6,2,3};
		
		System.out.println(lc.largestRectangleArea(heights));
		
	}
	
}
