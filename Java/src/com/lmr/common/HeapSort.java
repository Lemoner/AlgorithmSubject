package com.lmr.common;

import java.util.Arrays;

/**
 * ∂—≈≈–Ú
 */
public class HeapSort {
	
	public void Sort1(int[] nums){
		
//		for(int i=0;i<nums.length;i++){
//			ShitUp(nums, i);
//		}
		
		for(int i=nums.length/2-1;i>=0;i--){
			ShitDown(nums, i, nums.length);
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=nums.length-1;i>=0;i--){
			Swap(nums, i, 0);
			ShitDown(nums, 0, i);
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	public void ShitUp(int[] nums, int index){
		while(index>0){
			int parent=(index-1)>>>1;
			if(nums[index]>nums[parent]){
				Swap(nums, index, parent);
				index=parent;
			}
			else{
				break;
			}
		}
	}
	
	public void ShitDown(int[] nums, int index, int limit){
		int left,right,max;
		while(index<limit){
			left=(index<<1)+1;
			right=left+1;
			if(right<limit){
				max=nums[left]>nums[right]?left:right;
			}
			else if(left<limit){
				max=left;
			}
			else{
				break;
			}
			if(nums[index]<nums[max]){
				Swap(nums, index, max);
				index=max;
			}
			else{
				break;
			}
		}
	}
	

	public void Sort(int[] nums){
		
		int noleaf;
		noleaf=nums.length/2-1;
		
		for(int i=noleaf;i>=0;i--){
			int index=i;
			while(index<=noleaf){
				int t=Judge(nums,index,nums.length);
				if(t==0){
					break;
				}
				else{
					Swap(nums,index,2*index+t);
					index=2*index+t;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=nums.length-1;i>=0;i--){
			Swap(nums, i, 0);
			
			int index=0;
			while(index<=i/2-1){
				int t=Judge(nums,index,i);
				if(t==0){
					break;
				}
				else{
					Swap(nums,index,2*index+t);
					index=2*index+t;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

	private void Swap(int[] nums, int i, int j) {
		if(i!=j){
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
	}

	private int Judge(int[] nums, int i, int end) {
		int flag=0;
		if(nums[i]<nums[2*i+1]){
			flag=1;
		}
		if(2*i+2<end&&nums[i]<nums[2*i+2]&&nums[2*i+1]<nums[2*i+2]){
			flag=2;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		HeapSort heapSort=new HeapSort();
		
		int[] nums={4,6,8,5,9,3,4};
		
		heapSort.Sort(nums);
		
		int[] nums1={4,6,8,5,9,3,4};
		
		heapSort.Sort1(nums1);
		
		
	}
	
}
