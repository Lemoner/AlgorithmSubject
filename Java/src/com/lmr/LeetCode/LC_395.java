package com.lmr.LeetCode;

public class LC_395 {
	public int longestSubstring(String s, int k) {
		
		int[] temp=new int[26];
		int max=0;
		
		for(int i=0;i<s.length();i++){
			temp[s.charAt(i)-'a']++;
		}
		
		StringBuilder sb=new StringBuilder();
		boolean flag=true;
		for(int i=0;i<26;i++){
			if(temp[i]>0&&temp[i]<k){
				if (flag) {
					sb.append((char)('a'+i));
					flag=false;
				}
				else{
					sb.append('|');
					sb.append((char)('a'+i));
				}
			}
		}

		if(sb.length()>0){
			for(String str:s.split(sb.toString())){
				max=Math.max(max, longestSubstring(str, k));
			}
			return max;
		}
		else{
			return s.length();
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_395 lc=new LC_395();
		
		String s="abababcb";
		int k=3;
		
		System.out.println(lc.longestSubstring(s, k));
		
	}
}
