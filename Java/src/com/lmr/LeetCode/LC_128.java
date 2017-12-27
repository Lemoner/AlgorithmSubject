package com.lmr.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LC_128 {

	public int longestConsecutive(int[] nums) {
		
		Set<Integer> set=new HashSet<>();
		int maxlen,len,pre,next;
		
		for(Integer num:nums){
			set.add(num);
		}
		
//		maxlen=0;
//		for(Integer num:nums){
//			len=0;
//			if(set.contains(num)){
//				len++;
//				set.remove(num);
//				pre=num-1;
//				next=num+1;
//				while(set.contains(pre)){
//					set.remove(pre);
//					pre--;
//					len++;
//				}
//				while(set.contains(next)){
//					set.remove(next);
//					next++;
//					len++;
//				}
//				maxlen=Math.max(maxlen, len);
//			}
//		}
		
		maxlen=0;
		for(Integer num:nums){
			if(set.remove(num)){
				pre=num-1;
				next=num+1;
				while(set.remove(pre)){
					pre--;
				}
				while(set.remove(next)){
					next++;
				}
				maxlen=Math.max(maxlen, next-pre-1);
			}
		}
		
		return maxlen;

	}
	
	public static void main(String[] args) {
		
		LC_128 lc=new LC_128();
		
		int nums[]={10,4,20,1,3,2,4};
		
		System.out.println(lc.longestConsecutive(nums));
		
	}

}
