package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_SmallestKNumberInN {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] a=new int[101];
		int k,n;
		
		n=0;
		while(scanner.hasNext()){
			a[n++]=scanner.nextInt();
		}
		k=a[n-1];
		n--;
		
		QuickSort(a, 0, n-1, k-1);

		System.out.print(a[0]);
		for(int i=1;i<k;i++){
			System.out.print(" "+a[i]);
		}
		
		
	}
	
	public static void QuickSort(int[] nums, int start, int end, int k){
		
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
		
		if(right<=k){
			QuickSort(nums, start, right-1, right-start);
			QuickSort(nums, right+1, end, k-right);
		}
		else{
			QuickSort(nums, start, right-1, k);
		}
		
	}
	
}
