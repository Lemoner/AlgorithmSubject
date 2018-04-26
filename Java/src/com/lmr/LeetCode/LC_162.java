package com.lmr.LeetCode;

public class LC_162 {
	public int findPeakElement(int[] nums) {
		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				return i-1;
			}
		}
		return nums.length-1;
	}
	
	public int findPeakElement1(int[] A) {
        if (A.length == 0) {
            return A[0];
        }
        // write your code here
        int start = 0, end = A.length-1; // 1.答案在之间，2.不会出界 
        while(start + 1 <  end) {
            int mid = (start + end) / 2;
            if(A[mid] < A[mid - 1]) {
                end = mid;
            } else if(A[mid] < A[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(A[start] < A[end]) {
            return end;
        } else { 
            return start;
        }
    }
}
