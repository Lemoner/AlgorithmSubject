package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_78 {

//	public List<List<Integer>> subsets(int[] nums) {
//		
//		List<List<Integer>> result=new ArrayList<>();
//		
//		for(int i=0;i<nums.length;i++){
//			
//			List<List<Integer>> temp=new ArrayList<>();
//			
//			for(int j=i;j<nums.length;j++){
//				List<Integer> list=new ArrayList<>();
//				list.add(nums[i]);
//				temp.add(list);
//			}
//			
//			for(int j=i+1;j<nums.length;j++){
//				for(int k=j;k<nums.length;k++){
//					temp.get(k-i).add(nums[j]);
//				}
//			}
//			
//			result.addAll(temp);
//			
//		}
//		
//		result.add(new ArrayList<>());
//		
//		return result;
//
//	}
	
	public List<List<Integer>> subsets1(int[] nums) {
		
		List<List<Integer>> result=new ArrayList<>();
		
		result.add(new ArrayList<>());
		
		for(int num:nums){
			
			int size=result.size();
			
			for(int i=0;i<size;i++){
				List<Integer> temp=new ArrayList<>(result.get(i));
				temp.add(num);
				result.add(temp);
			}
			
		}
		
		return result;

	}
	
	public List<List<Integer>> subsets2(int[] nums) {
		
		List<List<Integer>> result=new ArrayList<>();
		
		DFS(result, new ArrayList<>(), nums, 0);
		
		return result;
		
	}
	
	public void DFS(List<List<Integer>> result, List<Integer> temp, int[] nums, int index){
		
		result.add(new ArrayList<>(temp));
		
		for(int i=index;i<nums.length;i++){
			temp.add(nums[i]);
			DFS(result, temp, nums, i+1);
			temp.remove(temp.size()-1);
		}
		
	}

	public static void main(String[] args) {
		
		LC_78 lc=new LC_78();
		
		int nums[]={1,2,3,4};
		
		System.out.println(lc.subsets2(nums));
		
	}
	
}
