package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_217 {

	public boolean containsDuplicate(int[] nums) {
		
		if(nums==null||nums.length==0){
			return false;
		}
		
		Arrays.sort(nums);
		
		for(int i=1;i<nums.length;i++){
			if(nums[i]==nums[i-1]){
				return true;
			}
		}
		
		return false;

	}
	
	public boolean containsDuplicate1(int[] nums) {
        //当数组不存在，或者长度小于2时，不可能存在重复数据
        if(nums == null || nums.length <= 1 ){
            return false;
        }

        //找出数组中的最大数和最小数
        int min = nums[0];
        int max = nums[0];
        for(int i = 1, size = nums.length; i < size; i++){
            if(nums[i] < min){
                min = nums[i];
            }else if(nums[i] > max){
                max = nums[i];
            }
        }

        //若最大最小数的区间小于数组长度，必定存在重复数据
        if((max - min + 1 ) < nums.length){
            return true;
        }
        boolean[] results = new boolean[max - min + 1];
        for(int i = 0,size = nums.length; i < size; i++){
            //减去最小数，保证偏移量为整数
            int index = nums[i] - min;

            //若boolean数组该位置被置为true，表示该数已经出现过
            if(results[index]){
                return true;
            }
            //将boolean该偏移位置设置为true
            results[index] = true;
        }
        return false;
    }

}
