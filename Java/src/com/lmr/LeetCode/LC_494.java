package com.lmr.LeetCode;

public class LC_494 {

	public int findTargetSumWays(int[] nums, int S) {
		
		int sum,x;
		
		sum=0;
		x=nums.length-1;
		
		for(int i=nums.length-1;i>=0;i--){
			sum+=nums[i];
			if(nums[i]==0){
				nums[i]=nums[x];
				nums[x]=0;
				x--;
			} 
		}
		
		return DFS(nums,S,sum,0,x)*(int)Math.pow(2, nums.length-1-x);
		
	}

	private int DFS(int[] nums, int S, int sum, int index, int end) {
		
		if(sum==S){
			return 1;
		}
		else if(sum<S||index>end){
			return 0;
		}
		else{
			return DFS(nums, S, sum-nums[index]*2, index+1, end)+DFS(nums, S, sum, index+1, end);
		}
		
	}
	
	public int findTargetSumWays1(int[] nums, int S) {
		
		int sum,ave;
		
		sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		
		if(S>sum||(S+sum)%2==1){
			return 0;
		}
		
		ave=(S+sum)/2;
		int dp[]=new int[ave+1];
		
		dp[0]=1;
		
//		for(int i=ave;i>=1;i--){
//			for(int j=0;j<nums.length;j++){
////				if(i>=nums[j]){
//					dp[i]+=dp[i-nums[j]];
////				}
//			}
//		}
		
		for(int i=0;i<nums.length;i++){
			for(int j=ave;j>=nums[i];j--){
				dp[j]+=dp[j-nums[i]];
			}
		}
		
		return dp[ave];
		
	}
	
	
//	public int findTargetSumWays1(int[] nums, int S) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        if(S > sum || (sum + S) % 2 == 1)   return 0;
//        return subsetSum(nums, (sum + S) / 2);
//    }
//
//    private int subsetSum(int[] nums, int S){
//        int[] dp = new int[S + 1];
//        dp[0] = 1;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = S; j >= nums[i]; j--) {
//                dp[j] += dp[j - nums[i]];
//            }
//        }
//        return dp[S];
//    }
	
	public static void main(String[] args) {
		
		LC_494 lc=new LC_494();
		
		int nums[]={1,1,1,1,1};
		int S=3;
		
		System.out.println(lc.findTargetSumWays1(nums, S));
		
	}

}
