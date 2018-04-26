package com.lmr.LeetCode;

public class LC_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int index,t1,t2;
		index=m+n-1;
		t1=m-1;
		t2=n-1;
		
		while(t1>=0&&t2>=0){
			if(nums1[t1]>nums2[t2]){
				nums1[index--]=nums1[t1--];
			}
			else{
				nums1[index--]=nums2[t2--];
			}
		}
		
		while(t2>=0){
			nums1[index--]=nums2[t2--];
		}
		
	}
}
