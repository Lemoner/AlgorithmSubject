package com.lmr.LeetCode;


public class LC_300 {

	public int lengthOfLIS(int[] nums) {
		
		if(nums.length==0){
			return 0;
		}
		
		int max,t;
		int dp[]=new int[nums.length];
		
		max=1;
		dp[0]=1;
		
		for(int i=1;i<nums.length;i++){
			t=0;
			for(int j=0;j<i;j++){
				if(nums[j]<nums[i]){
					t=dp[j]>t?dp[j]:t;
				}
			}
			dp[i]=t+1;
			max=dp[i]>max?dp[i]:max;
		}
		
		return max;
		
	}
	
	public int lengthOfLIS1(int[] nums) {
		
		if(nums.length==0){
			return 0;
		}
		
		int d[]=new int[nums.length];
		int pos,t;
		
		d[0]=nums[0];
		pos=1;
		
//		for(int i=1;i<nums.length;i++){
//			d[pos]=Integer.MAX_VALUE;
//			t=FindIndex(d, 0, pos, nums[i]);
//			if(t==pos){
//				d[pos]=nums[i];
//				pos++;
//			}
//			else{
//				d[t]=nums[i];
//			}
//		}
		
		for(int i=1;i<nums.length;i++){
			t=FindIndex1(d, 0, pos, nums[i]);
			if(t==pos){
				d[pos]=nums[i];
				pos++;
			}
			else{
				d[t]=nums[i];
			}
		}
		
		return pos;
		
	}
	
	private int FindIndex1(int[] d, int start, int end, int target) {
		
		if(d[start]>=target){
			return start;
		}
		if(d[end-1]<target){
			return end;
		}
		
		end=end-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(d[mid]<target){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		
		return start;
		
	}
	
	private int FindIndex(int[] d, int start, int end, int target) {
		
		while(start<=end){
			int mid=(start+end)/2;
			if(d[mid]<target){
				start=mid+1;
			}
			else{
				if(mid-1>=0&&d[mid-1]<target){
					return mid;
				}
				end=mid-1;
			}
		}
		
		return start;
		
	}

	public static void main(String[] args) {
		
		LC_300 lc=new LC_300();
		
//		int nums[]={10, 9, 2, 5, 3, 3, 7, 101, 18};
		int nums[]={1,3,2};
		
		System.out.println(lc.lengthOfLIS1(nums));
		
	}

}
