package com.lmr.LeetCode;

public class LC_28 {
	public int strStr(String haystack, String needle) {
		
		if(haystack.length()==0)
			if(needle.length()==0)
				return 0;
			else
				return -1;
        if(needle.length()==0)
            return 0;
        if(haystack.length()==needle.length())
            return haystack.equals(needle)?0:-1;
		
		char[] s=haystack.toCharArray();
		char[] m=needle.toCharArray();
		int[] next=new int[m.length];
		int i,j;
		
		i=0;
		j=0;
		
		getNextByZero(needle, next);
		
		while(i<s.length&&j<m.length){
			if(j==-1||s[i]==m[j]){
				i++;
				j++;
			}
			else{
				j=next[j];
			}
		}
		
		if(j>=m.length){
			return i-m.length;
		}
		else{
			return -1;
		}
	}
	
	public static void getNextByZero(String str, int next[]){
		
		char[] s=str.toCharArray();
		int i,j;
		
		i=0;
		j=-1;
		next[0]=-1;
		
		while(i<s.length-1){
			if(j==-1||s[i]==s[j]){
				i++;
				j++;
				next[i]=j;
			}
			else{
				j=next[j];
			}
		}
		
	}
}
