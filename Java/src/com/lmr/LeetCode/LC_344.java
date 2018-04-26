package com.lmr.LeetCode;

public class LC_344 {
	public String reverseString(String s) {
		
		int len=s.length();
		char temp;
		char[] c=s.toCharArray();

		for(int i=0;i<len/2;i++){
			temp=c[i];
			c[i]=c[len-i-1];
			c[len-i-1]=temp;
		}
		
		return new String(c);
		
	}
}
