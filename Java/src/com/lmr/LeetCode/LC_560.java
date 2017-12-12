package com.lmr.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LC_560 {

	public int subarraySum(int[] nums, int k) {
		
		int a[]=new int[nums.length];
		int result;
		
		result=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i-1;j>=0;j--){
				a[j+1]=a[j]+nums[i];
				if(a[j+1]==k){
					result++;
				}
			}
			a[0]=nums[i];
			if(a[0]==k){
				result++;
			}
		}
		
		return result;

	}
	
	public int subarraySum2(int[] nums, int k) {

		Map<Integer, Integer> map=new HashMap<>();
		int sum,result;
		
		sum=0;
		result=0;
		map.put(0, 1);
		
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			Integer integer=map.get(sum-k);
			if(integer!=null){
				result+=integer;
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		LC_560 lc=new LC_560();
		
//		int nums[]={1,2,3,2,1,2,3};
		int nums[]={1,0,2,1,-1,0,1,2};
		int k=3;
		
		System.out.println(lc.subarraySum2(nums, k));
		
	}

}
