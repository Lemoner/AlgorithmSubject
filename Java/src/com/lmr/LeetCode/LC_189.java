package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_189 {

	public void rotate(int[] nums, int k) {
		
		if(nums==null||nums.length==0){
			return ;
		}
		
		int index,pre,temp;
		
		index=0;
		pre=nums[index];
		
		for(int i=0,j=k;i<nums.length;i++,j=j+k){
			if(j%nums.length==0){
				index=(index+k)%nums.length;
				nums[index]=pre;
				
				index++;
				pre=nums[index%nums.length];
			}
			else{
				index=(index+k)%nums.length;
				temp=nums[index];
				nums[index]=pre;
				pre=temp;
			}
			
		}
		
	}
	
	public void swap(int[] nums, int low, int high) {
        while(low < high) {
            nums[low] = nums[low] ^ nums[high];
            nums[high] = nums[low] ^ nums[high];
            nums[low] = nums[low] ^ nums[high];
            low++;
            high--;
        }
        return;
    }
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if (k == 0) {
            return;
        }
        swap(nums, 0, len - k - 1);
        swap(nums, len - k, len -1);
        swap(nums, 0, len - 1);
        return;
        
    }
	
	public static void main(String[] args) {
		
		LC_189 lc=new LC_189();
		
		int[] nums={1,2,3,4,5,6};
		int k=3;
		
		lc.rotate(nums, k);
		
		System.out.println(Arrays.toString(nums));
		
	}

}
