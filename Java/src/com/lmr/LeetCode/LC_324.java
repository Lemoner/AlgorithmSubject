package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_324 {

	public void wiggleSort(int[] nums) {

		int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(temp);
        int large = temp.length / 2 + (temp.length % 2 == 0 ? -1 : 0);
        int small = temp.length - 1;
        for (int i = 0, j = 1; i < temp.length; i+=2, j+=2) {
            if(j < temp.length) nums[j] = temp[small--];
            nums[i] = temp[large--];
        }

	}
	
	public void wiggleSort1(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int[] t1 = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            t1[i] = nums[i];
        }
        Arrays.sort(t1);
        int n = nums.length;
        int k = (n + 1) / 2;
        int j = n;
        for(int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ?  t1[--k] : t1[--j];
        }
    }

	public static void main(String[] args) {

		LC_324 lc = new LC_324();

		int[] nums = {5,3,1,2,6,7,8,5,5};
		
		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));
		
		lc.wiggleSort(nums);

		System.out.println(Arrays.toString(nums));

	}

}
