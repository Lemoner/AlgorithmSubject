package com.lmr.common;

import java.util.Arrays;

public class Sort {
	
	public static int count=1;

	public void QuickSort(int[] nums, int start, int end){
		
		if(start>=end){
			return ;
		}
		
		int midnum,left,right,temp;
		
		midnum=nums[(start+end)/2];
		left=start;
		right=end;
		
		while(left<=right){
			while(left<=right&&nums[right]>midnum){
				right--;
			}
			while(left<=right&&nums[left]<midnum){
				left++;
			}
			if(left<=right){
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right--;
				System.out.println(count+++Arrays.toString(nums));
			}
		}
		
		System.out.println(count+++Arrays.toString(nums)+" - "+left+" - "+right+" - "+midnum);
		
		QuickSort(nums, start, right);
		QuickSort(nums, left, end);
		
//		midnum=nums[start];
//		left=start;
//		right=end;
//		
//		while(left<right){
//			while(right>left&&nums[right]>midnum){
//				right--;
//			}
//			while(left<right&&nums[left]<=midnum){
//				left++;
//			}
//			temp=nums[left];
//			nums[left]=nums[right];
//			nums[right]=temp;
//			System.out.println(count+++Arrays.toString(nums));
//		}
//		
//		temp=nums[left];
//		nums[left]=nums[start];
//		nums[start]=temp;
//		System.out.println(count+++Arrays.toString(nums));
		
//		while(left<right){
//			while(right>left&&nums[right]>=midnum){
//				right--;
//			}
//			nums[left]=nums[right];
//			System.out.println(count+++Arrays.toString(nums));
//			while(left<right&&nums[left]<=midnum){
//				left++;
//			}
//			nums[right]=nums[left];
//			System.out.println(count+++Arrays.toString(nums));
//		}
//		
//		nums[left]=midnum;
//		System.out.println(count+++Arrays.toString(nums));
		
//		QuickSort(nums, start, left-1);
//		QuickSort(nums, left+1, end);
		
	}
	
	public static void main(String[] args) {
		
		Sort sort=new Sort();
		
		int[] nums={3,5,2,5,1,5,6,3,1,4};
		
		System.out.println(Arrays.toString(nums));
		sort.QuickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
		
	}
	
}
