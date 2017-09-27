package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_46 {
	
	private List<List<Integer>> result=new ArrayList<List<Integer>>();

	public List<List<Integer>> permute1(int[] nums) {
		
		DFS(nums, new int[nums.length], new Integer[nums.length], 0);
		
		return result;

	}
	
	public void DFS(int[] nums, int[] flag, Integer[] temp, int count){
		
		if(count==nums.length){
			result.add(new ArrayList<>(Arrays.asList(temp)));
			return ;
		}
		
		for(int i=0;i<nums.length;i++){
			if(flag[i]!=1){
				temp[count]=nums[i];
				flag[i]=1;
				DFS(nums, flag, temp, count+1);
				flag[i]=0;
			}
		}
		
	}
	
	public List<List<Integer>> permute2(int[] nums) {
		
		DFSBySwap(nums, 0);
		
		return result;

	}
	
	public void DFSBySwap(int[] nums, int index){
		
		if(index==nums.length-1){
			List<Integer> list=new ArrayList<>();
			for(int i:nums){
				list.add(i);
			}
			result.add(list);
			return ;
		}
		
		DFSBySwap(nums, index+1);
		
		for(int i=index+1;i<nums.length;i++){
			Swap(nums, index, i);
			DFSBySwap(nums, index+1);
			Swap(nums, i, index);
		}
		
		
	}
	
	public void Swap(int[] nums, int i, int j){
		
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}
	
	public static void main(String[] args) {
		
		LC_46 lc=new LC_46();
		
		int[] nums={1,2,3};
		
		System.out.println(lc.permute2(nums));
		
	}

}
