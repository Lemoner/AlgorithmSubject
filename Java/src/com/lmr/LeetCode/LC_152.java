package com.lmr.LeetCode;

public class LC_152 {

	public int maxProduct(int[] nums) {
		
		int minlocal=nums[0];
		int maxlocal=nums[0];
		int maxproduct=nums[0];
		int temp;
		
		for(int i=1;i<nums.length;i++){
			temp=minlocal;
			minlocal=Math.min(Math.min(nums[i], minlocal*nums[i]), maxlocal*nums[i]);
			maxlocal=Math.max(Math.max(nums[i], maxlocal*nums[i]), temp*nums[i]);
			maxproduct=Math.max(maxproduct, maxlocal);
		}
		
		return maxproduct;
		
	}
	
	public static void main(String[] args) {
		
		LC_152 lc=new LC_152();
		
		int[] nums={0,2};
		
		System.out.println(lc.maxProduct(nums));
		
	}

}
