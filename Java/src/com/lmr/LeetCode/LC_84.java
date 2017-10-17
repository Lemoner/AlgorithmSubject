package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LC_84 {

	public int largestRectangleArea1(int[] heights) {
		
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
	
	public int largestRectangleArea2(int[] heights) {
		
		heights=Arrays.copyOf(heights, heights.length+1);
		heights[heights.length-1]=0;
		
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

	public static void main(String[] args) {
		
		LC_84 lc=new LC_84();
		
//		int[] heights={2,1,5,6,2,3};
		int[] heights={0,2,2,0,2,1,2};
		
		System.out.println(lc.largestRectangleArea2(heights));
		
	}
	
}
