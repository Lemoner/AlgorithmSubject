package com.lmr.LeetCode;

public class LC_242 {

	public boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length())
            return false;
		
		int[] x=new int[26];
		
		for(int i=0;i<s.length();i++){
			x[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<t.length();i++){
			x[t.charAt(i)-'a']--;
		}
		
		for(int i=0;i<x.length;i++){
			if(x[i]!=0){
				return false;
			}
		}
		
		return true;
	}

}
