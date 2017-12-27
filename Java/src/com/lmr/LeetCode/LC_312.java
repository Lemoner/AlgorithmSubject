package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_312 {

	public int maxCoins(int[] nums) {
		
		return DFS(nums, nums.length);
		
	}
	
	public int DFS(int nums[],int size){
		
		int sum,min,minindex;
		sum=0;
		
		if(size>3){
			minindex=1;
			min=nums[1];
			for(int i=2;i<size-1;i++){
				if(nums[i]<min){
					min=nums[i];
					minindex=i;
				}
			}
			
			if(min<=nums[0]&&min<=nums[size-1]){
				sum+=nums[minindex-1]*nums[minindex]*nums[minindex+1];
				System.arraycopy(nums, minindex+1, nums, minindex, size-minindex-1);
				size--;
				sum+=DFS(nums, size);
			}
			else{
				int result1,result2,result3,max;
				result1=nums[0]*nums[1];
				result2=nums[minindex-1]*nums[minindex]*nums[minindex+1];
				result3=nums[size-2]*nums[size-1];
				
				int[] nums1,nums2,nums3;
				nums1=new int[size];
				nums2=new int[size];
				nums3=new int[size];
				for(int i=0;i<size;i++){
					nums1[i]=nums[i];
					nums2[i]=nums[i];
					nums3[i]=nums[i];
				}
				
				System.arraycopy(nums1, 1, nums1, 0, size-1);
				result1+=DFS(nums1, size-1);
				System.arraycopy(nums2, minindex+1, nums2, minindex, size-minindex-1);
				result2+=DFS(nums2, size-1);
				result3+=DFS(nums3, size-1);
				
				System.out.println(result1+" - "+result2+" - "+result3);
				
				max=Math.max(result1, Math.max(result2, result3));
				if(max==result1){
					minindex=0;
				}
				else if(max==result2){
					
				}
				else{
					minindex=size-1;
				}
				System.arraycopy(nums, minindex+1, nums, minindex, size-minindex-1);
				size--;
				sum+=max; 
				
			}
			System.out.println(minindex);
		}
		else if(size==3){
			sum+=nums[0]*nums[1]*nums[2];
			sum+=nums[0]*nums[2];
			sum+=Math.max(nums[0],nums[2]);
		}
		else if(size==2){
			sum+=nums[0]*nums[1];
			sum+=Math.max(nums[0],nums[1]);
		}
		else if(size==1){
			sum+=nums[0];
		}
		
		return sum;
		
	}
	
	public int maxCoins1(int[] nums) {
		
		int a[]=new int[nums.length+2];
		int size;
		
		a[0]=1;
		size=1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				a[size++]=nums[i];
			}
		}
		a[size++]=1;
		
		int dp[][]=new int[size][size];
		
		for(int k=2;k<size;k++){
			for(int l=0;l<size-k;l++){
				int r=l+k;
				for(int m=l+1;m<r;m++){
					dp[l][r]=Math.max(dp[l][r], dp[l][m]+a[l]*a[m]*a[r]+dp[m][r]);
				}
			}
		}
		
		return dp[0][size-1];
		
	}
	
	public static void main(String[] args) {
		
		LC_312 lc=new LC_312();
		
		int nums[]={2,5};
		
		System.out.println(lc.maxCoins1(nums));
		
	}

}
