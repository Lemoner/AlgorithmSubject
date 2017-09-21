package com.lmr.LeetCode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lmr.LeetCode.LC_4;

public class LC_4Test {

	@Test
	public void testFindMedianSortedArrays1() {
		
		int[] nums1={1,2};
		int[] nums2={3};
		
		LC_4 lc=new LC_4();
		
		System.out.println(lc.findMedianSortedArrays2(nums1, nums2));
		
	}

	@Test
	public void testFindMedianSortedArrays2() {
		
		int[] nums1={};
		int[] nums2={3};
		
		LC_4 lc=new LC_4();
		
		System.out.println(lc.findMedianSortedArrays2(nums1, nums2));
		
	}
	
	@Test
	public void testFindKthNum2(){
		
		int[] nums1={1,5,9,10,12};
		int[] nums2={2,4,7,8};
		int k=8;
		
		LC_4 lc=new LC_4();
		System.out.println(lc.FindKthNum2(nums1, nums2, k));
		
	}

}
