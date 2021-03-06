package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> list=new ArrayList<>();
		int index1,index2;
		
		index1=0;
		index2=0;
		
		while(index1<nums1.length&&index2<nums2.length){
			if(nums1[index1]==nums2[index2]){
				list.add(nums1[index1]);
				index1++;
				index2++;
			}
			else if(nums1[index1]>nums2[index2]){
				index2++;
			}
			else{
				index1++;
			}
		}
		
		int[] result=new int[list.size()];
		
		for(int i=0;i<list.size();i++){
			result[i]=list.get(i);
		}
		
		return result;
		
		
	}

}
