package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_438 {

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> result=new ArrayList<>();
		
		if(s.length()<p.length()){
			return result;
		}
		
		int flag[]=new int[26];
		char c;
		
		for(int i=0;i<p.length();i++){
			flag[p.charAt(i)-'a']++;
		}
		
		for(int i=0;i<flag.length;i++){
			if(flag[i]<=0){
				flag[i]=Integer.MIN_VALUE;
			}
		}
		
		for(int i=0;i<p.length();i++){
			c=s.charAt(i);
			if(flag[c-'a']!=Integer.MIN_VALUE){
				flag[c-'a']--;
			}
		}
		
		if(CheckFlag(flag)){
			result.add(0);
		}
		
		for(int i=p.length();i<s.length();i++){
			c=s.charAt(i-p.length());
			if(flag[c-'a']!=Integer.MIN_VALUE){
				flag[c-'a']++;
			}
			c=s.charAt(i);
			if(flag[c-'a']!=Integer.MIN_VALUE){
				flag[c-'a']--;
				if(CheckFlag(flag)){
					result.add(i-p.length()+1);
				}
			}
		}
		
		return result;
		
	}
	
	private boolean CheckFlag(int[] flag) {
		for(int i=0;i<flag.length;i++){
			if(flag[i]!=0&&flag[i]!=Integer.MIN_VALUE){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		LC_438 lc=new LC_438();
		
//		String s="cbaebabacd";
//		String p="abc";
		
		String s="abab";
		String p="ab";
		
		System.out.println(lc.findAnagrams(s, p).toString());
		
	}

}
