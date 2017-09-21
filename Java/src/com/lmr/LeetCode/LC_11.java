package com.lmr.LeetCode;

public class LC_11 {

	public int maxArea1(int[] height) {
		
		int max,minh;
		
		max=0;
		for(int i=0;i<height.length;i++){
			for(int j=i+1;j<height.length;j++){
				minh=Math.min(height[i], height[j]);
				max=Math.max(max, minh*(j-i));
			}
		}
		
		return max;
		
    }
	
	public int maxArea2(int[] height) {
		
		int max,maxindex,minh;
		
		max=0;
		
		for(int i=0;i<height.length;i++){
			maxindex=i;
			for(int j=i+1;j<height.length;j++){
				if(height[j]>height[i]&&maxindex==i){
					maxindex=j;
					minh=height[i];
				}
				else{
					minh=height[j];
				}
				if(minh*(j-i)>max){
					max=minh*(j-i);
				}
//				minh=Math.min(height[i], height[j]);
//				max=Math.max(max, minh*(j-i));
			}
			if(maxindex==i){
				break;
			}
			else{
				i=maxindex-1;
			}
		}
		
		return max;
		
	}
	
	public int maxArea3(int[] height) {
		
		int max,left,right;
		
		max=0;
		left=0;
		right=height.length-1;
		
		while(left<right){
			
			if(height[left]<height[right]){
				max=Math.max(max, height[left]*(right-left));
				left++;
			}
			else{
				max=Math.max(max, height[right]*(right-left));
				right--;
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
