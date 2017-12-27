package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_1 {
	
	public int[] twoSum1(int[] nums, int target) {
        int x,y,flag;
        x=0;
        y=0;
        flag=0;
        for(x=0;x<nums.length;x++){
            for(y=x+1;y<nums.length;y++){
                if(nums[x]+nums[y]==target){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        int[] result=new int[2];
        result[0]=x;
        result[1]=y;
        return result;
    }
	
	public int[] twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        int x,y,sum;
        x=0;
        y=nums.length-1;
        for(;x<y;){
            sum=nums[x]+nums[y];
            if(sum==target){
                break;
            }
            else if(sum>target){
                y--;
            }
            else{
                x++;
            }
        }
        int[] result=new int[2];
        result[0]=x;
        result[1]=y;
        return result;
    }
	
}
