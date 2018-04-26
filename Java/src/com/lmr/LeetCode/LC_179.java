package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LC_179 {
	public String largestNumber(int[] nums) {
		
		int k;
		for(k=0;k<nums.length;k++){
			if(nums[k]!=0){
				break;
			}
		}
		if(k>=nums.length){
			return "0";
		}
		
		int maxindex,temp;
		
		for(int i=0;i<nums.length;i++){
			maxindex=i;
			for(int j=i+1;j<nums.length;j++){
				if(Compare(nums[maxindex],nums[j])<0){
					maxindex=j;
				}
			}
			temp=nums[maxindex];
			nums[maxindex]=nums[i];
			nums[i]=temp;
			System.out.println(Arrays.toString(nums));
		}
		
		String result="";
		for(int i=0;i<nums.length;i++){
			result+=nums[i];
		}
		
		return result;
	}

	private int Compare(int a, int b) {
		
		String sa,sb;
		char a1,b1;
		int ai,bi;
		sa=a+"";
		sb=b+"";
		ai=0;
		bi=0;
		while(sa.length()>ai||sb.length()>bi){
			if(sa.length()<=ai){
				ai=0;
			}
			if(sb.length()<=bi){
				bi=0;
			}
			a1=sa.charAt(ai);
			b1=sb.charAt(bi);
			if(a1>b1){
				return 1;
			}
			else if(a1<b1){
				return -1;
			}
			else{
				ai++;
				bi++;
			}
		}
		
		return 0;
	}
	
	
	public String largestNumber1(int[] nums) {
		
		String[] str=new String[nums.length];
		
		for(int i=0;i<nums.length;i++){
			str[i]=String.valueOf(nums[i]);
		}
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});

		if(str[0].charAt(0)=='0'){ 
			return "0";
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length;i++){
			sb.append(str[i]);
		}
		
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		LC_179 lc=new LC_179();
		
		int[] nums={1,2,3,4,5,6,7,8,9,0};
		
		System.out.println(lc.largestNumber1(nums));
		
	}
}
