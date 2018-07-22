package com.lmr.common;

import java.util.Arrays;

public class QuickSort {
	
	public static int count=1;

	public void Sort(int[] nums, int start, int end){
		
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
			}
		}
		
		System.out.println(count+++Arrays.toString(nums)+" - "+left+" - "+right+" - "+midnum);
		
		Sort(nums, start, right);
		Sort(nums, left, end);
		
	}
	
	public void Sort1(int[] nums, int start, int end){
		
		if(start>=end){
			return ;
		}
		
		int midnum,left,right,temp;
		
		midnum=nums[start];
		left=start+1;
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
			}
		}
		
		temp=nums[start];
		nums[start]=nums[right];
		nums[right]=temp;
		
		System.out.println(count+++Arrays.toString(nums)+" - "+left+" - "+right+" - "+midnum);
		
		Sort1(nums, start, right-1);
		Sort1(nums, right+1, end);
		
	}
	
	public static void main(String[] args) {
		
		QuickSort quickSort=new QuickSort();
		
//		int[] nums={3,5,2,5,1,5,6,3,1,4};
//		int[] nums={3,5,9,7,2,1,6,8,4};
		int[] nums={3,9,6,8,-10,7,-11,19,30,12,23,5};
		
		System.out.println(Arrays.toString(nums));
		quickSort.Sort1(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
		
	}
	
}
