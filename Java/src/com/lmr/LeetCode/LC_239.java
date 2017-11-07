package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_239 {

	public int[] maxSlidingWindow(int[] nums, int k) {
		
		if(nums.length==0||k==0){
			return new int[0];
		}
		
		int[] result=new int[nums.length-k+1];
		int max=Integer.MIN_VALUE;
		
		for(int i=k-1;i>=0;i--){
			if(nums[i]>max){
				max=nums[i];
			}
			if(i<result.length){
				result[i]=max;
			}
		}
		
		for(int i=k;i<nums.length;i++){
			
			if(i<=nums.length-k){
				result[i]=nums[i];
				for(int j=i-1;j>i-k;j--){
					if(nums[i]>result[j]){
						result[j]=nums[i];
					}
					else{
						break;
					}
				}
			}
			else{
				for(int j=nums.length-k;j>i-k;j--){
					if(nums[i]>result[j]){
						result[j]=nums[i];
					}
					else{
						break;
					}
				}
			}
			
		}
		
		return result;

	}
	
	public int[] maxSlidingWindow1(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return new int[0];
        
        int[] ret = new int[nums.length - k + 1]; //n-(k-1)
        int index = 0;
        
        int max = Integer.MIN_VALUE;
        int indexOfMax = 0;
        for(int i = 0; i < k; i++){ //first window
            if(nums[i] > max){
                max = nums[i];
                indexOfMax = i;
            }
        }
        
        ret[index++] = max;
        
        //rest windows
        for(int low = 1, high = k; high < nums.length; low++, high++){
            if(indexOfMax < low){
                //we do not have max in [low, high), get max
                max = Integer.MIN_VALUE;
                for(int i = low; i <= high; i++)
                    if(nums[i] > max){
                        max = nums[i];
                        indexOfMax = i;
                    }
            }else{
                //we have max in [low, high), just compare with nums[high]
                if(nums[high] > max){
                    max = nums[high];
                    indexOfMax = high;
                }
            }
            ret[index++] = max;
        }
        
        return ret;
    }
	
	public static void main(String[] args) {
		
		LC_239 lc=new LC_239();
		
//		int[] nums={1,3,-1,-3,5,3,6,7};
//		int k=3;
		
		int[] nums={9,11};
		int k=2;
		
		System.out.println(Arrays.toString(lc.maxSlidingWindow(nums, k)));;
		
	}

}
