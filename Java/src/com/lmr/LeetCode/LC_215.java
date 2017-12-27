package com.lmr.LeetCode;

public class LC_215 {

	public int findKthLargest(int[] nums, int k) {

		int[] dp=new int[k];
		int index,temp;
		
		for(int i=0;i<nums.length;i++){
			if(i<k){
				index=0;
				while(index<k&&index<i&&dp[index]<=nums[i]){
					index++;
				}
				for(int j=i-1;j>=index;j--){
					dp[j+1]=dp[j];
				}
				dp[index]=nums[i];
			}
			else{
				if(nums[i]>dp[0]){
					dp[0]=nums[i];
				}
				for(int j=1;j<k;j++){
					if(dp[j-1]>dp[j]){
						temp=dp[j-1];
						dp[j-1]=dp[j];
						dp[j]=temp;
					}
					else{
						break;
					}
				}
			}
		}
		
		return dp[0];
		
	}
	
	public int findKthLargest1(int[] nums, int k) {
		
		return findKthInScope(nums, k, 0, nums.length-1);
		
	}
	
//	public int findKthInScope(int[] nums, int k, int start, int end) {
//		
//		int midnum,left,right,temp,midth;
//		
//		midnum=nums[start];
//		left=start;
//		right=end;
//		
//		while(left<right){
//			while(right>left&&nums[right]>=midnum){
//				right--;
//			}
//			nums[left]=nums[right];
//			while(left<right&&nums[left]<=midnum){
//				left++;
//			}
//			nums[right]=nums[left];
//		}
//		
//		nums[left]=midnum;
//		midth=nums.length-left;
//		
//		if(midth==k){
//			return midnum;
//		}
//		else if(midth>k){
//			return findKthInScope(nums, k, left+1, end);
//		}
//		else{
//			return findKthInScope(nums, k, start, left-1);
//		}
//		
//	}
	
	public int findKthInScope(int[] nums, int k, int start, int end) {
		
		int midnum,left,right,temp,midth;
		
		midnum=nums[(start+end)/2];
		left=start;
		right=end;
		
		while(left<=right){
			while(left<=right&&nums[right]>midnum){
				right--;
			}
			while(left<=right&&nums[left]<midnum){
				left++;
			}
			if(left<=right){
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right--;
			}
		}
		
		if(right>=nums.length-k){
			return findKthInScope(nums, k, start, right);
		}
		if(left<=nums.length-k){
			return findKthInScope(nums, k, left, end);
		}
		return nums[nums.length-k];
		
	}
	
	public static void main(String[] args) {
		
		LC_215 lc=new LC_215();
		
//		int[] nums={3,5,1,4,6,2};
		int[] nums={-1,2,0};
		
		System.out.println(lc.findKthLargest1(nums, 2));
		
	}

}
